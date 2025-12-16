package com.avito.android.publish.details.adapter.historical_suggest;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.k0;

/* compiled from: HistoricalSuggestsRe23Blueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/i;", "LTV0/b;", "Lcom/avito/android/publish/details/adapter/historical_suggest/o;", "LJO/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements TV0.b<o, JO.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f233245a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f233246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f233247c = new g.a<>(R.layout.historical_re23_suggests_item, a.f233248l);

    /* compiled from: HistoricalSuggestsRe23Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/details/adapter/historical_suggest/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/details/adapter/historical_suggest/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f233248l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view);
        }
    }

    @Inject
    public i(@Y61.k k kVar, @Y61.k @k0 u3.l<SimpleTestGroupWithNone> lVar) {
        this.f233245a = kVar;
        this.f233246b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f233245a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f233247c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof JO.d) && this.f233246b.f439745a.f439749b.b();
    }
}
