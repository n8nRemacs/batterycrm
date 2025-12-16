package com.avito.android.status_doc.lifecycle;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import zx0.InterfaceC50641a;

/* compiled from: GigStatusDocIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/status_doc/lifecycle/b;", "Lzx0/a;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC50641a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f284903a;

    @Inject
    public b(@k Application application) {
        this.f284903a = application;
    }

    @Override // zx0.InterfaceC50641a
    @k
    public final Intent a() {
        GigStatusDocActivity.f284879m.getClass();
        return new Intent(this.f284903a, (Class<?>) GigStatusDocActivity.class);
    }
}
