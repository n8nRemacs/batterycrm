package com.avito.android.bottom_navigation.space;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BottomNavigationCurrentSpaceProviderImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/space/b;", "Lcom/avito/android/bottom_navigation/space/a;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final id.j f107073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f107074b;

    @Inject
    public b(@Y61.k id.j jVar, @Y61.k f fVar) {
        this.f107073a = jVar;
        this.f107074b = fVar;
    }

    @Override // com.avito.android.bottom_navigation.space.a
    @Y61.l
    public final BottomNavigationSpace n() {
        o oVar;
        Iterable iterable = (Iterable) this.f107073a.f398601a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity != null) {
                arrayList.add(activity);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                oVar = null;
                break;
            }
            ComponentCallbacks2 componentCallbacks2 = (Activity) it2.next();
            oVar = componentCallbacks2 instanceof o ? (o) componentCallbacks2 : null;
            if (oVar != null) {
                break;
            }
        }
        if (oVar != null) {
            return oVar.n();
        }
        Activity activity2 = (Activity) C42745f0.G(arrayList);
        if (activity2 == null) {
            return null;
        }
        return this.f107074b.f107078a.get(activity2);
    }
}
