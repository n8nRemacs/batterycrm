package defpackage;

import android.content.Context;
import androidx.media3.effect.SingleInputVideoGraph$Factory;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e7a implements r4h {
    public final /* synthetic */ int a;
    public final c4h b;

    public e7a(c4h c4hVar) {
        this.a = 0;
        this.b = c4hVar;
    }

    @Override // defpackage.r4h
    public final t4h a(Context context, gf3 gf3Var, uy0 uy0Var, s4h s4hVar, Executor executor, long j, boolean z) {
        switch (this.a) {
            case 0:
                return new f7a(uy0Var, gf3Var, this.b, s4hVar, context, executor, z);
            default:
                try {
                    return ((r4h) SingleInputVideoGraph$Factory.class.getConstructor(c4h.class).newInstance((k3c) this.b)).a(context, gf3Var, uy0Var, s4hVar, executor, j, z);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }

    public e7a() {
        this.a = 1;
        this.b = new k3c();
    }
}
