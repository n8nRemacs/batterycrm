package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.Q1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: MessageRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Q1;", "metaInfoList", "Lkotlin/Q;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Lcom/avito/android/messenger/conversation/mvi/data/MessageAndMetaInfo;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<O1> f190439c;

    public Z(d0 d0Var, List<O1> list) {
        this.f190438b = d0Var;
        this.f190439c = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (T t12 : list) {
            linkedHashMap.put(((Q1) t12).f215284c, t12);
        }
        List<O1> list2 = this.f190439c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (O1 o12 : list2) {
            arrayList.add(new kotlin.Q(this.f190438b.f190458e.b(o12), linkedHashMap.get(o12.f215238a)));
        }
        return arrayList;
    }
}
