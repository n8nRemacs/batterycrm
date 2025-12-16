package fY;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.serp.adapter.d1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpListResourcesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfY/b;", "LfY/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40373b implements InterfaceC40372a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f395905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f395906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f395908d;

    @Inject
    public C40373b(@k Resources resources, @d1 int i12) {
        this.f395905a = resources;
        this.f395906b = i12;
        this.f395907c = resources.getDimensionPixelSize(R.dimen.switch_serp_map_button_height_with_floating_container);
        this.f395908d = resources.getDimensionPixelSize(R.dimen.switch_serp_map_button_height_without_floating_container);
    }

    @Override // fY.InterfaceC40372a
    /* renamed from: a, reason: from getter */
    public final int getF395906b() {
        return this.f395906b;
    }

    @Override // fY.InterfaceC40372a
    public final boolean b() {
        return this.f395905a.getBoolean(R.bool.can_switch_display_type);
    }

    @Override // fY.InterfaceC40372a
    public final int c(int i12) throws Resources.NotFoundException {
        Resources resources = this.f395905a;
        return (int) (((i12 - resources.getDimensionPixelSize(R.dimen.bottom_nav_height)) - (resources.getDimensionPixelSize(R.dimen.search_map_shortcuts_height) + resources.getDimensionPixelSize(R.dimen.search_map_search_bar_with_padding_height))) * 0.5f);
    }

    @Override // fY.InterfaceC40372a
    public final int d(boolean z12, boolean z13) {
        if (z13) {
            return this.f395907c;
        }
        if (z12) {
            return this.f395908d;
        }
        return 0;
    }

    @Override // fY.InterfaceC40372a
    public final int e(int i12, boolean z12) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = this.f395905a;
        if (z12) {
            dimensionPixelSize = (int) ((i12 - resources.getDimensionPixelSize(R.dimen.bottom_nav_height)) * 0.5f);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.search_map_search_bar_with_padding_height);
        } else {
            dimensionPixelSize = (int) ((i12 - resources.getDimensionPixelSize(R.dimen.bottom_nav_height)) * 0.6f);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.search_map_search_bar_with_padding_height);
        }
        return dimensionPixelSize2 + dimensionPixelSize;
    }
}
