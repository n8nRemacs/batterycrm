package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class V1 extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f27507l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f27507l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final Float invoke(Float f12) {
        return (Float) ((Y41.l) this.f27507l.getValue()).invoke(Float.valueOf(f12.floatValue()));
    }
}
