package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "x", "", "y", "invoke", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S1 extends kotlin.jvm.internal.N implements Y41.p<Float, Float, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O1 f27461l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(O1 o12) {
        super(2);
        this.f27461l = o12;
    }

    @Override // Y41.p
    public final Boolean invoke(Float f12, Float f13) {
        float fFloatValue = f12.floatValue();
        float fFloatValue2 = f13.floatValue();
        O1 o12 = this.f27461l;
        C43259k.d(o12.Y1(), null, null, new R1(o12, fFloatValue, fFloatValue2, null), 3);
        return Boolean.TRUE;
    }
}
