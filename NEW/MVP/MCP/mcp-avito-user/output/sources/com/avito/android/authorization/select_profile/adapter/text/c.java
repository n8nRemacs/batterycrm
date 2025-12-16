package com.avito.android.authorization.select_profile.adapter.text;

import Y41.l;
import Y61.k;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TextItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/text/c;", "Lcom/avito/android/authorization/select_profile/adapter/text/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f94283b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super DeepLink, G0> lVar) {
        this.f94283b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((d) eVar).Cr((SelectProfileField.Text) aVar, this.f94283b);
    }
}
