package com.avito.android.messenger.channels.mvi.data;

import androidx.work.impl.CallableC23587q;
import arrow.core.C23703n1;
import arrow.core.X0;
import com.avito.android.persistence.messenger.AbstractC33042a;
import com.avito.android.persistence.messenger.C33091m0;
import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.G0;
import com.avito.android.persistence.messenger.InterfaceC33095n0;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.Q2;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.persistence.messenger.Y0;
import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.util.N4;
import com.avito.android.util.W4;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import javax.inject.Inject;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: ChannelRepo.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/w;", "Lcom/avito/android/messenger/channels/mvi/data/r;", "Lcom/avito/android/util/N4;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31714w implements r, N4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC33042a f187255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G0 f187256b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q2 f187257c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y0 f187258d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33095n0 f187259e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31697e f187260f;

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/l0;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/l0;", "com/avito/android/util/rx3/a0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$a */
    public static final class a<T1, T2, T3, R> implements l41.h {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T1, T2, T3, R> f187261a = new a<>();

        @Override // l41.h
        public final Object a(Object obj, Object obj2, Object obj3) {
            return new C42829l0(obj, obj2, obj3);
        }
    }

    /* compiled from: ChannelRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000126\u0010\b\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/l0;", "", "Lcom/avito/android/persistence/messenger/Y;", "Lcom/avito/android/persistence/messenger/m0;", "", "", "", "Lcom/avito/android/persistence/messenger/c3;", "<name for destructuring parameter 0>", "Lcom/avito/android/remote/model/messenger/Channel;", "apply", "(Lkotlin/l0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$b */
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Channel channelA;
            C42829l0 c42829l0 = (C42829l0) obj;
            List<com.avito.android.persistence.messenger.Y> list = (List) c42829l0.f406871b;
            List list2 = (List) c42829l0.f406872c;
            Map map = (Map) c42829l0.f406873d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = list2.iterator();
            while (true) {
                kotlin.G0 g02 = null;
                if (!it.hasNext()) {
                    break;
                }
                C33091m0 c33091m0 = (C33091m0) it.next();
                List list3 = (List) linkedHashMap.get(c33091m0.f215515b);
                if (list3 != null) {
                    list3.add(c33091m0);
                    g02 = kotlin.G0.f406611a;
                }
                if (g02 == null) {
                    linkedHashMap.put(c33091m0.f215515b, C42745f0.e0(c33091m0));
                }
            }
            Map mapC = P0.c();
            ArrayList arrayList = new ArrayList();
            for (com.avito.android.persistence.messenger.Y y12 : list) {
                List<c3> list4 = (List) map.get(y12.f215352b);
                if (list4 != null) {
                    InterfaceC31697e interfaceC31697e = C31714w.this.f187260f;
                    String str = y12.f215352b;
                    List list5 = (List) linkedHashMap.get(str);
                    channelA = interfaceC31697e.a(y12, list4, list5 != null ? list5 : C42784z0.f406748b, (O1) mapC.get(str));
                } else {
                    channelA = null;
                }
                if (channelA != null) {
                    arrayList.add(channelA);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: ChannelRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "", "Lcom/avito/android/persistence/messenger/Y;", "apply", "([Ljava/lang/Object;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f187263b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(obj2);
            }
            return C42745f0.H(arrayList);
        }
    }

    /* compiled from: ChannelRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "", "Lcom/avito/android/persistence/messenger/m0;", "apply", "([Ljava/lang/Object;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$d */
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f187264b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(obj2);
            }
            return C42745f0.H(arrayList);
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\r\u0010\r\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/b0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$e */
    public static final class e<T1, T2, T3, T4, R> implements l41.i {
        public e() {
        }

        @Override // l41.i
        @Y61.k
        public final R a(@Y61.k T1 t12, @Y61.k T2 t22, @Y61.k T3 t32, @Y61.k T4 t42) {
            R r12;
            List list = (List) t42;
            List list2 = (List) t32;
            List<c3> list3 = (List) t22;
            com.avito.android.persistence.messenger.Y y12 = (com.avito.android.persistence.messenger.Y) C42745f0.G((List) t12);
            if (y12 != null) {
                if (list3.isEmpty()) {
                    arrow.core.Y0.f56266a.getClass();
                    r12 = (R) X0.f56264b;
                } else {
                    r12 = (R) new C23703n1(C31714w.this.f187260f.a(y12, list3, list2, (O1) C42745f0.G(list)));
                }
                if (r12 != null) {
                    return r12;
                }
            }
            arrow.core.Y0.f56266a.getClass();
            return (R) X0.f56264b;
        }
    }

    /* compiled from: ChannelRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u00070\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Y;", "channelEntities", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/messenger/Channel;", "Lcom/avito/android/persistence/messenger/P0;", "Lcom/avito/android/messenger/channels/mvi/data/ChannelAndDraft;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$f */
    public static final class f<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f187267c;

        public f(MessengerUserHashInfo messengerUserHashInfo) {
            this.f187267c = messengerUserHashInfo;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            io.reactivex.rxjava3.core.z zVarE;
            io.reactivex.rxjava3.core.z zVarA;
            io.reactivex.rxjava3.core.z zVarY;
            io.reactivex.rxjava3.core.z zVarC;
            List list = (List) obj;
            if (list.isEmpty()) {
                return io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.persistence.messenger.Y) it.next()).f215352b);
            }
            int size = arrayList.size();
            C31714w c31714w = C31714w.this;
            MessengerUserHashInfo messengerUserHashInfo = this.f187267c;
            if (size > 500) {
                ArrayList arrayListR0 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR0, 10));
                Iterator<T> it2 = arrayListR0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(c31714w.f187257c.e(messengerUserHashInfo.f430682d, (List) it2.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarE = io.reactivex.rxjava3.core.z.m(arrayList2, F.f187174b);
            } else {
                zVarE = c31714w.f187257c.e(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            B0 b0D0 = zVarE.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new G());
            if (arrayList.size() > 500) {
                ArrayList arrayListR02 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListR02, 10));
                Iterator<T> it3 = arrayListR02.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(c31714w.f187259e.a(messengerUserHashInfo.f430682d, (List) it3.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarA = io.reactivex.rxjava3.core.z.m(arrayList3, C.f187173b);
            } else {
                zVarA = c31714w.f187259e.a(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            B0 b0D02 = zVarA.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new D());
            if (arrayList.size() > 500) {
                ArrayList arrayListR03 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayListR03, 10));
                Iterator<T> it4 = arrayListR03.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(c31714w.f187258d.y(messengerUserHashInfo.f430682d, (List) it4.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarY = io.reactivex.rxjava3.core.z.m(arrayList4, A.f187171b);
            } else {
                zVarY = c31714w.f187258d.y(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            io.reactivex.rxjava3.core.z zVarJ = io.reactivex.rxjava3.core.z.j(b0D0, b0D02, zVarY.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(B.f187172b), new I(c31714w, list));
            ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((com.avito.android.persistence.messenger.Y) it5.next()).f215352b);
            }
            if (arrayList5.size() > 500) {
                ArrayList arrayListR04 = C42745f0.R0(arrayList5, 500, 500);
                ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayListR04, 10));
                Iterator<T> it6 = arrayListR04.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(c31714w.f187256b.c(messengerUserHashInfo.f430682d, (List) it6.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarC = io.reactivex.rxjava3.core.z.m(arrayList6, J.f187177b);
            } else {
                zVarC = c31714w.f187256b.c(messengerUserHashInfo.f430682d, arrayList5, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            return io.reactivex.rxjava3.core.z.k(zVarJ, zVarC.D(io.reactivex.rxjava3.internal.functions.a.f401991a), new H());
        }
    }

    /* compiled from: ChannelRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0002`\u00070\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Y;", "channelEntities", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/messenger/Channel;", "Lcom/avito/android/persistence/messenger/P0;", "Lcom/avito/android/messenger/channels/mvi/data/ChannelAndDraft;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f187269c;

        public g(MessengerUserHashInfo messengerUserHashInfo) {
            this.f187269c = messengerUserHashInfo;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            io.reactivex.rxjava3.core.z zVarE;
            io.reactivex.rxjava3.core.z zVarA;
            io.reactivex.rxjava3.core.z zVarY;
            io.reactivex.rxjava3.core.z zVarC;
            List list = (List) obj;
            if (list.isEmpty()) {
                return io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.persistence.messenger.Y) it.next()).f215352b);
            }
            int size = arrayList.size();
            C31714w c31714w = C31714w.this;
            MessengerUserHashInfo messengerUserHashInfo = this.f187269c;
            if (size > 500) {
                ArrayList arrayListR0 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR0, 10));
                Iterator<T> it2 = arrayListR0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(c31714w.f187257c.e(messengerUserHashInfo.f430682d, (List) it2.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarE = io.reactivex.rxjava3.core.z.m(arrayList2, F.f187174b);
            } else {
                zVarE = c31714w.f187257c.e(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            B0 b0D0 = zVarE.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new G());
            if (arrayList.size() > 500) {
                ArrayList arrayListR02 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListR02, 10));
                Iterator<T> it3 = arrayListR02.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(c31714w.f187259e.a(messengerUserHashInfo.f430682d, (List) it3.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarA = io.reactivex.rxjava3.core.z.m(arrayList3, C.f187173b);
            } else {
                zVarA = c31714w.f187259e.a(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            B0 b0D02 = zVarA.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new D());
            if (arrayList.size() > 500) {
                ArrayList arrayListR03 = C42745f0.R0(arrayList, 500, 500);
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayListR03, 10));
                Iterator<T> it4 = arrayListR03.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(c31714w.f187258d.y(messengerUserHashInfo.f430682d, (List) it4.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarY = io.reactivex.rxjava3.core.z.m(arrayList4, A.f187171b);
            } else {
                zVarY = c31714w.f187258d.y(messengerUserHashInfo.f430682d, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            io.reactivex.rxjava3.core.z zVarJ = io.reactivex.rxjava3.core.z.j(b0D0, b0D02, zVarY.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(B.f187172b), new I(c31714w, list));
            ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((com.avito.android.persistence.messenger.Y) it5.next()).f215352b);
            }
            if (arrayList5.size() > 500) {
                ArrayList arrayListR04 = C42745f0.R0(arrayList5, 500, 500);
                ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayListR04, 10));
                Iterator<T> it6 = arrayListR04.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(c31714w.f187256b.c(messengerUserHashInfo.f430682d, (List) it6.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
                }
                zVarC = io.reactivex.rxjava3.core.z.m(arrayList6, J.f187177b);
            } else {
                zVarC = c31714w.f187256b.c(messengerUserHashInfo.f430682d, arrayList5, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
            }
            return io.reactivex.rxjava3.core.z.k(zVarJ, zVarC.D(io.reactivex.rxjava3.internal.functions.a.f401991a), new H());
        }
    }

    /* compiled from: ChannelRepo.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "timeStampRes", "Larrow/core/Y0;", "apply", "(Ljava/util/List;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.data.w$h */
    public static final class h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T, R> f187270b = new h<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return arrow.syntax.collections.f.a((List) obj);
        }
    }

    @Inject
    public C31714w(@Y61.k AbstractC33042a abstractC33042a, @Y61.k G0 g02, @Y61.k Q2 q22, @Y61.k Y0 y02, @Y61.k InterfaceC33095n0 interfaceC33095n0, @Y61.k InterfaceC31697e interfaceC31697e) {
        this.f187255a = abstractC33042a;
        this.f187256b = g02;
        this.f187257c = q22;
        this.f187258d = y02;
        this.f187259e = interfaceC33095n0;
        this.f187260f = interfaceC31697e;
        new W4("ChannelRepo");
    }

    public static Boolean t(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(!bool.booleanValue());
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC23587q(this, messengerUserHashInfo, str, 8));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserType);
        AbstractC33042a abstractC33042a = this.f187255a;
        String str2 = messengerUserHashInfo.f430682d;
        C41933a0 c41933a0L = abstractC33042a.l(str2, str, userEntityTypeG);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.core.z zVarN = io.reactivex.rxjava3.core.z.n(new io.reactivex.rxjava3.core.E[]{c41933a0L.D(oVar), this.f187257c.d(str2, str, com.avito.android.messenger.util.i.g(messengerUserType)).D(oVar), this.f187259e.b(str2, str, com.avito.android.messenger.util.i.g(messengerUserType)).D(oVar), this.f187258d.q(str2, str, com.avito.android.messenger.util.i.g(messengerUserType)).D(oVar)}, io.reactivex.rxjava3.internal.functions.a.o(new e()), AbstractC41777j.f401972b);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q("channelId", str));
        return zVarN;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a c(@Y61.k LinkedHashSet linkedHashSet) {
        io.reactivex.rxjava3.internal.operators.completable.r rVarC = this.f187259e.c(linkedHashSet);
        linkedHashSet.toString();
        return rVarC;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>>> d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.l Boolean bool) {
        C41933a0 c41933a0T;
        boolean zIsEmpty = collection.isEmpty();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (!zIsEmpty) {
            c41933a0T = this.f187255a.v(messengerUserHashInfo.f430682d, j12, collection, collection2, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else if (collection2.isEmpty()) {
            c41933a0T = this.f187255a.t(messengerUserHashInfo.f430682d, j12, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else {
            c41933a0T = this.f187255a.u(messengerUserHashInfo.f430682d, j12, collection2, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        }
        io.reactivex.rxjava3.core.z zVarY0 = c41933a0T.D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new g(messengerUserHashInfo));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        collection.toString();
        collection2.toString();
        return zVarY0;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>>> e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.k Collection<String> collection3, @Y61.k Collection<String> collection4, @Y61.l Boolean bool) {
        io.reactivex.rxjava3.core.z zVarM;
        boolean zIsEmpty = collection.isEmpty();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (zIsEmpty) {
            if (collection2.isEmpty()) {
                zVarM = io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("Tags for the first list are empty!"));
            } else if (!collection3.isEmpty()) {
                zVarM = this.f187255a.q(messengerUserHashInfo.f430682d, j12, collection2, collection3, collection4, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
            } else if (collection4.isEmpty()) {
                zVarM = io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("Tags for the second list are empty!"));
            } else {
                zVarM = this.f187255a.p(messengerUserHashInfo.f430682d, j12, collection2, collection4, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
            }
        } else if (!collection3.isEmpty()) {
            zVarM = this.f187255a.s(messengerUserHashInfo.f430682d, j12, collection, collection2, collection3, collection4, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else if (collection4.isEmpty()) {
            zVarM = io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("Tags for the second list are empty!"));
        } else {
            zVarM = this.f187255a.r(messengerUserHashInfo.f430682d, j12, collection, collection2, collection4, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        }
        io.reactivex.rxjava3.core.z zVarY0 = zVarM.D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new f(messengerUserHashInfo));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        collection.toString();
        collection2.toString();
        collection3.toString();
        collection4.toString();
        return zVarY0;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        io.reactivex.rxjava3.internal.operators.completable.r rVarN = this.f187255a.N(messengerUserHashInfo.f430682d, str, true, C42745f0.U(ChannelIsReadStatus.IS_NOT_READ, ChannelIsReadStatus.IS_NOT_READ_LOCALLY), ChannelIsReadStatus.IS_READ_LOCALLY, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVarN;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a g(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.internal.operators.completable.r rVarD = this.f187255a.d(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVarD;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a h(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.l Boolean bool) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31711t(this, messengerUserHashInfo, arrayList2, arrayList, bool, 0));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        arrayList.toString();
        arrayList2.size();
        return rVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a i(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        io.reactivex.rxjava3.internal.operators.completable.r rVarL = this.f187255a.L(messengerUserHashInfo.f430682d, str, ChannelIsReadStatus.IS_NOT_READ, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVarL;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC23587q(this, messengerUserHashInfo, channel, 7));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        channel.getChannelId();
        return rVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.I<arrow.core.Y0<Long>> k(@Y61.k MessengerUserHashInfo messengerUserHashInfo, int i12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.l Boolean bool) {
        C42006d c42006dZ;
        boolean zIsEmpty = collection.isEmpty();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (!zIsEmpty) {
            c42006dZ = this.f187255a.B(messengerUserHashInfo.f430682d, i12, collection, collection2, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else if (collection2.isEmpty()) {
            c42006dZ = this.f187255a.z(messengerUserHashInfo.f430682d, i12, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else {
            c42006dZ = this.f187255a.A(messengerUserHashInfo.f430682d, i12, collection2, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        }
        io.reactivex.rxjava3.internal.operators.single.O oR2 = c42006dZ.r(h.f187270b);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        collection.toString();
        collection2.toString();
        return oR2;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.I l(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k SortedSet sortedSet, @Y61.k SortedSet sortedSet2, @Y61.l Boolean bool) {
        C42006d c42006dX;
        boolean zIsEmpty = sortedSet.isEmpty();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (zIsEmpty) {
            boolean zIsEmpty2 = sortedSet2.isEmpty();
            AbstractC33042a abstractC33042a = this.f187255a;
            String str = messengerUserHashInfo.f430682d;
            c42006dX = !zIsEmpty2 ? abstractC33042a.x(str, com.avito.android.messenger.util.i.g(messengerUserType), sortedSet2, t(bool)) : abstractC33042a.w(str, com.avito.android.messenger.util.i.g(messengerUserType), t(bool));
        } else {
            c42006dX = this.f187255a.y(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserType), sortedSet, sortedSet2, t(bool));
        }
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        sortedSet.toString();
        sortedSet2.toString();
        return c42006dX;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<Channel>> m(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<String> collection) {
        io.reactivex.rxjava3.core.z zVarO;
        io.reactivex.rxjava3.core.z zVarA;
        io.reactivex.rxjava3.core.z zVarE;
        int size = collection.size();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        AbstractC33042a abstractC33042a = this.f187255a;
        String str = messengerUserHashInfo.f430682d;
        if (size > 500) {
            ArrayList arrayListR0 = C42745f0.R0(collection, 500, 500);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
            Iterator it = arrayListR0.iterator();
            while (it.hasNext()) {
                arrayList.add(abstractC33042a.o(str, (List) it.next(), com.avito.android.messenger.util.i.g(messengerUserType)));
            }
            zVarO = io.reactivex.rxjava3.core.z.m(arrayList, c.f187263b);
        } else {
            zVarO = abstractC33042a.o(str, collection, com.avito.android.messenger.util.i.g(messengerUserType));
        }
        io.reactivex.rxjava3.internal.operators.observable.L lD2 = zVarO.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        int size2 = collection.size();
        InterfaceC33095n0 interfaceC33095n0 = this.f187259e;
        if (size2 > 500) {
            ArrayList arrayListR02 = C42745f0.R0(collection, 500, 500);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR02, 10));
            Iterator it2 = arrayListR02.iterator();
            while (it2.hasNext()) {
                arrayList2.add(interfaceC33095n0.a(str, (List) it2.next(), com.avito.android.messenger.util.i.g(messengerUserType)));
            }
            zVarA = io.reactivex.rxjava3.core.z.m(arrayList2, d.f187264b);
        } else {
            zVarA = interfaceC33095n0.a(str, collection, com.avito.android.messenger.util.i.g(messengerUserType));
        }
        io.reactivex.rxjava3.internal.operators.observable.L lD3 = zVarA.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        int size3 = collection.size();
        Q2 q22 = this.f187257c;
        if (size3 > 500) {
            ArrayList arrayListR03 = C42745f0.R0(collection, 500, 500);
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListR03, 10));
            Iterator it3 = arrayListR03.iterator();
            while (it3.hasNext()) {
                arrayList3.add(q22.e(str, (List) it3.next(), com.avito.android.messenger.util.i.g(messengerUserType)));
            }
            zVarE = io.reactivex.rxjava3.core.z.m(arrayList3, F.f187174b);
        } else {
            zVarE = q22.e(str, collection, com.avito.android.messenger.util.i.g(messengerUserType));
        }
        B0 b0D0 = io.reactivex.rxjava3.core.z.j(lD2, lD3, zVarE.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new G()), a.f187261a).d0(new b());
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        collection.size();
        return b0D0;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<String>> n(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        C41933a0 c41933a0N = this.f187255a.n(messengerUserHashInfo.f430682d, ChannelIsReadStatus.IS_NOT_READ_LOCALLY, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return c41933a0N;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a o(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        io.reactivex.rxjava3.internal.operators.completable.r rVarM = this.f187255a.M(messengerUserHashInfo.f430682d, str, ChannelIsReadStatus.IS_READ, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVarM;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a p(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31710s(0, str, this, messengerUserHashInfo, str2));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a q(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        io.reactivex.rxjava3.internal.operators.completable.r rVarN = this.f187255a.N(messengerUserHashInfo.f430682d, str, false, C42745f0.U(ChannelIsReadStatus.IS_READ, ChannelIsReadStatus.IS_READ_LOCALLY), ChannelIsReadStatus.IS_NOT_READ_LOCALLY, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return rVarN;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.N
    @Y61.k
    public final AbstractC41768a r(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<Channel> list) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC23587q(this, messengerUserHashInfo, list, 6));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        list.size();
        return rVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<String>> s(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        C41933a0 c41933a0N = this.f187255a.n(messengerUserHashInfo.f430682d, ChannelIsReadStatus.IS_READ_LOCALLY, userEntityTypeG);
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        return c41933a0N;
    }
}
