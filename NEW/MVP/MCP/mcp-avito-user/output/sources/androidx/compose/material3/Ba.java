package androidx.compose.material3;

import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/O6;", "Landroidx/compose/material3/SheetValue;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/O6;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ba extends kotlin.jvm.internal.N implements Y41.l<O6<SheetValue>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f34552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f34553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Me f34554n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(float f12, long j12, Me me2) {
        super(1);
        this.f34552l = f12;
        this.f34553m = j12;
        this.f34554n = me2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(O6<SheetValue> o62) {
        O6<SheetValue> o63 = o62;
        SheetValue sheetValue = SheetValue.f35417b;
        float f12 = this.f34552l;
        o63.a(sheetValue, f12);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        int i12 = (int) (this.f34553m & 4294967295L);
        float f13 = i12;
        if (f13 > f12 / 2 && !this.f34554n.f35133a) {
            o63.a(SheetValue.f35419d, f12 / 2.0f);
        }
        if (i12 != 0) {
            o63.a(SheetValue.f35418c, Math.max(0.0f, f12 - f13));
        }
        return kotlin.G0.f406611a;
    }
}
