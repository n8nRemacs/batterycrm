package com.avito.android.rubricator.list.category.mvi;

import android.os.Parcelable;
import com.avito.android.rubricator.list.category.model.CategoryListArguments;
import com.avito.android.rubricator.list.category.mvi.entity.CategoriesList;
import com.avito.android.rubricator.list.category.mvi.entity.CategoryListState;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import kotlin.collections.C42745f0;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import un0.InterfaceC49081a;

/* compiled from: CategoryListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f255938a;

    /* renamed from: b, reason: collision with root package name */
    public final u f255939b;

    /* renamed from: c, reason: collision with root package name */
    public final b f255940c;

    /* renamed from: d, reason: collision with root package name */
    public final h f255941d;

    /* renamed from: e, reason: collision with root package name */
    public final j f255942e;

    public f(l lVar, u uVar, b bVar, h hVar, j jVar) {
        this.f255938a = lVar;
        this.f255939b = uVar;
        this.f255940c = bVar;
        this.f255941d = hVar;
        this.f255942e = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        CategoryListArguments categoryListArguments = (CategoryListArguments) this.f255938a.f393949a;
        InterfaceC49081a interfaceC49081a = (InterfaceC49081a) this.f255939b.get();
        this.f255940c.getClass();
        a aVar = new a();
        this.f255941d.getClass();
        g gVar = new g();
        this.f255942e.getClass();
        i iVar = new i();
        CategoryListState.f255932g.getClass();
        ArrayList arrayListA = interfaceC49081a.a(categoryListArguments.f255917c);
        Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
        return new d("CategoryList", new CategoryListState(arrayListA, null, C42745f0.O(C43033p.D(C43066x.Q(categoryListArguments.f255916b)), " ", null, null, null, 62), false, "", null), new c(aVar, iVar, gVar));
    }
}
