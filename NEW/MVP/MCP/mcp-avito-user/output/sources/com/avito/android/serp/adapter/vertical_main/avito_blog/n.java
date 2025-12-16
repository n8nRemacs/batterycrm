package com.avito.android.serp.adapter.vertical_main.avito_blog;

import Oi0.C14700d;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBlogItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/n;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/k;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.android.serp.c implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f272644b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14700d f272645c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f272646d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f272647e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f272648f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UV0.c<AvitoBlogArticleItem> f272649g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f272650h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f272651i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final SV.b f272652j;

    public n(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C14700d c14700d) {
        super(view);
        this.f272644b = hVar;
        this.f272645c = c14700d;
        View viewFindViewById = view.findViewById(R.id.avito_blog_widget_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272646d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avito_blog_articles_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f272647e = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f272648f = arrayList;
        this.f272649g = new UV0.c<>(arrayList);
        this.f272650h = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        c14700d.setHasStableIds(true);
        recyclerView.setAdapter(c14700d);
        SV.b bVar = new SV.b(y6.b(24), null, 2, null);
        SV.b bVar2 = this.f272652j;
        if (bVar2 != null) {
            bVar2.b(null);
        }
        bVar.b(recyclerView);
        this.f272652j = bVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.k
    public final void JN(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = this.f272648f;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f272644b.f338510e = this.f272649g;
        C14700d c14700d = this.f272645c;
        c14700d.notifyDataSetChanged();
        if (c14700d.f338513c.getCount() >= 0) {
            this.f272647e.A0(0);
        }
        this.f272651i = (io.reactivex.rxjava3.internal.observers.m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(this.f272650h, this.f272647e, null, null, null, 30).x(new l(this), m.f272643b);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f272651i;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.k
    public final void setTitle(@Y61.k String str) {
        this.f272646d.setText(str);
    }
}
