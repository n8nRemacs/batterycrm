package com.avito.android.profile.remove.confirm;

import Y41.p;
import Y41.q;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.error.z;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.confirm.h;
import com.avito.android.remote.InterfaceC34401z0;
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

/* compiled from: ProfileRemoveConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/confirm/i;", "Lcom/avito/android/profile/remove/confirm/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f223849a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f223850b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProfileRemoveAnalytics f223851c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f223852d;

    /* compiled from: ProfileRemoveConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/remove/confirm/h$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.confirm.ProfileRemoveConfirmInteractorImpl$removeAccount$1", f = "ProfileRemoveConfirmInteractor.kt", i = {0, 1, 2, 5}, l = {41, 43, 53, 58, 61, 63, 64, 67}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super h.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223853q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223854r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f223856t;

        /* compiled from: ProfileRemoveConfirmInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.remove.confirm.i$a$a, reason: collision with other inner class name */
        public static final class C6777a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public static final C6777a<T> f223857b = new C6777a<>();

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f223856t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(this.f223856t, continuation);
            aVar.f223854r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super h.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0124 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v20 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.remove.confirm.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProfileRemoveConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/remove/confirm/h$b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.confirm.ProfileRemoveConfirmInteractorImpl$removeAccount$2", f = "ProfileRemoveConfirmInteractor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super h.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223858q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f223859r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f223860s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super h.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f223859r = interfaceC43172j;
            bVar.f223860s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f223858q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f223859r;
                Throwable th2 = this.f223860s;
                if (!(th2 instanceof CancellationException)) {
                    h.b.a aVar = new h.b.a(z.l(th2));
                    this.f223859r = null;
                    this.f223858q = 1;
                    if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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

    @Inject
    public i(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k ProfileRemoveAnalytics profileRemoveAnalytics, @Y61.k R0 r02) {
        this.f223849a = interfaceC34401z0;
        this.f223850b = interfaceC27663a;
        this.f223851c = profileRemoveAnalytics;
        this.f223852d = r02;
    }

    @Override // com.avito.android.profile.remove.confirm.h
    @Y61.k
    public final InterfaceC43160i<h.b> a(@Y61.l String str) {
        return C43175k.I(this.f223852d.a(), new C43152f0(C43175k.G(new a(str, null)), new b(3, null)));
    }
}
