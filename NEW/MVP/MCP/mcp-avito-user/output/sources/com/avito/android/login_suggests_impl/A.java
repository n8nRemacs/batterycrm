package com.avito.android.login_suggests_impl;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/A;", "Lcom/avito/android/login_suggests_impl/z;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f182846a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f182847b;

    public A(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f182846a = view;
        View viewFindViewById = view.findViewById(R.id.login_suggests_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar);
        this.f182847b = jVar;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }
}
