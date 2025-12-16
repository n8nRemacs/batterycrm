package com.avito.android.messenger.folders;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Folder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/folders/f;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f196355b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f196356a;

    /* compiled from: Folder.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/folders/f$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static f a(@k List list, @k Map map) {
            List<com.avito.android.messenger.folders.a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.android.messenger.folders.a aVar : list2) {
                Integer num = (Integer) map.get(aVar.f196343a);
                arrayList.add(new Q(aVar, Integer.valueOf(num != null ? num.intValue() : 0)));
            }
            return new f(arrayList);
        }

        public a() {
        }
    }

    public f(@k ArrayList arrayList) {
        this.f196356a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f196356a.equals(((f) obj).f196356a);
    }

    public final int hashCode() {
        return this.f196356a.hashCode();
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("FoldersUnreadCounters(counters="), this.f196356a, ')');
    }
}
