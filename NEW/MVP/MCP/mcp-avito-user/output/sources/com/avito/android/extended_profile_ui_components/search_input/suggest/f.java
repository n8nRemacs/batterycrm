package com.avito.android.extended_profile_ui_components.search_input.suggest;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/f;", "LTV0/b;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/l;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/SuggestItem;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.b<l, SuggestItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f153447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f153448b = new g.a<>(R.layout.extended_profile_serp_suggest_item, a.f153449l);

    /* compiled from: SuggestItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_ui_components/search_input/suggest/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f153449l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view);
        }
    }

    @Inject
    public f(@Y61.k h hVar) {
        this.f153447a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f153447a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f153448b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SuggestItem;
    }
}
