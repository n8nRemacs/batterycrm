package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b7h extends dtf implements sm6 {
    public k7h X;
    public Uri Y;
    public int Z;
    public n9a o;
    public final /* synthetic */ k7h s0;
    public final /* synthetic */ Uri t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7h(k7h k7hVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.s0 = k7hVar;
        this.t0 = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b7h(this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        k7h k7hVar;
        n9a n9aVar;
        Uri uri;
        int i = this.Z;
        boolean z = true;
        if (i == 0) {
            g8j.b(obj);
            k7hVar = this.s0;
            n9aVar = k7hVar.f;
            this.o = n9aVar;
            this.X = k7hVar;
            uri = this.t0;
            this.Y = uri;
            this.Z = 1;
            Object objE = n9aVar.e(null, this);
            g84 g84Var = g84.a;
            if (objE == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = this.Y;
            k7hVar = this.X;
            n9aVar = this.o;
            g8j.b(obj);
        }
        try {
            Uri uri2 = k7hVar.h;
            js jsVar = k7hVar.g;
            if (uri2 == null) {
                x9f x9fVar = k7hVar.i;
                if (x9fVar == null || !x9fVar.isActive()) {
                    z = false;
                }
                if (!z && jsVar.isEmpty()) {
                    k7hVar.h = uri;
                }
            }
            jsVar.addLast(new y6h(uri, false));
            n9aVar.g(null);
            return qqg.a;
        } catch (Throwable th) {
            n9aVar.g(null);
            throw th;
        }
    }
}
