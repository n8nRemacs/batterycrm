package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/f3;", "Landroidx/compose/material/BottomDrawerValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/f3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21257m3 extends kotlin.jvm.internal.N implements Y41.l<C21166f3<BottomDrawerValue>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33805l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f33806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f33807n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21257m3(float f12, float f13, boolean z12) {
        super(1);
        this.f33805l = f12;
        this.f33806m = f13;
        this.f33807n = z12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21166f3<BottomDrawerValue> c21166f3) {
        C21166f3<BottomDrawerValue> c21166f32 = c21166f3;
        BottomDrawerValue bottomDrawerValue = BottomDrawerValue.f32449b;
        float f12 = this.f33805l;
        c21166f32.a(bottomDrawerValue, f12);
        float f13 = 0.5f * f12;
        float f14 = this.f33806m;
        if (f14 > f13 || this.f33807n) {
            c21166f32.a(BottomDrawerValue.f32450c, f13);
        }
        if (f14 > 0.0f) {
            c21166f32.a(BottomDrawerValue.f32451d, Math.max(0.0f, f12 - f14));
        }
        return kotlin.G0.f406611a;
    }
}
