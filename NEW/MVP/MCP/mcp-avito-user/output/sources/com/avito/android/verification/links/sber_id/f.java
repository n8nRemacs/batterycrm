package com.avito.android.verification.links.sber_id;

import Ob1.a;
import Y41.l;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import d31.AbstractC39500f;
import e.InterfaceC39835a;
import e.h;
import f61.C40239a;
import java.net.SocketException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sberid.sdk.init.a;

/* compiled from: VerificationSberIdSyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationSberIdLink f324495l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VerificationSberIdLink verificationSberIdLink) {
        super(1);
        this.f324495l = verificationSberIdLink;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(Context context) throws SocketException {
        Context context2 = context;
        Application application = (Application) context2.getApplicationContext();
        ActivityC22955m activityC22955m = (ActivityC22955m) context2;
        a.c cVar = a.c.f437770a;
        VerificationSberIdLink verificationSberIdLink = this.f324495l;
        a.c.a(cVar, application, verificationSberIdLink.f324481c);
        a.d.f437775a.getClass();
        Ob1.a.f12414h.getClass();
        a.C0794a.C0795a c0795a = new a.C0794a.C0795a();
        c0795a.f12425a = verificationSberIdLink.f324484f;
        c0795a.f12426b = verificationSberIdLink.f324483e;
        c0795a.f12427c = verificationSberIdLink.f324482d;
        c0795a.f12428d = verificationSberIdLink.f324485g;
        Uri.Builder builderBuildUpon = new Uri.Builder().scheme("sberbankidlogin").authority("sberbankid").build().buildUpon();
        builderBuildUpon.appendQueryParameter("client_id", ((h) ((InterfaceC39835a) Ob1.a.f12415i.getValue())).a());
        String str = c0795a.f12425a;
        if (str == null) {
            str = null;
        }
        builderBuildUpon.appendQueryParameter("scope", str);
        String str2 = c0795a.f12426b;
        if (str2 == null) {
            str2 = null;
        }
        builderBuildUpon.appendQueryParameter(VoiceInfo.STATE, str2);
        String str3 = c0795a.f12427c;
        if (str3 == null) {
            str3 = null;
        }
        builderBuildUpon.appendQueryParameter("nonce", str3);
        String str4 = c0795a.f12428d;
        builderBuildUpon.appendQueryParameter("redirect_uri", str4 != null ? str4 : null);
        builderBuildUpon.appendQueryParameter("logUid", ((C40239a) Ob1.a.f12417k.getValue()).f395679a);
        Uri uriBuild = builderBuildUpon.build();
        if (!((O51.d) ((T51.c) a.d.f437777c.getValue()).f15377a).a().f18606d.f18636e || AbstractC39500f.a(activityC22955m)) {
            a.d.a(activityC22955m, uriBuild);
        } else {
            FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
            g0.h hVar = new g0.h();
            Bundle bundle = new Bundle();
            bundle.putParcelable(TooltipAttribute.PARAM_DEEP_LINK, uriBuild);
            hVar.setArguments(bundle);
            hVar.show(supportFragmentManager, "App2AppBottomSheetDialogFragment");
        }
        return G0.f406611a;
    }
}
