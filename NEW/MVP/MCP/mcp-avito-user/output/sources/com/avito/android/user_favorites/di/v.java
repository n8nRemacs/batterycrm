package com.avito.android.user_favorites.di;

import androidx.fragment.app.Fragment;
import com.avito.android.employee_stub_public.EmployeeStubData;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserFavoritesTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class v extends N implements Y41.a<Fragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.employee_stub_impl.d f316914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.avito.android.employee_stub_impl.d dVar) {
        super(0);
        this.f316914l = dVar;
    }

    @Override // Y41.a
    public final Fragment invoke() {
        return this.f316914l.a(EmployeeStubData.Favorites.f147615b);
    }
}
