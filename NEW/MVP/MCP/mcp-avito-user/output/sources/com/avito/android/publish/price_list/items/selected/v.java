package com.avito.android.publish.price_list.items.selected;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.tag.lines_layout.LinesLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.o6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedPriceListItemsRe23View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/v;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/selected/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class v extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f238745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f238746c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f238747d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f238748e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinesLayout f238749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238750g;

    /* renamed from: h, reason: collision with root package name */
    public int f238751h;

    public v(@Y61.k View view) {
        super(view);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f238745b = dVar;
        View viewFindViewById = view.findViewById(R.id.selected_items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.tag.lines_layout.LinesLayout");
        }
        LinesLayout linesLayout = (LinesLayout) viewFindViewById;
        this.f238749f = linesLayout;
        this.f238751h = 3;
        linesLayout.setDividerSize(dVar.getResources().getDimensionPixelSize(R.dimen.price_list_selected_divider_margin));
        linesLayout.setMaxLines(Integer.MAX_VALUE);
    }

    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void D4(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f238748e = lVar;
    }

    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void Ke(int i12) {
        this.f238751h = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void N3(@Y61.k List<a> list) {
        androidx.appcompat.view.d dVar;
        Q q12;
        LinesLayout linesLayout = this.f238749f;
        linesLayout.removeAllViews();
        int size = this.f238750g ? list.size() : Math.min(list.size(), this.f238751h);
        boolean z12 = true;
        boolean z13 = this.f238750g || (!list.isEmpty() && size < this.f238751h);
        int size2 = list.size() - size;
        if (!this.f238750g && size2 <= 0 && z13) {
            z12 = false;
        }
        int i12 = 0;
        while (true) {
            dVar = this.f238745b;
            if (i12 >= size) {
                break;
            }
            a aVar = list.get(i12);
            Button button = (Button) LayoutInflater.from(dVar).inflate(R.layout.item_selected_price_list_tag_re23, (ViewGroup) linesLayout, false);
            button.setId(aVar.hashCode());
            ((TextView) button.findViewById(R.id.text_view)).setEllipsize(TextUtils.TruncateAt.MIDDLE);
            FV.a aVar2 = FV.a.f4720a;
            String str = aVar.f238711b;
            if (str == null) {
                str = "";
            }
            button.setText(aVar2.e(str, button.getContext(), R.attr.textIconEdit, y6.b(3)));
            button.setTextColor(C35835l0.d(aVar.f238712c ? R.attr.red600 : R.attr.black, button.getContext()));
            button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(24, this, aVar));
            linesLayout.addView(button);
            i12++;
        }
        if (z13) {
            Button button2 = (Button) LayoutInflater.from(dVar).inflate(R.layout.item_selected_price_list_tag_re23, (ViewGroup) linesLayout, false);
            CharSequence charSequenceE = FV.a.f4720a.e(dVar.getString(R.string.price_list_clear_selected_button), dVar, R.attr.textIconClose, y6.b(3));
            o6.f318942a.getClass();
            button2.setId(View.generateViewId());
            button2.setText(charSequenceE);
            button2.setTag("price-list-clear");
            final int i13 = 0;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.price_list.items.selected.u

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v f238744c;

                {
                    this.f238744c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            Y41.a<G0> aVar3 = this.f238744c.f238747d;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                break;
                            }
                            break;
                        default:
                            v vVar = this.f238744c;
                            boolean z14 = !vVar.f238750g;
                            vVar.f238750g = z14;
                            Y41.l<? super Boolean, G0> lVar = vVar.f238748e;
                            if (lVar != null) {
                                lVar.invoke(Boolean.valueOf(z14));
                                break;
                            }
                            break;
                    }
                }
            });
            linesLayout.addView(button2);
        }
        if (z12) {
            Button button3 = (Button) LayoutInflater.from(dVar).inflate(R.layout.item_selected_price_list_tag_re23, (ViewGroup) linesLayout, false);
            if (this.f238750g) {
                q12 = new Q(dVar.getString(R.string.price_list_hide_items_selected_button_re23), Integer.valueOf(R.attr.textIconExpandLess));
            } else {
                q12 = new Q(size2 == 0 ? dVar.getString(R.string.price_list_more_selected_items) : dVar.getResources().getQuantityString(R.plurals.price_list_selected_items_plurals_re23, size2, Integer.valueOf(size2)), Integer.valueOf(R.attr.textIconExpandMore));
            }
            String str2 = (String) q12.f406619b;
            int iIntValue = ((Number) q12.f406620c).intValue();
            o6.f318942a.getClass();
            button3.setId(View.generateViewId());
            button3.setText(FV.a.f4720a.e(str2, button3.getContext(), iIntValue, y6.b(3)));
            final int i14 = 1;
            button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.publish.price_list.items.selected.u

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v f238744c;

                {
                    this.f238744c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            Y41.a<G0> aVar3 = this.f238744c.f238747d;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                break;
                            }
                            break;
                        default:
                            v vVar = this.f238744c;
                            boolean z14 = !vVar.f238750g;
                            vVar.f238750g = z14;
                            Y41.l<? super Boolean, G0> lVar = vVar.f238748e;
                            if (lVar != null) {
                                lVar.invoke(Boolean.valueOf(z14));
                                break;
                            }
                            break;
                    }
                }
            });
            linesLayout.addView(button3);
        }
    }

    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void eM(@Y61.k Y41.a<G0> aVar) {
        this.f238747d = aVar;
    }

    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void lc(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f238746c = lVar;
    }

    @Override // com.avito.android.publish.price_list.items.selected.r
    public final void n3(boolean z12) {
        this.f238750g = z12;
    }
}
