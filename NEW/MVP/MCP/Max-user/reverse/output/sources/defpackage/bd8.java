package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class bd8 implements je7 {
    public final Context a;
    public final wl8 b;

    public bd8(Context context, wl8 wl8Var) {
        this.a = context;
        this.b = wl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.je7
    public final sc3 a(ce5 ce5Var, int i, ksc kscVar, ie7 ie7Var) {
        v1a v1aVar = a93.s0;
        Context context = this.a;
        try {
            String str = ce5Var.t0;
            if (str == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawableB = r34.b(context, Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
            u6g u6gVar = drawableB instanceof u6g ? (u6g) drawableB : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(v1aVar.x(context).k());
            }
            if (drawableB != 0) {
                return new ok4(drawableB, (hbd) v1aVar.x(context).Y, this.b);
            }
            return null;
        } catch (Throwable th) {
            op5.c("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}
