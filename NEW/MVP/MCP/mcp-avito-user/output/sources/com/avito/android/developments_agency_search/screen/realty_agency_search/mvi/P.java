package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.Metadata;

/* compiled from: RealtyAgencySearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLw/c;", "invoke", "()LLw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<Lw.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138765l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchInternalAction f138766m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Lw.c cVar, RealtyAgencySearchInternalAction realtyAgencySearchInternalAction) {
        super(0);
        this.f138765l = cVar;
        this.f138766m = realtyAgencySearchInternalAction;
    }

    @Override // Y41.a
    public final Lw.c invoke() {
        return Lw.c.a(this.f138765l, null, null, null, null, null, null, null, ((RealtyAgencySearchInternalAction.ContentBottomSheet.UpdateState) this.f138766m).f138836b, null, null, 895);
    }
}
