package androidx.compose.material3;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import java.io.Serializable;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: TextFieldImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "labelProgress", "Landroidx/compose/ui/graphics/T;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "prefixSuffixAlphaProgress", "Lkotlin/G0;", "invoke-eopBjH0", "(FJJFFLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Oi extends kotlin.jvm.internal.N implements Y41.u<Float, androidx.compose.ui.graphics.T, androidx.compose.ui.graphics.T, Float, Float, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f35250A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f35251B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f35252C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f35253D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35254E;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21935vi f35256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f35257n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f35258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f35259p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35260q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f35261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35263t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35264u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35265v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35266w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TextFieldType f35267x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35268y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f35269z;

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oi(Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, C21935vi c21935vi, boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, String str, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar3, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar4, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar5, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar6, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar7, TextFieldType textFieldType, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar8, boolean z14, androidx.compose.foundation.layout.T1 t12, boolean z15, androidx.compose.ui.text.x0 x0Var, androidx.compose.ui.text.x0 x0Var2, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar9) {
        super(7);
        this.f35255l = pVar;
        this.f35256m = c21935vi;
        this.f35257n = z12;
        this.f35258o = z13;
        this.f35259p = kVar;
        this.f35260q = pVar2;
        this.f35261r = str;
        this.f35262s = pVar3;
        this.f35263t = pVar4;
        this.f35264u = pVar5;
        this.f35265v = pVar6;
        this.f35266w = pVar7;
        this.f35267x = textFieldType;
        this.f35268y = pVar8;
        this.f35269z = z14;
        this.f35250A = t12;
        this.f35251B = z15;
        this.f35252C = x0Var;
        this.f35253D = x0Var2;
        this.f35254E = pVar9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.u
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        int i12;
        int i13;
        long j12;
        C22096n c22096n;
        C22096n c22096nB;
        float fFloatValue = ((Number) obj).floatValue();
        long j13 = ((androidx.compose.ui.graphics.T) obj2).f39331a;
        long j14 = ((androidx.compose.ui.graphics.T) obj3).f39331a;
        float fFloatValue2 = ((Number) obj4).floatValue();
        float fFloatValue3 = ((Number) obj5).floatValue();
        androidx.compose.runtime.A a12 = (androidx.compose.runtime.A) obj6;
        int iIntValue = ((Number) serializable).intValue();
        if ((iIntValue & 6) == 0) {
            i12 = (a12.k(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i12 |= a12.n(j13) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i12 |= a12.n(j14) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i12 |= a12.k(fFloatValue2) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i12 |= a12.k(fFloatValue3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i14 = i12;
        if ((74899 & i14) == 74898 && a12.c()) {
            a12.f();
        } else {
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f35255l;
            C22096n c22096nB2 = pVar != null ? androidx.compose.runtime.internal.r.b(a12, -382297919, new Ri(fFloatValue, j14, pVar, this.f35251B, j13)) : null;
            C21935vi c21935vi = this.f35256m;
            c21935vi.getClass();
            a12.I(653850713);
            androidx.compose.foundation.interaction.k kVar = this.f35259p;
            InterfaceC22204y1 interfaceC22204y1A = androidx.compose.foundation.interaction.f.a(kVar, a12, 0);
            boolean z12 = this.f35258o;
            boolean z13 = this.f35257n;
            if (z13) {
                i13 = i14;
                j12 = z12 ? c21935vi.f37588E : ((Boolean) interfaceC22204y1A.getF42167b()).booleanValue() ? c21935vi.f37585B : c21935vi.f37586C;
            } else {
                i13 = i14;
                j12 = c21935vi.f37587D;
            }
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(j12), a12);
            a12.O();
            long j15 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f35260q;
            C22096n c22096nB3 = (pVar2 == null || this.f35261r.length() != 0 || fFloatValue2 <= 0.0f) ? null : androidx.compose.runtime.internal.r.b(a12, -524658155, new Ti(fFloatValue2, j15, pVar2));
            a12.I(129569364);
            InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(androidx.compose.ui.graphics.T.a(!z13 ? c21935vi.f37595L : z12 ? c21935vi.f37596M : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? c21935vi.f37593J : c21935vi.f37594K), a12);
            a12.O();
            long j16 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M2.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f35262s;
            C22096n c22096nB4 = (pVar3 == null || fFloatValue3 <= 0.0f) ? null : androidx.compose.runtime.internal.r.b(a12, 1824482619, new Ui(fFloatValue3, j16, this.f35252C, pVar3));
            a12.I(1575329427);
            InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(androidx.compose.ui.graphics.T.a(!z13 ? c21935vi.f37599P : z12 ? c21935vi.f37600Q : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? c21935vi.f37597N : c21935vi.f37598O), a12);
            a12.O();
            long j17 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M3.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f35263t;
            if (pVar4 == null || fFloatValue3 <= 0.0f) {
                c22096n = c22096nB4;
                c22096nB = null;
            } else {
                c22096n = c22096nB4;
                c22096nB = androidx.compose.runtime.internal.r.b(a12, 907456412, new Vi(fFloatValue3, j17, this.f35252C, pVar4));
            }
            a12.I(925127045);
            InterfaceC22204y1 interfaceC22204y1M4 = C22126m3.m(androidx.compose.ui.graphics.T.a(!z13 ? c21935vi.f37618r : z12 ? c21935vi.f37619s : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? c21935vi.f37616p : c21935vi.f37617q), a12);
            a12.O();
            long j18 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M4.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f35264u;
            C22096n c22096nB5 = pVar5 != null ? androidx.compose.runtime.internal.r.b(a12, 90769583, new Si(j18, pVar5)) : null;
            a12.I(-109504137);
            InterfaceC22204y1 interfaceC22204y1M5 = C22126m3.m(androidx.compose.ui.graphics.T.a(!z13 ? c21935vi.f37622v : z12 ? c21935vi.f37623w : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? c21935vi.f37620t : c21935vi.f37621u), a12);
            a12.O();
            long j19 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M5.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar6 = this.f35265v;
            C22096n c22096nB6 = pVar6 != null ? androidx.compose.runtime.internal.r.b(a12, 2077796155, new Xi(j19, pVar6)) : null;
            a12.I(1464709698);
            InterfaceC22204y1 interfaceC22204y1M6 = C22126m3.m(androidx.compose.ui.graphics.T.a(!z13 ? c21935vi.f37591H : z12 ? c21935vi.f37592I : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? c21935vi.f37589F : c21935vi.f37590G), a12);
            a12.O();
            long j22 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M6.getF42167b()).f39331a;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar7 = this.f35266w;
            C22096n c22096nB7 = pVar7 != null ? androidx.compose.runtime.internal.r.b(a12, -1531019900, new Wi(j22, this.f35253D, pVar7)) : null;
            int iOrdinal = this.f35267x.ordinal();
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar8 = this.f35254E;
            if (iOrdinal == 0) {
                a12.I(404042583);
                C21709lj.a(androidx.compose.ui.v.f42878y1, this.f35268y, c22096nB2, c22096nB3, c22096nB5, c22096nB6, c22096n, c22096nB, this.f35269z, fFloatValue, androidx.compose.runtime.internal.r.b(a12, -2124779163, new Qi(pVar8)), c22096nB7, this.f35250A, a12, (1879048192 & (i13 << 27)) | 6);
                a12.O();
            } else if (iOrdinal != 1) {
                a12.I(404045277);
                a12.O();
            } else {
                a12.I(404043576);
                a12.I(404043645);
                Object objT = a12.t();
                androidx.compose.runtime.A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    l0.n.f413402b.getClass();
                    objT = C22126m3.g(l0.n.a(0L));
                    a12.H(objT);
                }
                InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                a12.O();
                C22096n c22096nB8 = androidx.compose.runtime.internal.r.b(a12, 1902535592, new Pi(interfaceC22204y1, this.f35250A, pVar8));
                v.a aVar = androidx.compose.ui.v.f42878y1;
                a12.I(404044653);
                boolean z14 = (i13 & 14) == 4;
                Object objT2 = a12.t();
                if (z14 || objT2 == c1651a) {
                    objT2 = new Ni(fFloatValue, interfaceC22204y1);
                    a12.H(objT2);
                }
                a12.O();
                C21565fc.c(aVar, this.f35268y, c22096nB3, c22096nB2, c22096nB5, c22096nB6, c22096n, c22096nB, this.f35269z, fFloatValue, (Y41.l) objT2, c22096nB8, c22096nB7, this.f35250A, a12, ((i13 << 27) & 1879048192) | 6);
                a12.O();
            }
        }
        return kotlin.G0.f406611a;
    }
}
