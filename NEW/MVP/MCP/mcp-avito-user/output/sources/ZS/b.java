package ZS;

import Y61.k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.ownership.Owners;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ScenarioIdentity.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZS/b;", "", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f20168a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f20169b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f20170c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f20171d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f20172e;

    public /* synthetic */ b(Screen screen, String str, String str2, List list, String str3, int i12, C42822w c42822w) {
        this(screen, str, (i12 & 4) != 0 ? "" : str2, (List<? extends Owners>) list, (i12 & 16) != 0 ? "" : str3);
    }

    public b(@k Screen screen, @k Owners owners, @k String str) {
        this(screen, screen.f90471b, (String) null, Collections.singletonList(owners), str, 4, (C42822w) null);
    }

    public b(@k Screen screen, @k String str, @k String str2, @k List<? extends Owners> list, @k String str3) {
        this.f20171d = str;
        this.f20170c = str2;
        this.f20168a = screen.f90471b;
        List<? extends Owners> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Owners) it.next()).name());
        }
        this.f20172e = arrayList;
        this.f20169b = str3;
    }

    public b(Screen screen, String str, String str2, Owners owners, String str3, int i12, C42822w c42822w) {
        this(screen, str, (i12 & 4) != 0 ? "" : str2, (List<? extends Owners>) Collections.singletonList(owners), (i12 & 16) != 0 ? "" : str3);
    }

    public /* synthetic */ b(Screen screen, Owners owners, String str, int i12, C42822w c42822w) {
        this(screen, owners, (i12 & 4) != 0 ? "" : str);
    }
}
