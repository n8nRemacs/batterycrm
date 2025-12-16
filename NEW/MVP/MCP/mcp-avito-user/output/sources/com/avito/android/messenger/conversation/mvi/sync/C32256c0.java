package com.avito.android.messenger.conversation.mvi.sync;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "oldMessageRemoteIdsToDelete", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32256c0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f194756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194757c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194758d;

    public C32256c0(P p12, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f194756b = p12;
        this.f194757c = messengerUserHashInfo;
        this.f194758d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return C41823n.f402260b;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (String str : list2) {
            arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.v(this.f194756b.f194644l.b(this.f194758d, str, this.f194757c)));
        }
        return AbstractC41768a.p(arrayList);
    }
}
