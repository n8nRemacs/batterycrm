package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Connector.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h;", "", "Landroidx/compose/ui/graphics/colorspace/c;", SearchParamsConverterKt.SOURCE, "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/n;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I[FLkotlin/jvm/internal/w;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;ILkotlin/jvm/internal/w;)V", "a", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f39416e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f39417a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f39418b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f39419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final float[] f39420d;

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Connector.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h$b;", "Landroidx/compose/ui/graphics/colorspace/h;", "Landroidx/compose/ui/graphics/colorspace/r;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/n;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/r;Landroidx/compose/ui/graphics/colorspace/r;ILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends h {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final r f39421f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final r f39422g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final float[] f39423h;

        public b(r rVar, r rVar2, int i12, C42822w c42822w) {
            float[] fArrF;
            super(rVar, rVar2, rVar, rVar2, i12, null, null);
            this.f39421f = rVar;
            this.f39422g = rVar2;
            boolean zC2 = d.c(rVar.f39448d, rVar2.f39448d);
            float[] fArrF2 = rVar.f39453i;
            float[] fArrE = rVar2.f39454j;
            if (zC2) {
                fArrF = d.f(fArrE, fArrF2);
            } else {
                u uVar = rVar.f39448d;
                float[] fArrA = uVar.a();
                u uVar2 = rVar2.f39448d;
                float[] fArrA2 = uVar2.a();
                k.f39425a.getClass();
                u uVar3 = k.f39427c;
                if (!d.c(uVar, uVar3)) {
                    androidx.compose.ui.graphics.colorspace.a.f39377b.getClass();
                    fArrF2 = d.f(d.b(androidx.compose.ui.graphics.colorspace.a.f39378c.f39379a, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArrF2);
                }
                if (!d.c(uVar2, uVar3)) {
                    androidx.compose.ui.graphics.colorspace.a.f39377b.getClass();
                    fArrE = d.e(d.f(d.b(androidx.compose.ui.graphics.colorspace.a.f39378c.f39379a, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rVar2.f39453i));
                }
                n.f39435b.getClass();
                fArrF = d.f(fArrE, n.a(i12, n.f39438e) ? d.g(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrF2) : fArrF2);
            }
            this.f39423h = fArrF;
        }

        @Override // androidx.compose.ui.graphics.colorspace.h
        public final long a(long j12) {
            float fI2 = T.i(j12);
            float fH2 = T.h(j12);
            float f12 = T.f(j12);
            float fE2 = T.e(j12);
            r rVar = this.f39421f;
            float fA2 = (float) rVar.f39460p.a(fI2);
            o oVar = rVar.f39460p;
            float fA3 = (float) oVar.a(fH2);
            float fA4 = (float) oVar.a(f12);
            float[] fArr = this.f39423h;
            float f13 = (fArr[6] * fA4) + (fArr[3] * fA3) + (fArr[0] * fA2);
            float f14 = (fArr[7] * fA4) + (fArr[4] * fA3) + (fArr[1] * fA2);
            float f15 = (fArr[8] * fA4) + (fArr[5] * fA3) + (fArr[2] * fA2);
            r rVar2 = this.f39422g;
            float fA5 = (float) rVar2.f39457m.a(f13);
            double d12 = f14;
            o oVar2 = rVar2.f39457m;
            return V.a(fA5, (float) oVar2.a(d12), (float) oVar2.a(f15), fE2, rVar2);
        }
    }

    public h(c cVar, c cVar2, c cVar3, c cVar4, int i12, float[] fArr, C42822w c42822w) {
        this.f39417a = cVar2;
        this.f39418b = cVar3;
        this.f39419c = cVar4;
        this.f39420d = fArr;
    }

    public long a(long j12) {
        float fI2 = T.i(j12);
        float fH2 = T.h(j12);
        float f12 = T.f(j12);
        float fE2 = T.e(j12);
        c cVar = this.f39418b;
        long jE2 = cVar.e(fI2, fH2, f12);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fG2 = cVar.g(fI2, fH2, f12);
        float[] fArr = this.f39420d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG2 *= fArr[2];
        }
        float f13 = fIntBitsToFloat;
        float f14 = fIntBitsToFloat2;
        return this.f39419c.h(f13, f14, fG2, fE2, this.f39417a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(c cVar, c cVar2, int i12, C42822w c42822w) {
        c cVarA;
        c cVarA2;
        float[] fArrA;
        float[] fArrA2;
        long j12 = cVar.f39387b;
        androidx.compose.ui.graphics.colorspace.b.f39380b.getClass();
        long j13 = androidx.compose.ui.graphics.colorspace.b.f39381c;
        if (androidx.compose.ui.graphics.colorspace.b.a(j12, j13)) {
            k.f39425a.getClass();
            cVarA = d.a(cVar, k.f39427c);
        } else {
            cVarA = cVar;
        }
        if (androidx.compose.ui.graphics.colorspace.b.a(cVar2.f39387b, j13)) {
            k.f39425a.getClass();
            cVarA2 = d.a(cVar2, k.f39427c);
        } else {
            cVarA2 = cVar2;
        }
        f39416e.getClass();
        n.f39435b.getClass();
        float[] fArr = null;
        if (n.a(i12, n.f39438e)) {
            boolean zA2 = androidx.compose.ui.graphics.colorspace.b.a(cVar.f39387b, j13);
            boolean zA3 = androidx.compose.ui.graphics.colorspace.b.a(cVar2.f39387b, j13);
            if ((!zA2 || !zA3) && (zA2 || zA3)) {
                u uVar = ((r) (zA2 ? cVar : cVar2)).f39448d;
                if (zA2) {
                    fArrA = uVar.a();
                } else {
                    k.f39425a.getClass();
                    fArrA = k.f39430f;
                }
                if (zA3) {
                    fArrA2 = uVar.a();
                } else {
                    k.f39425a.getClass();
                    fArrA2 = k.f39430f;
                }
                fArr = new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]};
            }
        }
        this(cVar, cVar2, cVarA, cVarA2, i12, fArr, null);
    }
}
