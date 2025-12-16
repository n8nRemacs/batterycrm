package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import l41.r;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageScrollSuggestsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/b;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f191826a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f191827b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f191828c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191829d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f191830e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<String> f191831f;

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "ctx", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f191832b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Channel channel;
            LocalMessage lastMessage;
            com.avito.android.mvi.b<Channel> bVar = ((InterfaceC31987a.C5631a) obj).f190237b;
            String remoteId = null;
            b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
            if (dVar != null && (channel = (Channel) dVar.f207035a) != null && (lastMessage = channel.getLastMessage()) != null) {
                remoteId = lastMessage.getRemoteId();
            }
            return remoteId == null ? "" : remoteId;
        }
    }

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00000\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "text", "kotlin.jvm.PlatformType", "lastId", "Lkotlin/Q;", "apply", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T1, T2, R> f191834b = new c<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q((String) obj, (String) obj2);
        }
    }

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001f\u0010\u0004\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u00032\u001f\u0010\u0005\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "Lj41/e;", "a", "b", "", "test", "(Lkotlin/Q;Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T1, T2> f191835a = new d<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            Q q12 = (Q) obj;
            Q q13 = (Q) obj2;
            return L.f(q12.f406619b, q13.f406619b) && L.f(q12.f406620c, q13.f406620c);
        }
    }

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f191836b = new e<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.r
        public final boolean test(Object obj) {
            Q q12 = (Q) obj;
            return (C43066x.K((String) q12.f406619b) && C43066x.K((String) q12.f406620c)) ? false : true;
        }
    }

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/arch/mvi/utils/c;", "", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            Q q12 = (Q) obj;
            String str = (String) q12.f406619b;
            String str2 = (String) q12.f406620c;
            b bVar = b.this;
            return bVar.f191827b.getSellerSuggests(bVar.f191826a, str2, str).z(bVar.f191830e).F().d0(com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.c.f191840b).d0(com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.d.f191841b).m0(com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.e.f191842b);
        }
    }

    /* compiled from: MessageScrollSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T, R> f191839b = new h<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return C43066x.A0((String) obj).toString();
        }
    }

    @Inject
    public b(@InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f191826a = str;
        this.f191827b = interfaceC47842z;
        InterfaceC32119a.b.f191940e.getClass();
        final com.jakewharton.rxrelay3.b bVarN0 = com.jakewharton.rxrelay3.b.N0(new c.C2712c(InterfaceC32119a.b.f191941f));
        this.f191828c = new C41981q0(bVarN0);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191829d = cVar;
        H hA2 = interfaceC35745a5.a();
        this.f191830e = hA2;
        final com.jakewharton.rxrelay3.b bVarN02 = com.jakewharton.rxrelay3.b.N0("");
        io.reactivex.rxjava3.subjects.e<String> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f191831f = eVar;
        B0 b0D0 = interfaceC31987a.M0().j0(hA2).d0(a.f191832b);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(b0D0.D(oVar).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.b.b
            @Override // l41.g
            public final void accept(Object obj) {
                bVarN02.accept((String) obj);
            }
        }));
        cVar.b(z.k(z.q(z.c0(""), eVar.d0(h.f191839b).D(oVar)), bVarN02, c.f191834b).B(d.f191835a).N(e.f191836b).y0(new f()).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.b.g
            @Override // l41.g
            public final void accept(Object obj) {
                bVarN0.accept((com.avito.android.arch.mvi.utils.c) obj);
            }
        }));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C41981q0 getF191828c() {
        return this.f191828c;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a
    public final void b2(@Y61.k String str) {
        this.f191831f.onNext(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a
    public final void c2() {
        this.f191831f.onNext(" ");
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a
    public final void destroy() {
        this.f191829d.e();
    }
}
