package com.avito.android.publish.slots.cv_upload.item.cvUploadButton;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cvUploadButton/g;", "Lcom/avito/android/publish/slots/cv_upload/item/cvUploadButton/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f243407b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243408c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f243409d;

    @Inject
    public g(@k InterfaceC28373a interfaceC28373a) {
        this.f243407b = interfaceC28373a;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243408c = cVar;
        this.f243409d = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        c cVar = (c) aVar;
        I5.a(dVar.f243404c, cVar.f243400c, false);
        dVar.itemView.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(2, new f(this, cVar)));
    }

    @Override // com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e
    @k
    /* renamed from: a0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243409d() {
        return this.f243409d;
    }
}
