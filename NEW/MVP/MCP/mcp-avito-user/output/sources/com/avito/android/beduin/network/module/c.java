package com.avito.android.beduin.network.module;

import Ti.InterfaceC15365a;
import Ui.InterfaceC15524c;
import ai.InterfaceC19892b;
import com.avito.android.beduin.common.component.conditional_group.component.Condition;
import com.avito.android.beduin.common.component.conditional_group.component.FalseCondition;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin.network.parse.BeduinPromoBlockModelAdapterFactory;
import com.avito.android.beduin.network.parse.SkipToFieldTypeAdapter;
import com.avito.android.beduin.network.parse.SkipToFieldTypeAndGenModelIdAdapter;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import gi.C40685a;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.InterfaceC42819t;
import vi.InterfaceC49334c;
import wi.InterfaceC49629e;

/* compiled from: BeduinJsonModule_ProvideBeduinTypeAdapterFactoriesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C40685a> f104026a;

    public c(Provider<C40685a> provider) {
        this.f104026a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Class<TabsScreenModel.c> cls;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter;
        C40685a c40685a = this.f104026a.get();
        a.f104024a.getClass();
        SkipToFieldTypeAndGenModelIdAdapter skipToFieldTypeAndGenModelIdAdapter = new SkipToFieldTypeAndGenModelIdAdapter();
        BeduinPromoBlockModelAdapterFactory beduinPromoBlockModelAdapterFactory = new BeduinPromoBlockModelAdapterFactory();
        SkipToFieldTypeAdapter skipToFieldTypeAdapter2 = new SkipToFieldTypeAdapter(BeduinAction.class, "params");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter3 = new SkipToFieldTypeAdapter(DisplayingPredicate.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter4 = new SkipToFieldTypeAdapter(Condition.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter5 = new SkipToFieldTypeAdapter(ParamsSource.class, "value");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter6 = new SkipToFieldTypeAdapter(BeduinModelTransform.class, "params");
        Class<NavigationBarItem> cls2 = NavigationBarItem.class;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter7 = skipToFieldTypeAdapter5;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter8 = new SkipToFieldTypeAdapter(cls2, "content");
        SkipToFieldTypeAdapter skipToFieldTypeAdapter9 = new SkipToFieldTypeAdapter(TabsScreenModel.d.class, "params");
        Class<TabsScreenModel.c> cls3 = TabsScreenModel.c.class;
        SkipToFieldTypeAdapter skipToFieldTypeAdapter10 = new SkipToFieldTypeAdapter(cls3, "params");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, BeduinModel.class);
        Iterator it = c40685a.f396727a.iterator();
        while (true) {
            cls = cls3;
            if (!it.hasNext()) {
                break;
            }
            com.avito.android.beduin.common.component.b bVar = (com.avito.android.beduin.common.component.b) it.next();
            for (String str : bVar.a()) {
                Iterator it2 = it;
                Class<NavigationBarItem> cls4 = cls2;
                if (BeduinPromoBlockModel.class.isAssignableFrom(bVar.S())) {
                    runtimeTypeAdapterFactoryD.b(bVar.S(), str, beduinPromoBlockModelAdapterFactory);
                } else if (com.avito.android.beduin.network.parse.a.class.isAssignableFrom(bVar.S())) {
                    runtimeTypeAdapterFactoryD.b(bVar.S(), str, null);
                } else {
                    runtimeTypeAdapterFactoryD.b(bVar.S(), str, skipToFieldTypeAndGenModelIdAdapter);
                }
                it = it2;
                cls2 = cls4;
            }
            cls3 = cls;
        }
        Class<NavigationBarItem> cls5 = cls2;
        G0 g02 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, BeduinAction.class);
        Iterator it3 = c40685a.f396728b.iterator();
        while (it3.hasNext()) {
            InterfaceC15524c interfaceC15524c = (InterfaceC15524c) it3.next();
            runtimeTypeAdapterFactoryD2.b(interfaceC15524c.getAction(), interfaceC15524c.getF99982c(), skipToFieldTypeAdapter2);
        }
        G0 g03 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD3 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, DisplayingPredicate.class);
        Iterator it4 = c40685a.f396729c.iterator();
        while (it4.hasNext()) {
            InterfaceC19892b interfaceC19892b = (InterfaceC19892b) it4.next();
            Class<? extends DisplayingPredicate> clsA = interfaceC19892b.a();
            if (com.avito.android.beduin.network.parse.b.class.isAssignableFrom(clsA)) {
                runtimeTypeAdapterFactoryD3.b(clsA, interfaceC19892b.getF103304b(), null);
            } else {
                runtimeTypeAdapterFactoryD3.b(clsA, interfaceC19892b.getF103304b(), skipToFieldTypeAdapter3);
            }
        }
        G0 g04 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD4 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, BeduinModelTransform.class);
        Iterator it5 = c40685a.f396730d.iterator();
        while (it5.hasNext()) {
            InterfaceC15365a interfaceC15365a = (InterfaceC15365a) it5.next();
            runtimeTypeAdapterFactoryD4.b(interfaceC15365a.a(), interfaceC15365a.getType(), skipToFieldTypeAdapter6);
        }
        G0 g05 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD5 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, Condition.class);
        runtimeTypeAdapterFactoryD5.f254223f = FalseCondition.class;
        Iterator it6 = c40685a.f396731e.iterator();
        while (it6.hasNext()) {
            com.avito.android.beduin.common.component.conditional_group.component.b bVar2 = (com.avito.android.beduin.common.component.conditional_group.component.b) it6.next();
            Class<? extends Condition> value = bVar2.getValue();
            if (com.avito.android.beduin.network.parse.b.class.isAssignableFrom(value)) {
                runtimeTypeAdapterFactoryD5.b(value, bVar2.getF101055b(), null);
            } else {
                runtimeTypeAdapterFactoryD5.b(value, bVar2.getF101055b(), skipToFieldTypeAdapter4);
            }
        }
        G0 g06 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD6 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, ParamsSource.class);
        Iterator it7 = c40685a.f396732f.iterator();
        while (it7.hasNext()) {
            com.avito.android.beduin.common.component.params_source.a aVar = (com.avito.android.beduin.common.component.params_source.a) it7.next();
            Class<? extends ParamsSource> value2 = aVar.getValue();
            if (aVar.a() != null) {
                runtimeTypeAdapterFactoryD6.b(value2, aVar.getType(), null);
                skipToFieldTypeAdapter = skipToFieldTypeAdapter7;
            } else {
                skipToFieldTypeAdapter = skipToFieldTypeAdapter7;
                runtimeTypeAdapterFactoryD6.b(value2, aVar.getType(), skipToFieldTypeAdapter);
            }
            skipToFieldTypeAdapter7 = skipToFieldTypeAdapter;
        }
        G0 g07 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD7 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, cls5);
        Iterator it8 = c40685a.f396733g.iterator();
        while (it8.hasNext()) {
            com.avito.android.beduin.common.navigation_bar.d dVar = (com.avito.android.beduin.common.navigation_bar.d) it8.next();
            runtimeTypeAdapterFactoryD7.b(dVar.getValue(), dVar.getType(), skipToFieldTypeAdapter8);
        }
        G0 g08 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD8 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, TabsScreenModel.d.class);
        Iterator it9 = c40685a.f396734h.iterator();
        while (it9.hasNext()) {
            InterfaceC49629e interfaceC49629e = (InterfaceC49629e) it9.next();
            runtimeTypeAdapterFactoryD8.b(((InterfaceC42819t) interfaceC49629e.getValue()).f(), interfaceC49629e.getType(), skipToFieldTypeAdapter9);
        }
        G0 g09 = G0.f406611a;
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD9 = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, cls);
        Iterator it10 = c40685a.f396735i.iterator();
        while (it10.hasNext()) {
            InterfaceC49334c interfaceC49334c = (InterfaceC49334c) it10.next();
            runtimeTypeAdapterFactoryD9.b(((InterfaceC42819t) interfaceC49334c.getValue()).f(), interfaceC49334c.getType(), skipToFieldTypeAdapter10);
        }
        G0 g010 = G0.f406611a;
        Set setL0 = C42756l.l0(new RuntimeTypeAdapterFactory[]{runtimeTypeAdapterFactoryD, runtimeTypeAdapterFactoryD2, runtimeTypeAdapterFactoryD3, runtimeTypeAdapterFactoryD4, runtimeTypeAdapterFactoryD5, runtimeTypeAdapterFactoryD6, runtimeTypeAdapterFactoryD7, runtimeTypeAdapterFactoryD8, runtimeTypeAdapterFactoryD9});
        t.d(setL0);
        return setL0;
    }
}
