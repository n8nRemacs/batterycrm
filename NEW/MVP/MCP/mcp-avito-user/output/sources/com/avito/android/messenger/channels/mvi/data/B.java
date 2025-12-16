package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.O1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelRepo.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/persistence/messenger/O1;", "messages", "", "", "apply", "(Ljava/util/List;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final B<T, R> f187172b = new B<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (T t12 : list) {
            linkedHashMap.put(((O1) t12).f215239b, t12);
        }
        return linkedHashMap;
    }
}
