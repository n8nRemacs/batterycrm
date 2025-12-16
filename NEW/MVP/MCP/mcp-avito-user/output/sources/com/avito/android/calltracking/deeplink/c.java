package com.avito.android.calltracking.deeplink;

import Y61.k;
import am.InterfaceC19907a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.analytics.H;
import com.avito.android.calltracking.remote.deeplink.CallInitiator;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.calltracking.remote.model.MessengerRecallContactMethodResultForApi;
import com.avito.android.calltracking.remote.model.RecallFromGsmContext;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.u;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.z;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import vN.C49237a;

/* compiled from: MessengerPhoneCallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/deeplink/c;", "Lev/a;", "Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC40161a<MessengerReallContactMethodLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC19907a f113642f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f113643g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f113644h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f113645i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final H f113646j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final u f113647k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C49237a f113648l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final x f113649m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final XL.a f113650n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f113651o = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public c(@k InterfaceC19907a interfaceC19907a, @k a.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k H h12, @k u uVar, @k C49237a c49237a, @k x xVar, @k XL.a aVar2) {
        this.f113642f = interfaceC19907a;
        this.f113643g = iVar;
        this.f113644h = aVar;
        this.f113645i = interfaceC35745a5;
        this.f113646j = h12;
        this.f113647k = uVar;
        this.f113648l = c49237a;
        this.f113649m = xVar;
        this.f113650n = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RecallFromGsmContext recallFromGsmContext;
        MessengerReallContactMethodLink messengerReallContactMethodLink = (MessengerReallContactMethodLink) deepLink;
        MessengerReallContactMethodLink.f113765d.getClass();
        if (bundle != null) {
            recallFromGsmContext = (RecallFromGsmContext) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("RecallFromGsmContext", RecallFromGsmContext.class) : bundle.getParcelable("RecallFromGsmContext"));
        } else {
            recallFromGsmContext = null;
        }
        if (recallFromGsmContext == null) {
            f.c.f125255c.getClass();
            a.i.C4057a.e(this.f113643g, "Ошибка при попытке получить данные для звонка", f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            j(MessengerReallContactMethodLink.c.C3331c.f113770b);
        }
        String str2 = recallFromGsmContext.f113774b;
        Long lZ02 = str2 != null ? C43066x.z0(str2) : null;
        String strValueOf = String.valueOf(recallFromGsmContext.f113776d);
        CallInitiator.f113761c.getClass();
        z<TypedResult<MessengerRecallContactMethodResultForApi>> zVarD = this.f113642f.d(recallFromGsmContext.f113775c, lZ02, messengerReallContactMethodLink.f113767c.f113764b.toLowerCase(Locale.ROOT), messengerReallContactMethodLink.f113766b, this.f113646j.a(), Boolean.valueOf(this.f113647k.b("android.permission.RECORD_AUDIO")), recallFromGsmContext.f113777e);
        InterfaceC35745a5 interfaceC35745a5 = this.f113645i;
        this.f113651o.b(zVarD.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new a(this, bundle, strValueOf), new b(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f113651o.e();
    }
}
