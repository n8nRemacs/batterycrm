package com.avito.android.publish.details.adapter.objects.re23.price_list;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListPreviewRe23ItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/re23/price_list/j;", "LHj/c;", "Lcom/avito/android/publish/details/adapter/objects/re23/price_list/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends Hj.c implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f233426q = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final androidx.appcompat.view.d f233427m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final LinearLayout f233428n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Button f233429o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public Y41.a<G0> f233430p;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.item_price_list_preview_re23_content, aVar);
        this.f233427m = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f233428n = (LinearLayout) this.f7656e.findViewById(R.id.objects_container);
        this.f233429o = (Button) this.f7656e.findViewById(R.id.price_list_preview_button);
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.price_list.i
    public final void Mx(@InterfaceC42150f int i12, @k Y41.a aVar, @k String str) {
        FV.a aVar2 = FV.a.f4720a;
        Button button = this.f233429o;
        Context context = button.getContext();
        int iB2 = y6.b(4);
        aVar2.getClass();
        button.setText(FV.a.i(str, context, i12, iB2));
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(8, aVar));
        D6.c(button, null, Integer.valueOf(y6.b(this.f233428n.getChildCount() != 0 ? 12 : 0)), null, null, 13);
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.price_list.i
    public final void Xb(@k String str, @k String str2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f233427m);
        ViewGroup viewGroup = this.f233428n;
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) layoutInflaterFrom.inflate(R.layout.item_price_list_preview_re23_dotted_text, viewGroup, false);
        descriptionParameterItem.getLeftTextView().setText(str);
        descriptionParameterItem.getRightTextView().setText(str2);
        descriptionParameterItem.setId(descriptionParameterItem.getId());
        viewGroup.addView(descriptionParameterItem);
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.price_list.i
    public final void clearItems() {
        this.f233428n.removeAllViews();
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.price_list.i
    public final void h5(@k Y41.a<G0> aVar) {
        this.f233430p = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f233430p;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.price_list.i
    public final void s(@k String str) {
        this.f7656e.setTag(str);
    }
}
