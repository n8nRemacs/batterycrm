package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import gj.InterfaceC40691b;
import hl.C40953a;
import hl.C40954b;
import hl.C40955c;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;
import wI.C49514a;

/* compiled from: BxContentBootstrap.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/v;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29225v implements com.avito.android.arch.mvi.b<BxContentInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BxContentArguments f112579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f112580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f112581c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f112582d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f112583e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.a f112584f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C40953a f112585g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f112586h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34736h0 f112587i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f112588j;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.v$a */
    public static final class a implements InterfaceC43160i<kotlin.Q<? extends Boolean, ? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1 f112589b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.v$a$a, reason: collision with other inner class name */
        public static final class C3309a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f112590b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$produce$$inlined$filter$1$2", f = "BxContentBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.mvi.v$a$a$a, reason: collision with other inner class name */
            public static final class C3310a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f112591q;

                /* renamed from: r, reason: collision with root package name */
                public int f112592r;

                public C3310a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f112591q = obj;
                    this.f112592r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3309a.this.emit(null, this);
                }
            }

            public C3309a(InterfaceC43172j interfaceC43172j) {
                this.f112590b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r6 instanceof com.avito.android.bxcontent.mvi.C29225v.a.C3309a.C3310a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.bxcontent.mvi.v$a$a$a r0 = (com.avito.android.bxcontent.mvi.C29225v.a.C3309a.C3310a) r0
                    int r1 = r0.f112592r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f112592r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.mvi.v$a$a$a r0 = new com.avito.android.bxcontent.mvi.v$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f112591q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f112592r
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
                    kotlin.Q r6 = (kotlin.Q) r6
                    A r6 = r6.f406619b
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L4c
                    r0.f112592r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f112590b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29225v.a.C3309a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(C1 c12) {
            this.f112589b = c12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super kotlin.Q<? extends Boolean, ? extends String>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f112589b.collect(new C3309a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$produce$$inlined$flatMapLatest$1", f = "BxContentBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.v$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, kotlin.Q<? extends Boolean, ? extends String>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f112594q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f112595r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f112596s;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, kotlin.Q<? extends Boolean, ? extends String> q12, Continuation<? super kotlin.G0> continuation) {
            b bVar = C29225v.this.new b(continuation);
            bVar.f112595r = interfaceC43172j;
            bVar.f112596s = q12;
            return bVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f112594q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f112595r;
                kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0(2);
                BxContentInternalAction.f111803Q1.getClass();
                t0Var.b(BxContentInternalAction.a.a());
                t0Var.a(C29225v.this.c());
                ArrayList<Object> arrayList = t0Var.f406850a;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N((InterfaceC43160i[]) arrayList.toArray(new InterfaceC43160i[arrayList.size()]));
                this.f112594q = 1;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.v$c */
    public static final class c implements InterfaceC43160i<BxContentInternalAction.MarkAdvertAsViewed> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f112598b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.v$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f112599b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$produce$$inlined$map$1$2", f = "BxContentBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.bxcontent.mvi.v$c$a$a, reason: collision with other inner class name */
            public static final class C3311a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f112600q;

                /* renamed from: r, reason: collision with root package name */
                public int f112601r;

                public C3311a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f112600q = obj;
                    this.f112601r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f112599b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.bxcontent.mvi.C29225v.c.a.C3311a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.bxcontent.mvi.v$c$a$a r0 = (com.avito.android.bxcontent.mvi.C29225v.c.a.C3311a) r0
                    int r1 = r0.f112601r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f112601r = r1
                    goto L18
                L13:
                    com.avito.android.bxcontent.mvi.v$c$a$a r0 = new com.avito.android.bxcontent.mvi.v$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f112600q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f112601r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$MarkAdvertAsViewed r6 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$MarkAdvertAsViewed
                    r6.<init>(r5)
                    r0.f112601r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f112599b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29225v.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f112598b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super BxContentInternalAction.MarkAdvertAsViewed> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f112598b).collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isAuthorized", "", ChannelContext.Item.USER_ID, "Lkotlin/Q;", "<anonymous>", "(ZLjava/lang/String;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$produce$2", f = "BxContentBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.v$d */
    public static final class d extends SuspendLambda implements Y41.q<Boolean, String, Continuation<? super kotlin.Q<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ boolean f112603q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ String f112604r;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(Boolean bool, String str, Continuation<? super kotlin.Q<? extends Boolean, ? extends String>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            d dVar = new d(3, continuation);
            dVar.f112603q = zBooleanValue;
            dVar.f112604r = str;
            return dVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            boolean z12 = this.f112603q;
            return new kotlin.Q(Boxing.boxBoolean(z12), this.f112604r);
        }
    }

    @Inject
    public C29225v(@Y61.k BxContentArguments bxContentArguments, @Y61.k Provider<C> provider, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advert.viewed.a aVar2, @Y61.k C40953a c40953a, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC34736h0 interfaceC34736h0, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f112579a = bxContentArguments;
        this.f112580b = provider;
        this.f112581c = interfaceC40691b;
        this.f112582d = e12;
        this.f112583e = aVar;
        this.f112584f = aVar2;
        this.f112585g = c40953a;
        this.f112586h = rVar;
        this.f112587i = interfaceC34736h0;
        this.f112588j = interfaceC49101b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BxContentInternalAction> a() {
        InterfaceC43160i interfaceC43160iW;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c(), this.f112579a.f108873l ? C43175k.G(new C29223u(this, null)) : C43175k.w());
        c cVar = new c(kotlinx.coroutines.rx3.y.a(this.f112584f.getF81002a()));
        com.avito.android.account.E e12 = this.f112582d;
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(new a(new C1(C43175k.t(kotlinx.coroutines.rx3.y.a(e12.g()), 1), C43175k.t(kotlinx.coroutines.rx3.y.a(e12.m()), 1), new d(3, null))), new b(null));
        C40953a c40953a = this.f112585g;
        C49514a c49514a = c40953a.f397379b;
        c49514a.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C49514a.f441365d;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        if (((Boolean) c49514a.f441366b.a().invoke()).booleanValue() && !c40953a.f397381d && c40953a.f397382e.f108868g.isMain()) {
            kotlin.reflect.n<Object> nVar2 = nVarArr[1];
            interfaceC43160iW = C43175k.G(new C40955c(new C40954b(c40953a.f397378a.a((Boolean) c49514a.f441367c.a().invoke()), c40953a), null));
        } else {
            interfaceC43160iW = C43175k.w();
        }
        return new C43197r1(new C29221t(this, null), C43175k.N(mVarN, cVar, lVarY, interfaceC43160iW));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super kotlin.G0> continuation) {
        this.f112581c.onCleared();
        return kotlin.G0.f406611a;
    }

    public final InterfaceC43160i<BxContentInternalAction> c() {
        InterfaceC34736h0 interfaceC34736h0;
        String str;
        BxContentArguments bxContentArguments = this.f112579a;
        boolean zIsMap = bxContentArguments.f108868g.isMap();
        Provider<C> provider = this.f112580b;
        SearchParams searchParamsCopy = bxContentArguments.f108864c;
        InterfaceC34736h0 interfaceC34736h02 = this.f112587i;
        if (zIsMap) {
            return provider.get().e(new C.c(searchParamsCopy != null ? searchParamsCopy.getLocationId() : null, null, bxContentArguments.f108864c, bxContentArguments.f108871j, bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108872k, 2, null), new C.b(null, 0, 0, null, null, false, bxContentArguments.f108864c, bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108867f, interfaceC34736h02.getLayoutType(), bxContentArguments.f108870i, null, null, null, null, null, null, null, null, 1032255, null));
        }
        PresentationType presentationType = bxContentArguments.f108868g;
        if (presentationType.isMain()) {
            return provider.get().n(bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108867f, bxContentArguments.f108864c, bxContentArguments.f108870i, bxContentArguments.f108872k, interfaceC34736h02.getLayoutType());
        }
        if (presentationType.isPush()) {
            return provider.get().e(null, new C.b(null, 0, 0, null, null, false, bxContentArguments.f108864c, bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108867f, interfaceC34736h02.getLayoutType(), bxContentArguments.f108870i, null, null, bxContentArguments.f108878q, bxContentArguments.f108879r, bxContentArguments.f108876o, bxContentArguments.f108877p, bxContentArguments.f108880s, bxContentArguments.f108881t, 63, null));
        }
        if ((searchParamsCopy != null ? searchParamsCopy.getLocationId() : null) != null) {
            interfaceC34736h0 = interfaceC34736h02;
            str = null;
        } else if (searchParamsCopy != null) {
            Location locationF = this.f112586h.f();
            str = null;
            interfaceC34736h0 = interfaceC34736h02;
            searchParamsCopy = searchParamsCopy.copy(((-1234173943) & 1) != 0 ? searchParamsCopy.categoryId : null, ((-1234173943) & 2) != 0 ? searchParamsCopy.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParamsCopy.locationId : locationF != null ? locationF.getId() : null, ((-1234173943) & 8) != 0 ? searchParamsCopy.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParamsCopy.metroIds : null, ((-1234173943) & 32) != 0 ? searchParamsCopy.directionId : null, ((-1234173943) & 64) != 0 ? searchParamsCopy.districtId : null, ((-1234173943) & 128) != 0 ? searchParamsCopy.params : null, ((-1234173943) & 256) != 0 ? searchParamsCopy.priceMax : null, ((-1234173943) & 512) != 0 ? searchParamsCopy.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParamsCopy.query : null, ((-1234173943) & 2048) != 0 ? searchParamsCopy.title : null, ((-1234173943) & 4096) != 0 ? searchParamsCopy.owner : null, ((-1234173943) & 8192) != 0 ? searchParamsCopy.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParamsCopy.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParamsCopy.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParamsCopy.radius : null, ((-1234173943) & 131072) != 0 ? searchParamsCopy.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParamsCopy.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParamsCopy.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParamsCopy.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParamsCopy.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParamsCopy.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParamsCopy.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParamsCopy.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParamsCopy.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParamsCopy.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParamsCopy.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParamsCopy.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParamsCopy.area : null, ((-1234173943) & 1073741824) != 0 ? searchParamsCopy.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParamsCopy.clarifyIconType : null, (0 & 1) != 0 ? searchParamsCopy.drawId : null);
        } else {
            interfaceC34736h0 = interfaceC34736h02;
            str = null;
            searchParamsCopy = null;
        }
        return provider.get().e(new C.c(searchParamsCopy != null ? searchParamsCopy.getLocationId() : str, Boolean.FALSE, searchParamsCopy, bxContentArguments.f108871j, bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108872k), new C.b(null, 0, 0, null, null, false, searchParamsCopy, bxContentArguments.f108868g, bxContentArguments.f108865d, bxContentArguments.f108867f, interfaceC34736h0.getLayoutType(), bxContentArguments.f108870i, null, null, null, null, null, bxContentArguments.f108877p, null, null, 901183, null));
    }
}
