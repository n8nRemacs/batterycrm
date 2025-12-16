package com.avito.android.serp.adapter.warning;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jr.InterfaceC42416a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SerpWarningItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/warning/i;", "Lcom/avito/android/serp/adapter/warning/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<e> f273731b;

    @Inject
    public i(@Y61.k h31.e<e> eVar) {
        this.f273731b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        SerpWarningItem serpWarningItem = (SerpWarningItem) aVar;
        kVar.P2(serpWarningItem.f273717d);
        Image image = serpWarningItem.f273718e;
        kVar.G4(image == null ? null : com.avito.android.image_loader.b.b(image));
        List<Action> list = serpWarningItem.f273720g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String title = ((Action) obj).getTitle();
            if (title != null && title.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            arrayList2.add(new InterfaceC42416a.C11584a(action.getTitle(), new h(this, action)));
        }
        kVar.h2(arrayList2);
        kVar.setCloseButtonVisible(serpWarningItem.f273719f);
        kVar.B7(new g(this, serpWarningItem, i12));
    }
}
