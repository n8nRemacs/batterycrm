package com.avito.android.user_advert.advert.items.multi_urgency;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.q;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f309652i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f309653b;

    /* renamed from: c, reason: collision with root package name */
    public final Switcher f309654c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f309655d;

    /* renamed from: e, reason: collision with root package name */
    public final SelectorCardGroup f309656e;

    /* renamed from: f, reason: collision with root package name */
    public final View f309657f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.items.multi_urgency.anim.g f309658g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.items.multi_urgency.anim.e f309659h;

    public j(@Y61.k View view) {
        super(view);
        this.f309653b = (TextView) view.findViewById(R.id.multi_urgency_title);
        this.f309654c = (Switcher) view.findViewById(R.id.multi_urgency_switcher);
        this.f309655d = (TextView) view.findViewById(R.id.multi_urgency_subtitle);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.multi_urgency_card_group);
        this.f309656e = selectorCardGroup;
        Spinner spinner = (Spinner) view.findViewById(R.id.multi_urgency_spinner);
        View viewFindViewById = view.findViewById(R.id.multi_urgency_overlay);
        this.f309657f = viewFindViewById;
        this.f309658g = new com.avito.android.user_advert.advert.items.multi_urgency.anim.g(spinner, viewFindViewById);
        this.f309659h = new com.avito.android.user_advert.advert.items.multi_urgency.anim.e(spinner, viewFindViewById);
        selectorCardGroup.setContentBinderFactory(k.f309661d);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void DP(boolean z12) {
        this.f309656e.setEnabled(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f309653b, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309654c.setOnCheckedChangeListener(null);
        this.f309656e.setSelectedListener(null);
        AnimatorSet animatorSet = this.f309658g.f309628c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f309659h.f309628c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void k(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f309655d, attributedText, null);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void nz(@Y61.k Y41.l<? super l, G0> lVar) {
        this.f309656e.setSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void qP(@Y61.k List<l> list) {
        Object next;
        ArrayList arrayList;
        SelectorCardGroup selectorCardGroup = this.f309656e;
        selectorCardGroup.setData(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((l) next).f309668e) {
                    break;
                }
            }
        }
        l lVar = (l) next;
        if (lVar != null) {
            int i12 = 0;
            selectorCardGroup.d(lVar, false);
            if (!selectorCardGroup.isAttachedToWindow()) {
                SelectorCardGroup.c(selectorCardGroup, lVar);
                return;
            }
            com.avito.android.user_advert.advert.items.multi_urgency.anim.i iVar = new com.avito.android.user_advert.advert.items.multi_urgency.anim.i(selectorCardGroup.getContext());
            com.avito.android.lib.design.selector_card.e eVar = selectorCardGroup.f180349f;
            if (eVar == null || (arrayList = eVar.f180411o) == null) {
                return;
            }
            Iterator it2 = q.a(arrayList).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                } else if (lVar.a((r) it2.next())) {
                    break;
                } else {
                    i12++;
                }
            }
            iVar.f53878a = i12;
            RecyclerView.m layoutManager = selectorCardGroup.f180348e.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.x1(iVar);
            }
        }
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void setLoading(boolean z12) {
        com.avito.android.user_advert.advert.items.multi_urgency.anim.a aVar = this.f309658g;
        AnimatorSet animatorSet = aVar.f309628c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.avito.android.user_advert.advert.items.multi_urgency.anim.a aVar2 = this.f309659h;
        AnimatorSet animatorSet2 = aVar2.f309628c;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (!z12) {
            aVar = aVar2;
        }
        if (this.itemView.isAttachedToWindow()) {
            aVar.start();
        } else {
            aVar.a();
        }
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void ul(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.f309654c.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(6, lVar));
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.i
    public final void wH(boolean z12) throws Resources.NotFoundException {
        this.f309654c.setChecked(z12);
    }

    /* compiled from: MultiUrgencyBlockView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_advert/advert/items/multi_urgency/j$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<l, G0> f309660a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super l, G0> lVar) {
            this.f309660a = lVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@Y61.k r rVar) {
            this.f309660a.invoke((l) rVar);
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@Y61.k r rVar) {
        }
    }
}
