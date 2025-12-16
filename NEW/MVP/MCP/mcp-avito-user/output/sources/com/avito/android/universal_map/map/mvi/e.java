package com.avito.android.universal_map.map.mvi;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UniversalMapBootstrap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersContentChanged;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersContentChanged;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.UniversalMapBootstrap$getBeduinFiltersFormsFlow$1", f = "UniversalMapBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.r<List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Continuation<? super UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f305444q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f305445r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f305446s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f305447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Continuation<? super e> continuation) {
        super(4, continuation);
        this.f305447t = aVar;
    }

    @Override // Y41.r
    public final Object invoke(List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, Continuation<? super UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged> continuation) {
        e eVar = new e(this.f305447t, continuation);
        eVar.f305444q = list;
        eVar.f305445r = list2;
        eVar.f305446s = list3;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = this.f305444q;
        List list2 = this.f305445r;
        List list3 = this.f305446s;
        a aVar = this.f305447t;
        String f103350r = aVar.f305241e.f306242a.getF103350r();
        com.avito.android.universal_map.map_mvi.point_filters.a aVar2 = aVar.f305241e;
        return new UniversalMapInternalAction.FiltersInternalAction.FiltersContentChanged(f103350r, aVar2.f306243b.getF103350r(), aVar2.f306244c.getF103350r(), list, list2, list3);
    }
}
