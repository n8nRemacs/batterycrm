package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kn4 implements je7 {
    public final je7 a;
    public final je7 b;
    public final s2c c;
    public final bf d = new bf(1, this);
    public final Map e;

    public kn4(bf bfVar, ze zeVar, s2c s2cVar, HashMap map) {
        this.a = bfVar;
        this.b = zeVar;
        this.c = s2cVar;
        this.e = map;
    }

    @Override // defpackage.je7
    public final sc3 a(ce5 ce5Var, int i, ksc kscVar, ie7 ie7Var) throws IOException {
        InputStream inputStreamW;
        je7 je7Var;
        ie7Var.getClass();
        ce5Var.i0();
        me7 me7VarC = ce5Var.b;
        if ((me7VarC == null || me7VarC == me7.c) && (inputStreamW = ce5Var.w()) != null) {
            Object obj = ne7.d;
            try {
                me7VarC = jfi.c(inputStreamW);
                ce5Var.b = me7VarC;
            } catch (IOException e) {
                rei.g(e);
                throw null;
            }
        }
        Map map = this.e;
        return (map == null || (je7Var = (je7) map.get(me7VarC)) == null) ? this.d.a(ce5Var, i, kscVar, ie7Var) : je7Var.a(ce5Var, i, kscVar, ie7Var);
    }

    public final CloseableStaticBitmap b(ce5 ce5Var, ie7 ie7Var) {
        vc3 vc3VarC = this.c.c(ce5Var, ie7Var.a);
        try {
            vc3VarC.getClass();
            fh7 fh7Var = fh7.d;
            ce5Var.i0();
            int i = ce5Var.c;
            ce5Var.i0();
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(vc3VarC, fh7Var, i, ce5Var.d);
            closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            vc3VarC.close();
            return closeableStaticBitmapOf;
        } catch (Throwable th) {
            vc3.P(vc3VarC);
            throw th;
        }
    }
}
