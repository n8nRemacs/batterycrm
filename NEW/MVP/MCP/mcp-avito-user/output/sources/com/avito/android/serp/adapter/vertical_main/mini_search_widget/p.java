package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MiniSearchWidgetItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/p;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/o;", "Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p extends com.avito.android.serp.c implements o, a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f273071b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f273072c;

    public p(@Y61.k View view) {
        super(view);
        this.f273071b = new b(view);
        this.f273072c = (TextView) view.findViewById(R.id.mini_search_title);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void GM(boolean z12) {
        this.f273071b.GM(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void K50(@Y61.l AttributedText attributedText) {
        this.f273071b.K50(attributedText);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void KU(int i12, int i13) {
        this.f273071b.KU(i12, 16);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void Qy(int i12, int i13, int i14) {
        this.f273071b.Qy(i12, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void U(@Y61.k Y41.a<G0> aVar) {
        this.f273071b.f273053i = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void hr(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f273071b.f273054j = (N) lVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void mQ(@Y61.l List<MiniSearchWidgetRecentSearches.Item> list) {
        this.f273071b.mQ(list);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.a
    public final void nL(@Y61.l AttributedText attributedText) {
        this.f273071b.nL(attributedText);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mini_search_widget.o
    public final void w(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f273072c, attributedText, null);
    }
}
