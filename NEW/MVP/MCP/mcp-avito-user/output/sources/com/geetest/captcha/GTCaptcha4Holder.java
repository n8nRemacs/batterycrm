package com.geetest.captcha;

import android.content.Context;
import com.avito.android.remote.model.Navigation;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.x;
import java.io.File;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0014R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006-"}, d2 = {"Lcom/geetest/captcha/GTCaptcha4Holder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "listener", "Lkotlin/G0;", "addOnFailureListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "response", "addOnSuccessListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "webViewShowListener", "addOnWebViewShowListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;)V", "cancel", "()V", "Landroid/content/res/Configuration;", "newConfig", "configurationChanged", "(Landroid/content/res/Configuration;)V", "destroy", "", "appId", "Lcom/geetest/captcha/GTCaptcha4Config;", Navigation.CONFIG, "init", "(Ljava/lang/String;Lcom/geetest/captcha/GTCaptcha4Config;)V", "preLoadWithCaptcha", "", "enable", "setLogEnable", "(Z)V", "verifyWithCaptcha", "Lcom/geetest/captcha/controller/Controller;", "controller", "Lcom/geetest/captcha/controller/Controller;", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.geetest.captcha.a, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class GTCaptcha4Holder {

    /* renamed from: e, reason: collision with root package name */
    public static long f342686e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f342687f = new b();

    /* renamed from: a, reason: collision with root package name */
    public final com.geetest.captcha.b f342688a;

    /* renamed from: b, reason: collision with root package name */
    public GTCaptcha4Client.OnSuccessListener f342689b;

    /* renamed from: c, reason: collision with root package name */
    public GTCaptcha4Client.OnFailureListener f342690c;

    /* renamed from: d, reason: collision with root package name */
    public GTCaptcha4Client.OnWebViewShowListener f342691d;

    /* renamed from: com.geetest.captcha.a$a */
    public static final class a extends N implements Y41.a<G0> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            invoke2();
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            File externalFilesDir = this.$context.getApplicationContext().getExternalFilesDir(null);
            i0.f342741a = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        }
    }

    /* renamed from: com.geetest.captcha.a$b */
    public static final class b {
    }

    public GTCaptcha4Holder(@Y61.k Context context) {
        this.f342688a = new com.geetest.captcha.b(context);
        try {
            S41.c.a(31, new a(context));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        e0.f342714f.a(context);
    }

    public final void a(@Y61.k String str, @Y61.l GTCaptcha4Config gTCaptcha4Config) {
        com.geetest.captcha.b bVar = this.f342688a;
        bVar.getClass();
        bVar.f342694a = str;
        com.geetest.captcha.b bVar2 = this.f342688a;
        bVar2.f342698e = gTCaptcha4Config;
        bVar2.f342700g = new o();
        s sVar = new s();
        bVar2.f342701h = sVar;
        bVar2.f342700g.f342782a = sVar;
        p pVar = new p(bVar2.f342702i, v.f342783l.a(bVar2.f342694a, bVar2.f342698e));
        bVar2.f342699f = pVar;
        pVar.a(x.a.FLOWING);
        bVar2.f342699f.a(x.NONE);
        p pVar2 = bVar2.f342699f;
        GTCaptcha4Config gTCaptcha4Config2 = bVar2.f342698e;
        pVar2.f342767c = new g(gTCaptcha4Config2 != null ? gTCaptcha4Config2.getDialogShowListener() : null);
        bVar2.f342700g.b(bVar2.f342699f);
    }
}
