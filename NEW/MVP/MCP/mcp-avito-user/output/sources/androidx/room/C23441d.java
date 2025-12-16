package androidx.room;

import androidx.room.C23435a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/room/a$a;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.room.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23441d extends kotlin.jvm.internal.N implements Y41.l<List<? extends C23435a.C1913a>, kotlin.G0> {
    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends C23435a.C1913a> list) {
        C23435a.c.f54371b.getClass();
        List<? extends C23435a.C1913a> list2 = list;
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            throw null;
        }
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        throw null;
    }
}
