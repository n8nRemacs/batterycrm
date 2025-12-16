package com.avito.android.captcha.deeplink;

import Y41.l;
import com.avito.android.captcha.deeplink.i;
import com.avito.android.captcha.p;
import com.avito.android.captcha.r;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CaptchaDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/z;", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<z, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f114988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f114989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CaptchaDeeplink f114990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f114991o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, r rVar, d dVar, CaptchaDeeplink captchaDeeplink) {
        super(1);
        this.f114988l = rVar;
        this.f114989m = dVar;
        this.f114990n = captchaDeeplink;
        this.f114991o = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(z zVar) {
        z zVar2 = zVar;
        this.f114988l.destroy();
        d dVar = this.f114989m;
        dVar.getClass();
        boolean z12 = zVar2 instanceof z.c;
        CaptchaDeeplink captchaDeeplink = this.f114990n;
        p pVar = this.f114991o;
        if (z12) {
            if (pVar instanceof p.a) {
                dVar.k(((z.c) zVar2).f115152a, captchaDeeplink);
            } else {
                dVar.i(i.e.f115034b, dVar.f114992f, captchaDeeplink);
            }
        } else if (zVar2 instanceof z.d) {
            dVar.f114996j.a(((z.d) zVar2).f115153a);
            if (pVar instanceof p.a) {
                dVar.k(p.a.a((p.a) pVar, "SERVER_ERROR_MESSAGE"), captchaDeeplink);
            } else {
                dVar.m(i.g.f115036b);
            }
        } else {
            dVar.m(i.g.f115036b);
        }
        return G0.f406611a;
    }
}
