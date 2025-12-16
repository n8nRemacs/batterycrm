package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.C0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistoricalSuggestsNewBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/b;", "LTV0/b;", "Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/i;", "Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<i, k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f233256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.historical_suggests.provider.a f233257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f233258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f233259d = new g.a<>(R.layout.historical_new_suggests_item, new a());

    /* compiled from: HistoricalSuggestsNewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, new com.avito.android.publish.details.adapter.historical_suggest.new_suggest.a(b.this));
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k com.avito.android.historical_suggests.provider.a aVar, @Y61.k C0 c02) {
        this.f233256a = dVar;
        this.f233257b = aVar;
        this.f233258c = c02;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f233256a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f233259d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof k;
    }
}
