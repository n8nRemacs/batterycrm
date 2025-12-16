package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class tm4 implements rl3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fsc b;

    public /* synthetic */ tm4(fsc fscVar, int i) {
        this.a = i;
        this.b = fscVar;
    }

    @Override // defpackage.rl3
    public final Object j(v6d v6dVar) {
        switch (this.a) {
            case 0:
                return new vm4((Context) v6dVar.a(Context.class), ((h06) v6dVar.a(h06.class)).c(), v6dVar.b(fsc.a(v17.class)), v6dVar.c(cr4.class), (Executor) v6dVar.f(this.b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, v6dVar);
        }
    }
}
