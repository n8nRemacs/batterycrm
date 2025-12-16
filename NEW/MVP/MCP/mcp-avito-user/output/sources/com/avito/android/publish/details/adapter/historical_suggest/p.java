package com.avito.android.publish.details.adapter.historical_suggest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.akita.view.component.fieldset.Fieldset;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestsRe23View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/historical_suggest/o;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f233280g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f233281b;

    /* renamed from: c, reason: collision with root package name */
    public final Fieldset f233282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, ListItemCheckmark> f233283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f233284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ListItemCheckmark f233285f;

    public p(@Y61.k View view) {
        super(view);
        this.f233281b = view;
        this.f233282c = (Fieldset) view.findViewById(R.id.fieldset);
        this.f233283d = new HashMap<>();
    }

    public final void B80(ListItemCheckmark listItemCheckmark) {
        ListItemCheckmark listItemCheckmark2 = this.f233285f;
        if (listItemCheckmark2 != null) {
            listItemCheckmark2.setChecked(false);
        }
        this.f233285f = listItemCheckmark;
        listItemCheckmark.setChecked(true);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void Ld(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f233281b.getContext());
        Fieldset fieldset = this.f233282c;
        ListItemCheckmark listItemCheckmark = (ListItemCheckmark) layoutInflaterFrom.inflate(R.layout.historical_checkmark_item, (ViewGroup) fieldset, false);
        this.f233283d.put(str, listItemCheckmark);
        listItemCheckmark.setTitle(str2);
        listItemCheckmark.setSubtitle(str3);
        listItemCheckmark.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(this, listItemCheckmark, str, 7));
        fieldset.addView(listItemCheckmark);
        if (z12) {
            B80(listItemCheckmark);
        }
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void O7(@Y61.k String str) {
        ListItemCheckmark listItemCheckmark = this.f233283d.get(str);
        if (listItemCheckmark != null) {
            B80(listItemCheckmark);
        }
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void Yb(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f233284e = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f233284e = null;
        this.f233283d.clear();
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void ja() {
        ListItemCheckmark listItemCheckmark = this.f233285f;
        if (listItemCheckmark != null) {
            listItemCheckmark.setChecked(false);
        }
        this.f233285f = null;
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void setTitle(@Y61.k String str) {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f233281b.getContext(), null, 0, 0, 14, null);
        aVar.getContext().setTheme(R.style.Theme_DesignSystem_Re23);
        I5.a(aVar, str, false);
        aVar.setTextAppearance(C35835l0.j(R.attr.textH50, aVar.getContext()));
        this.f233282c.addView(aVar);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.o
    public final void t7() {
        this.f233282c.removeAllViews();
    }
}
