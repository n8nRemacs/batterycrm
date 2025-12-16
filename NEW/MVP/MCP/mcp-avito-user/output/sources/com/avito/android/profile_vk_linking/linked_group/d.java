package com.avito.android.profile_vk_linking.linked_group;

import Mc0.InterfaceC14468a;
import Sc0.d;
import Xc0.b;
import com.avito.android.deep_linking.x;
import com.avito.android.error.z;
import com.avito.android.util.R0;
import java.util.concurrent.CancellationException;
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

/* compiled from: VkLinkedGroupInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/d;", "Lcom/avito/android/profile_vk_linking/linked_group/c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.profile_vk_linking.linked_group.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14468a f231255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.linked_group.mvi.l f231256b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f231257c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f231258d;

    /* compiled from: VkLinkedGroupInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LXc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupInteractorImpl$loadLinkedGroup$1", f = "VkLinkedGroupInteractor.kt", i = {0, 1}, l = {32, 33, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Xc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231259q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231260r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f231260r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Xc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final java.lang.Object invokeSuspend(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
    }

    /* compiled from: VkLinkedGroupInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LXc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupInteractorImpl$loadLinkedGroup$2", f = "VkLinkedGroupInteractor.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Xc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231262q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231263r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231264s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Xc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f231263r = interfaceC43172j;
            bVar.f231264s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231262q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231263r;
                Throwable th2 = this.f231264s;
                if (!(th2 instanceof CancellationException)) {
                    b.c cVar = new b.c(z.l(th2));
                    this.f231263r = null;
                    this.f231262q = 1;
                    if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: VkLinkedGroupInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LXc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupInteractorImpl$unlinkGroup$1", f = "VkLinkedGroupInteractor.kt", i = {0, 1, 2, 2}, l = {52, 54, 58, 59, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Xc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public d.c f231265q;

        /* renamed from: r, reason: collision with root package name */
        public int f231266r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f231267s;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f231267s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Xc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.linked_group.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkedGroupInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LXc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupInteractorImpl$unlinkGroup$2", f = "VkLinkedGroupInteractor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_vk_linking.linked_group.d$d, reason: collision with other inner class name */
    public static final class C7040d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Xc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231269q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231270r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231271s;

        public C7040d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Xc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C7040d c7040d = new C7040d(3, continuation);
            c7040d.f231270r = interfaceC43172j;
            c7040d.f231271s = th2;
            return c7040d.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231269q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231270r;
                b.j jVar = new b.j(z.l(this.f231271s));
                this.f231270r = null;
                this.f231269q = 1;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
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
    public d(@Y61.k InterfaceC14468a interfaceC14468a, @Y61.k com.avito.android.profile_vk_linking.linked_group.mvi.l lVar, @Y61.k x xVar, @Y61.k R0 r02) {
        this.f231255a = interfaceC14468a;
        this.f231256b = lVar;
        this.f231257c = xVar;
        this.f231258d = r02;
    }

    @Override // com.avito.android.profile_vk_linking.linked_group.c
    @Y61.k
    public final InterfaceC43160i<Xc0.b> a() {
        return C43175k.I(this.f231258d.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    @Override // com.avito.android.profile_vk_linking.linked_group.c
    @Y61.k
    public final InterfaceC43160i<Xc0.b> b() {
        return C43175k.I(this.f231258d.a(), new C43152f0(C43175k.G(new c(null)), new C7040d(3, null)));
    }
}
