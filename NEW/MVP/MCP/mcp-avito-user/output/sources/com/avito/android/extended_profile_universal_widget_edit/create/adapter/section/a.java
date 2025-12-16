package com.avito.android.extended_profile_universal_widget_edit.create.adapter.section;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalWidgetCreateSectionItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/g;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/UniversalWidgetCreateSectionItem;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<g, UniversalWidgetCreateSectionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f153683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f153684b = new g.a<>(R.layout.universal_widget_create_section_item, C4481a.f153685l);

    /* compiled from: UniversalWidgetCreateSectionItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.a$a, reason: collision with other inner class name */
    public static final class C4481a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4481a f153685l = new C4481a();

        public C4481a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f153683a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f153683a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f153684b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof UniversalWidgetCreateSectionItem;
    }
}
