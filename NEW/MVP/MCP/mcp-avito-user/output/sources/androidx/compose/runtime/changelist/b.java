package androidx.compose.runtime.changelist;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.C22068g;
import androidx.compose.runtime.C22153s1;
import androidx.compose.runtime.C22183t1;
import androidx.compose.runtime.G;
import androidx.compose.runtime.I;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.K2;
import androidx.compose.runtime.changelist.d;
import androidx.compose.runtime.changelist.g;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComposerChangeListWriter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/changelist/b;", "", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B f38191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public androidx.compose.runtime.changelist.a f38192b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38193c;

    /* renamed from: f, reason: collision with root package name */
    public int f38196f;

    /* renamed from: g, reason: collision with root package name */
    public int f38197g;

    /* renamed from: l, reason: collision with root package name */
    public int f38202l;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final I0 f38194d = new I0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f38195e = true;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f38198h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f38199i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f38200j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f38201k = -1;

    /* compiled from: ComposerChangeListWriter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/changelist/b$a;", "", "<init>", "()V", "", "invalidGroupLocation", "I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@k B b12, @k androidx.compose.runtime.changelist.a aVar) {
        this.f38191a = b12;
        this.f38192b = aVar;
    }

    public final void a(@l C22153s1 c22153s1, @k I i12, @k C22183t1 c22183t1, @k C22183t1 c22183t12) {
        androidx.compose.runtime.changelist.a aVar = this.f38192b;
        aVar.getClass();
        d.C22044e c22044e = d.C22044e.f38224c;
        g gVar = aVar.f38190a;
        gVar.g(c22044e);
        int i13 = gVar.f38250f - gVar.f38245a[gVar.f38246b - 1].f38206b;
        Object[] objArr = gVar.f38249e;
        objArr[i13] = c22153s1;
        objArr[i13 + 1] = i12;
        objArr[i13 + 3] = c22183t12;
        objArr[i13 + 2] = c22183t1;
    }

    public final void b() {
        d();
        ArrayList arrayList = this.f38198h;
        if (arrayList.isEmpty()) {
            this.f38197g++;
        } else {
            C22026a.e(1, arrayList);
        }
    }

    public final void c() {
        int i12 = this.f38197g;
        if (i12 > 0) {
            androidx.compose.runtime.changelist.a aVar = this.f38192b;
            aVar.getClass();
            d.K k12 = d.K.f38218c;
            g gVar = aVar.f38190a;
            gVar.g(k12);
            gVar.f38247c[gVar.f38248d - gVar.f38245a[gVar.f38246b - 1].f38205a] = i12;
            this.f38197g = 0;
        }
        ArrayList arrayList = this.f38198h;
        if (arrayList.isEmpty()) {
            return;
        }
        androidx.compose.runtime.changelist.a aVar2 = this.f38192b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        aVar2.getClass();
        if (size != 0) {
            d.C22047h c22047h = d.C22047h.f38227c;
            g gVar2 = aVar2.f38190a;
            gVar2.g(c22047h);
            g.b.a(gVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void d() {
        int i12 = this.f38202l;
        if (i12 > 0) {
            int i13 = this.f38199i;
            if (i13 >= 0) {
                c();
                androidx.compose.runtime.changelist.a aVar = this.f38192b;
                aVar.getClass();
                d.z zVar = d.z.f38244c;
                g gVar = aVar.f38190a;
                gVar.g(zVar);
                int i14 = gVar.f38248d - gVar.f38245a[gVar.f38246b - 1].f38205a;
                int[] iArr = gVar.f38247c;
                iArr[i14] = i13;
                iArr[i14 + 1] = i12;
                this.f38199i = -1;
            } else {
                int i15 = this.f38201k;
                int i16 = this.f38200j;
                c();
                androidx.compose.runtime.changelist.a aVar2 = this.f38192b;
                aVar2.getClass();
                d.s sVar = d.s.f38238c;
                g gVar2 = aVar2.f38190a;
                gVar2.g(sVar);
                int i17 = gVar2.f38248d - gVar2.f38245a[gVar2.f38246b - 1].f38205a;
                int[] iArr2 = gVar2.f38247c;
                iArr2[i17 + 1] = i15;
                iArr2[i17] = i16;
                iArr2[i17 + 2] = i12;
                this.f38200j = -1;
                this.f38201k = -1;
            }
            this.f38202l = 0;
        }
    }

    public final void e(boolean z12) {
        B b12 = this.f38191a;
        int i12 = z12 ? b12.f37878G.f38005i : b12.f37878G.f38003g;
        int i13 = i12 - this.f38196f;
        if (i13 < 0) {
            G.c("Tried to seek backward");
        }
        if (i13 > 0) {
            androidx.compose.runtime.changelist.a aVar = this.f38192b;
            aVar.getClass();
            d.C22041a c22041a = d.C22041a.f38220c;
            g gVar = aVar.f38190a;
            gVar.g(c22041a);
            gVar.f38247c[gVar.f38248d - gVar.f38245a[gVar.f38246b - 1].f38205a] = i13;
            this.f38196f = i12;
        }
    }

    public final void f() {
        K2 k22 = this.f38191a.f37878G;
        if (k22.f37999c > 0) {
            int i12 = k22.f38005i;
            I0 i02 = this.f38194d;
            if (i02.a(-2) != i12) {
                if (!this.f38193c && this.f38195e) {
                    e(false);
                    androidx.compose.runtime.changelist.a aVar = this.f38192b;
                    aVar.getClass();
                    aVar.f38190a.g(d.n.f38233c);
                    this.f38193c = true;
                }
                if (i12 > 0) {
                    C22068g c22068gA = k22.a(i12);
                    i02.c(i12);
                    e(false);
                    androidx.compose.runtime.changelist.a aVar2 = this.f38192b;
                    aVar2.getClass();
                    d.m mVar = d.m.f38232c;
                    g gVar = aVar2.f38190a;
                    gVar.g(mVar);
                    g.b.a(gVar, 0, c22068gA);
                    this.f38193c = true;
                }
            }
        }
    }

    public final void g(int i12, int i13) {
        if (i13 > 0) {
            if (!(i12 >= 0)) {
                G.c("Invalid remove index " + i12);
            }
            if (this.f38199i == i12) {
                this.f38202l += i13;
                return;
            }
            d();
            this.f38199i = i12;
            this.f38202l = i13;
        }
    }
}
