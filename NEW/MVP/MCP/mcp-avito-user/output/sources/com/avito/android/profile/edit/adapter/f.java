package com.avito.android.profile.edit.adapter;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/adapter/f;", "LTV0/b;", "Lcom/avito/android/profile/edit/refactoring/adapter/h;", "Lcom/avito/android/profile/edit/refactoring/adapter/item/InputItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements TV0.b<com.avito.android.profile.edit.refactoring.adapter.h, InputItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.edit.refactoring.adapter.l f222031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f222032b = new g.a<>(R.layout.edit_text_single_line, a.f222033l);

    /* compiled from: InputItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/edit/refactoring/adapter/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/edit/refactoring/adapter/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.profile.edit.refactoring.adapter.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f222033l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.profile.edit.refactoring.adapter.i invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.profile.edit.refactoring.adapter.i(view);
        }
    }

    public f(@Y61.k com.avito.android.profile.edit.refactoring.adapter.l lVar) {
        this.f222031a = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f222031a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f222032b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof InputItem;
    }
}
