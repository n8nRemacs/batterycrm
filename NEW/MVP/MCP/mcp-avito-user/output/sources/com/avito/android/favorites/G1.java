package com.avito.android.favorites;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MenuWrapper.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/G1;", "Lcom/avito/android/favorites/E1;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class G1 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f156275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super MenuItem, kotlin.G0> f156276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Menu, ? super MenuInflater, kotlin.G0> f156277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Menu f156278d;

    public G1(@Y61.k ActivityC22955m activityC22955m) {
        this.f156275a = activityC22955m;
    }

    @Y61.l
    public final MenuItem a() {
        Menu menu = this.f156278d;
        if (menu != null) {
            return menu.findItem(R.id.menu_cart_item);
        }
        return null;
    }
}
