package ok;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.brandspace.router.BrandspaceArguments;
import com.avito.android.brandspace.router.BrandspaceFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BrandspaceIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lok/b;", "Lok/a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ok.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C44787b implements InterfaceC44786a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f419998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f419999b;

    @Inject
    public C44787b(@k L l12, @k com.avito.android.navigation.a aVar) {
        this.f419998a = l12;
        this.f419999b = aVar;
    }

    @Override // ok.InterfaceC44786a
    @k
    public final Intent a(@k String str, @l String str2, @l String str3) {
        NavigationTabSetItem navigationTabSetItemA = this.f419999b.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
        }
        return this.f419998a.d(new BrandspaceFragmentData(new BrandspaceArguments(null, str, str2, str3), navigationTabSetItemA));
    }
}
