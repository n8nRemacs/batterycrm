package com.avito.android.developments_agency_search.screen.single_selector_dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.konveyor.adapter.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleSelectorBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/single_selector_dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f139047J = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final l<com.avito.android.developments_agency_search.adapter.checkable_item.a, G0> f139048E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f139049F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final ArrayList f139050G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public j f139051H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f139052I;

    /* compiled from: SingleSelectorBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            b bVar = (b) this.receiver;
            ArrayList arrayList = bVar.f139050G;
            arrayList.replaceAll(new com.avito.android.developments_agency_search.screen.single_selector_dialog.a(str, 0));
            com.avito.konveyor.adapter.a aVar = bVar.f139052I;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(bVar.f139050G));
            j jVar = bVar.f139051H;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.avito.android.developments_agency_search.adapter.checkable_item.a aVar2 = (com.avito.android.developments_agency_search.adapter.checkable_item.a) it.next();
                if (aVar2.f136217d) {
                    bVar.f139048E.invoke(aVar2);
                    bVar.dismiss();
                    return G0.f406611a;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: SingleSelectorBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.single_selector_dialog.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4189b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            b bVar = (b) this.receiver;
            int i12 = b.f139047J;
            bVar.getClass();
            RecyclerView recyclerView = (RecyclerView) view;
            j jVar = bVar.f139051H;
            if (jVar == null) {
                jVar = null;
            }
            recyclerView.setAdapter(jVar);
            com.avito.konveyor.adapter.a aVar = bVar.f139052I;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(bVar.f139050G));
            j jVar2 = bVar.f139051H;
            (jVar2 != null ? jVar2 : null).notifyDataSetChanged();
            return G0.f406611a;
        }
    }

    /* compiled from: SingleSelectorBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = b.this;
            Y41.a<G0> aVar = bVar.f139049F;
            if (aVar != null) {
                aVar.invoke();
            }
            bVar.dismiss();
            return G0.f406611a;
        }
    }

    public /* synthetic */ b(Context context, List list, String str, l lVar, boolean z12, boolean z13, Y41.a aVar, int i12, C42822w c42822w) {
        this(context, list, str, lVar, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? null : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Context context, @k List<com.avito.android.developments_agency_search.adapter.checkable_item.a> list, @k String str, @k l<? super com.avito.android.developments_agency_search.adapter.checkable_item.a, G0> lVar, boolean z12, boolean z13, @Y61.l Y41.a<G0> aVar) {
        super(context, 0, 2, 0 == true ? 1 : 0);
        this.f139048E = lVar;
        this.f139049F = aVar;
        this.f139050G = new ArrayList(list);
        com.avito.android.developments_agency_search.screen.single_selector_dialog.di.a.a().a(new a(1, this, b.class, "onItemClicked", "onItemClicked(Ljava/lang/String;)V", 0)).a(this);
        C(R.layout.dialog_single_selector, new C4189b(1, this, b.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        L(str, z13 ? context.getString(R.string.das_search_sorting_dialog_action_title) : null, z12, true);
        w(true);
        P(new c());
    }
}
