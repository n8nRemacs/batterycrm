package QO0;

import Y61.k;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PaymentHistoryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQO0/b;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f13708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<f> f13709b;

    public b(ViewPager viewPager, List<f> list) {
        this.f13708a = viewPager;
        this.f13709b = list;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k h hVar) {
        this.f13708a.setCurrentItem(this.f13709b.indexOf(hVar));
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k h hVar) {
    }
}
