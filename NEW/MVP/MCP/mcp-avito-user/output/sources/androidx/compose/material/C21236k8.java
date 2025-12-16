package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21236k8 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f33744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, Float> f33745m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33746n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f33747o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f33748p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21236k8(kotlin.ranges.f fVar, Y41.l lVar, float f12, InterfaceC22192v1 interfaceC22192v1, kotlin.ranges.f fVar2) {
        super(0);
        this.f33744l = fVar;
        this.f33745m = lVar;
        this.f33746n = f12;
        this.f33747o = interfaceC22192v1;
        this.f33748p = fVar2;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        kotlin.ranges.f<Float> fVar = this.f33744l;
        float fFloatValue = (fVar.g().floatValue() - fVar.d().floatValue()) / 1000;
        float fFloatValue2 = this.f33745m.invoke(Float.valueOf(this.f33746n)).floatValue();
        InterfaceC22192v1 interfaceC22192v1 = this.f33747o;
        if (Math.abs(fFloatValue2 - interfaceC22192v1.getF42167b().floatValue()) > fFloatValue) {
            if (this.f33748p.e(interfaceC22192v1.getF42167b())) {
                interfaceC22192v1.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return kotlin.G0.f406611a;
    }
}
