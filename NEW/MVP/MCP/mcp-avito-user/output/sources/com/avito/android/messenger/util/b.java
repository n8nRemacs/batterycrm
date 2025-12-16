package com.avito.android.messenger.util;

import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    public static final boolean a(@Y61.k Channel channel, @Y61.k String str, long j12) {
        Object obj;
        Long lastActionTime;
        if (channel.getDisplayInfo().getStatus() != null) {
            return false;
        }
        List<User> users = channel.getUsers();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : users) {
            User user = (User) obj2;
            if (!L.f(user.getId(), str) && user.getLastActionTime() != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Long lastActionTime2 = ((User) next).getLastActionTime();
                long jLongValue = lastActionTime2 != null ? lastActionTime2.longValue() : Long.MIN_VALUE;
                do {
                    Object next2 = it.next();
                    Long lastActionTime3 = ((User) next2).getLastActionTime();
                    long jLongValue2 = lastActionTime3 != null ? lastActionTime3.longValue() : Long.MIN_VALUE;
                    if (jLongValue < jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        User user2 = (User) obj;
        return (user2 == null || (lastActionTime = user2.getLastActionTime()) == null || j12 - lastActionTime.longValue() >= 150) ? false : true;
    }
}
