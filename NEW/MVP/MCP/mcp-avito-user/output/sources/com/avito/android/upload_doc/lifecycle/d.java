package com.avito.android.upload_doc.lifecycle;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigUploadDocIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/d;", "LNG0/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements NG0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f306847a;

    @Inject
    public d(@k Application application) {
        this.f306847a = application;
    }

    @Override // NG0.a
    @k
    public final Intent a(@k GigUploadDocDeeplink.FlowType flowType) {
        GigUploadDocActivity.f306811m.getClass();
        Intent intent = new Intent(this.f306847a, (Class<?>) GigUploadDocActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", flowType);
        return intent;
    }
}
