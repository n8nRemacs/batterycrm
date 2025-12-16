package com.avito.android.messenger.analytics;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.list_feature.C31819y;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: MessengerBadgeTagAnalyticsAgent.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/analytics/t;", "Lcom/avito/android/messenger/analytics/s;", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.analytics.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31663t implements InterfaceC31662s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f186305a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f186306b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186307c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f186308d = f2.b(0, 0, null, 7);

    /* compiled from: MessengerBadgeTagAnalyticsAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.analytics.MessengerBadgeTagAnalyticsAgentImpl$1", f = "MessengerBadgeTagAnalyticsAgent.kt", i = {0}, l = {98}, m = "invokeSuspend", n = {"accumulator$iv"}, s = {"L$0"})
    /* renamed from: com.avito.android.messenger.analytics.t$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f186309q;

        /* renamed from: r, reason: collision with root package name */
        public int f186310r;

        /* compiled from: Reduce.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/V0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.analytics.t$a$a, reason: collision with other inner class name */
        public static final class C5462a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0.h f186312b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C31663t f186313c;

            public C5462a(l0.h hVar, C31663t c31663t) {
                this.f186312b = hVar;
                this.f186313c = c31663t;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.Set] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
                l0.h hVar = this.f186312b;
                b bVar = (b) t12;
                ?? r02 = (T) ((Set) hVar.f406842b);
                String str = bVar.f186314a;
                c cVar = bVar.f186315b;
                if (cVar.b().size() == cVar.a().size()) {
                    List<Long> listB = cVar.b();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
                    int i12 = 0;
                    for (T t13 : listB) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        arrayList.add(str + '|' + ((Number) t13).longValue() + '|' + cVar.a().get(i12));
                        i12 = i13;
                    }
                    if (r02.addAll(arrayList)) {
                        C31663t c31663t = this.f186313c;
                        c31663t.f186305a.c(new C31647c(str, c31663t.f186306b.l(cVar), bVar.f186316c));
                    }
                }
                hVar.f406842b = r02;
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C31663t.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.LinkedHashSet] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            l0.h hVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f186310r;
            if (i12 == 0) {
                C42729a0.b(obj);
                C31663t c31663t = C31663t.this;
                e2 e2Var = c31663t.f186308d;
                ?? linkedHashSet = new LinkedHashSet();
                l0.h hVar2 = new l0.h();
                hVar2.f406842b = linkedHashSet;
                C5462a c5462a = new C5462a(hVar2, c31663t);
                this.f186309q = hVar2;
                this.f186310r = 1;
                e2Var.getClass();
                if (e2.g(e2Var, c5462a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hVar = hVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = this.f186309q;
                C42729a0.b(obj);
            }
            T t12 = hVar.f406842b;
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerBadgeTagAnalyticsAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/t$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.analytics.t$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f186314a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final c f186315b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f186316c;

        public b(@Y61.k String str, @Y61.k c cVar, boolean z12) {
            this.f186314a = str;
            this.f186315b = cVar;
            this.f186316c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f186314a, bVar.f186314a) && kotlin.jvm.internal.L.f(this.f186315b, bVar.f186315b) && this.f186316c == bVar.f186316c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f186316c) + (((this.f186314a.hashCode() * 31) + this.f186315b.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelTagsAnalytics(channelId=");
            sb2.append(this.f186314a);
            sb2.append(", tagsAnalytics=");
            sb2.append(this.f186315b);
            sb2.append(", isSeller=");
            return androidx.appcompat.app.r.x(sb2, this.f186316c, ')');
        }
    }

    /* compiled from: MessengerBadgeTagAnalyticsAgent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/messenger/analytics/t$c;", "", "", "", "tagId", "", PlatformActions.MESSAGE_ID, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.analytics.t$c */
    public static final /* data */ class c {

        @com.google.gson.annotations.c(PlatformActions.MESSAGE_ID)
        @Y61.k
        private final List<String> messageId;

        @com.google.gson.annotations.c("tagId")
        @Y61.k
        private final List<Long> tagId;

        public c(@Y61.k List<Long> list, @Y61.k List<String> list2) {
            this.tagId = list;
            this.messageId = list2;
        }

        @Y61.k
        public final List<String> a() {
            return this.messageId;
        }

        @Y61.k
        public final List<Long> b() {
            return this.tagId;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.tagId, cVar.tagId) && kotlin.jvm.internal.L.f(this.messageId, cVar.messageId);
        }

        public final int hashCode() {
            return this.messageId.hashCode() + (this.tagId.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TagsAnalytics(tagId=");
            sb2.append(this.tagId);
            sb2.append(", messageId=");
            return androidx.compose.foundation.H.p(sb2, this.messageId, ')');
        }
    }

    @Inject
    public C31663t(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Gson gson, @Y61.k C30277e1 c30277e1, @Y61.k R0 r02) {
        this.f186305a = interfaceC28373a;
        this.f186306b = gson;
        this.f186307c = c30277e1;
        C43238h c43238hA = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.a()));
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[62];
        if (((Boolean) c30277e1.f145020j0.a().invoke()).booleanValue()) {
            C43259k.d(c43238hA, null, null, new a(null), 3);
        }
    }

    @Override // com.avito.android.messenger.analytics.InterfaceC31662s
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k List list, boolean z12, @Y61.k C31819y c31819y) {
        C30277e1 c30277e1 = this.f186307c;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[62];
        if (!((Boolean) c30277e1.f145020j0.a().invoke()).booleanValue()) {
            return G0.f406611a;
        }
        e2 e2Var = this.f186308d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxLong(((HY.b) it.next()).f7138b));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((HY.b) it2.next()).f7137a);
        }
        Object objEmit = e2Var.emit(new b(str, new c(arrayList, arrayList2), z12), c31819y);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
