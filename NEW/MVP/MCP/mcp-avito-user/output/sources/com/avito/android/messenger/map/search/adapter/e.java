package com.avito.android.messenger.map.search.adapter;

import Y61.k;
import Y61.l;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GeoSearchSuggestItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/adapter/e;", "Lcom/avito/android/messenger/map/search/adapter/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f196528b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f196529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f196530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f196531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f196532f;

    public e(@k View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.messenger_geo_search_suggest_item_layout);
        this.f196528b = linearLayout;
        this.f196529c = LayoutInflater.from(linearLayout.getContext());
        this.f196530d = new ArrayList();
        this.f196531e = (int) TypedValue.applyDimension(1, 12.0f, linearLayout.getResources().getDisplayMetrics());
        this.f196532f = (int) TypedValue.applyDimension(1, 19.0f, linearLayout.getResources().getDisplayMetrics());
    }

    @Override // com.avito.android.messenger.map.search.adapter.d
    public final void wk(@k CharSequence charSequence, @l CharSequence charSequence2) {
        ViewGroup viewGroup;
        ArrayList arrayList = this.f196530d;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            viewGroup = this.f196528b;
            if (!zHasNext) {
                break;
            } else {
                viewGroup.removeView((View) it.next());
            }
        }
        arrayList.clear();
        LayoutInflater layoutInflater = this.f196529c;
        if (charSequence2 == null || C43066x.K(charSequence2)) {
            TextView textView = (TextView) layoutInflater.inflate(R.layout.messenger_geo_search_suggest_item_name, viewGroup, false);
            textView.setId(View.generateViewId());
            textView.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i12 = this.f196532f;
            layoutParams.topMargin = i12;
            layoutParams.bottomMargin = i12;
            textView.setLayoutParams(layoutParams);
            textView.setTag("messenger_geo_search_suggest_item_name");
            viewGroup.addView(textView);
            arrayList.add(textView);
            return;
        }
        TextView textView2 = (TextView) layoutInflater.inflate(R.layout.messenger_geo_search_suggest_item_name, viewGroup, false);
        textView2.setId(View.generateViewId());
        textView2.setText(charSequence);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = this.f196531e;
        textView2.setLayoutParams(layoutParams2);
        textView2.setTag("messenger_geo_search_suggest_item_name");
        viewGroup.addView(textView2);
        arrayList.add(textView2);
        TextView textView3 = (TextView) layoutInflater.inflate(R.layout.messenger_geo_search_suggest_item_description, viewGroup, false);
        textView3.setId(View.generateViewId());
        textView3.setText(charSequence2);
        textView3.setTag("messenger_geo_search_suggest_item_description");
        viewGroup.addView(textView3);
        arrayList.add(textView3);
    }

    @Override // com.avito.android.messenger.map.search.adapter.d
    public final void x0(@k View.OnClickListener onClickListener) {
        this.f196528b.setOnClickListener(onClickListener);
    }
}
