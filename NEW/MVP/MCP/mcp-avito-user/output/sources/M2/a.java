package M2;

import M2.b;
import M2.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.request.e;
import coil.request.q;
import coil.request.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CrossfadeTransition.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LM2/a;", "LM2/c;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f10348a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f10349b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10350c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10351d;

    /* compiled from: CrossfadeTransition.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM2/a$a;", "LM2/c$a;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: M2.a$a, reason: collision with other inner class name */
    public static final class C0657a implements c.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f10352b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10353c;

        @j
        public C0657a() {
            this(0, false, 3, null);
        }

        @Override // M2.c.a
        @k
        public final c a(@k d dVar, @k q qVar) {
            boolean z12 = qVar instanceof x;
            b.a aVar = c.a.f10356a;
            if (!z12) {
                aVar.getClass();
                return new b(dVar, qVar);
            }
            if (((x) qVar).f58740c != DataSource.f58268b) {
                return new a(dVar, qVar, this.f10352b, this.f10353c);
            }
            aVar.getClass();
            return new b(dVar, qVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0657a) {
                C0657a c0657a = (C0657a) obj;
                if (this.f10352b == c0657a.f10352b && this.f10353c == c0657a.f10353c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10353c) + (this.f10352b * 31);
        }

        public C0657a(int i12, boolean z12, int i13, C42822w c42822w) {
            i12 = (i13 & 1) != 0 ? 100 : i12;
            z12 = (i13 & 2) != 0 ? false : z12;
            this.f10352b = i12;
            this.f10353c = z12;
            if (i12 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }
    }

    @j
    public a(@k d dVar, @k q qVar, int i12, boolean z12) {
        this.f10348a = dVar;
        this.f10349b = qVar;
        this.f10350c = i12;
        this.f10351d = z12;
        if (i12 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // M2.c
    public final void a() {
        d dVar = this.f10348a;
        Drawable drawableA = dVar.a();
        q qVar = this.f10349b;
        boolean z12 = qVar instanceof x;
        G2.a aVar = new G2.a(drawableA, qVar.getF58738a(), qVar.getF58739b().f58648C, this.f10350c, (z12 && ((x) qVar).f58744g) ? false : true, this.f10351d);
        if (z12) {
            dVar.b(aVar);
        } else if (qVar instanceof e) {
            dVar.d(aVar);
        }
    }

    public /* synthetic */ a(d dVar, q qVar, int i12, boolean z12, int i13, C42822w c42822w) {
        this(dVar, qVar, (i13 & 4) != 0 ? 100 : i12, (i13 & 8) != 0 ? false : z12);
    }
}
