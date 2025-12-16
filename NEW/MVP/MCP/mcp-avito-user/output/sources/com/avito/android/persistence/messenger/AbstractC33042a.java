package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ChannelDao.kt */
@androidx.room.A
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.persistence.messenger.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC33042a {
    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d A(@Y61.k String str, int i12, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d B(@Y61.k String str, int i12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @androidx.room.W
    public abstract long C(@Y61.k Y y12);

    @androidx.room.W
    @Y61.k
    public abstract kotlin.collections.builders.b D(@Y61.k AbstractCollection abstractCollection);

    @androidx.room.Q0
    public void E(@Y61.k Y y12, @Y61.k List list, @Y61.k ArrayList arrayList, @Y61.l O1 o12) {
        C(y12);
        D(arrayList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J((c3) it.next());
        }
        if (o12 != null) {
            H(o12);
        }
    }

    @androidx.room.W
    @Y61.k
    public abstract kotlin.collections.builders.b F(@Y61.k ArrayList arrayList);

    @androidx.room.Q0
    public void G(@Y61.k ArrayList arrayList, @Y61.k LinkedHashSet linkedHashSet, @Y61.k LinkedHashSet linkedHashSet2, @Y61.k ArrayList arrayList2) {
        F(arrayList);
        K(linkedHashSet);
        D(linkedHashSet2);
        I(arrayList2);
    }

    @androidx.room.W
    public abstract long H(@Y61.k O1 o12);

    @androidx.room.W
    @Y61.k
    public abstract kotlin.collections.builders.b I(@Y61.k ArrayList arrayList);

    @androidx.room.W
    public abstract long J(@Y61.k c3 c3Var);

    @androidx.room.W
    @Y61.k
    public abstract kotlin.collections.builders.b K(@Y61.k LinkedHashSet linkedHashSet);

    @InterfaceC23458l0
    @Y61.k
    public abstract io.reactivex.rxjava3.internal.operators.completable.r L(@Y61.k String str, @Y61.k String str2, @Y61.k ChannelIsReadStatus channelIsReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract io.reactivex.rxjava3.internal.operators.completable.r M(@Y61.k String str, @Y61.k String str2, @Y61.k ChannelIsReadStatus channelIsReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract io.reactivex.rxjava3.internal.operators.completable.r N(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k List list, @Y61.k ChannelIsReadStatus channelIsReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    public abstract int a(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @androidx.room.Q0
    public void b(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        String str4 = (String) C42745f0.G(m(userEntityType, str, str2, str3));
        if (str4 != null) {
            a(str, str4, userEntityType);
            e(str, str4, userEntityType);
        }
    }

    @androidx.room.Q0
    public void c(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType) {
        a(str, str2, userEntityType);
        e(str, str2, userEntityType);
    }

    @InterfaceC23458l0
    @Y61.k
    public abstract io.reactivex.rxjava3.internal.operators.completable.r d(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    public abstract int e(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @androidx.room.Q0
    public void f(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.k LinkedHashSet linkedHashSet, @Y61.k LinkedHashSet linkedHashSet2, @Y61.k ArrayList arrayList3, @Y61.l Boolean bool) {
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C33126v0 c33126v0 = (C33126v0) it.next();
            boolean zIsEmpty = c33126v0.f215552a.isEmpty();
            SortedSet<String> sortedSet = c33126v0.f215553b;
            C42745f0.h(!zIsEmpty ? k(str, userEntityType, c33126v0.f215552a, sortedSet, bool) : !sortedSet.isEmpty() ? j(str, userEntityType, sortedSet, bool) : i(str, userEntityType, bool), arrayList4);
        }
        Set setP0 = C42745f0.P0(arrayList4);
        if (!setP0.isEmpty()) {
            if (setP0.size() > 500) {
                for (List list : C42745f0.R0(setP0, 500, 500)) {
                    g(str, list, userEntityType);
                    h(str, list, userEntityType);
                }
            } else {
                g(str, setP0, userEntityType);
                h(str, setP0, userEntityType);
            }
        }
        F(arrayList2);
        K(linkedHashSet);
        D(linkedHashSet2);
        I(arrayList3);
    }

    @InterfaceC23458l0
    public abstract int g(@Y61.k String str, @Y61.k Collection<String> collection, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    public abstract int h(@Y61.k String str, @Y61.k Collection<String> collection, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract ArrayList i(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract ArrayList j(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.k SortedSet sortedSet, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract ArrayList k(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.k SortedSet sortedSet, @Y61.k SortedSet sortedSet2, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 l(@Y61.k String str, @Y61.k String str2, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract ArrayList m(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 n(@Y61.k String str, @Y61.k ChannelIsReadStatus channelIsReadStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 o(@Y61.k String str, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    public abstract C41933a0 p(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    public abstract C41933a0 q(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k Collection collection3, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    public abstract C41933a0 r(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k Collection collection3, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @androidx.room.Q0
    @Y61.k
    public abstract C41933a0 s(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k Collection collection3, @Y61.k Collection collection4, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 t(@Y61.k String str, long j12, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 u(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C41933a0 v(@Y61.k String str, long j12, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d w(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d x(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.k SortedSet sortedSet, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d y(@Y61.k String str, @Y61.k UserEntityType userEntityType, @Y61.k SortedSet sortedSet, @Y61.k SortedSet sortedSet2, @Y61.l Boolean bool);

    @InterfaceC23458l0
    @Y61.k
    public abstract C42006d z(@Y61.k String str, int i12, @Y61.k UserEntityType userEntityType, @Y61.l Boolean bool);
}
