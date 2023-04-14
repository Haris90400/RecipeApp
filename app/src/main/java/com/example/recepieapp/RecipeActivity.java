package com.example.recepieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    TextView titleTextView, ingredientsTextView, instructionsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);

        titleTextView = findViewById(R.id.title_text_view);
        ingredientsTextView = findViewById(R.id.ingredients_text_view);
        instructionsTextView = findViewById(R.id.instructions_text_view);

        Intent intent = getIntent();
        String recipeName = intent.getStringExtra("recipe_name");
        setTitle(recipeName);

        // Set recipe data
        if (recipeName.equals("Pasta")) {
            titleTextView.setText("Pasta Recipe");
            ingredientsTextView.setText("Ingredients:\n- 1 pound spaghetti\n- 1/4 cup olive oil\n- 4 cloves garlic, minced\n- 1/2 teaspoon red pepper flakes\n- 1/2 cup grated Parmesan cheese\n- Salt and pepper to taste");
            instructionsTextView.setText("Instructions:\n1. Cook spaghetti according to package directions.\n2. While spaghetti is cooking, heat olive oil in a large skillet over medium heat. Add garlic and red pepper flakes and cook until fragrant, about 1 minute.\n3. Reserve 1 cup of pasta cooking water, then drain spaghetti and add it to the skillet with the garlic and red pepper flakes. Toss to combine, adding reserved pasta water as needed to loosen the sauce.\n4. Remove from heat and stir in Parmesan cheese. Season with salt and pepper to taste.");
        } else if (recipeName.equals("Pizza")) {
            titleTextView.setText("Pizza Recipe");
            ingredientsTextView.setText("Ingredients:\n- 1 pound pizza dough\n- 1/2 cup pizza sauce\n- 2 cups shredded mozzarella cheese\n- 1/2 cup sliced pepperoni\n- 1/4 cup sliced black olives\n- 1/4 cup sliced mushrooms\n- Salt and pepper to taste");
            instructionsTextView.setText("Instructions:\n1. Preheat oven to 450°F.\n2. Roll out pizza dough on a floured surface and transfer to a baking sheet.\n3. Spread pizza sauce evenly over the dough, leaving a small border around the edge.\n4. Sprinkle shredded mozzarella cheese over the sauce, then top with pepperoni, black olives, and mushrooms. Season with salt and pepper to taste.\n5. Bake for 10-12 minutes, or until crust is golden brown and cheese is melted and bubbly.");
        } else if (recipeName.equals("Salad")) {
            titleTextView.setText("Salad Recipe");
            ingredientsTextView.setText("Ingredients:\n- 4 cups mixed greens\n- 1/2 cup cherry tomatoes, halved\n- 1/2 cup sliced cucumber\n- 1/4 cup crumbled feta cheese\n- 1/4 cup sliced red onion\n- 1/4 cup balsamic vinaigrette\n- Salt and pepper to taste");
            instructionsTextView.setText("Instructions:\n1. Combine mixed greens, cherry tomatoes, cucumber, feta cheese, and red onion in a large bowl.\n2. Drizzle balsamic vinaigrette over the top and toss to combine. Season with salt and pepper to taste.");
        }
    }
}
