package com.avito.android.esia_redirect_screen.ui;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EsiaRedirectIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/ui/d;", "Lcom/avito/android/esia_redirect_screen/ui/c;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f148111a;

    @Inject
    public d(@k Context context) {
        this.f148111a = context;
    }

    @Override // com.avito.android.esia_redirect_screen.ui.c
    @k
    public final Intent a() {
        return new Intent(this.f148111a, (Class<?>) EsiaRedirectActivity.class);
    }
}
