package com.avito.android.user_advert.advert.items.group.parameter.description;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupParameterDescriptionItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/group/parameter/description/a;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/group/parameter/description/f;", "LDH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<f, DH0.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f309458a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f309459b = new g.a<>(R.layout.part_advert_group_value_description, C9487a.f309460l);

    /* compiled from: GroupParameterDescriptionItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/group/parameter/description/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/group/parameter/description/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.items.group.parameter.description.a$a, reason: collision with other inner class name */
    public static final class C9487a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9487a f309460l = new C9487a();

        public C9487a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f309458a = cVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, DH0.b> a() {
        return this.f309458a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f309459b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof DH0.b;
    }
}
