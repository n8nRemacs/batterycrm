package com.avito.android.extended_profile.di;

import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import fA.InterfaceC40265a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/di/v;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/e;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.di.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30441v implements com.avito.android.extended_profile_ui_components.search_input.suggest.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40265a, G0> f149949a;

    /* JADX WARN: Multi-variable type inference failed */
    public C30441v(Y41.l<? super InterfaceC40265a, G0> lVar) {
        this.f149949a = lVar;
    }

    @Override // com.avito.android.extended_profile_ui_components.search_input.suggest.e
    public final void a(@Y61.k SuggestItem suggestItem) {
        this.f149949a.invoke(new InterfaceC40265a.t(suggestItem));
    }
}
