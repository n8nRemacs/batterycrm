package com.avito.android.advert.item.icebreakers;

import Y41.p;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IceBreakersView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/icebreakers/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f76494g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public s f76495b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f76496c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f76497d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f76498e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Chips f76499f;

    /* compiled from: IceBreakersView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/icebreakers/o$a", "Lcom/avito/android/lib/design/chips/Chips$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<com.avito.android.advert.item.icebreakers.a, Integer, G0> f76501b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super com.avito.android.advert.item.icebreakers.a, ? super Integer, G0> pVar) {
            this.f76501b = pVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.a
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Integer num = (Integer) C42745f0.G(o.this.f76499f.n());
            if (num != null) {
                ((e) this.f76501b).invoke((com.avito.android.advert.item.icebreakers.a) hVar, num);
            }
        }
    }

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icebreakers_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76496c = (TextView) viewFindViewById;
        this.f76497d = (TextView) view.findViewById(R.id.icebreakers_description);
        View viewFindViewById2 = view.findViewById(R.id.icebreakers_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f76498e = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icebreaker_buttons);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f76499f = (Chips) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void W() {
        K2.d(this.f76498e, true);
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void Yh(int i12, @Y61.k ArrayList arrayList) {
        Object next;
        Chips chips = this.f76499f;
        chips.setData(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.advert.item.icebreakers.a) next).f76452b == i12) {
                    break;
                }
            }
        }
        com.avito.android.advert.item.icebreakers.a aVar = (com.avito.android.advert.item.icebreakers.a) next;
        if (aVar == null) {
            aVar = (com.avito.android.advert.item.icebreakers.a) C42745f0.E(arrayList);
        }
        chips.q(aVar, false);
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void cd(@Y61.k Y41.a<G0> aVar) {
        this.f76498e.setRightIconListener(new com.avito.android.advert.closed.b(27, this, aVar));
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void cp(@Y61.k p<? super com.avito.android.advert.item.icebreakers.a, ? super Integer, G0> pVar) {
        this.f76499f.setChipsClickedListener(new a(pVar));
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void gf(@Y61.k p<? super com.avito.android.advert.item.icebreakers.a, ? super Integer, G0> pVar) {
        this.f76499f.setChipsSelectedListener(new b(pVar));
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void h(@Y61.l String str) {
        TextView textView = this.f76497d;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void i0() {
        this.f76498e.v();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f76499f.setChipsSelectedListener(null);
        Input input = this.f76498e;
        input.setOnFocusChangeListener(null);
        input.setRightIconListener(null);
        s sVar = this.f76495b;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f76495b = null;
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void o0(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f76498e.setOnFocusChangeListener(new n(0, lVar));
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f76496c, str, false);
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void u0(@Y61.k Y41.l<? super String, G0> lVar) {
        s sVar = this.f76495b;
        Input input = this.f76498e;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f76495b = com.avito.android.lib.design.input.n.c(input, lVar);
    }

    @Override // com.avito.android.advert.item.icebreakers.m
    public final void y0(@Y61.k String str) {
        Input.t(this.f76498e, str, false, 4);
    }

    /* compiled from: IceBreakersView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/icebreakers/o$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<com.avito.android.advert.item.icebreakers.a, Integer, G0> f76503b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super com.avito.android.advert.item.icebreakers.a, ? super Integer, G0> pVar) {
            this.f76503b = pVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Integer num = (Integer) C42745f0.G(o.this.f76499f.n());
            if (num != null) {
                ((f) this.f76503b).invoke((com.avito.android.advert.item.icebreakers.a) hVar, num);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
