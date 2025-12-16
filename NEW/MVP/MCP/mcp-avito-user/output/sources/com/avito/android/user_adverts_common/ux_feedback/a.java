package com.avito.android.user_adverts_common.ux_feedback;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts_common.ux_feedback.d;
import com.avito.android.ux.feedback.impl.f;
import com.avito.android.ux.feedback.impl.x;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import i31.InterfaceC41220a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.rx3.y;

/* compiled from: UxFeedbackDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_common/ux_feedback/a;", "", "a", "_avito_user-adverts-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f315933a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f315934b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f315935c = f2.b(0, 1, null, 5);

    /* compiled from: UxFeedbackDeepLinkHandler.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_common/ux_feedback/a$a;", "", "_avito_user-adverts-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_common.ux_feedback.a$a, reason: collision with other inner class name */
    public interface InterfaceC9795a {
        @k
        a a(@k T t12);
    }

    /* compiled from: UxFeedbackDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_common.ux_feedback.UxFeedbackDeepLinkHandler$handleDeepLinks$1", f = "UxFeedbackDeepLinkHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315936q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315936q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = a.this.f315935c;
                d.a aVar = d.a.f315948a;
                this.f315936q = 1;
                if (e2Var.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: UxFeedbackDeepLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_common.ux_feedback.UxFeedbackDeepLinkHandler$handleDeepLinks$2", f = "UxFeedbackDeepLinkHandler.kt", i = {}, l = {56, 64}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315938q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f315939r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f315940s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f315941t;

        /* compiled from: UxFeedbackDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/ux/feedback/impl/x;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/ux/feedback/impl/x;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts_common.ux_feedback.UxFeedbackDeepLinkHandler$handleDeepLinks$2$results$1$1", f = "UxFeedbackDeepLinkHandler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts_common.ux_feedback.a$c$a, reason: collision with other inner class name */
        public static final class C9796a extends SuspendLambda implements p<T, Continuation<? super x>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f315942q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ a f315943r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b f315944s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9796a(a aVar, b bVar, Continuation<? super C9796a> continuation) {
                super(2, continuation);
                this.f315943r = aVar;
                this.f315944s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C9796a(this.f315943r, this.f315944s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super x> continuation) {
                return ((C9796a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f315942q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43160i interfaceC43160iA = y.a(this.f315943r.f315933a.b(this.f315944s));
                    this.f315942q = 1;
                    obj = C43175k.y(interfaceC43160iA, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* compiled from: UxFeedbackDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts_common/ux_feedback/a$c$b", "LSK0/c;", "_avito_user-adverts-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements SK0.c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f315945a;

            public b(UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink) {
                this.f315945a = uxFeedbackStartCampaignLink.f319188b;
            }

            @Override // SK0.c
            @k
            /* renamed from: a, reason: from getter */
            public final String getF315945a() {
                return this.f315945a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f315940s = arrayList;
            this.f315941t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f315940s, this.f315941t, continuation);
            cVar.f315939r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315938q;
            a aVar = this.f315941t;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f315939r;
                ArrayList arrayList = this.f315940s;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C43259k.b(t12, null, new C9796a(aVar, new b((UxFeedbackStartCampaignLink) it.next()), null), 3));
                }
                this.f315938q = 1;
                obj = C43225h.a(arrayList2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            List list = (List) obj;
            int i13 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if ((((x) it2.next()) instanceof x.d) && (i13 = i13 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            Object obj2 = i13 > 0 ? d.b.f315949a : d.a.f315948a;
            e2 e2Var = aVar.f315935c;
            this.f315938q = 2;
            if (e2Var.emit(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @i31.c
    public a(@k f fVar, @InterfaceC41220a @k T t12) {
        this.f315933a = fVar;
        this.f315934b = t12;
    }

    public final void a(@k List<? extends DeepLink> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UxFeedbackStartCampaignLink) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        T t12 = this.f315934b;
        if (zIsEmpty) {
            C43259k.d(t12, null, null, new b(null), 3);
        } else {
            C43259k.d(t12, null, null, new c(arrayList, this, null), 3);
        }
    }
}
