package com.avito.android.bxcontent.garage;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.garage.i;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.AddCarToGarageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddCarToGarageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/garage/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AddCarToGarageLink;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<AddCarToGarageLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f111092l = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f111093f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f111094g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f111095h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final g f111096i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f111097j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f111098k;

    /* compiled from: AddCarToGarageDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/garage/a$a;", "", "<init>", "()V", "", "DURATION_TIME", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.garage.a$a, reason: collision with other inner class name */
    public static final class C3278a {
        public /* synthetic */ C3278a(C42822w c42822w) {
            this();
        }

        public C3278a() {
        }
    }

    static {
        new C3278a(null);
    }

    @Inject
    public a(@k Context context, @k InterfaceC28373a interfaceC28373a, @k a.i iVar, @k g gVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC35741a1 interfaceC35741a1) {
        this.f111093f = context;
        this.f111094g = interfaceC28373a;
        this.f111095h = iVar;
        this.f111096i = gVar;
        this.f111097j = interfaceC35745a5;
        this.f111098k = interfaceC35741a1;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AddCarToGarageLink addCarToGarageLink = (AddCarToGarageLink) deepLink;
        a.i.C4057a.d(this.f111095h, com.avito.android.printable_text.b.c(R.string.serp_add_car_to_garage_text, addCarToGarageLink.f132933b), null, Collections.singletonList(new c.a.C3719a(this.f111093f.getResources().getString(R.string.serp_add_car_to_garage_action), false, null, new d(this, addCarToGarageLink), 6, null)), null, 5000, null, null, null, 2010);
    }

    public final void k(String str, Throwable th2) {
        f.c cVarB;
        if (th2 != null) {
            cVarB = new f.c(th2);
        } else {
            f.c.f125255c.getClass();
            cVarB = f.c.a.b();
        }
        a.i.C4057a.e(this.f111095h, str, cVarB, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        j(new i.a(str));
    }
}
