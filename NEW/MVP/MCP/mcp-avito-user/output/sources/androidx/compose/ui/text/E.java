package androidx.compose.ui.text;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/M;", "paragraphInfo", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/M;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<M, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f41909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float[] f41910m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f41911n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.e f41912o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(long j12, float[] fArr, l0.f fVar, l0.e eVar) {
        super(1);
        this.f41909l = j12;
        this.f41910m = fArr;
        this.f41911n = fVar;
        this.f41912o = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(M m12) {
        M m13 = m12;
        int i12 = m13.f41933b;
        long j12 = this.f41909l;
        int iG2 = i12 > v0.g(j12) ? m13.f41933b : v0.g(j12);
        int iF2 = v0.f(j12);
        int iF3 = m13.f41934c;
        if (iF3 >= iF2) {
            iF3 = v0.f(j12);
        }
        long jA2 = w0.a(m13.d(iG2), m13.d(iF3));
        l0.f fVar = this.f41911n;
        int i13 = fVar.f406840b;
        float[] fArr = this.f41910m;
        L l12 = m13.f41932a;
        l12.q(jA2, fArr, i13);
        int iE2 = (v0.e(jA2) * 4) + fVar.f406840b;
        int i14 = fVar.f406840b;
        while (true) {
            l0.e eVar = this.f41912o;
            if (i14 >= iE2) {
                fVar.f406840b = iE2;
                eVar.f406839b = l12.getHeight() + eVar.f406839b;
                return G0.f406611a;
            }
            int i15 = i14 + 1;
            float f12 = fArr[i15];
            float f13 = eVar.f406839b;
            fArr[i15] = f12 + f13;
            int i16 = i14 + 3;
            fArr[i16] = fArr[i16] + f13;
            i14 += 4;
        }
    }
}
