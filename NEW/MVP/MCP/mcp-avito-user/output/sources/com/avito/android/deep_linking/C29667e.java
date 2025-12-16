package com.avito.android.deep_linking;

import Ic.InterfaceC14058a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lW.InterfaceC43691a;

/* compiled from: AppLinkDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/e;", "", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29667e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132900a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f132901b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f132902c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14058a f132903d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.mapping.checker.c f132904e;

    @Inject
    public C29667e(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k InterfaceC14058a interfaceC14058a, @Y61.k com.avito.android.deeplink_handler.mapping.checker.c cVar) {
        this.f132900a = interfaceC35745a5;
        this.f132901b = rVar;
        this.f132902c = interfaceC43691a;
        this.f132903d = interfaceC14058a;
        this.f132904e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@Y61.l DeepLink deepLink, @Y61.k Uri uri, @Y61.k InterfaceC29693p interfaceC29693p) {
        String locationId;
        com.avito.android.deep_linking.links.s sVar = deepLink instanceof com.avito.android.deep_linking.links.s ? (com.avito.android.deep_linking.links.s) deepLink : null;
        if (sVar != null && (locationId = sVar.getLocationId()) != null) {
            B0 b0D = this.f132901b.d();
            InterfaceC35745a5 interfaceC35745a5 = this.f132900a;
            I0 i0J0 = b0D.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
            C29665c c29665c = new C29665c(this, locationId);
            final V2 v22 = V2.f318762a;
            i0J0.u0(c29665c, new l41.g() { // from class: com.avito.android.deep_linking.d
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            });
        }
        this.f132903d.a(uri);
        if (deepLink != 0 && this.f132904e.a(deepLink)) {
            interfaceC29693p.a(deepLink);
        } else {
            interfaceC29693p.S0(uri);
            interfaceC29693p.close();
        }
    }
}
