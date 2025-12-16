package androidx.compose.material;

import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/f3;", "Landroidx/compose/material/ModalBottomSheetValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/f3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21182g6 extends kotlin.jvm.internal.N implements Y41.l<C21166f3<ModalBottomSheetValue>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21234k6 f33599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f33600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21182g6(float f12, C21234k6 c21234k6, long j12) {
        super(1);
        this.f33598l = f12;
        this.f33599m = c21234k6;
        this.f33600n = j12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21166f3<ModalBottomSheetValue> c21166f3) {
        C21166f3<ModalBottomSheetValue> c21166f32 = c21166f3;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f32953b;
        float f12 = this.f33598l;
        c21166f32.a(modalBottomSheetValue, f12);
        float f13 = f12 / 2.0f;
        boolean z12 = this.f33599m.f33738b;
        long j12 = this.f33600n;
        if (!z12) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            if (((int) (j12 & 4294967295L)) > f13) {
                c21166f32.a(ModalBottomSheetValue.f32955d, f13);
            }
        }
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        int i12 = (int) (j12 & 4294967295L);
        if (i12 != 0) {
            c21166f32.a(ModalBottomSheetValue.f32954c, Math.max(0.0f, f12 - i12));
        }
        return kotlin.G0.f406611a;
    }
}
