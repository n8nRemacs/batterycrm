package com.avito.android.profile.edit.adapter;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.edit.refactoring.adapter.InterfaceC33337a;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvatarItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/adapter/a;", "LTV0/b;", "Lcom/avito/android/profile/edit/adapter/b;", "Lcom/avito/android/profile/edit/refactoring/adapter/item/AvatarItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<b, AvatarItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33337a f222020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f222021b = new g.a<>(R.layout.edit_profile_avatar, C6717a.f222022l);

    /* compiled from: AvatarItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/edit/adapter/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/edit/adapter/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.edit.adapter.a$a, reason: collision with other inner class name */
    public static final class C6717a extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6717a f222022l = new C6717a();

        public C6717a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    public a(@Y61.k InterfaceC33337a interfaceC33337a) {
        this.f222020a = interfaceC33337a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f222020a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f222021b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AvatarItem;
    }
}
