package com.avito.android.profile_vk_linking.start;

import Mc0.InterfaceC14468a;
import Y41.p;
import Y41.q;
import ad0.InterfaceC19871b;
import com.avito.android.deep_linking.x;
import com.avito.android.error.z;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VkLinkingStartInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/c;", "Lcom/avito/android/profile_vk_linking/start/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.profile_vk_linking.start.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14468a f231401a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.start.mvi.a f231402b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f231403c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231404d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f231405e;

    /* compiled from: VkLinkingStartInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lad0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.start.VkLinkingStartInteractorImpl$loadSettings$1", f = "VkLinkingStartInteractor.kt", i = {0, 1}, l = {38, 39, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC19871b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231406q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231407r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f231407r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19871b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:112:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 600
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.start.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingStartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lad0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.start.VkLinkingStartInteractorImpl$loadSettings$2", f = "VkLinkingStartInteractor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC19871b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231409q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231410r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231411s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC19871b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f231410r = interfaceC43172j;
            bVar.f231411s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231409q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231410r;
                InterfaceC19871b.c cVar = new InterfaceC19871b.c(z.l(this.f231411s));
                this.f231410r = null;
                this.f231409q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VkLinkingStartInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lad0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.start.VkLinkingStartInteractorImpl$sendVkTokens$1", f = "VkLinkingStartInteractor.kt", i = {0, 1}, l = {55, 56, 63, 67, 75}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.profile_vk_linking.start.c$c, reason: collision with other inner class name */
    public static final class C7046c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC19871b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231412q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231413r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f231415t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f231416u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7046c(String str, String str2, Continuation<? super C7046c> continuation) {
            super(2, continuation);
            this.f231415t = str;
            this.f231416u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7046c c7046c = c.this.new C7046c(this.f231415t, this.f231416u, continuation);
            c7046c.f231413r = obj;
            return c7046c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19871b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7046c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.start.c.C7046c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingStartInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lad0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.start.VkLinkingStartInteractorImpl$sendVkTokens$2", f = "VkLinkingStartInteractor.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC19871b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231417q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231418r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231419s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC19871b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f231418r = interfaceC43172j;
            dVar.f231419s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231417q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231418r;
                InterfaceC19871b.e eVar = new InterfaceC19871b.e(z.l(this.f231419s));
                this.f231418r = null;
                this.f231417q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k InterfaceC14468a interfaceC14468a, @Y61.k com.avito.android.profile_vk_linking.start.mvi.a aVar, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k R0 r02) {
        this.f231401a = interfaceC14468a;
        this.f231402b = aVar;
        this.f231403c = xVar;
        this.f231404d = aVar2;
        this.f231405e = r02;
    }

    @Override // com.avito.android.profile_vk_linking.start.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC19871b> a() {
        return C43175k.I(this.f231405e.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    @Override // com.avito.android.profile_vk_linking.start.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC19871b> b(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f231405e.a(), new C43152f0(C43175k.G(new C7046c(str, str2, null)), new d(3, null)));
    }
}
