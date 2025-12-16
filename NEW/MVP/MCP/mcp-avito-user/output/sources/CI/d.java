package CI;

import WQ.h;
import Y61.k;
import com.avito.android.horizontal_list.items.defaultItem.c;
import com.avito.android.horizontal_list.items.recentSearchItem.c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: HorizontalListWidgetKonveyorItemModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LCI/d;", "LWQ/d;", "Lcom/avito/android/horizontal_list/e;", "Lcom/avito/android/horizontal_list/c;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements WQ.d<com.avito.android.horizontal_list.e, com.avito.android.horizontal_list.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.b f2076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.b f2077b;

    public d(c.b bVar, c.b bVar2) {
        this.f2076a = bVar;
        this.f2077b = bVar2;
    }

    @Override // WQ.d
    @k
    public final Q<com.avito.android.horizontal_list.e, com.avito.android.horizontal_list.c> a(@k h hVar) throws BlueprintCollisionException {
        com.avito.android.horizontal_list.items.defaultItem.a aVar = new com.avito.android.horizontal_list.items.defaultItem.a(this.f2076a.a(hVar.b0()));
        com.avito.android.horizontal_list.items.recentSearchItem.a aVar2 = new com.avito.android.horizontal_list.items.recentSearchItem.a(this.f2077b.a(hVar.b0()));
        com.avito.android.horizontal_list.e eVar = new com.avito.android.horizontal_list.e(hVar.getF111009h());
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        return new Q<>(eVar, new com.avito.android.horizontal_list.c(eVar, aVarA, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null)));
    }
}
