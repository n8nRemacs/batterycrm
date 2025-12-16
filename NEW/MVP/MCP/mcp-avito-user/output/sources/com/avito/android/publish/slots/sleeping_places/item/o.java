package com.avito.android.publish.slots.sleeping_places.item;

import Y41.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SleepingPlacesSlotItemViewImplRedesigned.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/sleeping_places/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f244920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f244921c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Badge f244922d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f244923e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f244924f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f244925g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public p<? super Integer, ? super String, G0> f244926h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public p<? super String, ? super Integer, G0> f244927i;

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title_redesigned);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244920b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle_redesigned);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244921c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge_redesigned);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f244922d = (Badge) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.bed_types_redesigned);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f244923e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.add_bed_type_redesigned);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f244924f = (Button) viewFindViewById5;
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void Im(@Y61.l p<? super Integer, ? super String, G0> pVar) {
        this.f244926h = pVar;
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void O3(@Y61.l String str) {
        I5.a(this.f244921c, str, false);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void P70(@Y61.l String str, boolean z12) {
        TextView textView = this.f244920b;
        I5.a(textView, str, false);
        this.f244922d.setVisibility((z12 && textView.getVisibility() == 0) ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void Q40(boolean z12) {
        this.f244924f.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void Tg(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f244924f);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void VO(@Y61.l p<? super String, ? super Integer, G0> pVar) {
        this.f244927i = pVar;
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void dg(int i12, @Y61.k List list, boolean z12) {
        LinearLayout linearLayout = this.f244923e;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(!list.isEmpty() ? 0 : 8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final SelectedBedType selectedBedType = (SelectedBedType) it.next();
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.sleeping_places_row_item_redesigned, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.select_redesigned);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input = (Input) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.amount_redesigned);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.stepper.Stepper");
            }
            Stepper stepper = (Stepper) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.delete_redesigned);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById3;
            button.setVisibility(z12 ? 0 : 8);
            final int i13 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.slots.sleeping_places.item.m

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o f244916c;

                {
                    this.f244916c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            Y41.l<? super String, G0> lVar = this.f244916c.f244925g;
                            if (lVar != null) {
                                lVar.invoke(selectedBedType.getStringId());
                                break;
                            }
                            break;
                        default:
                            p<? super Integer, ? super String, G0> pVar = this.f244916c.f244926h;
                            if (pVar != null) {
                                SelectedBedType selectedBedType2 = selectedBedType;
                                pVar.invoke(selectedBedType2.getId(), selectedBedType2.getStringId());
                                break;
                            }
                            break;
                    }
                }
            });
            input.setState(selectedBedType.getState().getSelect());
            Input.t(input, selectedBedType.getTitle(), false, 6);
            final int i14 = 1;
            input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.slots.sleeping_places.item.m

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o f244916c;

                {
                    this.f244916c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            Y41.l<? super String, G0> lVar = this.f244916c.f244925g;
                            if (lVar != null) {
                                lVar.invoke(selectedBedType.getStringId());
                                break;
                            }
                            break;
                        default:
                            p<? super Integer, ? super String, G0> pVar = this.f244916c.f244926h;
                            if (pVar != null) {
                                SelectedBedType selectedBedType2 = selectedBedType;
                                pVar.invoke(selectedBedType2.getId(), selectedBedType2.getStringId());
                                break;
                            }
                            break;
                    }
                }
            });
            stepper.setCurrentState(selectedBedType.getState().getStepper());
            stepper.setMaxValue(i12);
            stepper.setValue(selectedBedType.getAmount());
            stepper.setOnValueChangeListener(new n(this, selectedBedType));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void e60(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f244925g = lVar;
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.i
    public final void fV(@Y61.l String str) {
        Button button = this.f244924f;
        String string = button.getContext().getString(R.string.sleeping_add_bed_type_text_redesigned);
        button.setState(new UU.a(str == null ? string : str, null, false, false, false, null, C35835l0.m(button.getContext(), R.attr.ic_plus16, R.attr.black), null, null, false, 958, null));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f244925g = null;
        this.f244927i = null;
        this.f244926h = null;
    }
}
