package com.avito.android.beduin.common.actionhandler.option_selector;

import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Selector.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/a;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/actionhandler/option_selector/konveyor/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<com.avito.android.beduin.common.actionhandler.option_selector.konveyor.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f100302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f100302l = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.beduin.common.actionhandler.option_selector.konveyor.a aVar) {
        b bVar = new b(aVar);
        d dVar = this.f100302l;
        com.avito.konveyor.adapter.h hVar = dVar.f100306H;
        List<OpenOptionSelectorAction.Option> list = dVar.f100304F;
        hVar.f338510e = new UV0.c(d.V(bVar, list));
        dVar.f100307I.notifyDataSetChanged();
        dVar.r();
        for (Object obj : list) {
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                ((g) dVar.f100305G).invoke(obj);
                return G0.f406611a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
