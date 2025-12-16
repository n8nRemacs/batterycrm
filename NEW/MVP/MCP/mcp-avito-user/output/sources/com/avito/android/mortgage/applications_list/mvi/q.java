package com.avito.android.mortgage.applications_list.mvi;

import SZ.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationsListReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "LSZ/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements u<ApplicationsListInternalAction, SZ.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f198477b;

    @Inject
    public q(@Y61.k k kVar) {
        this.f198477b = kVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final SZ.c a(ApplicationsListInternalAction applicationsListInternalAction, SZ.c cVar) {
        ApplicationsListInternalAction applicationsListInternalAction2 = applicationsListInternalAction;
        SZ.c cVar2 = cVar;
        if (applicationsListInternalAction2 instanceof ApplicationsListInternalAction.ContentLoading) {
            return SZ.c.a(cVar2, d.c.f15068a);
        }
        if (applicationsListInternalAction2 instanceof ApplicationsListInternalAction.ContentError) {
            return SZ.c.a(cVar2, ((ApplicationsListInternalAction.ContentError) applicationsListInternalAction2).f198444b instanceof ApiError.NetworkIOError ? new d.b(R.attr.img_noInternet, com.avito.android.printable_text.b.c(R.string.error_layout_no_internet, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_check_connection, new Serializable[0])) : new d.b(R.attr.img_unknownError, com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh, new Serializable[0])));
        }
        boolean z12 = applicationsListInternalAction2 instanceof ApplicationsListInternalAction.DeleteError;
        k kVar = this.f198477b;
        if (z12) {
            return SZ.c.a(cVar2, new d.a(kVar.a(cVar2.f15062b)));
        }
        if (!(applicationsListInternalAction2 instanceof ApplicationsListInternalAction.ContentLoaded)) {
            return cVar2;
        }
        List<ApplicationsItemModel> list = ((ApplicationsListInternalAction.ContentLoaded) applicationsListInternalAction2).f198445b;
        return new SZ.c(list, new d.a(kVar.a(list)));
    }
}
