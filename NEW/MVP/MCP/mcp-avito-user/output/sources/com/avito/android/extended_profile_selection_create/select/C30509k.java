package com.avito.android.extended_profile_selection_create.select;

import androidx.fragment.app.Fragment;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.extended_profile_selection_create.select.L;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.search.filter.InterfaceC34598u;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionCreateRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/k;", "Lcom/avito/android/extended_profile_selection_create/select/i;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_selection_create.select.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30509k implements InterfaceC30507i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RA.a, G0> f152283a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34598u f152284b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<L.a> f152285c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C30509k(@Y61.k Fragment fragment, @Y61.k Y41.l<? super RA.a, G0> lVar, @Y61.k InterfaceC34598u interfaceC34598u) {
        this.f152283a = lVar;
        this.f152284b = interfaceC34598u;
        this.f152285c = fragment.registerForActivityResult(new C30508j(this), new C28629h(0));
    }

    @Override // com.avito.android.extended_profile_selection_create.select.InterfaceC30507i
    public final void a(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.k FilterAnalyticsData filterAnalyticsData) {
        this.f152285c.b(new L.a(searchParams, str, filterAnalyticsData));
    }
}
