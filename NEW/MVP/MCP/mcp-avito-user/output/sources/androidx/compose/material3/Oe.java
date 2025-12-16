package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SheetValue;", "savedValue", "Landroidx/compose/material3/Me;", "invoke", "(Landroidx/compose/material3/SheetValue;)Landroidx/compose/material3/Me;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Oe extends kotlin.jvm.internal.N implements Y41.l<SheetValue, Me> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f35245l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f35246m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<SheetValue, Boolean> f35247n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oe(boolean z12, androidx.compose.ui.unit.d dVar, Y41.l<? super SheetValue, Boolean> lVar) {
        super(1);
        this.f35245l = z12;
        this.f35246m = dVar;
        this.f35247n = lVar;
    }

    @Override // Y41.l
    public final Me invoke(SheetValue sheetValue) {
        Y41.l<SheetValue, Boolean> lVar = this.f35247n;
        return new Me(this.f35245l, this.f35246m, sheetValue, lVar, false, 16, null);
    }
}
