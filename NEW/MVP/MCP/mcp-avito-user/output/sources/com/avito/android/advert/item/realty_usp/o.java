package com.avito.android.advert.item.realty_usp;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.realty_usp.RealtyUspItem;
import com.avito.android.advert.item.realty_usp.q;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.remote.model.text.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyUspView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/realty_usp/m;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f78427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f78428c;

    /* renamed from: d, reason: collision with root package name */
    public final Chips f78429d;

    /* renamed from: e, reason: collision with root package name */
    public final ShimmerFrameLayout f78430e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public List<RealtyUspItem.UspChipData> f78431f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public List<q> f78432g;

    /* compiled from: RealtyUspView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/o$a;", "", "<init>", "()V", "", "CHIPS_APPEAR_DELAY", "J", "CHIPS_APPEAR_DURATION", "", "CHIP_RAW_TEXT_PARAMETER", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyUspView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "lineSpaceAvailable", "", "position", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<Boolean, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<RealtyUspItem.UspChipData> f78434m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<RealtyUspItem.UspChipData> list) {
            super(2);
            this.f78434m = list;
        }

        @Override // Y41.p
        public final G0 invoke(Boolean bool, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            o oVar = o.this;
            if (!oVar.f78432g.isEmpty() && !zBooleanValue && 1 <= iIntValue && iIntValue < oVar.f78432g.size()) {
                oVar.f78432g = oVar.f78432g.subList(0, iIntValue - 1);
                oVar.f78432g.add(new q.b(oVar.f78427b.getContext().getString(R.string.show_more_pattern, Integer.valueOf((this.f78434m.size() - iIntValue) + 1))));
                oVar.f78429d.post(new n(oVar, 1));
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public o(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f78427b = view;
        this.f78428c = aVar;
        this.f78429d = (Chips) view.findViewById(R.id.usp_tabs_chips);
        this.f78430e = (ShimmerFrameLayout) view.findViewById(R.id.usp_tabs_shimmer);
        this.f78432g = new ArrayList();
    }

    public final ArrayList B80(List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RealtyUspItem.UspChipData uspChipData = (RealtyUspItem.UspChipData) it.next();
            CharSequence charSequenceC = this.f78428c.c(this.f78427b.getContext(), uspChipData.f78390b);
            String str = "";
            if (charSequenceC == null) {
                charSequenceC = "";
            }
            Iterator<T> it2 = uspChipData.f78390b.getAttributes().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((Attribute) next).getName(), "text")) {
                    break;
                }
            }
            Attribute attribute = (Attribute) next;
            String title = attribute != null ? attribute.getTitle() : null;
            if (title != null) {
                str = title;
            }
            arrayList.add(new q.a(charSequenceC, str));
        }
        return new ArrayList(arrayList);
    }

    @Override // com.avito.android.advert.item.realty_usp.m
    public final void C1(@Y61.k List<RealtyUspItem.UspChipData> list) {
        if (new com.avito.android.lib.util.c(list, this.f78431f).f181333c) {
            return;
        }
        List<RealtyUspItem.UspChipData> list2 = list;
        this.f78431f = list2;
        Chips chips = this.f78429d;
        chips.setAlpha(0.0f);
        this.f78432g = B80(list2);
        chips.setEllipsizeCallback(new b(list));
        if (chips.getAlpha() < 1.0f) {
            chips.animate().alpha(1.0f).setDuration(300L).setStartDelay(50L).start();
        }
        chips.setData(this.f78432g);
    }

    @Override // com.avito.android.advert.item.realty_usp.m
    public final void HX(@Y61.k Y41.l<? super q, G0> lVar) {
        this.f78429d.setChipsSelectedListener(new c(lVar, this));
    }

    @Override // com.avito.android.advert.item.realty_usp.m
    public final void NJ() {
        this.f78430e.b();
    }

    @Override // com.avito.android.advert.item.realty_usp.m
    public final void Uu() {
        ShimmerFrameLayout shimmerFrameLayout = this.f78430e;
        shimmerFrameLayout.c();
        shimmerFrameLayout.a(null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f78429d.setChipsSelectedListener(null);
    }

    @Override // com.avito.android.advert.item.realty_usp.m
    public final void u3(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        Chips chips = this.f78429d;
        chips.setMaxLines(numValueOf);
        List list = this.f78431f;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        this.f78432g = B80(list);
        chips.post(new n(this, 0));
    }

    /* compiled from: RealtyUspView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/realty_usp/o$c", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<q, G0> f78435a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f78436b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super q, G0> lVar, o oVar) {
            this.f78435a = lVar;
            this.f78436b = oVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            if (hVar instanceof q) {
                ((i) this.f78435a).invoke(hVar);
                this.f78436b.f78429d.j();
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
