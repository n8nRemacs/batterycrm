package androidx.compose.foundation.text;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "delta", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F2 extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J2 f30251l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(J2 j22) {
        super(1);
        this.f30251l = j22;
    }

    @Override // Y41.l
    public final Float invoke(Float f12) {
        float fFloatValue = f12.floatValue();
        J2 j22 = this.f30251l;
        InterfaceC22192v1 interfaceC22192v1 = j22.f30371a;
        float f13 = ((C22040c3) interfaceC22192v1).f() + fFloatValue;
        C22040c3 c22040c3 = (C22040c3) j22.f30372b;
        if (f13 > c22040c3.f()) {
            fFloatValue = c22040c3.f() - ((C22040c3) interfaceC22192v1).f();
        } else if (f13 < 0.0f) {
            fFloatValue = -((C22040c3) interfaceC22192v1).f();
        }
        ((C22040c3) interfaceC22192v1).S6(((C22040c3) interfaceC22192v1).f() + fFloatValue);
        return Float.valueOf(fFloatValue);
    }
}
