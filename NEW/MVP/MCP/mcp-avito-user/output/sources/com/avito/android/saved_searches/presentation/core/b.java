package com.avito.android.saved_searches.presentation.core;

import Do0.InterfaceC13425a;
import androidx.view.M0;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchAnalyticsHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/b;", "Lcom/avito/android/saved_searches/presentation/core/a;", "Landroidx/lifecycle/M0;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13425a f258396E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final SavedSearchParams f258397J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f258398K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f258399L;

    @Inject
    public b(@Y61.k InterfaceC13425a interfaceC13425a, @Y61.k SavedSearchParams savedSearchParams) {
        this.f258396E = interfaceC13425a;
        this.f258397J = savedSearchParams;
        SavedSearchArgs savedSearchArgs = savedSearchParams.f181445d;
        interfaceC13425a.b(savedSearchArgs.f181431c, savedSearchArgs.f181432d, savedSearchParams.f181443b);
    }

    @Override // com.avito.android.saved_searches.presentation.core.a
    public final void Vc() {
        this.f258398K = true;
    }

    @Override // com.avito.android.saved_searches.presentation.core.a
    public final void ja() {
        this.f258399L = true;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        SavedSearchParams savedSearchParams = this.f258397J;
        SavedSearchArgs savedSearchArgs = savedSearchParams.f181445d;
        this.f258396E.a(savedSearchArgs.f181431c, savedSearchArgs.f181432d, savedSearchParams.f181443b, this.f258398K ? "1" : null, this.f258399L ? "1" : null);
    }
}
