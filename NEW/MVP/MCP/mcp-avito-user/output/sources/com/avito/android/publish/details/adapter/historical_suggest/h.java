package com.avito.android.publish.details.adapter.historical_suggest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/details/adapter/historical_suggest/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f233239g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f233240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f233241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, ListItemCheckmark> f233242d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f233243e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ListItemCheckmark f233244f;

    public h(@Y61.k View view) {
        super(view);
        this.f233240b = view;
        this.f233241c = (ComponentContainer) view.findViewById(R.id.container);
        this.f233242d = new HashMap<>();
    }

    public final void B80(ListItemCheckmark listItemCheckmark) {
        ListItemCheckmark listItemCheckmark2 = this.f233244f;
        if (listItemCheckmark2 != null) {
            listItemCheckmark2.setChecked(false);
        }
        this.f233244f = listItemCheckmark;
        listItemCheckmark.setChecked(true);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void Ld(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f233240b.getContext());
        ComponentContainer componentContainer = this.f233241c;
        ListItemCheckmark listItemCheckmark = (ListItemCheckmark) layoutInflaterFrom.inflate(R.layout.historical_checkmark_item, (ViewGroup) componentContainer, false);
        this.f233242d.put(str, listItemCheckmark);
        listItemCheckmark.setTitle(str2);
        listItemCheckmark.setSubtitle(str3);
        listItemCheckmark.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(this, listItemCheckmark, str, 6));
        componentContainer.addView(listItemCheckmark);
        if (z12) {
            B80(listItemCheckmark);
        }
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void O7(@Y61.k String str) {
        ListItemCheckmark listItemCheckmark = this.f233242d.get(str);
        if (listItemCheckmark != null) {
            B80(listItemCheckmark);
        }
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void Yb(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f233243e = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f233243e = null;
        this.f233242d.clear();
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void ja() {
        ListItemCheckmark listItemCheckmark = this.f233244f;
        if (listItemCheckmark != null) {
            listItemCheckmark.setChecked(false);
        }
        this.f233244f = null;
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void setTitle(@Y61.k String str) {
        this.f233241c.setTitle(str);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.g
    public final void t7() {
        this.f233241c.removeAllViews();
    }
}
