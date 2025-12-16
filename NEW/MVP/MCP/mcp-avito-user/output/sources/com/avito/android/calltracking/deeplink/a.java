package com.avito.android.calltracking.deeplink;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.calltracking.remote.model.GsmResult;
import com.avito.android.calltracking.remote.model.IacResult;
import com.avito.android.calltracking.remote.model.MessengerRecallContactMethodResultForApi;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallData;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.reflect.n;
import l41.g;
import vN.C49237a;

/* compiled from: MessengerPhoneCallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/calltracking/remote/model/MessengerRecallContactMethodResultForApi;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f113638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f113639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f113640d;

    public a(c cVar, Bundle bundle, String str) {
        this.f113638b = cVar;
        this.f113639c = bundle;
        this.f113640d = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        IacCallContext iacCallContext;
        DeepLink deepLink;
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        c cVar = this.f113638b;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                a.i.C4057a.e(cVar.f113643g, error.getError().getF244063c(), new f.c(error.getError()), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                cVar.j(MessengerReallContactMethodLink.c.f.f113773b);
                return;
            }
            return;
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        if (((MessengerRecallContactMethodResultForApi) success.getResult()).getError() != null) {
            String message = ((MessengerRecallContactMethodResultForApi) success.getResult()).getError().getMessage();
            f.c.f125255c.getClass();
            a.i.C4057a.e(cVar.f113643g, message, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            cVar.j(MessengerReallContactMethodLink.c.b.f113769b);
        }
        GsmResult gsmResult = ((MessengerRecallContactMethodResultForApi) success.getResult()).getGsmResult();
        com.avito.android.deeplink_handler.handler.composite.a aVar = cVar.f113644h;
        if (gsmResult != null) {
            cVar.i(MessengerReallContactMethodLink.c.d.f113771b, aVar, cVar.f113649m.b(((MessengerRecallContactMethodResultForApi) success.getResult()).getGsmResult().getAction().getUri()));
        }
        if (((MessengerRecallContactMethodResultForApi) success.getResult()).getIacResult() != null) {
            MessengerReallContactMethodLink.f113765d.getClass();
            Bundle bundle = this.f113639c;
            if (bundle != null) {
                iacCallContext = (IacCallContext) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("IacCallContext", IacCallContext.class) : bundle.getParcelable("IacCallContext"));
            } else {
                iacCallContext = null;
            }
            if (iacCallContext == null) {
                f.c.f125255c.getClass();
                a.i.C4057a.e(cVar.f113643g, "Ошибка при попытке перезвонить пользователю", f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                cVar.j(MessengerReallContactMethodLink.c.a.f113768b);
            }
            if (bundle != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("gsmCallLink", DeepLink.class) : bundle.getParcelable("gsmCallLink"));
            } else {
                deepLink = null;
            }
            IacCallInfo.a aVar2 = IacCallInfo.f166831o;
            String strA = cVar.f113650n.a();
            IacResult iacResult = ((MessengerRecallContactMethodResultForApi) success.getResult()).getIacResult();
            String analyticParams = iacResult != null ? iacResult.getAnalyticParams() : null;
            C49237a c49237a = cVar.f113648l;
            c49237a.getClass();
            n<Object> nVar = C49237a.f440707l[2];
            IacCanCallData iacCanCallData = new IacCanCallData(analyticParams, ((Boolean) c49237a.f440710c.a().invoke()).booleanValue(), null, 4, null);
            String str = this.f113640d;
            aVar2.getClass();
            cVar.i(MessengerReallContactMethodLink.c.e.f113772b, aVar, new IacLaunchCallAfterCanCallLink(new IacMakeCallLink(new IacCallInfo(strA, iacCallContext.f166825c, iacCallContext.f166826d, str, iacCallContext.f166824b, false, IacCallDirection.OUTGOING, deepLink, iacCallContext.f166827e, null, iacCanCallData, null, null))));
        }
    }
}
