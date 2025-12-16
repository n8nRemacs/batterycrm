package com.avito.android.tariff_lf_constructor.configure.setting.items.total_info;

import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.common.ui.PriceDotsView;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import wD0.C49488b;

/* compiled from: ConstructorSettingTotalInfotemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/total_info/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/items/total_info/k;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f300131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f300132c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PriceDotsView f300133d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PriceDotsView f300134e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PriceDotsView f300135f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PriceDotsView f300136g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f300137h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f300138i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f300139j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f300140k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Y41.a<G0> f300141l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Y41.a<G0> f300142m;

    public b(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f300131b = aVar;
        this.f300132c = (TextView) view.findViewById(R.id.tv_title);
        this.f300133d = (PriceDotsView) view.findViewById(R.id.packages_price_view);
        this.f300134e = (PriceDotsView) view.findViewById(R.id.discount_view);
        this.f300135f = (PriceDotsView) view.findViewById(R.id.level_price_view);
        this.f300136g = (PriceDotsView) view.findViewById(R.id.total_price_view);
        this.f300137h = (TextView) view.findViewById(R.id.tv_bonus);
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view.findViewById(R.id.prolongation_switcher);
        this.f300138i = listItemSwitcher;
        Button button = (Button) view.findViewById(R.id.btn_continue);
        this.f300139j = button;
        this.f300140k = (TextView) view.findViewById(R.id.offer);
        final int i12 = 0;
        listItemSwitcher.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f300130c;

            {
                this.f300130c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar2 = this.f300130c.f300141l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar3 = this.f300130c.f300142m;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f300130c;

            {
                this.f300130c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar2 = this.f300130c.f300141l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar3 = this.f300130c.f300142m;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void C40(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300135f;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void F6(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300134e;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void Fx(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300133d;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void Hv(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f300137h, attributedText, this.f300131b);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void Mu(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300136g;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void OK(@l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f300140k;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, this.f300131b);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void S40(@l C49488b c49488b) {
        G0 g02;
        ListItemSwitcher listItemSwitcher = this.f300138i;
        if (c49488b != null) {
            D6.H(listItemSwitcher);
            listItemSwitcher.setTitle(c49488b.getTitle());
            listItemSwitcher.setChecked(c49488b.getEnabled());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(listItemSwitcher);
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void W50(@Y61.k Y41.a<G0> aVar) {
        this.f300142m = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void c1(@Y61.k String str) {
        this.f300139j.setText(str);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void l70(@Y61.k Y41.a<G0> aVar) {
        this.f300141l = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.k
    public final void setTitle(@Y61.k String str) {
        this.f300132c.setText(str);
    }
}
