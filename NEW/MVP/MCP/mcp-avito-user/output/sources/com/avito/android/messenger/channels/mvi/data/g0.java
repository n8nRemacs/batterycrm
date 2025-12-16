package com.avito.android.messenger.channels.mvi.data;

import Ag.CallableC13028a;
import com.avito.android.persistence.messenger.Q2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: UserRepo.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/g0;", "Lcom/avito/android/messenger/channels/mvi/data/f0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q2 f187224a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f187225b;

    /* compiled from: UserRepo.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "", "it", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f187226b = new a<>();

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

    @Inject
    public g0(@Y61.k Q2 q22, @Y61.k c0 c0Var) {
        this.f187224a = q22;
        this.f187225b = c0Var;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.o0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k ArrayList arrayList) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31710s(arrayList, this, messengerUserHashInfo, str));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.n0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O b(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f187224a.b(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).r(new j0(this));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.o0
    @Y61.k
    public final AbstractC41768a c(@Y61.l Long l12, @Y61.l Long l13, @Y61.k String str) {
        return this.f187224a.g(l12, l13, str);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.n0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<String>> d(long j12, @Y61.k Collection<String> collection) {
        int size = collection.size();
        Q2 q22 = this.f187224a;
        if (size <= 500) {
            return q22.a(j12, collection);
        }
        ArrayList arrayListR0 = C42745f0.R0(collection, 500, 500);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
        Iterator it = arrayListR0.iterator();
        while (it.hasNext()) {
            arrayList.add(q22.a(j12, (List) it.next()));
        }
        return io.reactivex.rxjava3.core.z.m(arrayList, a.f187226b);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.n0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k Set set) {
        io.reactivex.rxjava3.core.I iC2;
        int size = set.size();
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        Q2 q22 = this.f187224a;
        String str2 = messengerUserHashInfo.f430682d;
        if (size > 500) {
            ArrayList arrayListR0 = C42745f0.R0(set, 500, 500);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
            Iterator it = arrayListR0.iterator();
            while (it.hasNext()) {
                arrayList.add(q22.c(str2, str, (List) it.next(), com.avito.android.messenger.util.i.g(messengerUserType)));
            }
            iC2 = io.reactivex.rxjava3.core.I.H(arrayList, h0.f187227b);
        } else {
            iC2 = q22.c(str2, str, set, com.avito.android.messenger.util.i.g(messengerUserType));
        }
        return iC2.r(new i0(set));
    }

    @Override // com.avito.android.messenger.channels.mvi.data.o0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r f(@Y61.k Collection collection) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC13028a(16, this, collection));
    }
}
