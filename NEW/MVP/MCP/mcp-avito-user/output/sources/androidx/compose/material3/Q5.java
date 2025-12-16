package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U5 f35338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f35339m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Long f35340n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f35341o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21648j4 f35342p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35343q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(U5 u52, Long l12, Long l13, int i12, InterfaceC21648j4 interfaceC21648j4, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f35338l = u52;
        this.f35339m = l12;
        this.f35340n = l13;
        this.f35341o = i12;
        this.f35342p = interfaceC21648j4;
        this.f35343q = vVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(221185);
        U5 u52 = this.f35338l;
        u52.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-1611069472);
        Long l12 = this.f35339m;
        int i12 = (bE2.B(l12) ? 4 : 2) | iA2;
        Long l13 = this.f35340n;
        int i13 = i12 | (bE2.B(l13) ? 32 : 16);
        int i14 = this.f35341o;
        int i15 = i13 | (bE2.m(i14) ? 256 : 128);
        InterfaceC21648j4 interfaceC21648j4 = this.f35342p;
        int i16 = i15 | (bE2.B(interfaceC21648j4) ? 2048 : 1024);
        int i17 = 74899 & i16;
        androidx.compose.ui.v vVar2 = this.f35343q;
        if (i17 == 74898 && bE2.c()) {
            bE2.f();
            vVar = vVar2;
        } else {
            int i18 = Ng.f35206b;
            String strA = Og.a(bE2, R.string.m3c_date_range_picker_start_headline);
            String strA2 = Og.a(bE2, R.string.m3c_date_range_picker_end_headline);
            C22096n c22096nB = androidx.compose.runtime.internal.r.b(bE2, 482821121, new O5(strA));
            C22096n c22096nB2 = androidx.compose.runtime.internal.r.b(bE2, -1522669758, new P5(strA2));
            B3.f34535a.getClass();
            vVar = vVar2;
            u52.a(l12, l13, i14, interfaceC21648j4, vVar, strA, strA2, c22096nB, c22096nB2, B3.f34536b, bE2, (i16 & 7168) | (i16 & 14) | 918552576 | (i16 & 112) | (i16 & 896) | 24576, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Q5(u52, l12, l13, i14, interfaceC21648j4, vVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
