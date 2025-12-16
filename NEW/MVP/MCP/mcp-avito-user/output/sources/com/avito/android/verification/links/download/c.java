package com.avito.android.verification.links.download;

import Ju.AbstractC14250d;
import Y61.k;
import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.completable.K;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import l41.o;
import l41.r;
import rv.C47920c;
import zz.InterfaceC50647a;

/* compiled from: VerificationDownloadLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/download/c;", "Lev/a;", "Lcom/avito/android/verification/links/download/VerificationDownloadLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends AbstractC40161a<VerificationDownloadLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f324189f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f324190g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f324191h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.h f324192i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e f324193j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f324194k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC50647a f324195l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324196m = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationDownloadLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "it", "", "test", "(Ljava/util/Map;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f324197b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Map) obj).containsKey("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* compiled from: VerificationDownloadLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "it", "", "apply", "(Ljava/util/Map;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f324198b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            C47920c c47920c = (C47920c) ((Map) obj).get("android.permission.WRITE_EXTERNAL_STORAGE");
            return Boolean.valueOf(c47920c != null ? c47920c.f437161a : false);
        }
    }

    /* compiled from: VerificationDownloadLinkAsyncHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isGranted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.verification.links.download.c$c, reason: collision with other inner class name */
    public static final class C10037c<T> implements l41.g {
        public C10037c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            G0 g02;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c cVar = c.this;
            if (!zBooleanValue) {
                cVar.j(AbstractC14250d.b.f9170c);
                return;
            }
            VerificationDownloadLink verificationDownloadLinkC = cVar.c();
            if (verificationDownloadLinkC != null) {
                cVar.e();
                cVar.b();
                cVar.k(verificationDownloadLinkC);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                cVar.j(AbstractC14250d.b.f9170c);
            }
        }
    }

    @Inject
    public c(@k Context context, @k a.g gVar, @k a.i iVar, @k a.h hVar, @k e eVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC50647a interfaceC50647a) {
        this.f324189f = context;
        this.f324190g = gVar;
        this.f324191h = iVar;
        this.f324192i = hVar;
        this.f324193j = eVar;
        this.f324194k = interfaceC35745a5;
        this.f324195l = interfaceC50647a;
    }

    @Override // ev.AbstractC40161a
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, DeepLink deepLink, String str) {
        k((VerificationDownloadLink) deepLink);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        androidx.core.content.d.registerReceiver(this.f324189f, this.f324193j, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        this.f324196m.b(this.f324192i.W1().N(a.f324197b).d0(b.f324198b).t0(new C10037c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324196m.e();
        this.f324189f.unregisterReceiver(this.f324193j);
    }

    public final void k(@k VerificationDownloadLink verificationDownloadLink) {
        if (Build.VERSION.SDK_INT < 29 && androidx.core.content.d.checkSelfPermission(this.f324189f, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.f324192i.o0("android.permission.WRITE_EXTERNAL_STORAGE");
            return;
        }
        e eVar = this.f324193j;
        eVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        Uri uri = verificationDownloadLink.f324186b;
        String strS = AK.c.s(sb2, (String) C42745f0.Q(uri.getPathSegments()), ".pdf");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.addRequestHeader("Cookie", C42745f0.O(eVar.f324208a.a(), ";", null, null, f.f324212l, 30));
        request.setTitle(strS);
        request.setMimeType("application/pdf");
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strS);
        long jEnqueue = eVar.f324209b.enqueue(request);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        z zVarT = z.a0(1L, 1L, timeUnit, h12).T(new g(eVar, jEnqueue), Integer.MAX_VALUE);
        zVarT.getClass();
        K kN2 = new v(z.g0(zVarT.E0(45L, timeUnit, null, h12), eVar.f324210c.N(new h(jEnqueue))).S()).q(this.f324194k.e()).n(new com.avito.android.verification.links.download.a(this));
        C31684n c31684n = new C31684n(this, 23);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f324196m.b(kN2.m(gVar, gVar, interfaceC43543a, c31684n, interfaceC43543a, interfaceC43543a).v(new com.avito.android.advert_core.task.a(10), new com.avito.android.verification.links.download.b(this)));
    }
}
