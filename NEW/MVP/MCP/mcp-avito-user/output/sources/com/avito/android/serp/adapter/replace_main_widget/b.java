package com.avito.android.serp.adapter.replace_main_widget;

import Em0.InterfaceC13506b;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainWidgetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/replace_main_widget/a;", "Lcom/avito/android/serp/adapter/replace_main_widget/ReplaceMainWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<com.avito.android.serp.adapter.replace_main_widget.a, ReplaceMainWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f270680a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13506b f270681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f270682c = new g.a<>(R.layout.replace_main_widget, new a());

    /* compiled from: ReplaceMainWidgetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/replace_main_widget/a;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/replace_main_widget/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.serp.adapter.replace_main_widget.a> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.serp.adapter.replace_main_widget.a invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.serp.adapter.replace_main_widget.a(view, b.this.f270681b);
        }
    }

    @Inject
    public b(@Y61.k j jVar, @Y61.k InterfaceC13506b interfaceC13506b) {
        this.f270680a = jVar;
        this.f270681b = interfaceC13506b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270680a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f270682c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ReplaceMainWidgetItem;
    }
}
