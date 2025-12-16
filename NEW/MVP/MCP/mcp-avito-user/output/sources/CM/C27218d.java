package cm;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.calltracking.CalltrackingScreenType;
import com.avito.android.calltracking.tabs.CalltrackingTab;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingTabsDataProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcm/d;", "Lcm/c;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cm.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C27218d implements InterfaceC27217c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f58125a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C27215a f58126b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f58127c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Integer f58128d;

    @Inject
    public C27218d(@k Resources resources, @k C27215a c27215a) {
        this.f58125a = resources;
        this.f58126b = c27215a;
    }

    @Override // cm.InterfaceC27217c
    public final void a(int i12, int i13) {
        Integer num;
        Integer num2 = this.f58127c;
        boolean z12 = num2 == null || num2.intValue() != i12 || (num = this.f58128d) == null || num.intValue() != i13;
        this.f58127c = Integer.valueOf(i12);
        this.f58128d = Integer.valueOf(i13);
        if (z12) {
            ArrayList arrayList = new ArrayList(CalltrackingScreenType.values().length);
            Resources resources = this.f58125a;
            arrayList.add(0, new CalltrackingTab(resources.getString(R.string.tab_title_all), i12 > 0 ? String.valueOf(i12) : null, false));
            arrayList.add(1, new CalltrackingTab(resources.getString(R.string.tab_title_missed), i13 > 0 ? String.valueOf(i13) : null, true));
            C27215a c27215a = this.f58126b;
            c27215a.f178152a.b(new UV0.c(arrayList));
            c27215a.d();
        }
    }
}
