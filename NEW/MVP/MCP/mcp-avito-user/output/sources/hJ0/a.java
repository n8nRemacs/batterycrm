package HJ0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.lib.deprecated_design.tab.b;
import com.avito.android.user_favorites.adapter.viewed.ViewedTab;
import kotlin.Metadata;

/* compiled from: ViewedBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LHJ0/a;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lcom/avito/android/user_favorites/adapter/viewed/ViewedTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements b<ViewedTab> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.user_viewed.b f7029a;

    public a(@k com.avito.android.user_viewed.b bVar) {
        this.f7029a = bVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @l
    public final Fragment a(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return this.f7029a.a();
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof ViewedTab;
    }
}
