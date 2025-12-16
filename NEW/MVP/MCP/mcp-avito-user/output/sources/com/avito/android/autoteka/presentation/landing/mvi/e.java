package com.avito.android.autoteka.presentation.landing.mvi;

import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import com.avito.android.beduin_models.BeduinModel;
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
import lj.InterfaceC43779a;

/* compiled from: AutotekaLandingBootstrap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentChanged;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentChanged;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.landing.mvi.AutotekaLandingBootstrap$formContentChangedFlow$3", f = "AutotekaLandingBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements Y41.r<List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Continuation<? super AutotekaLandingInternalAction.ContentChanged>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f97339q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f97340r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f97341s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f97342t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f97343u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43779a f97344v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC43779a interfaceC43779a, InterfaceC43779a interfaceC43779a2, InterfaceC43779a interfaceC43779a3, Continuation<? super e> continuation) {
        super(4, continuation);
        this.f97342t = interfaceC43779a;
        this.f97343u = interfaceC43779a2;
        this.f97344v = interfaceC43779a3;
    }

    @Override // Y41.r
    public final Object invoke(List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, Continuation<? super AutotekaLandingInternalAction.ContentChanged> continuation) {
        e eVar = new e(this.f97342t, this.f97343u, this.f97344v, continuation);
        eVar.f97339q = list;
        eVar.f97340r = list2;
        eVar.f97341s = list3;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new AutotekaLandingInternalAction.ContentChanged(this.f97342t.getF103350r(), this.f97339q, this.f97343u.getF103350r(), this.f97340r, this.f97344v.getF103350r(), this.f97341s);
    }
}
