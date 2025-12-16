package com.google.android.gms.internal.p000authapi;

import OX0.b;
import OX0.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.Feature;
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

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbag extends h implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final C36616a f349977l = new C36616a("Auth.Api.Identity.CredentialSaving.API", new zbad(), new C36616a.g());

    /* renamed from: k, reason: collision with root package name */
    public final String f349978k;

    public zbag(@N Activity activity, @N k kVar) {
        super(activity, (C36616a<k>) f349977l, kVar, h.a.f348930c);
        this.f349978k = zbat.zba();
    }

    public final Status getStatusFromIntent(@P Intent intent) {
        if (intent == null) {
            return Status.f348902h;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : TX0.b.a(byteArrayExtra, creator));
        return status == null ? Status.f348902h : status;
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(@N SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C36729v.j(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a aVar = new SaveAccountLinkingTokenRequest.a();
        aVar.f348683d = saveAccountLinkingTokenRequest.f348677e;
        aVar.f348682c = saveAccountLinkingTokenRequest.f348676d;
        aVar.f348680a = saveAccountLinkingTokenRequest.f348674b;
        aVar.f348681b = saveAccountLinkingTokenRequest.f348675c;
        aVar.f348685f = saveAccountLinkingTokenRequest.f348679g;
        String str = saveAccountLinkingTokenRequest.f348678f;
        if (!TextUtils.isEmpty(str)) {
            aVar.f348684e = str;
        }
        aVar.f348684e = this.f349978k;
        C36729v.a("Consent PendingIntent cannot be null", aVar.f348680a != null);
        C36729v.a("Invalid tokenType", "auth_code".equals(aVar.f348681b));
        C36729v.a("serviceId cannot be null or empty", !TextUtils.isEmpty(aVar.f348682c));
        C36729v.a("scopes cannot be null", aVar.f348683d != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(aVar.f348680a, aVar.f348681b, aVar.f348682c, aVar.f348683d, aVar.f348684e, aVar.f348685f);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbg};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae((C37028k) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                C36729v.j(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 1535;
        return doRead(aVarA.a());
    }

    @Override // OX0.b
    public final Task<SavePasswordResult> savePassword(@N SavePasswordRequest savePasswordRequest) {
        C36729v.j(savePasswordRequest);
        SavePasswordRequest.a aVar = new SavePasswordRequest.a();
        aVar.f348690a = savePasswordRequest.f348687b;
        aVar.f348692c = savePasswordRequest.f348689d;
        String str = savePasswordRequest.f348688c;
        if (str != null) {
            aVar.f348691b = str;
        }
        aVar.f348691b = this.f349978k;
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(aVar.f348690a, aVar.f348691b, aVar.f348692c);
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zbas.zbe};
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                zbaf zbafVar = new zbaf((C37028k) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
                C36729v.j(savePasswordRequest3);
                zbnVar.zbd(zbafVar, savePasswordRequest3);
            }
        };
        aVarA.f348953b = false;
        aVarA.f348955d = 1536;
        return doRead(aVarA.a());
    }

    public zbag(@N Context context, @N k kVar) {
        super(context, (C36616a<k>) f349977l, kVar, h.a.f348930c);
        this.f349978k = zbat.zba();
    }
}
