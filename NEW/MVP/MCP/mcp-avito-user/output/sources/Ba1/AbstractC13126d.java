package Ba1;

import android.widget.ImageView;

/* renamed from: Ba1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13126d {
    public static final void a(ImageView imageView) {
        androidx.dynamicanimation.animation.i iVar = new androidx.dynamicanimation.animation.i(imageView, androidx.dynamicanimation.animation.c.f46025n, 1.0f);
        androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j(1.0f);
        jVar.a(0.5f);
        jVar.b(200.0f);
        iVar.f46047t = jVar;
        androidx.dynamicanimation.animation.i iVar2 = new androidx.dynamicanimation.animation.i(imageView, androidx.dynamicanimation.animation.c.f46026o, 1.0f);
        androidx.dynamicanimation.animation.j jVar2 = new androidx.dynamicanimation.animation.j(1.0f);
        jVar2.a(0.5f);
        jVar2.b(200.0f);
        iVar2.f46047t = jVar2;
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        iVar2.j();
        iVar.j();
    }
}
