package NY;

import NY.d;
import NY.f;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.b0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MessageListPartialState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {
    @Y61.k
    public static final Q<f.b.d, f.b.AbstractC0740b> a(@Y61.k String str, @Y61.k List<User> list, @Y61.k List<Q<LocalMessage, Q1>> list2, @Y61.k f.b.d dVar, @Y61.k f.b.AbstractC0740b abstractC0740b, @Y61.k f.c cVar, @Y61.k b0 b0Var, @Y61.k Map<String, VideoInfo> map, @Y61.k MY.c cVar2) {
        d bVar;
        List list3;
        b0 b0Var2;
        MY.c cVar3;
        Long l12 = cVar.f11569a;
        long jLongValue = l12 != null ? l12.longValue() : Long.MAX_VALUE;
        f.b.AbstractC0740b.d dVar2 = abstractC0740b instanceof f.b.AbstractC0740b.d ? (f.b.AbstractC0740b.d) abstractC0740b : null;
        f.b.d aVar = dVar2 != null ? dVar : new f.b.d.a(true);
        int i12 = -1;
        if ((dVar2 != null ? dVar2.f11562c : null) == null || L.f(dVar2.f11562c, d.c.f11546a)) {
            Iterator<Q<LocalMessage, Q1>> it = list2.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                LocalMessage localMessage = it.next().f406619b;
                if (L.f(localMessage.getFromId(), localMessage.getUserId())) {
                    if (MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated()) < jLongValue) {
                        break;
                    }
                    i13++;
                } else if (localMessage.getReadLocallyTimestamp() != null) {
                    if (localMessage.getReadLocallyTimestamp().longValue() < jLongValue) {
                        break;
                    }
                    i13++;
                } else {
                    if (localMessage.isRead()) {
                        break;
                    }
                    i13++;
                }
            }
            bVar = i13 != -1 ? i13 != 0 ? new d.b(list2.get(i13).f406619b.getLocalId()) : d.a.f11544a : d.c.f11546a;
        } else {
            bVar = dVar2.f11562c;
        }
        ArrayList arrayListB = b0Var.b(list2, str, list, map, cVar2);
        if (L.f(bVar, d.c.f11546a) ? true : L.f(bVar, d.a.f11544a)) {
            list3 = list;
            b0Var2 = b0Var;
            cVar3 = cVar2;
            i12 = 0;
        } else {
            if (!(bVar instanceof d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it2 = arrayListB.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (L.f(((T1.d) it2.next()).f189180o.getLocalId(), ((d.b) bVar).f11545a)) {
                    i12 = i14;
                    break;
                }
                i14++;
            }
            if (i12 < 0 || i12 >= arrayListB.size()) {
                i12 = 0;
            }
            while (i12 > 0) {
                LocalMessage localMessage2 = ((T1.d) arrayListB.get(i12 - 1)).f189180o;
                if (!L.f(localMessage2.getFromId(), localMessage2.getUserId())) {
                    break;
                }
                i12--;
            }
            list3 = list;
            b0Var2 = b0Var;
            cVar3 = cVar2;
        }
        return new Q<>(aVar, new f.b.AbstractC0740b.d(b0Var2.a(arrayListB, list3, i12, cVar3), list2, bVar, i12, dVar2 != null ? dVar2.f11564e : false));
    }
}
