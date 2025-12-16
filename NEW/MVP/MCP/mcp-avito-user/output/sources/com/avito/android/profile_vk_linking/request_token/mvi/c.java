package com.avito.android.profile_vk_linking.request_token.mvi;

import Y41.p;
import Y61.l;
import Zc0.InterfaceC19539b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VkRequestTokenBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "LZc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.b<InterfaceC19539b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f231369a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f231371c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f231372d;

    /* compiled from: VkRequestTokenBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.request_token.mvi.VkRequestTokenBootstrap$produce$1", f = "VkRequestTokenBootstrap.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC19539b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231373q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231374r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f231374r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19539b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231373q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f231374r;
                if (!c.this.f231372d) {
                    c cVar = c.this;
                    InterfaceC28373a interfaceC28373a = cVar.f231370b;
                    String strA = cVar.f231371c.a();
                    if (strA == null) {
                        strA = "";
                    }
                    interfaceC28373a.c(new Ic0.b(strA));
                    c.this.f231372d = true;
                }
                InterfaceC19539b.c cVar2 = new InterfaceC19539b.c(c.this.f231369a);
                this.f231373q = 1;
                if (interfaceC43172j.emit(cVar2, this) == coroutine_suspended) {
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
    public c(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k String str) {
        this.f231369a = str;
        this.f231370b = interfaceC28373a;
        this.f231371c = e12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC19539b> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
