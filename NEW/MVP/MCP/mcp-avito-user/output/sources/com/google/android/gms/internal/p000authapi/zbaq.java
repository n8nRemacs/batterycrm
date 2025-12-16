package com.google.android.gms.internal.p000authapi;

import OX0.d;
import OX0.t;
import TX0.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C36646i;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbaq extends h implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final C36616a f349983l = new C36616a("Auth.Api.Identity.SignIn.API", new zbal(), new C36616a.g());

    /* renamed from: k, reason: collision with root package name */
    public final String f349984k;

    public zbaq(@N Activity activity, @N t tVar) {
        super(activity, (C36616a<t>) f349983l, tVar, h.a.f348930c);
        this.f349984k = zbat.zba();
    }

    @Override // OX0.d
    public final Task<BeginSignInResult> beginSignIn(@N BeginSignInRequest beginSignInRequest) {
        C36729v.j(beginSignInRequest);
        BeginSignInRequest.a aVar = new BeginSignInRequest.a();
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.f348624c;
        C36729v.j(googleIdTokenRequestOptions);
        aVar.f348653b = googleIdTokenRequestOptions;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.f348623b;
        C36729v.j(passwordRequestOptions);
        aVar.f348652a = passwordRequestOptions;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f348628g;
        C36729v.j(passkeysRequestOptions);
        aVar.f348654c = passkeysRequestOptions;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.f348629h;
        C36729v.j(passkeyJsonRequestOptions);
        aVar.f348655d = passkeyJsonRequestOptions;
        aVar.f348657f = beginSignInRequest.f348626e;
        aVar.f348658g = beginSignInRequest.f348627f;
        aVar.f348659h = beginSignInRequest.f348630i;
        String str = beginSignInRequest.f348625d;
        if (str != null) {
            aVar.f348656e = str;
        }
        aVar.f348656e = this.f349984k;
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(aVar.f348652a, aVar.f348653b, aVar.f348656e, aVar.f348657f, aVar.f348658g, aVar.f348654c, aVar.f348655d, aVar.f348659h);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam((C37028k) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                BeginSignInRequest beginSignInRequest3 = beginSignInRequest2;
                C36729v.j(beginSignInRequest3);
                zbwVar.zbc(zbamVar, beginSignInRequest3);
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 1553;
        return doRead(aVarA.a());
    }

    public final String getPhoneNumberFromIntent(@P Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.f348902h);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : b.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.f348904j);
        }
        if (!status.h()) {
            throw new ApiException(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new ApiException(Status.f348902h);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(@N final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        C36729v.j(getPhoneNumberHintIntentRequest);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbh};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = this.zba;
                GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest2 = getPhoneNumberHintIntentRequest;
                zbaqVar.getClass();
                ((zbw) ((zbar) obj).getService()).zbd(new zbap((C37028k) obj2), getPhoneNumberHintIntentRequest2, zbaqVar.f349984k);
            }
        };
        aVarA.f348955d = 1653;
        return doRead(aVarA.a());
    }

    @Override // OX0.d
    public final SignInCredential getSignInCredentialFromIntent(@P Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.f348902h);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : b.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.f348904j);
        }
        if (!status.h()) {
            throw new ApiException(status);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? b.a(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.f348902h);
    }

    @Override // OX0.d
    public final Task<PendingIntent> getSignInIntent(@N GetSignInIntentRequest getSignInIntentRequest) {
        C36729v.j(getSignInIntentRequest);
        GetSignInIntentRequest.a aVar = new GetSignInIntentRequest.a();
        String str = getSignInIntentRequest.f348662b;
        C36729v.j(str);
        aVar.f348668a = str;
        aVar.f348671d = getSignInIntentRequest.f348665e;
        aVar.f348669b = getSignInIntentRequest.f348663c;
        aVar.f348672e = getSignInIntentRequest.f348666f;
        aVar.f348673f = getSignInIntentRequest.f348667g;
        String str2 = getSignInIntentRequest.f348664d;
        if (str2 != null) {
            aVar.f348670c = str2;
        }
        aVar.f348670c = this.f349984k;
        final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(aVar.f348673f, aVar.f348668a, aVar.f348669b, aVar.f348670c, aVar.f348671d, aVar.f348672e);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbf};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbao zbaoVar = new zbao((C37028k) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                GetSignInIntentRequest getSignInIntentRequest3 = getSignInIntentRequest2;
                C36729v.j(getSignInIntentRequest3);
                zbwVar.zbe(zbaoVar, getSignInIntentRequest3);
            }
        };
        aVarA.f348955d = 1555;
        return doRead(aVarA.a());
    }

    @Override // OX0.d
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = i.f348935a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
        C36646i.a();
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbb};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = this.zba;
                zbaqVar.getClass();
                ((zbw) ((zbar) obj).getService()).zbf(new zban((C37028k) obj2), zbaqVar.f349984k);
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 1554;
        return doWrite(aVarA.a());
    }

    public zbaq(@N Context context, @N t tVar) {
        super(context, (C36616a<t>) f349983l, tVar, h.a.f348930c);
        this.f349984k = zbat.zba();
    }
}
