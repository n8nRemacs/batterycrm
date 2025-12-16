package androidx.core.provider;

import androidx.core.graphics.z;
import androidx.core.provider.m;
import androidx.core.provider.o;
import j.N;
import java.util.concurrent.Executor;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final z.a f44812a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Executor f44813b;

    public c(@N z.a aVar, @N Executor executor) {
        this.f44812a = aVar;
        this.f44813b = executor;
    }

    public final void a(@N m.a aVar) {
        int i12 = aVar.f44840b;
        Executor executor = this.f44813b;
        z.a aVar2 = this.f44812a;
        if (i12 == 0) {
            ((o.b) executor).execute(new a(aVar2, aVar.f44839a));
        } else {
            ((o.b) executor).execute(new b(aVar2, i12));
        }
    }
}
