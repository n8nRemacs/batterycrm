package com.avito.android.search.filter.adapter.switcher_with_hint;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ur.InterfaceC49101b;

/* compiled from: SwitcherWithHintItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/switcher_with_hint/b;", "Lcom/avito/android/search/filter/adapter/switcher_with_hint/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.search.filter.adapter.switcher_with_hint.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f262615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f262616b;

    /* compiled from: SwitcherWithHintItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/search/filter/adapter/switcher_with_hint/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/search/filter/adapter/switcher_with_hint/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f262617l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    /* compiled from: SwitcherWithHintItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/search/filter/adapter/switcher_with_hint/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/search/filter/adapter/switcher_with_hint/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.search.filter.adapter.switcher_with_hint.b$b, reason: collision with other inner class name */
    public static final class C7856b extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7856b f262618l = new C7856b();

        public C7856b() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f262615a = dVar;
        this.f262616b = interfaceC49101b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f262615a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f262616b.c() ? new g.a<>(R.layout.global_switcher_with_hint, a.f262617l) : new g.a<>(R.layout.switcher_with_hint, C7856b.f262618l);
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SwitcherWithHintItem;
    }
}
