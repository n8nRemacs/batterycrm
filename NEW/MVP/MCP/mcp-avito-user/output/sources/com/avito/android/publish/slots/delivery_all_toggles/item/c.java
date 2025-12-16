package com.avito.android.publish.slots.delivery_all_toggles.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAllTogglesBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f243480P = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Y41.p<String, Boolean, G0> f243481E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f243482F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final View f243483G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final TextView f243484H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final TextView f243485I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243486J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243487K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243488L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243489M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243490N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Button f243491O;

    /* compiled from: DeliveryAllTogglesBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/c$a;", "", "<init>", "()V", "", "TITLE_PARAMETER", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k Context context, @Y61.l com.avito.android.publish.slots.delivery_all_toggles.item.a aVar, @Y61.k Y41.p<? super String, ? super Boolean, G0> pVar, @Y61.k Y41.a<G0> aVar2) {
        Object next;
        BooleanParameter booleanParameter;
        Object next2;
        BooleanParameter booleanParameter2;
        Object next3;
        BooleanParameter booleanParameter3;
        Object next4;
        BooleanParameter booleanParameter4;
        Object next5;
        BooleanParameter booleanParameter5;
        super(context, 0, 2, null);
        this.f243481E = pVar;
        this.f243482F = aVar2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.delivery_all_toggles_bottom_sheet, (ViewGroup) null);
        this.f243483G = viewInflate;
        setContentView(viewInflate);
        if (!this.f178529w) {
            this.f178529w = true;
            com.avito.android.lib.design.bottom_sheet.q qVar = this.f178530x;
            if (qVar != null) {
                qVar.setDraggable(true);
            }
        }
        View viewFindViewById = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f243484H = textView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_pvz_switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById2;
        this.f243486J = listItemSwitcher;
        View viewFindViewById3 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_courier_switcher);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f243487K = (ListItemSwitcher) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_postamat_switcher);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f243488L = (ListItemSwitcher) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_dbs_label);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243485I = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_dbs_switcher);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f243489M = (ListItemSwitcher) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_delivery_dbs_courier_switcher);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f243490N = (ListItemSwitcher) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.all_toggles_bottom_sheet_action_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243491O = (Button) viewFindViewById8;
        if (((aVar == null || (booleanParameter5 = aVar.f243473a) == null) ? null : booleanParameter5.getValue()) != null) {
            D6.G(textView, true);
            D6.G(listItemSwitcher, true);
            listItemSwitcher.setChecked(L.f(aVar.f243473a.getValue(), Boolean.TRUE));
            BooleanParameter booleanParameter6 = aVar.f243473a;
            listItemSwitcher.setTitle(booleanParameter6.getTitle());
            AttributedText subtitle = booleanParameter6.getSubtitle();
            if (subtitle != null) {
                Iterator<T> it = subtitle.getAttributes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next5 = null;
                        break;
                    } else {
                        next5 = it.next();
                        if (L.f(((Attribute) next5).getName(), "title")) {
                            break;
                        }
                    }
                }
                Attribute attribute = (Attribute) next5;
                listItemSwitcher.setSubtitle(attribute != null ? attribute.getTitle() : null);
            }
            final int i12 = 0;
            this.f243486J.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f243479b;

                {
                    this.f243479b = this;
                }

                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    c cVar = this.f243479b;
                    switch (i12) {
                        case 0:
                            int i13 = c.f243480P;
                            cVar.V();
                            break;
                        case 1:
                            int i14 = c.f243480P;
                            cVar.V();
                            break;
                        case 2:
                            int i15 = c.f243480P;
                            cVar.V();
                            break;
                        case 3:
                            int i16 = c.f243480P;
                            cVar.V();
                            break;
                        default:
                            int i17 = c.f243480P;
                            cVar.V();
                            break;
                    }
                }
            });
        }
        if (((aVar == null || (booleanParameter4 = aVar.f243475c) == null) ? null : booleanParameter4.getValue()) != null) {
            D6.G(this.f243484H, true);
            D6.G(this.f243488L, true);
            this.f243488L.setChecked(L.f(aVar.f243475c.getValue(), Boolean.TRUE));
            ListItemSwitcher listItemSwitcher2 = this.f243488L;
            BooleanParameter booleanParameter7 = aVar.f243475c;
            listItemSwitcher2.setTitle(booleanParameter7.getTitle());
            AttributedText subtitle2 = booleanParameter7.getSubtitle();
            if (subtitle2 != null) {
                ListItemSwitcher listItemSwitcher3 = this.f243488L;
                Iterator<T> it2 = subtitle2.getAttributes().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next4 = null;
                        break;
                    } else {
                        next4 = it2.next();
                        if (L.f(((Attribute) next4).getName(), "title")) {
                            break;
                        }
                    }
                }
                Attribute attribute2 = (Attribute) next4;
                listItemSwitcher3.setSubtitle(attribute2 != null ? attribute2.getTitle() : null);
            }
            final int i13 = 1;
            this.f243488L.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f243479b;

                {
                    this.f243479b = this;
                }

                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    c cVar = this.f243479b;
                    switch (i13) {
                        case 0:
                            int i132 = c.f243480P;
                            cVar.V();
                            break;
                        case 1:
                            int i14 = c.f243480P;
                            cVar.V();
                            break;
                        case 2:
                            int i15 = c.f243480P;
                            cVar.V();
                            break;
                        case 3:
                            int i16 = c.f243480P;
                            cVar.V();
                            break;
                        default:
                            int i17 = c.f243480P;
                            cVar.V();
                            break;
                    }
                }
            });
        }
        if (((aVar == null || (booleanParameter3 = aVar.f243474b) == null) ? null : booleanParameter3.getValue()) != null) {
            D6.G(this.f243484H, true);
            D6.G(this.f243487K, true);
            this.f243487K.setChecked(L.f(aVar.f243474b.getValue(), Boolean.TRUE));
            ListItemSwitcher listItemSwitcher4 = this.f243487K;
            BooleanParameter booleanParameter8 = aVar.f243474b;
            listItemSwitcher4.setTitle(booleanParameter8.getTitle());
            AttributedText subtitle3 = booleanParameter8.getSubtitle();
            if (subtitle3 != null) {
                ListItemSwitcher listItemSwitcher5 = this.f243487K;
                Iterator<T> it3 = subtitle3.getAttributes().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it3.next();
                        if (L.f(((Attribute) next3).getName(), "title")) {
                            break;
                        }
                    }
                }
                Attribute attribute3 = (Attribute) next3;
                listItemSwitcher5.setSubtitle(attribute3 != null ? attribute3.getTitle() : null);
            }
            final int i14 = 2;
            this.f243487K.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f243479b;

                {
                    this.f243479b = this;
                }

                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    c cVar = this.f243479b;
                    switch (i14) {
                        case 0:
                            int i132 = c.f243480P;
                            cVar.V();
                            break;
                        case 1:
                            int i142 = c.f243480P;
                            cVar.V();
                            break;
                        case 2:
                            int i15 = c.f243480P;
                            cVar.V();
                            break;
                        case 3:
                            int i16 = c.f243480P;
                            cVar.V();
                            break;
                        default:
                            int i17 = c.f243480P;
                            cVar.V();
                            break;
                    }
                }
            });
        }
        if (((aVar == null || (booleanParameter2 = aVar.f243477e) == null) ? null : booleanParameter2.getValue()) != null) {
            D6.G(this.f243485I, true);
            D6.G(this.f243489M, true);
            this.f243489M.setChecked(L.f(aVar.f243477e.getValue(), Boolean.TRUE));
            ListItemSwitcher listItemSwitcher6 = this.f243489M;
            BooleanParameter booleanParameter9 = aVar.f243477e;
            listItemSwitcher6.setTitle(booleanParameter9.getTitle());
            AttributedText subtitle4 = booleanParameter9.getSubtitle();
            if (subtitle4 != null) {
                ListItemSwitcher listItemSwitcher7 = this.f243489M;
                Iterator<T> it4 = subtitle4.getAttributes().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it4.next();
                        if (L.f(((Attribute) next2).getName(), "title")) {
                            break;
                        }
                    }
                }
                Attribute attribute4 = (Attribute) next2;
                listItemSwitcher7.setSubtitle(attribute4 != null ? attribute4.getTitle() : null);
            }
            final int i15 = 3;
            this.f243489M.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f243479b;

                {
                    this.f243479b = this;
                }

                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    c cVar = this.f243479b;
                    switch (i15) {
                        case 0:
                            int i132 = c.f243480P;
                            cVar.V();
                            break;
                        case 1:
                            int i142 = c.f243480P;
                            cVar.V();
                            break;
                        case 2:
                            int i152 = c.f243480P;
                            cVar.V();
                            break;
                        case 3:
                            int i16 = c.f243480P;
                            cVar.V();
                            break;
                        default:
                            int i17 = c.f243480P;
                            cVar.V();
                            break;
                    }
                }
            });
        }
        if (((aVar == null || (booleanParameter = aVar.f243476d) == null) ? null : booleanParameter.getValue()) != null) {
            D6.G(this.f243485I, true);
            D6.G(this.f243490N, true);
            this.f243490N.setChecked(L.f(aVar.f243476d.getValue(), Boolean.TRUE));
            ListItemSwitcher listItemSwitcher8 = this.f243490N;
            BooleanParameter booleanParameter10 = aVar.f243476d;
            listItemSwitcher8.setTitle(booleanParameter10.getTitle());
            AttributedText subtitle5 = booleanParameter10.getSubtitle();
            if (subtitle5 != null) {
                ListItemSwitcher listItemSwitcher9 = this.f243490N;
                Iterator<T> it5 = subtitle5.getAttributes().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it5.next();
                        if (L.f(((Attribute) next).getName(), "title")) {
                            break;
                        }
                    }
                }
                Attribute attribute5 = (Attribute) next;
                listItemSwitcher9.setSubtitle(attribute5 != null ? attribute5.getTitle() : null);
            }
            final int i16 = 4;
            this.f243490N.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.delivery_all_toggles.item.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f243479b;

                {
                    this.f243479b = this;
                }

                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    c cVar = this.f243479b;
                    switch (i16) {
                        case 0:
                            int i132 = c.f243480P;
                            cVar.V();
                            break;
                        case 1:
                            int i142 = c.f243480P;
                            cVar.V();
                            break;
                        case 2:
                            int i152 = c.f243480P;
                            cVar.V();
                            break;
                        case 3:
                            int i162 = c.f243480P;
                            cVar.V();
                            break;
                        default:
                            int i17 = c.f243480P;
                            cVar.V();
                            break;
                    }
                }
            });
        }
        this.f243491O.setText(R.string.delivery_all_toggles_apply_button_label);
        this.f243491O.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 18));
    }

    public final void V() {
        boolean zIsChecked = this.f243486J.isChecked();
        Button button = this.f243491O;
        if (zIsChecked || this.f243487K.isChecked() || this.f243488L.isChecked() || this.f243489M.isChecked() || this.f243490N.isChecked()) {
            D6.k(button);
        } else {
            D6.h(button);
        }
    }
}
