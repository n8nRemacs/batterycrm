package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.gestures.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20458h extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20430a f27727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.e f27728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20458h(InterfaceC20430a interfaceC20430a, l0.e eVar) {
        super(2);
        this.f27727l = interfaceC20430a;
        this.f27728m = eVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(Float f12, Float f13) {
        float fFloatValue = f12.floatValue();
        this.f27727l.a(fFloatValue, f13.floatValue());
        this.f27728m.f406839b = fFloatValue;
        return kotlin.G0.f406611a;
    }
}
