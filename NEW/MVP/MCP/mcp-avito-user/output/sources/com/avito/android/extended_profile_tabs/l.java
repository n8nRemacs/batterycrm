package com.avito.android.extended_profile_tabs;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import iA.InterfaceC41258a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: ExtendedProfileTabsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/l;", "Lcom/avito/android/extended_profile_tabs/i;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41258a> f153211a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileTabsArguments f153212b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f153213c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f153214d;

    @Inject
    public l(@Y61.k h31.e<InterfaceC41258a> eVar, @Y61.k ExtendedProfileTabsArguments extendedProfileTabsArguments, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k R0 r02) {
        this.f153211a = eVar;
        this.f153212b = extendedProfileTabsArguments;
        this.f153213c = searchParamsConverter;
        this.f153214d = r02;
    }

    @Override // com.avito.android.extended_profile_tabs.i
    @Y61.k
    public final C43152f0 a() {
        return new C43152f0(C43175k.I(this.f153214d.a(), C43175k.G(new j(this, null))), new k(3, null));
    }
}
