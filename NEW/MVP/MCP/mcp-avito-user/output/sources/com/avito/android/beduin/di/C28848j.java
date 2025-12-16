package com.avito.android.beduin.di;

import bi.C25653b;
import com.avito.android.beduin.common.component.grid_snippet.BeduinGridSnippetModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Provider;
import kotlin.collections.P0;
import kotlin.jvm.internal.t0;

/* compiled from: BeduinComponentFactoryModule_ProvideBeduinComponentItemFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28848j implements dagger.internal.h<InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.p f103935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.beduin.common.component.grid_snippet.g f103936b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Map<Class<? extends BeduinModel>, InterfaceC40113b<? extends BeduinModel, ? extends AbstractC40112a<? extends BeduinModel, ? extends InterfaceC40116e>>>> f103937c;

    public C28848j(dagger.internal.p pVar, com.avito.android.beduin.common.component.grid_snippet.g gVar, Provider provider) {
        this.f103935a = pVar;
        this.f103936b = gVar;
        this.f103937c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map map = (Map) this.f103935a.get();
        com.avito.android.beduin.common.component.grid_snippet.f fVar = (com.avito.android.beduin.common.component.grid_snippet.f) this.f103936b.get();
        Map<Class<? extends BeduinModel>, InterfaceC40113b<? extends BeduinModel, ? extends AbstractC40112a<? extends BeduinModel, ? extends InterfaceC40116e>>> map2 = this.f103937c.get();
        C28847i.f103921a.getClass();
        kotlin.Q q12 = new kotlin.Q(BeduinGridSnippetModel.class, fVar);
        t0 t0Var = new t0(2);
        t0Var.b(P0.o(map).toArray(new kotlin.Q[0]));
        t0Var.a(q12);
        ArrayList<Object> arrayList = t0Var.f406850a;
        return new C25653b(P0.g((kotlin.Q[]) arrayList.toArray(new kotlin.Q[arrayList.size()])), map2);
    }
}
