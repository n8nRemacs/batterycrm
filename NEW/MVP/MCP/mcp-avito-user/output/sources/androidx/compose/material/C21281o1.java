package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/f3;", "Landroidx/compose/material/BottomSheetValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/f3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21281o1 extends kotlin.jvm.internal.N implements Y41.l<C21166f3<BottomSheetValue>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33854l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f33855m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33856n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21281o1(float f12, float f13, int i12) {
        super(1);
        this.f33854l = i12;
        this.f33855m = f12;
        this.f33856n = f13;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21166f3<BottomSheetValue> c21166f3) {
        C21166f3<BottomSheetValue> c21166f32 = c21166f3;
        BottomSheetValue bottomSheetValue = BottomSheetValue.f32454b;
        float f12 = this.f33854l;
        float f13 = this.f33855m;
        c21166f32.a(bottomSheetValue, f12 - f13);
        float f14 = this.f33856n;
        if (f14 > 0.0f && f14 != f13) {
            c21166f32.a(BottomSheetValue.f32455c, f12 - f14);
        }
        return kotlin.G0.f406611a;
    }
}
