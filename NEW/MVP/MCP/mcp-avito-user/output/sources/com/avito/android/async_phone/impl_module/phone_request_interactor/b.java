package com.avito.android.async_phone.impl_module.phone_request_interactor;

import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.BuyContactsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SpendContactsLink;
import com.avito.android.early_access.deeplink.EarlyAccessLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.BuyContactsResponse;
import com.avito.android.remote.model.EarlyAccessResponse;
import com.avito.android.remote.model.FailurePhoneResponse;
import com.avito.android.remote.model.IacPhoneResponse;
import com.avito.android.remote.model.PhoneResponse;
import com.avito.android.remote.model.PhoneResponseKt;
import com.avito.android.remote.model.SpendContactResponse;
import com.avito.android.remote.model.SuccessPhoneResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: AsyncPhoneInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PhoneResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f92138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f92139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f92140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f92141e;

    public b(a aVar, String str, String str2, Boolean bool) {
        this.f92138b = aVar;
        this.f92139c = str;
        this.f92140d = str2;
        this.f92141e = bool;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws ApiException {
        TypedResult typedResult = (TypedResult) obj;
        int i12 = a.f92130h;
        this.f92138b.getClass();
        if (!(typedResult instanceof TypedResult.Success)) {
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
            String str = this.f92139c;
            return new EarlyAccessLink(new PhoneRequestLink(str, this.f92140d, false, this.f92141e, null, null, 52, null), ((EarlyAccessResponse) phoneResponse).getEarlyAccessModal().a(str));
        }
        SuccessPhoneResponse successPhoneResponse = (SuccessPhoneResponse) phoneResponse;
        AnonymousNumberDialogLink anonymousNumberDialogLink = PhoneResponseKt.toAnonymousNumberDialogLink(successPhoneResponse);
        if (successPhoneResponse.getAnonymousNumberModal() == null) {
            anonymousNumberDialogLink = null;
        }
        if (anonymousNumberDialogLink != null) {
            return anonymousNumberDialogLink;
        }
        DeepLink redirectUri = successPhoneResponse.getRedirectUri();
        if (redirectUri != null) {
            return redirectUri;
        }
        IacPhoneResponse iac = successPhoneResponse.getIac();
        DeepLink action = iac != null ? iac.getAction() : null;
        IacPhoneResponse iac2 = successPhoneResponse.getIac();
        if (iac2 == null || !iac2.getCallAvailable()) {
            action = null;
        }
        if (action != null) {
            return action;
        }
        Action action2 = successPhoneResponse.getAction();
        DeepLink deepLink = action2 != null ? action2.getDeepLink() : null;
        if (deepLink != null) {
            return deepLink;
        }
        throw new UnsupportedOperationException("Action null in PhoneResponse");
    }
}
