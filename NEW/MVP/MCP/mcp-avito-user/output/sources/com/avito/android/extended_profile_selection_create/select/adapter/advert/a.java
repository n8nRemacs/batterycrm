package com.avito.android.extended_profile_selection_create.select.adapter.advert;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectionAdvertItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/g;", "Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/SelectionAdvertItem;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<g, SelectionAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f152044a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f152045b;

    /* compiled from: SelectionAdvertItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_selection_create.select.adapter.advert.a$a, reason: collision with other inner class name */
    public static final class C4446a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.h f152046l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f152047m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4446a(com.avito.android.server_time.h hVar, Locale locale) {
            super(2);
            this.f152046l = hVar;
            this.f152047m = locale;
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, this.f152046l, this.f152047m);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.server_time.h hVar, @k Locale locale) {
        this.f152044a = cVar;
        this.f152045b = new g.a<>(R.layout.extended_profile_selection_create_advert_item, new C4446a(hVar, locale));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f152044a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f152045b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SelectionAdvertItem;
    }
}
