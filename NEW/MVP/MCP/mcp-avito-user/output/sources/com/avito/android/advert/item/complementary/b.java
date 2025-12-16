package com.avito.android.advert.item.complementary;

import Tp0.u;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.C28144l;
import com.avito.android.advert.item.similars.m;
import com.avito.android.favorite.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.section.chips.SectionChip;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.L0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: ComplementaryBottomSheetDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/complementary/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.similars.a f74571E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final u f74572F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final Provider<n> f74573G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.advert.viewed.f> f74574H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f74575I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final L0 f74576J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C28144l f74577K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public f f74578L;

    @Inject
    public b(@C27710t.p @k Context context, @k com.avito.android.advert.item.similars.a aVar, @Tp0.h @k u uVar, @k Provider provider, @k Provider provider2, @Tp0.g @k com.avito.konveyor.a aVar2, @k L0 l02, @k C28144l c28144l) {
        super(new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23), R.style.Design_Widget_BottomSheetDialog);
        this.f74571E = aVar;
        this.f74572F = uVar;
        this.f74573G = provider;
        this.f74574H = provider2;
        this.f74575I = aVar2;
        this.f74576J = l02;
        this.f74577K = c28144l;
        C(R.layout.advert_details_complementary_redesign_i2i_content, new a(this));
        com.avito.android.lib.design.bottom_sheet.d.M(this, context.getText(R.string.united_section_default_title), true, true, 2);
        S(C35835l0.g(context).y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(@k m mVar) {
        f fVar = this.f74578L;
        if (fVar != null) {
            m mVar2 = fVar.f74603o;
            com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(mVar, mVar2);
            if (cVar.f181333c) {
                return;
            }
            List<SectionChip> list = mVar2 != null ? mVar2.f80304a : null;
            List<SectionChip> list2 = mVar.f80304a;
            if (!L.f(list2, list)) {
                int size = list2.size();
                Chips chips = fVar.f74595g;
                if (size > 1) {
                    boolean z12 = chips.getVisibility() == 0;
                    D6.G(chips, true);
                    ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
                    List<SectionChip> list3 = list2;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                    int i12 = 0;
                    for (Object obj : list3) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        SectionChip sectionChip = (SectionChip) obj;
                        arrayList.add(new ItemChipable(i12, null, null, null, sectionChip.f264619d, null, sectionChip.f264620e, false, false, 430, null));
                        i12 = i13;
                    }
                    chips.setState(new ChipsState(0, displayType, null, arrayList, new d(list2, fVar), 1, null));
                    if (!z12) {
                        Iterator<SectionChip> it = list2.iterator();
                        int i14 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i14 = -1;
                                break;
                            } else if (it.next().f264619d) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (i14 != -1) {
                            chips.A0(i14);
                        }
                    }
                } else {
                    D6.w(chips);
                }
            }
            T t12 = cVar.f181331a;
            m.a aVar = t12 != 0 ? ((m) t12).f80305b : null;
            T t13 = cVar.f181332b;
            if (!L.f(aVar, t13 != 0 ? ((m) t13).f80305b : null)) {
                m.a aVar2 = mVar.f80305b;
                boolean z13 = aVar2 instanceof m.a.c;
                LinearLayout linearLayout = fVar.f74597i;
                RecyclerView recyclerView = fVar.f74596h;
                if (z13) {
                    D6.G(recyclerView, true);
                    D6.w(linearLayout);
                    fVar.a(false);
                    UV0.c cVar2 = new UV0.c(((m.a.c) aVar2).f80308a);
                    fVar.f74592d.c(cVar2);
                    fVar.f74594f.c(cVar2);
                    fVar.f74593e.c(cVar2);
                    fVar.f74602n.notifyDataSetChanged();
                } else if (aVar2 instanceof m.a.C2374a) {
                    D6.G(linearLayout, true);
                    D6.w(recyclerView);
                    fVar.a(false);
                    boolean z14 = ((m.a.C2374a) aVar2).f80306a;
                    Button button = fVar.f74599k;
                    TextView textView = fVar.f74598j;
                    if (z14) {
                        textView.setText(R.string.section_default_load_failed_retry_text);
                        button.setState(new UU.a(button.getContext().getText(R.string.reload), null, false, false, false, new e(fVar), null, null, null, false, 990, null));
                        D6.G(button, true);
                    } else {
                        textView.setText(R.string.section_default_not_found_error_text);
                        D6.w(button);
                    }
                } else if (L.f(aVar2, m.a.b.f80307a)) {
                    fVar.a(true);
                    D6.w(recyclerView);
                    D6.w(linearLayout);
                }
            }
            fVar.f74603o = mVar;
        }
    }
}
