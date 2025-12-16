package com.avito.android.feeds_global;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeedsBlueprintImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feeds_global/b;", "Lcom/avito/android/feeds_global/a;", "_avito_bx-content_widget_feeds-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.feeds_global.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f157919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f157920b = new g.a<>(R.layout.bx_content_widget_feeds_global_layout, a.f157921l);

    /* compiled from: FeedsBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "Lcom/avito/android/feeds_global/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/feeds_global/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f157921l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, D6.s(viewGroup));
        }
    }

    public b(@Y61.k h hVar) {
        this.f157919a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f157919a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f157920b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof f;
    }
}
