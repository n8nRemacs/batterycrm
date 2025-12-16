package com.google.android.gms.internal.p000authapi;

import OX0.a;
import OX0.f;
import OX0.g;
import TX0.b;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.zbd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;
import j.P;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbaa extends h implements a {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349974k = new C36616a("Auth.Api.Identity.Authorization.API", new zby(), new C36616a.g());

    public zbaa(@N Activity activity, @N g gVar) {
        String str = gVar.f12300b;
        new f();
        if (str != null) {
            C36729v.f(str);
        }
        String strZba = zbat.zba();
        C36729v.f(strZba);
        super(activity, (C36616a<g>) f349974k, new g(strZba), h.a.f348930c);
    }

    public final Task<AuthorizationResult> authorize(@N AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        C36729v.j(authorizationRequest);
        AuthorizationRequest.a aVar = new AuthorizationRequest.a();
        ArrayList arrayList = authorizationRequest.f348599b;
        C36729v.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        aVar.f348608a = arrayList;
        Bundle bundle = authorizationRequest.f348607j;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] zbdVarArrValues = zbd.values();
                int length = zbdVarArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        zbdVar = null;
                        break;
                    }
                    zbdVar = zbdVarArrValues[i12];
                    if (zbdVar.f348706b.equals(str)) {
                        break;
                    }
                    i12++;
                }
                if (string != null && zbdVar != null) {
                    if (aVar.f348616i == null) {
                        aVar.f348616i = new Bundle();
                    }
                    aVar.f348616i.putString(zbdVar.f348706b, string);
                }
            }
        }
        String str2 = authorizationRequest.f348605h;
        if (str2 != null) {
            aVar.f348614g = str2;
        }
        String str3 = authorizationRequest.f348604g;
        if (str3 != null) {
            C36729v.f(str3);
            aVar.f348613f = str3;
        }
        Account account = authorizationRequest.f348603f;
        if (account != null) {
            aVar.f348612e = account;
        }
        boolean z12 = authorizationRequest.f348602e;
        String str4 = authorizationRequest.f348600c;
        if (z12 && str4 != null) {
            String str5 = aVar.f348609b;
            C36729v.a("two different server client ids provided", str5 == null || str5.equals(str4));
            aVar.f348609b = str4;
            aVar.f348611d = true;
        }
        if (authorizationRequest.f348601d && str4 != null) {
            String str6 = aVar.f348609b;
            C36729v.a("two different server client ids provided", str6 == null || str6.equals(str4));
            aVar.f348609b = str4;
            aVar.f348610c = true;
            aVar.f348615h = authorizationRequest.f348606i;
        }
        aVar.f348614g = ((g) getApiOptions()).f12300b;
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(aVar.f348608a, aVar.f348609b, aVar.f348610c, aVar.f348611d, aVar.f348612e, aVar.f348613f, aVar.f348614g, aVar.f348615h, aVar.f348616i);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbc};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbz zbzVar = new zbz((C37028k) obj2);
                zbk zbkVar = (zbk) ((zbg) obj).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                C36729v.j(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 1534;
        return doRead(aVarA.a());
    }

    public final AuthorizationResult getAuthorizationResultFromIntent(@P Intent intent) throws ApiException {
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
        Parcelable.Creator<AuthorizationResult> creator2 = AuthorizationResult.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        AuthorizationResult authorizationResult = (AuthorizationResult) (byteArrayExtra2 != null ? b.a(byteArrayExtra2, creator2) : null);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new ApiException(Status.f348902h);
    }

    public zbaa(@N Context context, @N g gVar) {
        String str = gVar.f12300b;
        new f();
        if (str != null) {
            C36729v.f(str);
        }
        String strZba = zbat.zba();
        C36729v.f(strZba);
        super(context, (C36616a<g>) f349974k, new g(strZba), h.a.f348930c);
    }
}
