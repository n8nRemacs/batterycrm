package com.avito.android.login_suggests_impl;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LoginSuggestsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/d;", "LFW/a;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements FW.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f182894a;

    @Inject
    public d(@Y61.k Application application) {
        this.f182894a = application;
    }

    @Override // FW.a
    @Y61.k
    public final Intent a() {
        return new Intent(this.f182894a, (Class<?>) LoginSuggestsActivity.class);
    }
}
