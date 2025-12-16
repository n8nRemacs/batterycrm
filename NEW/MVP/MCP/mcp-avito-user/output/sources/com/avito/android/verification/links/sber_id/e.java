package com.avito.android.verification.links.sber_id;

import Y41.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import vb1.C49297b;

/* compiled from: VerificationSberIdSyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationSberIdLink f324492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String[] f324493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f324494n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VerificationSberIdLink verificationSberIdLink, String[] strArr, d dVar) {
        super(1);
        this.f324492l = verificationSberIdLink;
        this.f324493m = strArr;
        this.f324494n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        C49297b.a aVar = new C49297b.a(context);
        VerificationSberIdLink verificationSberIdLink = this.f324492l;
        aVar.f440882b = Long.parseLong(verificationSberIdLink.f324481c);
        String[] strArr = this.f324493m;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        Set<String> setL0 = C42756l.l0((String[]) Arrays.copyOf(strArr2, strArr2.length));
        aVar.f440881a = setL0;
        aVar.f440883c = verificationSberIdLink.f324483e;
        aVar.f440884d = verificationSberIdLink.f324482d;
        aVar.f440885e = verificationSberIdLink.f324485g;
        if (setL0.isEmpty() || !aVar.f440881a.contains("openid")) {
            throw new IllegalArgumentException("Scopes empty or not containing openid scope");
        }
        if (aVar.f440882b == 0) {
            throw new IllegalArgumentException("clientId is not set");
        }
        String str = aVar.f440883c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("state is null or empty");
        }
        String str2 = aVar.f440884d;
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("nonce is null or empty");
        }
        String str3 = aVar.f440885e;
        if (str3 == null || str3.length() == 0) {
            throw new IllegalArgumentException("redirectUri is null or empty");
        }
        C49297b c49297b = new C49297b(aVar, null);
        this.f324494n.f324491g.f324486a = c49297b;
        Context context2 = c49297b.f440875b;
        c49297b.f440874a.getClass();
        Set<String> set = c49297b.f440877d;
        String string = new Uri.Builder().scheme(Constants.SCHEME).authority("sbi.sberbank.ru").path("/ic/sso/api/v1/oauth/authorize").appendQueryParameter("client_id", String.valueOf(c49297b.f440876c)).appendQueryParameter("scope", C42745f0.O(set, " ", null, null, null, 62).toLowerCase(Locale.ROOT)).appendQueryParameter("redirect_uri", c49297b.f440880g).appendQueryParameter("nonce", c49297b.f440879f).appendQueryParameter("response_type", "code").appendQueryParameter(VoiceInfo.STATE, c49297b.f440878e).toString();
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string));
            context2.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
        return G0.f406611a;
    }
}
