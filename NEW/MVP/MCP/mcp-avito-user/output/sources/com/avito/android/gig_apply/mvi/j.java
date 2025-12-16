package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import pH.AbstractC46954b;
import pH.C46956d;

/* compiled from: GigApplyReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LpH/b;", "LpH/d;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements com.avito.android.arch.mvi.u<AbstractC46954b, C46956d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigApplyOpenParams f159738b;

    @Inject
    public j(@Y61.k GigApplyOpenParams gigApplyOpenParams) {
        this.f159738b = gigApplyOpenParams;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C46956d a(AbstractC46954b abstractC46954b, C46956d c46956d) {
        AbstractC46954b abstractC46954b2 = abstractC46954b;
        C46956d c46956d2 = c46956d;
        return abstractC46954b2 instanceof AbstractC46954b.e ? C46956d.a(c46956d2, true, false, 65534) : abstractC46954b2 instanceof AbstractC46954b.c ? C46956d.a(c46956d2, false, false, 65534) : abstractC46954b2 instanceof AbstractC46954b.C12259b ? C46956d.a(c46956d2, false, this.f159738b.f159870o, 32767) : C46956d.a(c46956d2, false, false, 65534);
    }
}
