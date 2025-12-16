package rl;

import com.avito.android.R;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.ui.status_bar.d;
import com.avito.android.ui.status_bar.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: SerpSpaceTypeStatusBarUpdatesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrl/a;", "Lcom/avito/android/ui/status_bar/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47677a implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<d> f430165b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n2<d> f430166c;

    @Inject
    public C47677a(@Y61.k SerpSpaceType serpSpaceType) {
        Z1<d> z1A = p2.a(null);
        this.f430165b = z1A;
        this.f430166c = z1A;
        if (serpSpaceType.getIsForceBlackStatusBar()) {
            z1A.setValue(new d(ThemeAppearance.f181337e, new d.a.C9356a(R.attr.constantBlack)));
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<d> e2() {
        return this.f430166c;
    }
}
