package com.akita.compose.component.slider;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.l<Float, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f62731l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar) {
        super(1);
        this.f62731l = qVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Float f12) {
        int i12;
        float fFloatValue = f12.floatValue();
        q qVar = this.f62731l;
        kotlin.ranges.f<Float> fVar = qVar.f62738a;
        float f13 = kotlin.ranges.s.f(fFloatValue, fVar.d().floatValue(), fVar.g().floatValue());
        boolean z12 = true;
        int i13 = qVar.f62740c;
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
        InterfaceC22192v1 interfaceC22192v1 = qVar.f62741d;
        if (f13 == ((C22040c3) interfaceC22192v1).f()) {
            z12 = false;
        } else {
            if (f13 != ((C22040c3) interfaceC22192v1).f()) {
                Y41.l<? super Float, G0> lVar = qVar.f62747j;
                if (lVar != null) {
                    lVar.invoke(Float.valueOf(f13));
                } else {
                    qVar.d(f13);
                }
            }
            Y41.a<G0> aVar = qVar.f62739b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return Boolean.valueOf(z12);
    }
}
