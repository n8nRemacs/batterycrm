package com.avito.android.serp.adapter.mini_menu;

import Oi0.InterfaceC14698b;
import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.publish.objects.C33947g;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vr0.InterfaceC49372a;

/* compiled from: MiniMenuBlockBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/b;", "Lcom/avito/android/serp/adapter/mini_menu/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.mini_menu.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f270318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f270319b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14698b f270320c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.l f270321d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C f270322e;

    /* compiled from: MiniMenuBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/mini_menu/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/mini_menu/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new g(view, bVar.f270319b, new C33947g(bVar, 1), bVar.f270321d);
        }
    }

    @Inject
    public b(@Y61.k h hVar, @Y61.k @InterfaceC49372a com.avito.konveyor.adapter.h hVar2, @Y61.k @vr0.i InterfaceC14698b interfaceC14698b, @vr0.c @Y61.k RecyclerView.l lVar, @Y61.k C c12) {
        this.f270318a = hVar;
        this.f270319b = hVar2;
        this.f270320c = interfaceC14698b;
        this.f270321d = lVar;
        this.f270322e = c12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270318a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.mini_menu_block, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof MiniMenuBlockItem;
    }
}
