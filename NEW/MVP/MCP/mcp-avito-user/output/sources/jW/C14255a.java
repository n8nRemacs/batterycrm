package Jw;

import Y61.k;
import Y61.l;
import com.avito.android.image_loader.b;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14255a {
    @k
    public static final ArrayList a(@l List list) {
        if (list == null) {
            list = C42784z0.f406748b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b.b((Image) it.next()));
        }
        return arrayList;
    }
}
