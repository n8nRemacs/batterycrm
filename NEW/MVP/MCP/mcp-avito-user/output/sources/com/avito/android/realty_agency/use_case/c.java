package com.avito.android.realty_agency.use_case;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.realty_agency.beduin.SelectionItemParentScreen;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ui0.C49065a;

/* compiled from: AddLotToSelectionUseCase.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f251764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C49065a f251765m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, C49065a c49065a) {
        super(0);
        this.f251764l = aVar;
        this.f251765m = c49065a;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f251764l;
        b.a.a(aVar.f251750c, aVar.f251751d.f(SelectionItemParentScreen.f250859c, this.f251765m.getSelectionId()), null, null, 6);
        return G0.f406611a;
    }
}
