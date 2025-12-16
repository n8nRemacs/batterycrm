package com.avito.android.extended_profile_widgets.adapter.header;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/header/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/header/j;", "Lcom/avito/android/extended_profile_widgets/adapter/header/HeaderItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<j, HeaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f154430a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f154431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f154432c = new g.a<>(R.layout.extended_profile_header_item, new C4515a());

    /* compiled from: HeaderItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/header/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/header/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.header.a$a, reason: collision with other inner class name */
    public static final class C4515a extends N implements p<ViewGroup, View, l> {
        public C4515a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, a.this.f154431b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, boolean z12) {
        this.f154430a = cVar;
        this.f154431b = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154430a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f154432c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof HeaderItem;
    }
}
