package com.avito.android.verification.links.vtb_finish;

import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import com.avito.android.verification.links.vtb.e;
import com.avito.android.verification.links.vtb.g;
import com.avito.android.verification.links.vtb.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import vM0.f;

/* compiled from: VerificationVTBFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/vtb_finish/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/verification/links/vtb_finish/VerificationVTBFinishLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VerificationVTBFinishLink> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f324744p = 0;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f324745g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f324746h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.verification.storage.a f324747i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final g f324748j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.g f324749k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324750l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final a.i f324751m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final f f324752n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final R0 f324753o;

    /* compiled from: VerificationVTBFinishLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/vtb_finish/a$a;", "", "<init>", "()V", "", "KEY_CODE_VERIFIER", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.vtb_finish.a$a, reason: collision with other inner class name */
    public static final class C10046a {
        public /* synthetic */ C10046a(C42822w c42822w) {
            this();
        }

        public C10046a() {
        }
    }

    static {
        new C10046a(null);
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a, @k e eVar, @k com.avito.android.verification.storage.a aVar, @k g gVar, @k a.g gVar2, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k a.i iVar, @k f fVar, @k R0 r02) {
        super(r02);
        this.f324745g = interfaceC28373a;
        this.f324746h = eVar;
        this.f324747i = aVar;
        this.f324748j = gVar;
        this.f324749k = gVar2;
        this.f324750l = aVar2;
        this.f324751m = iVar;
        this.f324752n = fVar;
        this.f324753o = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        VerificationVTBFinishLink verificationVTBFinishLink = (VerificationVTBFinishLink) deepLink;
        boolean zContainsKey = verificationVTBFinishLink.f324743c.containsKey("code");
        ?? r112 = verificationVTBFinishLink.f324743c;
        if (zContainsKey && !r112.containsKey("error")) {
            Object objO = o(r112, (ContinuationImpl) continuation);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }
        String strL = (String) r112.get("error");
        if (strL == null) {
            strL = z.l(new UnknownError());
        }
        this.f324745g.c(new com.avito.android.verification.links.vtb.b(String.valueOf(c()), strL, true));
        PrintableText f323383c = this.f324752n.getF323383c();
        f.c.f125255c.getClass();
        a.i.C4057a.d(this.f324751m, f323383c, null, null, f.c.a.b(), 0, null, null, null, 2030);
        j(new k.a(strL));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x007d, B:27:0x0087, B:28:0x008d), top: B:46:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:25:0x007d, B:27:0x0087, B:28:0x008d), top: B:46:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.Map r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.vtb_finish.a.o(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
