package com.avito.android;

import android.app.Application;
import android.content.Intent;
import com.avito.android.bottom_navigation.ui.fragment.factory.HomeScreenDataGlobal;
import com.avito.android.bottom_navigation.ui.fragment.factory.HomeScreenDataMain;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: CoreActivityIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/M;", "Lcom/avito/android/L;", "_avito_intent-factories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f67350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f67351b;

    @Inject
    public M(@Y61.k Application application, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f67350a = application;
        this.f67351b = interfaceC49101b;
    }

    @Override // com.avito.android.L
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l String str2) {
        return e().putExtra("tab_fragment_data", this.f67351b.d() ? new HomeScreenDataMain(str, str2) : new HomeScreenDataGlobal(str, str2));
    }

    @Override // com.avito.android.L
    @Y61.k
    public final Intent b() {
        return e().setFlags(268468224);
    }

    @Override // com.avito.android.L
    @Y61.k
    public final Intent c(int i12) {
        return e().putExtra("tab_ordinal", i12);
    }

    @Override // com.avito.android.L
    @Y61.k
    public final Intent d(@Y61.k TabFragmentFactory.Data data) {
        return e().putExtra("tab_fragment_data", data);
    }

    public final Intent e() {
        return new Intent().setClassName(this.f67350a, "com.avito.android.Launcher").setFlags(603979776);
    }
}
