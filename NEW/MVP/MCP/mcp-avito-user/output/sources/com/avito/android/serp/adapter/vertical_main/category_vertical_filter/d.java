package com.avito.android.serp.adapter.vertical_main.category_vertical_filter;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.remote.model.vertical_main.BottomContent;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryVerticalFilterActionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/d;", "Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/a;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.android.serp.c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272656b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TabGroup f272657c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f272658d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f272659e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f272660f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f272661g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f272662h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f272663i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Y41.a<G0> f272664j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e>> f272665k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C41981q0 f272666l;

    public d(@k View view) {
        super(view);
        this.f272656b = view.getContext().getString(R.string.show_items);
        this.f272657c = (TabGroup) view.findViewById(R.id.category_vertical_tabs);
        View viewFindViewById = view.findViewById(R.id.category_vertical_parameters_button_background);
        this.f272658d = viewFindViewById;
        this.f272659e = (TextView) view.findViewById(R.id.category_vertical_parameters_button);
        Button button = (Button) view.findViewById(R.id.category_vertical_filters_button);
        this.f272660f = button;
        this.f272661g = (Button) view.findViewById(R.id.category_vertical_submit_button);
        com.jakewharton.rxrelay3.c<List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f272665k = cVar;
        this.f272666l = new C41981q0(cVar);
        final int i12 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.serp.adapter.vertical_main.category_vertical_filter.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f272654c;

            {
                this.f272654c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f272654c.f272663i;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f272654c.f272664j;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.serp.adapter.vertical_main.category_vertical_filter.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f272654c;

            {
                this.f272654c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f272654c.f272663i;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f272654c.f272664j;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Of(@l String str, boolean z12) {
        boolean z13 = !z12;
        this.f272657c.setEnabled(z13);
        this.f272658d.setEnabled(z13);
        this.f272660f.setEnabled(z13);
        if (str == null) {
            str = this.f272656b;
        }
        this.f272661g.setState(new UU.a(str, null, z13, z12, false, null, null, null, null, false, 1010, null));
    }

    public final void P0(int i12, @k List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (String str : list2) {
            if (str == null) {
                str = "";
            }
            arrayList.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(str), null, false, 6, null));
        }
        this.f272657c.setState(new com.avito.android.lib.design.tab_group.d(arrayList, i12, new c(this)));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void bg(@k View.OnClickListener onClickListener) {
        this.f272661g.setOnClickListener(onClickListener);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f272662h = null;
        this.f272663i = null;
        this.f272664j = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void s1(@k List<com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e> list) {
        this.f272665k.accept(list);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void Sj() {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void AQ(@l StyleBlock styleBlock) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void HW(@k Y41.a aVar) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void OD(@l Integer num) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void YI(@l Integer num) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void c20(@l BottomContent bottomContent, @k Y41.l<? super DeepLink, G0> lVar) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void yM(int i12, int i13) {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.J
    public final void xO(int i12, @k Y41.a aVar, @k String str) {
    }
}
