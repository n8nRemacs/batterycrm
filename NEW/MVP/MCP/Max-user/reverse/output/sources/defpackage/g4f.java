package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g4f implements h4f {
    public final /* synthetic */ int a = 1;

    public static final String c(Bitmap bitmap) {
        String strF = ho7.f(System.identityHashCode(bitmap), "@");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str = bitmap.isRecycled() ? "|recycled" : "";
        int generationId = bitmap.getGenerationId();
        StringBuilder sbM = utb.m(width, "Bitmap", strF, "(", "x");
        sbM.append(height);
        sbM.append(str);
        sbM.append("|genId=");
        sbM.append(generationId);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // defpackage.h4f
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    @Override // defpackage.h4f
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
