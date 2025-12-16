package com.avito.android.publish.details.adapter.objects.re23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectsPreviewItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/re23/l;", "LHj/c;", "Lcom/avito/android/publish/details/adapter/objects/re23/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends Hj.c implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f233407q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f233408m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f233409n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f233410o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f233411p;

    public l(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.item_education_list_preview_re23_content, aVar);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f233408m = dVar;
        this.f233409n = (LinearLayout) this.f7656e.findViewById(R.id.objects_container);
        this.f233410o = (Button) this.f7656e.findViewById(R.id.add_more_button);
        TextView textView = (TextView) view.findViewById(R.id.fieldset_hint);
        TextView textView2 = (TextView) view.findViewById(R.id.fieldset_title);
        TextView textView3 = (TextView) view.findViewById(R.id.fieldset_description);
        int iF2 = C35835l0.f(R.attr.publish_horizontalPadding, dVar);
        Iterator it = C42756l.f(new TextView[]{textView2, textView, textView3}).iterator();
        while (it.hasNext()) {
            D6.c((TextView) it.next(), Integer.valueOf(iF2), null, Integer.valueOf(iF2), null, 10);
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    public final void KE(int i12, @Y61.k String str, boolean z12, @Y61.l String str2, @Y61.k Y41.a<G0> aVar) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f233408m);
        ViewGroup viewGroup = this.f233409n;
        ListItem listItem = (ListItem) layoutInflaterFrom.inflate(R.layout.item_education_list_preview_re23_item, viewGroup, false);
        listItem.setTitle(str);
        listItem.setSubtitle(str2);
        listItem.setMessage(z12 ? listItem.getContext().getString(R.string.multi_object_element_with_error) : null);
        listItem.setMessageColor(C35835l0.e(R.attr.red600, listItem.getContext()));
        FV.a.a(FV.a.f4720a, (TextView) listItem.findViewById(R.id.item_text_icon), Integer.valueOf(R.attr.textIconArrowForwardIos));
        listItem.setRightAlignment(BaseListItem.Alignment.f179501c);
        listItem.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(1, aVar));
        listItem.setId(i12);
        viewGroup.addView(listItem);
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    public final void clearItems() {
        this.f233409n.removeAllViews();
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    @Y61.k
    public final Context getContext() {
        return this.f233408m;
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    public final void h5(@Y61.k Y41.a<G0> aVar) {
        this.f233411p = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f233411p;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    public final void s(@Y61.k String str) {
        this.f7656e.setTag(str);
    }

    @Override // com.avito.android.publish.details.adapter.objects.re23.k
    public final void vT(@Y61.k String str, boolean z12, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f233410o;
        D6.G(button, z12);
        if (z12) {
            FV.a aVar2 = FV.a.f4720a;
            androidx.appcompat.view.d dVar = this.f233408m;
            int iB2 = y6.b(4);
            aVar2.getClass();
            button.setText(FV.a.i(str, dVar, R.attr.textIconAdd, iB2));
            button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(7, aVar));
            if (this.f233409n.getChildCount() != 0) {
                D6.c(this.f233410o, null, Integer.valueOf(y6.b(12)), null, null, 13);
            }
        }
    }
}
