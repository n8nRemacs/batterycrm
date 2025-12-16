package QJ0;

import Y61.k;
import android.content.res.Resources;
import android.util.TypedValue;
import com.avito.android.R;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserStatsResourcesProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQJ0/g;", "LQJ0/f;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13679a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13680b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f13681c;

    @Inject
    public g(@k Resources resources) throws Resources.NotFoundException {
        resources.getString(R.string.network_unavailable_snack);
        resources.getString(R.string.unknown_error);
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        new UniversalColor("gray8", new Color(resources.getColor(R.color.gray8, null)), new Color(resources.getColor(R.color.gray8, null)));
        this.f13679a = resources.getString(R.string.user_stats_chart_th);
        this.f13680b = resources.getString(R.string.user_stats_chart_mln);
        this.f13681c = resources.getString(R.string.user_stats_chart_bill);
    }

    @Override // QJ0.f
    @k
    /* renamed from: a, reason: from getter */
    public final String getF13679a() {
        return this.f13679a;
    }

    @Override // QJ0.f
    @k
    /* renamed from: b, reason: from getter */
    public final String getF13681c() {
        return this.f13681c;
    }

    @Override // QJ0.f
    @k
    /* renamed from: c, reason: from getter */
    public final String getF13680b() {
        return this.f13680b;
    }
}
