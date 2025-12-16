package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Dr0.InterfaceC13436a;
import Dr0.i;
import Oi0.C14700d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.konveyor.adapter.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ResizableServiceWidgetBlockBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/f;", "Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/ResizableServiceWidgetBlockItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<f, ResizableServiceWidgetBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f270705a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f270706b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f270707c;

    /* compiled from: ResizableServiceWidgetBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.resizable_service_widget.block.item.a$a, reason: collision with other inner class name */
    public static final class C8067a extends N implements p<ViewGroup, View, f> {
        public C8067a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new f(view, aVar.f270706b, aVar.f270707c);
        }
    }

    @Inject
    public a(@k d dVar, @InterfaceC13436a @k h hVar, @i @k C14700d c14700d) {
        this.f270705a = dVar;
        this.f270706b = hVar;
        this.f270707c = c14700d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270705a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.resizable_service_widget_block, new C8067a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ResizableServiceWidgetBlockItem;
    }
}
