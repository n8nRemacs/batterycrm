package com.avito.android.serp.adapter.vertical_main.avito_blog;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import Or0.InterfaceC14730a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBlogItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/e;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/k;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/AvitoBlogItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.b<k, AvitoBlogItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f272627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f272628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14698b f272629c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C f272630d;

    /* compiled from: AvitoBlogItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/avito_blog/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, n> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            e eVar = e.this;
            com.avito.konveyor.a aVar = eVar.f272628b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            return new n(view, hVar, new C14700d(hVar, eVar.f272629c, eVar.f272630d));
        }
    }

    @Inject
    public e(@Y61.k i iVar, @InterfaceC14730a @Y61.k com.avito.konveyor.a aVar, @InterfaceC14730a @Y61.k InterfaceC14698b interfaceC14698b, @Y61.k C c12) {
        this.f272627a = iVar;
        this.f272628b = aVar;
        this.f272629c = interfaceC14698b;
        this.f272630d = c12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272627a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.avito_blog_widget, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AvitoBlogItem;
    }
}
