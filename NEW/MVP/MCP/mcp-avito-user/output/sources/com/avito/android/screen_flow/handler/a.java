package com.avito.android.screen_flow.handler;

import Iu.C14159a;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import cv.m;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kp0.C43484a;
import kv.C43501a;
import qv.InterfaceC47451a;

/* compiled from: AddDeeplinkIntentModifier.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screen_flow/handler/a;", "Lqv/a;", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@m
/* loaded from: classes3.dex */
public final class a implements InterfaceC47451a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f260190a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f260191b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicReference<DeepLink> f260192c;

    @Inject
    public a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C c12, @k InterfaceC28373a interfaceC28373a) {
        this.f260190a = c12;
        this.f260191b = interfaceC28373a;
        aVar.d9().t0(new l41.g() { // from class: com.avito.android.screen_flow.handler.a.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) throws Throwable {
                C43501a c43501a = (C43501a) obj;
                a aVar2 = a.this;
                AtomicReference<DeepLink> atomicReference = aVar2.f260192c;
                if (atomicReference.get() != null) {
                    com.avito.android.deeplink_handler.handler.bundle.a aVar3 = c43501a.f413260a;
                    Bundle bundle = aVar3.f134522c;
                    boolean z12 = bundle != null ? bundle.getBoolean("screen_flow_handling", false) : false;
                    if (atomicReference.get() == null || !z12) {
                        return;
                    }
                    atomicReference.set(null);
                    com.avito.android.deep_linking.links.storage.a aVar4 = com.avito.android.deep_linking.links.storage.a.f134018a;
                    DeepLink deepLink = aVar3.f134520a;
                    String strB = aVar4.b(deepLink.getClass());
                    C14159a c14159a = aVar4.getClassesToMetaInfo().get(deepLink.getClass());
                    int i12 = c14159a != null ? c14159a.f8594a : 1;
                    ScreenFlowLinkNotOpenedError screenFlowLinkNotOpenedError = new ScreenFlowLinkNotOpenedError(AK.c.k("DeepLink ", i12 + '/' + strB, " passed to ScreenFlowLink.screenToOpen doesn't open an activity. Please, make sure to pass a deep link which will open an activity before returning a result, otherwise ScreenFlowLink mechanism will be broken."));
                    V2 v22 = V2.f318762a;
                    C c13 = aVar2.f260190a;
                    v22.m(screenFlowLinkNotOpenedError, true ^ c13.l());
                    if (c13.l()) {
                        aVar2.f260191b.c(new C43484a(i12, strB));
                    }
                }
            }
        });
        this.f260192c = new AtomicReference<>();
    }

    @Override // qv.InterfaceC47451a
    public final void a(@k Intent intent) {
        DeepLink andSet = this.f260192c.getAndSet(null);
        if (andSet != null) {
            intent.putExtra("deeplink_handler_link", andSet);
        }
    }
}
