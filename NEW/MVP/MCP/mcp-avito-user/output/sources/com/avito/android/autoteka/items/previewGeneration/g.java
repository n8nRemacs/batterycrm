package com.avito.android.autoteka.items.previewGeneration;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PreviewGenerationView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/previewGeneration/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/previewGeneration/f;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {
    @Override // com.avito.android.autoteka.items.previewGeneration.f
    public final void IE() {
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.animation_image);
        imageView.setBackgroundResource(R.drawable.autoteka_preview_generation_animation);
        Drawable background = imageView.getBackground();
        AnimationDrawable animationDrawable = background instanceof AnimationDrawable ? (AnimationDrawable) background : null;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }
}
