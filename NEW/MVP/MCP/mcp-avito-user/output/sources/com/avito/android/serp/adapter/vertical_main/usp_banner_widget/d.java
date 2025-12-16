package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UspBannersWidgetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/d;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/l;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.b<l, UspBannersWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f273346a;

    /* compiled from: UspBannersWidgetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, UspBannersWidgetViewImpl> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final UspBannersWidgetViewImpl invoke(ViewGroup viewGroup, View view) {
            return new UspBannersWidgetViewImpl(d.this.f273346a, view);
        }
    }

    @Inject
    public d(@Y61.k g gVar) {
        this.f273346a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273346a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.usp_banner_widget, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof UspBannersWidgetItem;
    }
}
