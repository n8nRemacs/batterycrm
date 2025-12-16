package com.avito.android.serp.adapter.empty_placeholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.empty_placeholder.l;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyPlaceholderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/m;", "Lcom/avito/android/serp/adapter/empty_placeholder/l;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f269917g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f269918b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f269919c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f269920d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f269921e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f269922f;

    public m(@Y61.k View view) {
        super(view);
        this.f269918b = (TextView) view.findViewById(R.id.title);
        this.f269919c = (TextView) view.findViewById(R.id.subtitle);
        this.f269920d = (LinearLayout) view.findViewById(R.id.actions_container);
        this.f269921e = new ArrayList();
        this.f269922f = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.serp.adapter.empty_placeholder.l
    public final void f(@Y61.k String str) {
        I5.a(this.f269919c, str, false);
    }

    @Override // com.avito.android.serp.adapter.empty_placeholder.l
    public final void h2(@Y61.k List<l.a> list) {
        int iJ2;
        int size;
        ArrayList arrayList = this.f269921e;
        int size2 = arrayList.size();
        ArrayList arrayList2 = (ArrayList) list;
        int size3 = arrayList2.size();
        LinearLayout linearLayout = this.f269920d;
        if (size2 < size3) {
            int size4 = arrayList2.size();
            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                View viewInflate = this.f269922f.inflate(R.layout.advert_item_empty_button, (ViewGroup) linearLayout, false);
                arrayList.add((TextView) viewInflate);
                linearLayout.addView(viewInflate);
            }
        }
        if (arrayList2.size() < arrayList.size() && (size = arrayList2.size()) <= (iJ2 = C42745f0.J(arrayList))) {
            while (true) {
                linearLayout.removeView((TextView) arrayList.remove(iJ2));
                if (iJ2 == size) {
                    break;
                } else {
                    iJ2--;
                }
            }
        }
        int size6 = arrayList2.size();
        for (int i12 = 0; i12 < size6; i12++) {
            TextView textView = (TextView) arrayList.get(i12);
            l.a aVar = (l.a) arrayList2.get(i12);
            textView.setText(aVar.f269915a);
            textView.setOnClickListener(new com.avito.android.review_gallery.g(aVar, 22));
        }
    }

    @Override // com.avito.android.serp.adapter.empty_placeholder.l
    public final void setTitle(@Y61.k String str) {
        this.f269918b.setText(str);
    }
}
