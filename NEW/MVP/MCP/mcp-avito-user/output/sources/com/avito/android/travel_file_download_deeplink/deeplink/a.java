package com.avito.android.travel_file_download_deeplink.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.travel_file_download_deeplink.TravelFileDownloadDeeplink;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import rv.C47920c;
import sv.C48421d;

/* compiled from: FileDownloadDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink;", "a", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<TravelFileDownloadDeeplink> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f301690n = 0;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f301691g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.h f301692h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f301693i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.b f301694j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C25719a f301695k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.i f301696l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.travel_file_download_deeplink.d f301697m;

    /* compiled from: FileDownloadDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/deeplink/a$a;", "", "<init>", "()V", "", "WRITE_PERMISSION", "Ljava/lang/String;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$a, reason: collision with other inner class name */
    public static final class C9231a {
        public /* synthetic */ C9231a(C42822w c42822w) {
            this();
        }

        public C9231a() {
        }
    }

    /* compiled from: FileDownloadDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f301698a;

        static {
            int[] iArr = new int[TravelFileDownloadDeeplink.Action.values().length];
            try {
                iArr[TravelFileDownloadDeeplink.Action.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f301698a = iArr;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f301699b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f301700c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$c$a, reason: collision with other inner class name */
        public static final class C9232a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f301701b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f301702c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.deeplink.FileDownloadDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "FileDownloadDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$c$a$a, reason: collision with other inner class name */
            public static final class C9233a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f301703q;

                /* renamed from: r, reason: collision with root package name */
                public int f301704r;

                public C9233a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f301703q = obj;
                    this.f301704r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9232a.this.emit(null, this);
                }
            }

            public C9232a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f301701b = interfaceC43172j;
                this.f301702c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.travel_file_download_deeplink.deeplink.a.c.C9232a.C9233a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.travel_file_download_deeplink.deeplink.a$c$a$a r0 = (com.avito.android.travel_file_download_deeplink.deeplink.a.c.C9232a.C9233a) r0
                    int r1 = r0.f301704r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f301704r = r1
                    goto L18
                L13:
                    com.avito.android.travel_file_download_deeplink.deeplink.a$c$a$a r0 = new com.avito.android.travel_file_download_deeplink.deeplink.a$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f301703q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f301704r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.travel_file_download_deeplink.deeplink.a r2 = r4.f301702c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f301704r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f301701b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.deeplink.a.c.C9232a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f301699b = interfaceC43160i;
            this.f301700c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f301699b).collect(new C9232a(interfaceC43172j, this.f301700c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Map<String, ? extends C47920c>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f301706b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$d$a, reason: collision with other inner class name */
        public static final class C9234a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f301707b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.deeplink.FileDownloadDeeplinkHandler$onCreateSuspend$$inlined$filter$2$2", f = "FileDownloadDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$d$a$a, reason: collision with other inner class name */
            public static final class C9235a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f301708q;

                /* renamed from: r, reason: collision with root package name */
                public int f301709r;

                public C9235a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f301708q = obj;
                    this.f301709r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9234a.this.emit(null, this);
                }
            }

            public C9234a(InterfaceC43172j interfaceC43172j) {
                this.f301707b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.travel_file_download_deeplink.deeplink.a.d.C9234a.C9235a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.travel_file_download_deeplink.deeplink.a$d$a$a r0 = (com.avito.android.travel_file_download_deeplink.deeplink.a.d.C9234a.C9235a) r0
                    int r1 = r0.f301709r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f301709r = r1
                    goto L18
                L13:
                    com.avito.android.travel_file_download_deeplink.deeplink.a$d$a$a r0 = new com.avito.android.travel_file_download_deeplink.deeplink.a$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f301708q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f301709r
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
                    r0.f301709r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f301707b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.deeplink.a.d.C9234a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i) {
            this.f301706b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Map<String, ? extends C47920c>> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f301706b).collect(new C9234a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC43160i<C47920c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f301711b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$e$a, reason: collision with other inner class name */
        public static final class C9236a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f301712b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.deeplink.FileDownloadDeeplinkHandler$onCreateSuspend$$inlined$map$1$2", f = "FileDownloadDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.travel_file_download_deeplink.deeplink.a$e$a$a, reason: collision with other inner class name */
            public static final class C9237a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f301713q;

                /* renamed from: r, reason: collision with root package name */
                public int f301714r;

                public C9237a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f301713q = obj;
                    this.f301714r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9236a.this.emit(null, this);
                }
            }

            public C9236a(InterfaceC43172j interfaceC43172j) {
                this.f301712b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.travel_file_download_deeplink.deeplink.a.e.C9236a.C9237a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.travel_file_download_deeplink.deeplink.a$e$a$a r0 = (com.avito.android.travel_file_download_deeplink.deeplink.a.e.C9236a.C9237a) r0
                    int r1 = r0.f301714r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f301714r = r1
                    goto L18
                L13:
                    com.avito.android.travel_file_download_deeplink.deeplink.a$e$a$a r0 = new com.avito.android.travel_file_download_deeplink.deeplink.a$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f301713q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f301714r
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
                    r0.f301714r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f301712b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L56
                    return r1
                L56:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.deeplink.a.e.C9236a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(d dVar) {
            this.f301711b = dVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47920c> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f301711b.collect(new C9236a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: FileDownloadDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.deeplink.FileDownloadDeeplinkHandler", f = "FileDownloadDeeplinkHandler.kt", i = {0}, l = {50}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f301716q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f301717r;

        /* renamed from: t, reason: collision with root package name */
        public int f301719t;

        public f(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f301717r = obj;
            this.f301719t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.n(this);
        }
    }

    /* compiled from: FileDownloadDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(rv.C47918a r11, kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.deeplink.a.g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FileDownloadDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends C42801a implements p<C47920c, Continuation<? super G0>, Object>, SuspendFunction {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final Object invoke(C47920c c47920c, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            int i12 = a.f301690n;
            TravelFileDownloadDeeplink travelFileDownloadDeeplink = (TravelFileDownloadDeeplink) aVar.c();
            if (!c47920c.f437161a || travelFileDownloadDeeplink == null) {
                aVar.j(TravelFileDownloadDeeplink.b.C9229b.f301681b);
            } else {
                aVar.a(aVar.b(), travelFileDownloadDeeplink, aVar.e());
            }
            return G0.f406611a;
        }
    }

    static {
        new C9231a(null);
    }

    @Inject
    public a(@k Context context, @k a.h hVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k C25719a c25719a, @k a.i iVar, @k com.avito.android.travel_file_download_deeplink.d dVar, @k R0 r02) {
        super(r02);
        this.f301691g = context;
        this.f301692h = hVar;
        this.f301693i = interfaceC4053a;
        this.f301694j = bVar;
        this.f301695k = c25719a;
        this.f301696l = iVar;
        this.f301697m = dVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        TravelFileDownloadDeeplink travelFileDownloadDeeplink = (TravelFileDownloadDeeplink) deepLink;
        if (travelFileDownloadDeeplink.f301675e) {
            this.f301695k.b(travelFileDownloadDeeplink, this, null, new com.avito.android.travel_file_download_deeplink.deeplink.b(this, travelFileDownloadDeeplink));
        } else {
            o(travelFileDownloadDeeplink);
        }
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.android.travel_file_download_deeplink.deeplink.a.f
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.travel_file_download_deeplink.deeplink.a$f r0 = (com.avito.android.travel_file_download_deeplink.deeplink.a.f) r0
            int r1 = r0.f301719t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f301719t = r1
            goto L1a
        L13:
            com.avito.android.travel_file_download_deeplink.deeplink.a$f r0 = new com.avito.android.travel_file_download_deeplink.deeplink.a$f
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r11)
        L1a:
            java.lang.Object r11 = r0.f301717r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f301719t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.travel_file_download_deeplink.deeplink.a r0 = r0.f301716q
            kotlin.C42729a0.b(r11)
            goto L42
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            kotlin.C42729a0.b(r11)
            r0.f301716q = r10
            r0.f301719t = r3
            kotlin.G0 r11 = kotlin.G0.f406611a
            if (r11 != r1) goto L41
            return r1
        L41:
            r0 = r10
        L42:
            com.avito.android.deeplink_handler.view.a$b r11 = r0.f301694j
            kotlinx.coroutines.flow.i r11 = fv.C40483b.a(r11)
            com.avito.android.travel_file_download_deeplink.deeplink.a$c r1 = new com.avito.android.travel_file_download_deeplink.deeplink.a$c
            r1.<init>(r11, r0)
            com.avito.android.travel_file_download_deeplink.deeplink.a$g r11 = new com.avito.android.travel_file_download_deeplink.deeplink.a$g
            java.lang.String r7 = "handleActivityResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<com.avito.android.travel_file_download_deeplink.deeplink.a> r5 = com.avito.android.travel_file_download_deeplink.deeplink.a.class
            java.lang.String r6 = "handleActivityResult"
            r2 = r11
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.r1 r2 = new kotlinx.coroutines.flow.r1
            r2.<init>(r11, r1)
            kotlinx.coroutines.internal.h r11 = r0.f134492f
            kotlinx.coroutines.flow.C43175k.K(r2, r11)
            com.avito.android.deeplink_handler.view.a$h r1 = r0.f301692h
            io.reactivex.rxjava3.internal.operators.observable.q0 r1 = r1.W1()
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.rx3.y.a(r1)
            com.avito.android.travel_file_download_deeplink.deeplink.a$d r2 = new com.avito.android.travel_file_download_deeplink.deeplink.a$d
            r2.<init>(r1)
            com.avito.android.travel_file_download_deeplink.deeplink.a$e r1 = new com.avito.android.travel_file_download_deeplink.deeplink.a$e
            r1.<init>(r2)
            com.avito.android.travel_file_download_deeplink.deeplink.a$h r9 = new com.avito.android.travel_file_download_deeplink.deeplink.a$h
            java.lang.String r7 = "handlePermissionResult(Lcom/avito/android/deeplink_handler/view/result/RequestPermissionResult;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<com.avito.android.travel_file_download_deeplink.deeplink.a> r5 = com.avito.android.travel_file_download_deeplink.deeplink.a.class
            java.lang.String r6 = "handlePermissionResult"
            r2 = r9
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.r1 r0 = new kotlinx.coroutines.flow.r1
            r0.<init>(r9, r1)
            kotlinx.coroutines.flow.C43175k.K(r0, r11)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.deeplink.a.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void o(TravelFileDownloadDeeplink travelFileDownloadDeeplink) {
        if (Build.VERSION.SDK_INT < 29 && androidx.core.content.d.checkSelfPermission(this.f301691g, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.f301692h.o0("android.permission.WRITE_EXTERNAL_STORAGE");
            return;
        }
        this.f301693i.J(this.f301697m.a(travelFileDownloadDeeplink.f301672b, travelFileDownloadDeeplink.f301673c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }
}
