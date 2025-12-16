package com.avito.android.configuration;

import Y61.k;
import com.avito.android.config.AppType;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49100a;

/* compiled from: AppTypeFromBuildConfigProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/configuration/a;", "Lur/a;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC49100a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AppType f125479a;

    @Inject
    public a(@k e eVar) {
        this.f125479a = eVar.f125502b;
    }

    @Override // ur.InterfaceC49100a
    @k
    /* renamed from: a, reason: from getter */
    public final AppType getF125479a() {
        return this.f125479a;
    }
}
