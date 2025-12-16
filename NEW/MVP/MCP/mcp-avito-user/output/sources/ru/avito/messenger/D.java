package ru.avito.messenger;

import c91.C26994z;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerApicoCreateItemChannelTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetChannelByIdTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetUsersTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoHistoryTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoReadChatsTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoSendTextMessageTestGroup;
import h91.C40785a;
import h91.C40788d;
import h91.C40790f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.avito.messenger.MessengerUserType;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.GetChannelFilters;
import ur.InterfaceC49101b;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/D;", "Lru/avito/messenger/A;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class D implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f430603a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Z81.a> f430604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f430605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f430606d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<C40788d> f430607e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<h91.h> f430608f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<h91.j> f430609g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<C40785a> f430610h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h31.e<h91.n> f430611i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h31.e<C40790f> f430612j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoGetChannelByIdTestGroup> f430613k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoCreateItemChannelTestGroup> f430614l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoHistoryTestGroup> f430615m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoGetUsersTestGroup> f430616n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoSendTextMessageTestGroup> f430617o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoReadChatsTestGroup> f430618p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final u3.g<MessengerApicoGetChannelsTestGroup> f430619q;

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/Channel;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Channel>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f430621m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f430622n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f430623o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f430624p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f430625q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, MessengerUserHashInfo messengerUserHashInfo) {
            super(0);
            this.f430621m = str;
            this.f430622n = str2;
            this.f430623o = str3;
            this.f430624p = str4;
            this.f430625q = messengerUserHashInfo;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Channel> invoke() {
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new B(D.this, this.f430621m, this.f430622n, this.f430623o, this.f430624p, null)).n(new C(D.this, this.f430625q));
        }
    }

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/Channel;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Channel>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f430627m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f430628n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, MessengerUserHashInfo messengerUserHashInfo) {
            super(0);
            this.f430627m = str;
            this.f430628n = messengerUserHashInfo;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<Channel> invoke() {
            String str = this.f430627m;
            D d12 = D.this;
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new E(d12, str, null)).n(new F(d12, this.f430628n));
        }
    }

    /* compiled from: MessengerClientFacade.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lkotlin/Q;", "Lru/avito/messenger/api/entity/ChannelsResponse;", "", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<kotlin.Q<? extends ChannelsResponse, ? extends Long>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ GetChannelFilters f430630m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f430631n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Long f430632o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f430633p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GetChannelFilters getChannelFilters, int i12, Long l12, MessengerUserHashInfo messengerUserHashInfo) {
            super(0);
            this.f430630m = getChannelFilters;
            this.f430631n = i12;
            this.f430632o = l12;
            this.f430633p = messengerUserHashInfo;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<kotlin.Q<? extends ChannelsResponse, ? extends Long>> invoke() {
            D d12 = D.this;
            C40790f c40790f = d12.f430612j.get();
            GetChannelFilters getChannelFilters = this.f430630m;
            List listM0 = C42745f0.M0(getChannelFilters.getTags());
            c40790f.getClass();
            ArrayList arrayListM = C40790f.m(listM0);
            C40790f c40790f2 = d12.f430612j.get();
            List listM02 = C42745f0.M0(getChannelFilters.getExcludeTags());
            c40790f2.getClass();
            ArrayList arrayListM2 = C40790f.m(listM02);
            Collection<String> itemIds = getChannelFilters.getItemIds();
            ArrayList arrayList = new ArrayList(C42745f0.q(itemIds, 10));
            Iterator<T> it = itemIds.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
            }
            Boolean unreadOnly = getChannelFilters.getUnreadOnly();
            Boolean bool = Boolean.TRUE;
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new G(D.this, new C26994z(arrayListM, null, arrayListM2, arrayList, kotlin.jvm.internal.L.f(unreadOnly, bool) ? bool : null), this.f430631n, this.f430632o, null)).n(new H(d12, this.f430633p));
        }
    }

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "Lru/avito/messenger/api/entity/ChannelUser;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<List<? extends ChannelUser>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f430635m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<String> f430636n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List<String> list) {
            super(0);
            this.f430635m = str;
            this.f430636n = list;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<List<? extends ChannelUser>> invoke() {
            List<String> list = this.f430636n;
            D d12 = D.this;
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new I(d12, this.f430635m, list, null)).n(new J(d12));
        }
    }

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lkotlin/G0;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<kotlin.G0>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<String> f430638m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<String> list) {
            super(0);
            this.f430638m = list;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<kotlin.G0> invoke() {
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new P(D.this, this.f430638m, null)).n(Q.f430696b);
        }
    }

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lru/avito/messenger/api/entity/ChatMessage;", "Lj41/e;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<ChatMessage>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f430640m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Integer f430641n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f430642o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f430643p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f430644q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f430645r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f430646s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Integer num, String str2, String str3, String str4, String str5, MessengerUserHashInfo messengerUserHashInfo) {
            super(0);
            this.f430640m = str;
            this.f430641n = num;
            this.f430642o = str2;
            this.f430643p = str3;
            this.f430644q = str4;
            this.f430645r = str5;
            this.f430646s = messengerUserHashInfo;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.I<ChatMessage> invoke() {
            return kotlinx.coroutines.rx3.Q.a(EmptyCoroutineContext.INSTANCE, new S(D.this, this.f430640m, this.f430641n, this.f430642o, this.f430643p, this.f430644q, this.f430645r, null)).n(new T(D.this, this.f430646s));
        }
    }

    @Inject
    public D(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k h31.e<Z81.a> eVar, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k h31.e<C40788d> eVar2, @Y61.k h31.e<h91.h> eVar3, @Y61.k h31.e<h91.j> eVar4, @Y61.k h31.e<C40785a> eVar5, @Y61.k h31.e<h91.n> eVar6, @Y61.k h31.e<C40790f> eVar7, @Y61.k u3.g<MessengerApicoGetChannelByIdTestGroup> gVar, @Y61.k u3.g<MessengerApicoCreateItemChannelTestGroup> gVar2, @Y61.k u3.g<MessengerApicoHistoryTestGroup> gVar3, @Y61.k u3.g<MessengerApicoGetUsersTestGroup> gVar4, @Y61.k u3.g<MessengerApicoSendTextMessageTestGroup> gVar5, @Y61.k u3.g<MessengerApicoReadChatsTestGroup> gVar6, @Y61.k u3.g<MessengerApicoGetChannelsTestGroup> gVar7) {
        this.f430603a = interfaceC47842z;
        this.f430604b = eVar;
        this.f430605c = c30277e1;
        this.f430606d = interfaceC49101b;
        this.f430607e = eVar2;
        this.f430608f = eVar3;
        this.f430609g = eVar4;
        this.f430610h = eVar5;
        this.f430611i = eVar6;
        this.f430612j = eVar7;
        this.f430613k = gVar;
        this.f430614l = gVar2;
        this.f430615m = gVar3;
        this.f430616n = gVar4;
        this.f430617o = gVar5;
        this.f430618p = gVar6;
        this.f430619q = gVar7;
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        u3.g<MessengerApicoCreateItemChannelTestGroup> gVar = this.f430614l;
        MessengerApicoCreateItemChannelTestGroup messengerApicoCreateItemChannelTestGroup = gVar.f439742a.f439749b;
        messengerApicoCreateItemChannelTestGroup.getClass();
        MessengerApicoCreateItemChannelTestGroup messengerApicoCreateItemChannelTestGroup2 = MessengerApicoCreateItemChannelTestGroup.f67831e;
        if ((messengerApicoCreateItemChannelTestGroup == messengerApicoCreateItemChannelTestGroup2 || messengerApicoCreateItemChannelTestGroup == MessengerApicoCreateItemChannelTestGroup.f67830d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoCreateItemChannelTestGroup messengerApicoCreateItemChannelTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoCreateItemChannelTestGroup3.getClass();
        return this.f430603a.w(messengerUserHashInfo, str, str2, str3, str4, h(messengerUserHashInfo, messengerApicoCreateItemChannelTestGroup3 == messengerApicoCreateItemChannelTestGroup2) ? new a(str3, str, str2, str4, messengerUserHashInfo) : null);
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        u3.g<MessengerApicoGetChannelByIdTestGroup> gVar = this.f430613k;
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup = gVar.f439742a.f439749b;
        messengerApicoGetChannelByIdTestGroup.getClass();
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup2 = MessengerApicoGetChannelByIdTestGroup.f67837e;
        if ((messengerApicoGetChannelByIdTestGroup == messengerApicoGetChannelByIdTestGroup2 || messengerApicoGetChannelByIdTestGroup == MessengerApicoGetChannelByIdTestGroup.f67836d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoGetChannelByIdTestGroup messengerApicoGetChannelByIdTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoGetChannelByIdTestGroup3.getClass();
        return this.f430603a.j(messengerUserHashInfo, str, h(messengerUserHashInfo, messengerApicoGetChannelByIdTestGroup3 == messengerApicoGetChannelByIdTestGroup2) ? new b(str, messengerUserHashInfo) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // ru.avito.messenger.A
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.I<kotlin.Q<ru.avito.messenger.api.entity.ChannelsResponse, java.lang.Long>> c(@Y61.l ru.avito.messenger.MessengerUserHashInfo r11, @Y61.l java.lang.Long r12, int r13, @Y61.k ru.avito.messenger.api.entity.GetChannelFilters r14) {
        /*
            r10 = this;
            u3.g<com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup> r0 = r10.f430619q
            u3.m<T> r1 = r0.f439742a
            T r1 = r1.f439749b
            com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup r1 = (com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup) r1
            r1.getClass()
            com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup r2 = com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup.f67843e
            r3 = 0
            if (r1 == r2) goto L14
            com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup r4 = com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup.f67842d
            if (r1 != r4) goto L21
        L14:
            if (r11 == 0) goto L19
            ru.avito.messenger.MessengerUserType r1 = r11.f430681c
            goto L1a
        L19:
            r1 = r3
        L1a:
            boolean r1 = r1 instanceof ru.avito.messenger.MessengerUserType.Default
            if (r1 == 0) goto L21
            r0.b()
        L21:
            u3.m<T> r0 = r0.f439742a
            T r0 = r0.f439749b
            com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup r0 = (com.avito.android.ab_tests.configs.MessengerApicoGetChannelsTestGroup) r0
            r0.getClass()
            if (r0 != r2) goto L2d
            goto L52
        L2d:
            com.avito.android.e1 r0 = r10.f430605c
            r0.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.C30277e1.f144946d1
            r2 = 96
            r1 = r1[r2]
            com.avito.android.A0$a r0 = r0.f144980Q0
            DE0.a r0 = r0.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            ur.b r0 = r10.f430606d
            boolean r0 = r0.c()
            if (r0 == 0) goto L67
        L52:
            if (r11 == 0) goto L57
            ru.avito.messenger.MessengerUserType r0 = r11.f430681c
            goto L58
        L57:
            r0 = r3
        L58:
            boolean r0 = r0 instanceof ru.avito.messenger.MessengerUserType.Default
            if (r0 == 0) goto L67
            ru.avito.messenger.D$c r3 = new ru.avito.messenger.D$c
            r4 = r3
            r5 = r10
            r6 = r14
            r7 = r13
            r8 = r12
            r9 = r11
            r4.<init>(r6, r7, r8, r9)
        L67:
            r9 = r3
            ru.avito.messenger.z r4 = r10.f430603a
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            io.reactivex.rxjava3.core.I r11 = r4.o(r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.avito.messenger.D.c(ru.avito.messenger.MessengerUserHashInfo, java.lang.Long, int, ru.avito.messenger.api.entity.GetChannelFilters):io.reactivex.rxjava3.core.I");
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<ChannelUser>> d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k List<String> list) {
        u3.g<MessengerApicoGetUsersTestGroup> gVar = this.f430616n;
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup = gVar.f439742a.f439749b;
        messengerApicoGetUsersTestGroup.getClass();
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup2 = MessengerApicoGetUsersTestGroup.f67849e;
        if ((messengerApicoGetUsersTestGroup == messengerApicoGetUsersTestGroup2 || messengerApicoGetUsersTestGroup == MessengerApicoGetUsersTestGroup.f67848d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoGetUsersTestGroup messengerApicoGetUsersTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoGetUsersTestGroup3.getClass();
        return this.f430603a.r(str, list, h(messengerUserHashInfo, messengerApicoGetUsersTestGroup3 == messengerApicoGetUsersTestGroup2) ? new d(str, list) : null);
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Long l12, @Y61.l Integer num) {
        u3.g<MessengerApicoHistoryTestGroup> gVar = this.f430615m;
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup = gVar.f439742a.f439749b;
        messengerApicoHistoryTestGroup.getClass();
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup2 = MessengerApicoHistoryTestGroup.f67855e;
        if ((messengerApicoHistoryTestGroup == messengerApicoHistoryTestGroup2 || messengerApicoHistoryTestGroup == MessengerApicoHistoryTestGroup.f67854d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoHistoryTestGroup messengerApicoHistoryTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoHistoryTestGroup3.getClass();
        return this.f430603a.x(str, l12, num, h(messengerUserHashInfo, messengerApicoHistoryTestGroup3 == messengerApicoHistoryTestGroup2) ? new O(l12, this, str, num, messengerUserHashInfo) : null);
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> f(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12) {
        u3.g<MessengerApicoSendTextMessageTestGroup> gVar = this.f430617o;
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup = gVar.f439742a.f439749b;
        messengerApicoSendTextMessageTestGroup.getClass();
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup2 = MessengerApicoSendTextMessageTestGroup.f67867e;
        if ((messengerApicoSendTextMessageTestGroup == messengerApicoSendTextMessageTestGroup2 || messengerApicoSendTextMessageTestGroup == MessengerApicoSendTextMessageTestGroup.f67866d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoSendTextMessageTestGroup messengerApicoSendTextMessageTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoSendTextMessageTestGroup3.getClass();
        return this.f430603a.y(str, str2, str3, list, str4, num, str5, l12, h(messengerUserHashInfo, messengerApicoSendTextMessageTestGroup3 == messengerApicoSendTextMessageTestGroup2) ? new f(str, num, str2, str4, str3, str5, messengerUserHashInfo) : null);
    }

    @Override // ru.avito.messenger.A
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<String> list) {
        u3.g<MessengerApicoReadChatsTestGroup> gVar = this.f430618p;
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup = gVar.f439742a.f439749b;
        messengerApicoReadChatsTestGroup.getClass();
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup2 = MessengerApicoReadChatsTestGroup.f67861e;
        if ((messengerApicoReadChatsTestGroup == messengerApicoReadChatsTestGroup2 || messengerApicoReadChatsTestGroup == MessengerApicoReadChatsTestGroup.f67860d) && (messengerUserHashInfo.f430681c instanceof MessengerUserType.Default)) {
            gVar.b();
        }
        MessengerApicoReadChatsTestGroup messengerApicoReadChatsTestGroup3 = gVar.f439742a.f439749b;
        messengerApicoReadChatsTestGroup3.getClass();
        return this.f430603a.t(h(messengerUserHashInfo, messengerApicoReadChatsTestGroup3 == messengerApicoReadChatsTestGroup2) ? new e(list) : null, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(ru.avito.messenger.MessengerUserHashInfo r5, boolean r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L24
            com.avito.android.e1 r6 = r4.f430605c
            r6.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.C30277e1.f144946d1
            r3 = 96
            r2 = r2[r3]
            com.avito.android.A0$a r6 = r6.f144980Q0
            DE0.a r6 = r6.a()
            java.lang.Object r6 = r6.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r0
        L25:
            ur.b r2 = r4.f430606d
            boolean r2 = r2.c()
            ru.avito.messenger.MessengerUserType r5 = r5.f430681c
            boolean r5 = r5 instanceof ru.avito.messenger.MessengerUserType.Default
            if (r6 != 0) goto L33
            if (r2 == 0) goto L36
        L33:
            if (r5 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.avito.messenger.D.h(ru.avito.messenger.MessengerUserHashInfo, boolean):boolean");
    }
}
