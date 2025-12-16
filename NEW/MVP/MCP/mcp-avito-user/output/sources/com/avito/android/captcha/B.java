package com.avito.android.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.avito.android.captcha.q;
import com.avito.android.captcha.s;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaType;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.GTCaptcha4Config;
import id.C41383a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;

/* compiled from: GeetestCaptchaHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/B;", "Lcom/avito/android/captcha/r;", "Lkotlinx/coroutines/T;", "a", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B implements r, T {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f114913p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f114914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41383a f114915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.D f114916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f114917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f114918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public GTCaptcha4Client f114919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Context f114920h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public E f114921i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Dialog f114922j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N f114923k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N f114924l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A f114925m = new A(this);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A f114926n = new A(this);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C f114927o = new C(this);

    /* compiled from: GeetestCaptchaHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/captcha/B$a;", "", "<init>", "()V", "", "DEBUG_EVENT_ID", "Ljava/lang/String;", "", "POLLING_INTERVAL_MILLIS", "J", "RELEASE_EVENT_ID", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public B(@Y61.k com.avito.android.D d12, @Y61.k InterfaceC35950u interfaceC35950u, @Y61.k R0 r02, @Y61.k C41383a c41383a) {
        this.f114914b = interfaceC35950u;
        this.f114915c = c41383a;
        this.f114916d = d12;
        this.f114917e = r02.b().plus(new F(kotlinx.coroutines.N.f410714t2, this));
    }

    public static z.d i(String str) {
        return new z.d(new q.b(str, CaptchaType.GEETEST));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2.equals("-13220") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.equals("-13219") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r2.equals("-13218") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r2.equals("-13217") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r2.equals("-13216") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r2.equals("-13215") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r2.equals("-13214") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r2.equals("-13213") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r2.equals("-13212") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r2.equals("-13211") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r2.equals("-13210") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r2.equals("-13209") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r2.equals("-13208") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r2.equals("-13207") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        if (r2.equals("-13206") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r2.equals("-13205") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        if (r2.equals("-13204") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        if (r2.equals("-13203") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d0, code lost:
    
        if (r2.equals("-13202") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:
    
        if (r2.equals("-13201") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return com.avito.android.captcha.CaptchaSdkErrorType.f114932e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r2.equals("-13221") == false) goto L74;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.captcha.CaptchaSdkErrorType k(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 1335165150(0x4f9500de, float:4.999724E9)
            if (r0 == r1) goto Ldf
            switch(r0) {
                case 1335133252: goto Ld3;
                case 1335133253: goto Lca;
                case 1335133254: goto Lc1;
                case 1335133255: goto Lb8;
                case 1335133256: goto Laf;
                case 1335133257: goto La6;
                case 1335133258: goto L9d;
                case 1335133259: goto L94;
                case 1335133260: goto L8b;
                default: goto Lc;
            }
        Lc:
            switch(r0) {
                case 1335133282: goto L82;
                case 1335133283: goto L78;
                case 1335133284: goto L6e;
                case 1335133285: goto L64;
                case 1335133286: goto L5a;
                case 1335133287: goto L50;
                case 1335133288: goto L46;
                case 1335133289: goto L3c;
                case 1335133290: goto L32;
                case 1335133291: goto L28;
                default: goto Lf;
            }
        Lf:
            switch(r0) {
                case 1335133313: goto L1e;
                case 1335133314: goto L14;
                default: goto L12;
            }
        L12:
            goto Le7
        L14:
            java.lang.String r0 = "-13221"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L1e:
            java.lang.String r0 = "-13220"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L28:
            java.lang.String r0 = "-13219"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L32:
            java.lang.String r0 = "-13218"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L3c:
            java.lang.String r0 = "-13217"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L46:
            java.lang.String r0 = "-13216"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L50:
            java.lang.String r0 = "-13215"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L5a:
            java.lang.String r0 = "-13214"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L64:
            java.lang.String r0 = "-13213"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L6e:
            java.lang.String r0 = "-13212"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L78:
            java.lang.String r0 = "-13211"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L82:
            java.lang.String r0 = "-13210"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L8b:
            java.lang.String r0 = "-13209"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L94:
            java.lang.String r0 = "-13208"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        L9d:
            java.lang.String r0 = "-13207"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        La6:
            java.lang.String r0 = "-13206"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Laf:
            java.lang.String r0 = "-13205"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Lb8:
            java.lang.String r0 = "-13204"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Lc1:
            java.lang.String r0 = "-13203"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Lca:
            java.lang.String r0 = "-13202"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Ld3:
            java.lang.String r0 = "-13201"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ldc
            goto Le7
        Ldc:
            com.avito.android.captcha.CaptchaSdkErrorType r2 = com.avito.android.captcha.CaptchaSdkErrorType.f114932e
            goto Lec
        Ldf:
            java.lang.String r0 = "-14460"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lea
        Le7:
            com.avito.android.captcha.CaptchaSdkErrorType r2 = com.avito.android.captcha.CaptchaSdkErrorType.f114933f
            goto Lec
        Lea:
            com.avito.android.captcha.CaptchaSdkErrorType r2 = com.avito.android.captcha.CaptchaSdkErrorType.f114931d
        Lec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.B.k(java.lang.String):com.avito.android.captcha.CaptchaSdkErrorType");
    }

    @Override // com.avito.android.captcha.r
    @Y61.k
    public final s b() {
        Context context;
        InterfaceC35950u interfaceC35950u = this.f114914b;
        com.avito.android.D d12 = this.f114916d;
        d12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.D.f67247d[0];
        if (!((Boolean) d12.f67248b.a().invoke()).booleanValue()) {
            return s.a.f115133a;
        }
        try {
            Activity activity = this.f114915c.get();
            if (activity == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Activity activity2 = activity;
            GTCaptcha4Client gTCaptcha4ClientInit = GTCaptcha4Client.getClient(activity2).init(interfaceC35950u.l() ? "7d9b72560e43ba7d258349c2d0f2b23c" : "11ac3c3257a85d81624b673bc8e70917", h());
            this.f114919g = gTCaptcha4ClientInit;
            if (gTCaptcha4ClientInit != null) {
                gTCaptcha4ClientInit.setLogEnable(!interfaceC35950u.l());
            }
            E e12 = this.f114921i;
            if (e12 != null && (context = this.f114920h) != null) {
                context.unregisterComponentCallbacks(e12);
            }
            this.f114921i = null;
            this.f114920h = null;
            Context applicationContext = activity2.getApplicationContext();
            this.f114920h = applicationContext;
            E e13 = new E(this, activity2);
            this.f114921i = e13;
            if (applicationContext != null) {
                applicationContext.registerComponentCallbacks(e13);
            }
            return s.c.f115135a;
        } catch (Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "Geetest captcha init failed", th2);
            g();
            return s.b.f115134a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.captcha.r
    public final void c(@Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        GTCaptcha4Client gTCaptcha4ClientAddOnSuccessListener;
        GTCaptcha4Client gTCaptcha4ClientAddOnFailureListener;
        this.f114923k = (N) lVar;
        this.f114924l = (N) lVar2;
        GTCaptcha4Client gTCaptcha4Client = this.f114919g;
        if (((gTCaptcha4Client == null || (gTCaptcha4ClientAddOnSuccessListener = gTCaptcha4Client.addOnSuccessListener(this.f114925m)) == null || (gTCaptcha4ClientAddOnFailureListener = gTCaptcha4ClientAddOnSuccessListener.addOnFailureListener(this.f114926n)) == null) ? null : gTCaptcha4ClientAddOnFailureListener.verifyWithCaptcha()) == null) {
            f(z.a.f115150a);
        }
    }

    @Override // com.avito.android.captcha.r
    public final void destroy() {
        Dialog dialog = this.f114922j;
        if (dialog != null) {
            dialog.dismiss();
        }
        g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void f(z zVar) {
        ?? r02 = this.f114924l;
        if (r02 != 0) {
            r02.invoke(zVar);
        }
        g();
    }

    public final void g() {
        Context context;
        E e12 = this.f114921i;
        if (e12 != null && (context = this.f114920h) != null) {
            context.unregisterComponentCallbacks(e12);
        }
        this.f114921i = null;
        this.f114920h = null;
        Q0.d(this.f114917e);
        GTCaptcha4Client gTCaptcha4Client = this.f114919g;
        if (gTCaptcha4Client != null) {
            gTCaptcha4Client.destroy();
        }
        this.f114919g = null;
        this.f114923k = null;
        this.f114924l = null;
        this.f114918f = null;
        this.f114922j = null;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF114917e() {
        return this.f114917e;
    }

    public final GTCaptcha4Config h() {
        GTCaptcha4Config.Builder params = new GTCaptcha4Config.Builder().setLanguage("ru").setCanceledOnTouchOutside(false).setParams(P0.e(new Q("hideSuccess", Boolean.TRUE)));
        params.setDialogShowListener(this.f114927o);
        return params.build();
    }

    @Override // com.avito.android.captcha.r
    public final void e() {
    }
}
