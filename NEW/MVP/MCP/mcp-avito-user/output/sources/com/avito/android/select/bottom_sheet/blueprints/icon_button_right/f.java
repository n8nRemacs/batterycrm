package com.avito.android.select.bottom_sheet.blueprints.icon_button_right;

import Y41.l;
import dq0.InterfaceC39781c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemWithIconRightPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f265148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f265149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, g gVar) {
        super(0);
        this.f265148l = gVar;
        this.f265149m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l<InterfaceC39781c, G0> lVar = this.f265148l.f265150b;
        if (lVar != null) {
            a aVar = this.f265149m;
            String str = aVar.f265132b;
            String str2 = aVar.f265133c;
            if (str2 == null) {
                str2 = "";
            }
            lVar.invoke(new InterfaceC39781c.j(new com.avito.android.select.variant.a(str, str2, null, null, null, null, null, null, true, null, false, false, false, false, false, false, null, false, null, 524028, null)));
        }
        return G0.f406611a;
    }
}
