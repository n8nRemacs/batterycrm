package com.avito.android.download_deeplink.link;

import Ju.AbstractC14250d;
import Y61.k;
import Y61.l;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import rv.C47920c;

/* compiled from: DownloadFileLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/download_deeplink/link/DownloadFileLink;", "a", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<DownloadFileLink> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f144899j = 0;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f144900g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.h f144901h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.download_deeplink.link.d f144902i;

    /* compiled from: DownloadFileLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/download_deeplink/link/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WRITE_PERMISSION", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.download_deeplink.link.a$a, reason: collision with other inner class name */
    public static final class C4213a {
        public /* synthetic */ C4213a(C42822w c42822w) {
            this();
        }

        public C4213a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Map<String, ? extends C47920c>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f144903b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.download_deeplink.link.a$b$a, reason: collision with other inner class name */
        public static final class C4214a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f144904b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.download_deeplink.link.DownloadFileLinkAsyncHandler$onCreateSuspend$$inlined$filter$1$2", f = "DownloadFileLinkAsyncHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.download_deeplink.link.a$b$a$a, reason: collision with other inner class name */
            public static final class C4215a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f144905q;

                /* renamed from: r, reason: collision with root package name */
                public int f144906r;

                public C4215a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f144905q = obj;
                    this.f144906r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4214a.this.emit(null, this);
                }
            }

            public C4214a(InterfaceC43172j interfaceC43172j) {
                this.f144904b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.download_deeplink.link.a.b.C4214a.C4215a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.download_deeplink.link.a$b$a$a r0 = (com.avito.android.download_deeplink.link.a.b.C4214a.C4215a) r0
                    int r1 = r0.f144906r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f144906r = r1
                    goto L18
                L13:
                    com.avito.android.download_deeplink.link.a$b$a$a r0 = new com.avito.android.download_deeplink.link.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f144905q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f144906r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.util.Map r6 = (java.util.Map) r6
                    java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
                    boolean r6 = r6.containsKey(r2)
                    if (r6 == 0) goto L4a
                    r0.f144906r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f144904b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.download_deeplink.link.a.b.C4214a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f144903b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Map<String, ? extends C47920c>> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f144903b).collect(new C4214a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<C47920c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f144908b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.download_deeplink.link.a$c$a, reason: collision with other inner class name */
        public static final class C4216a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f144909b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.download_deeplink.link.DownloadFileLinkAsyncHandler$onCreateSuspend$$inlined$map$1$2", f = "DownloadFileLinkAsyncHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.download_deeplink.link.a$c$a$a, reason: collision with other inner class name */
            public static final class C4217a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f144910q;

                /* renamed from: r, reason: collision with root package name */
                public int f144911r;

                public C4217a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f144910q = obj;
                    this.f144911r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4216a.this.emit(null, this);
                }
            }

            public C4216a(InterfaceC43172j interfaceC43172j) {
                this.f144909b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.download_deeplink.link.a.c.C4216a.C4217a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.download_deeplink.link.a$c$a$a r0 = (com.avito.android.download_deeplink.link.a.c.C4216a.C4217a) r0
                    int r1 = r0.f144911r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f144911r = r1
                    goto L18
                L13:
                    com.avito.android.download_deeplink.link.a$c$a$a r0 = new com.avito.android.download_deeplink.link.a$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f144910q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f144911r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L56
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.util.Map r5 = (java.util.Map) r5
                    java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
                    java.lang.Object r5 = r5.get(r6)
                    rv.c r5 = (rv.C47920c) r5
                    if (r5 != 0) goto L4b
                    rv.c$a r5 = rv.C47920c.f437160c
                    r5.getClass()
                    rv.c r5 = new rv.c
                    r6 = 0
                    r5.<init>(r6, r6)
                L4b:
                    r0.f144911r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f144909b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L56
                    return r1
                L56:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.download_deeplink.link.a.c.C4216a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(b bVar) {
            this.f144908b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47920c> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f144908b.collect(new C4216a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: DownloadFileLinkAsyncHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/c;", "result", "Lkotlin/G0;", "emit", "(Lrv/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC43172j {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            G0 g02;
            boolean z12 = ((C47920c) obj).f437161a;
            a aVar = a.this;
            if (z12) {
                int i12 = a.f144899j;
                DownloadFileLink downloadFileLink = (DownloadFileLink) aVar.c();
                if (downloadFileLink != null) {
                    aVar.a(aVar.b(), downloadFileLink, aVar.e());
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    aVar.j(AbstractC14250d.b.f9170c);
                }
            } else {
                V2.f318762a.d("DownloadFileLinkAsyncHandler", "Download cancelled, permission not granted");
                aVar.j(AbstractC14250d.b.f9170c);
            }
            return G0.f406611a;
        }
    }

    static {
        new C4213a(null);
    }

    @Inject
    public a(@k Context context, @k a.h hVar, @k com.avito.android.download_deeplink.link.d dVar, @k R0 r02) {
        super(r02);
        this.f144900g = context;
        this.f144901h = hVar;
        this.f144902i = dVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        DownloadFileLink downloadFileLink = (DownloadFileLink) deepLink;
        if (Build.VERSION.SDK_INT < 29 && androidx.core.content.d.checkSelfPermission(this.f144900g, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.f144901h.o0("android.permission.WRITE_EXTERNAL_STORAGE");
            return G0.f406611a;
        }
        Uri uri = downloadFileLink.f144897b;
        com.avito.android.download_deeplink.link.d dVar = this.f144902i;
        dVar.getClass();
        String str2 = downloadFileLink.f144898c;
        if (str2 == null) {
            str2 = (String) C42745f0.Q(uri.getPathSegments());
        }
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.addRequestHeader("Cookie", C42745f0.O(dVar.f144922b.a(), ";", null, null, e.f144926l, 30));
        request.setTitle(str2);
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        long jEnqueue = dVar.f144921a.enqueue(request);
        long jH2 = kotlin.time.g.h(1L, DurationUnit.f410634f);
        Object objCollect = new f(C43175k.G(new g(jH2, jH2, null)), dVar, jEnqueue).collect(new com.avito.android.download_deeplink.link.b(this), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        Object objCollect = new c(new b(y.a(this.f144901h.W1()))).collect(new d(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
