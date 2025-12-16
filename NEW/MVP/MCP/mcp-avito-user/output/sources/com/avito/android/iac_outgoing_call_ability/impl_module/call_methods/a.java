package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods;

import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.BuyContactsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.SpendContactsLink;
import com.avito.android.early_access.deeplink.EarlyAccessLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.BuyContactsResponse;
import com.avito.android.remote.model.EarlyAccessResponse;
import com.avito.android.remote.model.FailurePhoneResponse;
import com.avito.android.remote.model.IacPhoneResponse;
import com.avito.android.remote.model.NotificationToast;
import com.avito.android.remote.model.NotificationToastResponse;
import com.avito.android.remote.model.PhoneResponse;
import com.avito.android.remote.model.PhoneResponseKt;
import com.avito.android.remote.model.SpendContactResponse;
import com.avito.android.remote.model.SuccessPhoneResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.n;
import l41.o;
import vN.C49237a;

/* compiled from: CallMethodsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PhoneResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f168433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IacCallContext f168434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f168435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f168436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f168437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f168438g;

    public a(b bVar, IacCallContext iacCallContext, String str, String str2, Boolean bool, String str3, String str4) {
        this.f168433b = bVar;
        this.f168434c = iacCallContext;
        this.f168435d = str;
        this.f168436e = bool;
        this.f168437f = str3;
        this.f168438g = str4;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws ApiException, CallMethodsItemPhoneException {
        DeepLink deepLink;
        NotificationToast notificationToast;
        String text;
        TypedResult typedResult = (TypedResult) obj;
        b bVar = this.f168433b;
        bVar.getClass();
        boolean z12 = typedResult instanceof TypedResult.Success;
        if (z12) {
            Object obj2 = (PhoneResponse) ((TypedResult.Success) typedResult).getResult();
            if ((obj2 instanceof NotificationToastResponse) && (notificationToast = ((NotificationToastResponse) obj2).getNotificationToast()) != null && (text = notificationToast.getText()) != null) {
                bVar.f168449k.b(text);
            }
        }
        IacLaunchCallAfterCanCallLink iacLaunchCallAfterCanCallLink = null;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                throw new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        PhoneResponse phoneResponse = (PhoneResponse) ((TypedResult.Success) typedResult).getResult();
        if (!(phoneResponse instanceof SuccessPhoneResponse)) {
            if (phoneResponse instanceof FailurePhoneResponse) {
                return Jd.b.a(((FailurePhoneResponse) phoneResponse).getDialogInfo());
            }
            if (phoneResponse instanceof BuyContactsResponse) {
                return new BuyContactsLink(((BuyContactsResponse) phoneResponse).getContactPackageModal());
            }
            if (phoneResponse instanceof SpendContactResponse) {
                return new SpendContactsLink(((SpendContactResponse) phoneResponse).getSpendContactPopUp());
            }
            if (!(phoneResponse instanceof EarlyAccessResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = this.f168438g;
            return new EarlyAccessLink(new PhoneRequestLink(str, this.f168435d, false, this.f168436e, null, null, 52, null), ((EarlyAccessResponse) phoneResponse).getEarlyAccessModal().a(str));
        }
        SuccessPhoneResponse successPhoneResponse = (SuccessPhoneResponse) phoneResponse;
        Action action = successPhoneResponse.getAction();
        if (action != null) {
            C49237a c49237a = bVar.f168442d;
            c49237a.getClass();
            n<Object> nVar = C49237a.f440707l[6];
            if (((Boolean) c49237a.f440714g.a().invoke()).booleanValue() && successPhoneResponse.getAnonymousNumberModal() != null) {
                deepLink = PhoneResponseKt.toAnonymousNumberDialogLink(successPhoneResponse);
                if (deepLink == null) {
                    deepLink = action.getDeepLink();
                }
            } else if (successPhoneResponse.getRedirectUri() == null || (deepLink = successPhoneResponse.getRedirectUri()) == null) {
                deepLink = action.getDeepLink();
            }
        } else {
            deepLink = null;
        }
        IacPhoneResponse iac = successPhoneResponse.getIac();
        if (iac != null) {
            String strA = this.f168437f;
            if (strA == null) {
                strA = bVar.f168440b.a();
            }
            String str2 = strA;
            PhoneLink.Call call = c.f168450a;
            IacCanCallResult iacCanCallResultA = bVar.f168447i.a(new CanCallResult(iac.getCallAvailable(), iac.getAction(), iac.getCannotCallReason(), iac.getAnalyticsInfo(), iac.getCanVideoCall(), iac.getCallOptionsType(), iac.getCalleeId()), str2, this.f168434c, deepLink, null);
            if (iacCanCallResultA instanceof IacCanCallResult.Can) {
                iacLaunchCallAfterCanCallLink = new IacLaunchCallAfterCanCallLink(new IacMakeCallLink(((IacCanCallResult.Can) iacCanCallResultA).getCallInfo()));
            }
        }
        if (iacLaunchCallAfterCanCallLink != null) {
            return iacLaunchCallAfterCanCallLink;
        }
        if (deepLink != null) {
            return deepLink;
        }
        throw new CallMethodsItemPhoneException("GSM and IAC is null");
    }
}
