package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O8 extends kotlin.jvm.internal.N implements Y41.l<Float, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f33020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f33021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, kotlin.G0> f33023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33024p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O8(kotlin.ranges.f<Float> fVar, int i12, float f12, Y41.l<? super Float, kotlin.G0> lVar, Y41.a<kotlin.G0> aVar) {
        super(1);
        this.f33020l = fVar;
        this.f33021m = i12;
        this.f33022n = f12;
        this.f33023o = lVar;
        this.f33024p = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Float f12) {
        int i12;
        float fFloatValue = f12.floatValue();
        kotlin.ranges.f<Float> fVar = this.f33020l;
        float f13 = kotlin.ranges.s.f(fFloatValue, fVar.d().floatValue(), fVar.g().floatValue());
        boolean z12 = true;
        int i13 = this.f33021m;
        if (i13 > 0 && (i12 = i13 + 1) >= 0) {
            float fAbs = f13;
            float f14 = fAbs;
            int i14 = 0;
            while (true) {
                float fB2 = E0.e.b(fVar.d().floatValue(), fVar.g().floatValue(), i14 / i12);
                float f15 = fB2 - f13;
                if (Math.abs(f15) <= fAbs) {
                    fAbs = Math.abs(f15);
                    f14 = fB2;
                }
                if (i14 == i12) {
                    break;
                }
                i14++;
            }
            f13 = f14;
        }
        if (f13 == this.f33022n) {
            z12 = false;
        } else {
            this.f33023o.invoke(Float.valueOf(f13));
            Y41.a<kotlin.G0> aVar = this.f33024p;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return Boolean.valueOf(z12);
    }
}
