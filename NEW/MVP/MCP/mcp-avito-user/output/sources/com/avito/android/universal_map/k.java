package com.avito.android.universal_map;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import javax.inject.Inject;
import kotlin.Metadata;
import t3.z0;

/* compiled from: UniversalMapInterfaceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/k;", "Lcom/avito/android/universal_map/i;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f304779a;

    @Inject
    public k(@z0 @Y61.k u3.g<SimpleTestGroupWithNone> gVar) {
        this.f304779a = gVar;
    }

    @Override // com.avito.android.universal_map.i
    @Y61.k
    public final BaseFragment a(@Y61.k UniversalMapParams universalMapParams, @Y61.l String str) {
        u3.g<SimpleTestGroupWithNone> gVar = this.f304779a;
        if (gVar.f439742a.f439749b.b()) {
            gVar.b();
            UniversalMapFragmentMvi.f305959P0.getClass();
            return UniversalMapFragmentMvi.a.a(universalMapParams, str);
        }
        SimpleTestGroupWithNone simpleTestGroupWithNone = gVar.f439742a.f439749b;
        simpleTestGroupWithNone.getClass();
        if (simpleTestGroupWithNone == SimpleTestGroupWithNone.f67970d) {
            gVar.b();
        }
        UniversalMapFragment.f304838X0.getClass();
        return UniversalMapFragment.a.a(universalMapParams, str);
    }
}
