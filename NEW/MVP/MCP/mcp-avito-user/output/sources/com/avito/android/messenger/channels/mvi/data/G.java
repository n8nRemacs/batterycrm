package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.c3;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelRepo.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/persistence/messenger/c3;", "users", "", "", "", "apply", "(Ljava/util/List;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class G<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        G0 g02;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c3 c3Var : (List) obj) {
            List list = (List) linkedHashMap.get(c3Var.f215422c);
            if (list != null) {
                list.add(c3Var);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                linkedHashMap.put(c3Var.f215422c, C42745f0.e0(c3Var));
            }
        }
        return linkedHashMap;
    }
}
