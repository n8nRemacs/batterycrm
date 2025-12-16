package com.avito.android.evidence_request.details;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f148255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148256c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f148255b = i12;
        this.f148256c = obj;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f148255b) {
            case 0:
                com.avito.android.deeplink_handler.handler.composite.a aVar = ((EvidenceDetailsFragment) this.f148256c).f148230q0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLink, null, null, 6);
                break;
            default:
                ((h) this.f148256c).f148503S.setValue(deepLink);
                break;
        }
    }
}
