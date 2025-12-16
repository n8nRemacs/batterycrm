package com.avito.android.messenger.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: FlowerRedirectDeepLinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/Q;", "Lev/a;", "Lcom/avito/android/messenger/deeplink/FlowerRedirectLink;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Q extends AbstractC40161a<FlowerRedirectLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.g f195404f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f195405g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.flower.domain.a f195406h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f195407i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f195408j;

    /* compiled from: FlowerRedirectDeepLinkHandler.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/Q$a;", "", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: FlowerRedirectDeepLinkHandler.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/Q$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.deeplink.Q$a$a, reason: collision with other inner class name */
        public static final class C5767a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C5767a f195409b = new C5767a();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public Q(@Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.messenger.flower.domain.a aVar2, @Y61.k com.avito.android.util.R0 r02) {
        this.f195404f = gVar;
        this.f195405g = aVar;
        this.f195406h = aVar2;
        this.f195407i = kotlinx.coroutines.U.a(r02.b());
        this.f195408j = kotlinx.coroutines.U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        FlowerRedirectLink flowerRedirectLink = (FlowerRedirectLink) deepLink;
        if (flowerRedirectLink.f195327c) {
            C43259k.d(this.f195407i, null, null, new T(this, flowerRedirectLink, null), 3);
        } else {
            C43259k.d(this.f195408j, null, null, new S(this, flowerRedirectLink, null), 3);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        kotlinx.coroutines.U.b(this.f195407i, null);
    }
}
