package com.avito.android.multi_message_send.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import sv.C48421d;

/* compiled from: MultiMessageModalScreenDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/multi_message_send/deeplink/MultiMessageModalScreenDeeplink;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<MultiMessageModalScreenDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final E20.a f206622g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f206623h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f206624i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f206625j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f206626k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Context f206627l;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f206628b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f206629c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.multi_message_send.deeplink.c$a$a, reason: collision with other inner class name */
        public static final class C6153a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f206630b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f206631c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "MultiMessageModalScreenDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.multi_message_send.deeplink.c$a$a$a, reason: collision with other inner class name */
            public static final class C6154a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f206632q;

                /* renamed from: r, reason: collision with root package name */
                public int f206633r;

                public C6154a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f206632q = obj;
                    this.f206633r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6153a.this.emit(null, this);
                }
            }

            public C6153a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f206630b = interfaceC43172j;
                this.f206631c = cVar;
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
                    boolean r0 = r6 instanceof com.avito.android.multi_message_send.deeplink.c.a.C6153a.C6154a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.multi_message_send.deeplink.c$a$a$a r0 = (com.avito.android.multi_message_send.deeplink.c.a.C6153a.C6154a) r0
                    int r1 = r0.f206633r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f206633r = r1
                    goto L18
                L13:
                    com.avito.android.multi_message_send.deeplink.c$a$a$a r0 = new com.avito.android.multi_message_send.deeplink.c$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f206632q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f206633r
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
                    com.avito.android.multi_message_send.deeplink.c r2 = r4.f206631c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f206633r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f206630b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.deeplink.c.a.C6153a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, c cVar) {
            this.f206628b = interfaceC43160i;
            this.f206629c = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f206628b).collect(new C6153a(interfaceC43172j, this.f206629c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f206635b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f206636b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplinkHandler$onCreateSuspend$$inlined$filter$2$2", f = "MultiMessageModalScreenDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.multi_message_send.deeplink.c$b$a$a, reason: collision with other inner class name */
            public static final class C6155a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f206637q;

                /* renamed from: r, reason: collision with root package name */
                public int f206638r;

                public C6155a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f206637q = obj;
                    this.f206638r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f206636b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.multi_message_send.deeplink.c.b.a.C6155a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.multi_message_send.deeplink.c$b$a$a r0 = (com.avito.android.multi_message_send.deeplink.c.b.a.C6155a) r0
                    int r1 = r0.f206638r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f206638r = r1
                    goto L18
                L13:
                    com.avito.android.multi_message_send.deeplink.c$b$a$a r0 = new com.avito.android.multi_message_send.deeplink.c$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f206637q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f206638r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437156b
                    r2 = -1
                    if (r6 != r2) goto L47
                    r0.f206638r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f206636b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.deeplink.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(a aVar) {
            this.f206635b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f206635b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/n1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.multi_message_send.deeplink.c$c, reason: collision with other inner class name */
    public static final class C6156c implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f206640b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/n1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.multi_message_send.deeplink.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f206641b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplinkHandler$onCreateSuspend$$inlined$filterNot$1$2", f = "MultiMessageModalScreenDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.multi_message_send.deeplink.c$c$a$a, reason: collision with other inner class name */
            public static final class C6157a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f206642q;

                /* renamed from: r, reason: collision with root package name */
                public int f206643r;

                public C6157a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f206642q = obj;
                    this.f206643r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f206641b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.multi_message_send.deeplink.c.C6156c.a.C6157a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.multi_message_send.deeplink.c$c$a$a r0 = (com.avito.android.multi_message_send.deeplink.c.C6156c.a.C6157a) r0
                    int r1 = r0.f206643r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f206643r = r1
                    goto L18
                L13:
                    com.avito.android.multi_message_send.deeplink.c$c$a$a r0 = new com.avito.android.multi_message_send.deeplink.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f206642q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f206643r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L50
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    android.content.Intent r6 = r6.f437157c
                    if (r6 == 0) goto L42
                    java.lang.String r2 = "multi_message_send_result_code"
                    boolean r6 = r6.getBooleanExtra(r2, r3)
                    goto L43
                L42:
                    r6 = r3
                L43:
                    if (r6 != 0) goto L50
                    r0.f206643r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f206641b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L50
                    return r1
                L50:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.deeplink.c.C6156c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C6156c(b bVar) {
            this.f206640b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f206640b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: MultiMessageModalScreenDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.multi_message_send.deeplink.MultiMessageModalScreenDeeplinkHandler", f = "MultiMessageModalScreenDeeplinkHandler.kt", i = {0}, l = {35, 40}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public c f206645q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f206646r;

        /* renamed from: t, reason: collision with root package name */
        public int f206648t;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f206646r = obj;
            this.f206648t |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.n(this);
        }
    }

    /* compiled from: MultiMessageModalScreenDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements InterfaceC43172j {
        public e() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            c cVar = c.this;
            PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.multi_message_toast_success_send_title, new Serializable[0]);
            List listSingletonList = Collections.singletonList(new c.a.C3719a(cVar.f206627l.getString(R.string.multi_message_toast_success_send_button), true, null, new com.avito.android.multi_message_send.deeplink.d(cVar), 4, null));
            ToastMessageLink.ToastTheme toastTheme = ToastMessageLink.ToastTheme.f133730c;
            a.i.C4057a.d(cVar.f206625j, printableTextC, null, listSingletonList, null, 5000, null, new C30597v(cVar, 4), "avitoRe23", 474);
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k E20.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k a.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k Context context, @k R0 r02) {
        super(r02);
        this.f206622g = aVar;
        this.f206623h = interfaceC4053a;
        this.f206624i = bVar;
        this.f206625j = iVar;
        this.f206626k = aVar2;
        this.f206627l = context;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        MultiMessageModalScreenDeeplink multiMessageModalScreenDeeplink = (MultiMessageModalScreenDeeplink) deepLink;
        String string = bundle != null ? bundle.getString("MESSAGE_TEXT_KEY") : null;
        if (string == null || C43066x.K(string)) {
            j(AbstractC14250d.b.f9170c);
            return G0.f406611a;
        }
        long j12 = multiMessageModalScreenDeeplink.f206620b;
        String string2 = bundle.getString("CHANNEL_ID_KEY");
        if (string2 == null) {
            string2 = "";
        }
        this.f206623h.J(this.f206622g.a(j12, string, string2), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.multi_message_send.deeplink.c.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.multi_message_send.deeplink.c$d r0 = (com.avito.android.multi_message_send.deeplink.c.d) r0
            int r1 = r0.f206648t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206648t = r1
            goto L1a
        L13:
            com.avito.android.multi_message_send.deeplink.c$d r0 = new com.avito.android.multi_message_send.deeplink.c$d
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f206646r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f206648t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.C42729a0.b(r6)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.avito.android.multi_message_send.deeplink.c r2 = r0.f206645q
            kotlin.C42729a0.b(r6)
            goto L49
        L3c:
            kotlin.C42729a0.b(r6)
            r0.f206645q = r5
            r0.f206648t = r4
            kotlin.G0 r6 = kotlin.G0.f406611a
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            com.avito.android.deeplink_handler.view.a$b r6 = r2.f206624i
            kotlinx.coroutines.flow.i r6 = fv.C40483b.a(r6)
            com.avito.android.multi_message_send.deeplink.c$a r4 = new com.avito.android.multi_message_send.deeplink.c$a
            r4.<init>(r6, r2)
            com.avito.android.multi_message_send.deeplink.c$b r6 = new com.avito.android.multi_message_send.deeplink.c$b
            r6.<init>(r4)
            com.avito.android.multi_message_send.deeplink.c$c r4 = new com.avito.android.multi_message_send.deeplink.c$c
            r4.<init>(r6)
            com.avito.android.multi_message_send.deeplink.c$e r6 = new com.avito.android.multi_message_send.deeplink.c$e
            r6.<init>()
            r2 = 0
            r0.f206645q = r2
            r0.f206648t = r3
            java.lang.Object r6 = r4.collect(r6, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.deeplink.c.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
