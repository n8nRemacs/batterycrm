package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/Me;", "invoke", "()Landroidx/compose/material3/Me;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ke extends kotlin.jvm.internal.N implements Y41.a<Me> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f35013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f35014m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SheetValue f35015n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<SheetValue, Boolean> f35016o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f35017p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ke(boolean z12, androidx.compose.ui.unit.d dVar, SheetValue sheetValue, Y41.l<? super SheetValue, Boolean> lVar, boolean z13) {
        super(0);
        this.f35013l = z12;
        this.f35014m = dVar;
        this.f35015n = sheetValue;
        this.f35016o = lVar;
        this.f35017p = z13;
    }

    @Override // Y41.a
    public final Me invoke() {
        return new Me(this.f35013l, this.f35014m, this.f35015n, this.f35016o, this.f35017p);
    }
}
