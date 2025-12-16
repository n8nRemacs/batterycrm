package com.avito.android.advert.item.icebreakers_redesign;

import Fc1.G3;
import Y41.q;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.icebreakers.n;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.util.K2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IceBreakersRedesignView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/icebreakers_redesign/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/icebreakers_redesign/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f76557g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f76558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f76559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f76560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f76561e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public s f76562f;

    /* compiled from: IceBreakersRedesignView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/icebreakers_redesign/m$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q<IcebreakerRedesignChips, Boolean, Boolean, G0> f76563a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super IcebreakerRedesignChips, ? super Boolean, ? super Boolean, G0> qVar) {
            this.f76563a = qVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            IcebreakerRedesignChips icebreakerRedesignChips = (IcebreakerRedesignChips) hVar;
            ((e) this.f76563a).invoke(icebreakerRedesignChips, Boolean.FALSE, Boolean.valueOf(icebreakerRedesignChips.f76515e));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            IcebreakerRedesignChips icebreakerRedesignChips = (IcebreakerRedesignChips) hVar;
            ((e) this.f76563a).invoke(icebreakerRedesignChips, Boolean.TRUE, Boolean.valueOf(icebreakerRedesignChips.f76515e));
        }
    }

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icebreakers_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76558b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icebreaker_buttons);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f76559c = (Chips) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icebreakers_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f76560d = (Input) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.message_limit_error);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76561e = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void JG() {
        this.f76559c.j();
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void W() {
        K2.d(this.f76560d, true);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void Xp(@Y61.k q<? super IcebreakerRedesignChips, ? super Boolean, ? super Boolean, G0> qVar) {
        this.f76559c.setChipsSelectedListener(new a(qVar));
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void cd(@Y61.k Y41.a<G0> aVar) {
        this.f76560d.setRightIconListener(new com.avito.android.advert.closed.b(28, this, aVar));
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void h70() {
        this.f76559c.animate().alpha(0.0f).setDuration(200L).withEndAction(new G3(this, 21)).start();
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void hv(@Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, boolean z12) {
        ArrayList arrayListI0 = C42745f0.i0(new IcebreakerRedesignChips(-1, Integer.valueOf(R.drawable.advert_details_ic_icebreakers_edit), "", true), arrayList);
        Chips chips = this.f76559c;
        chips.setData(arrayListI0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (arrayList2.contains(Integer.valueOf(((IcebreakerRedesignChips) obj).f76512b))) {
                arrayList3.add(obj);
            }
        }
        chips.j();
        if (!arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                IcebreakerRedesignChips icebreakerRedesignChips = (IcebreakerRedesignChips) it.next();
                if (!((ArrayList) chips.s()).contains(icebreakerRedesignChips)) {
                    chips.q(icebreakerRedesignChips, false);
                }
            }
        } else if (z12 && !arrayList.isEmpty()) {
            chips.q((com.avito.android.lib.design.chips.h) C42745f0.E(arrayList), false);
        }
        chips.setAlpha(0.0f);
        chips.setVisibility(0);
        chips.animate().alpha(1.0f).setDuration(200L).start();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f76559c.setChipsSelectedListener(null);
        Input input = this.f76560d;
        input.setOnFocusChangeListener(null);
        input.setRightIconListener(null);
        s sVar = this.f76562f;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f76562f = null;
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void jo(boolean z12) {
        this.f76561e.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void o0(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f76560d.setOnFocusChangeListener(new n(1, lVar));
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void setTitle(@Y61.k String str) {
        this.f76558b.setText(str);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void u0(@Y61.k Y41.l<? super String, G0> lVar) {
        s sVar = this.f76562f;
        Input input = this.f76560d;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f76562f = com.avito.android.lib.design.input.n.c(input, lVar);
    }

    @Override // com.avito.android.advert.item.icebreakers_redesign.l
    public final void y0(@Y61.k String str) {
        Input.t(this.f76560d, str, false, 6);
    }
}
