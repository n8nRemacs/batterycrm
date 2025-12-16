package M2;

import M2.c;
import Y61.k;
import Y61.l;
import coil.request.e;
import coil.request.q;
import coil.request.x;
import kotlin.Metadata;

/* compiled from: NoneTransition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LM2/b;", "LM2/c;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f10354a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f10355b;

    /* compiled from: NoneTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM2/b$a;", "LM2/c$a;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c.a {
        @Override // M2.c.a
        @k
        public final c a(@k d dVar, @k q qVar) {
            return new b(dVar, qVar);
        }

        public final boolean equals(@l Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(@k d dVar, @k q qVar) {
        this.f10354a = dVar;
        this.f10355b = qVar;
    }

    @Override // M2.c
    public final void a() {
        q qVar = this.f10355b;
        boolean z12 = qVar instanceof x;
        d dVar = this.f10354a;
        if (z12) {
            dVar.b(((x) qVar).f58738a);
        } else if (qVar instanceof e) {
            dVar.d(((e) qVar).f58641a);
        }
    }
}
