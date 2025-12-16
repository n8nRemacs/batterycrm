package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.InterfaceC13983a;
import If.C14097b;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaChoosingPurchaseActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LHf/a;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "LHf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13983a, AutotekaChoosingPurchaseInternalAction, Hf.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.i f97133a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChoosingPurchaseDetails f97134b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.choosingProduct.a f97135c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C14097b f97136d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final If.d f97137e;

    @Inject
    public b(@Y61.k com.avito.android.autoteka.data.i iVar, @Y61.k ChoosingPurchaseDetails choosingPurchaseDetails, @Y61.k com.avito.android.autoteka.data.choosingProduct.a aVar, @Y61.k C14097b c14097b, @Y61.k If.d dVar) {
        this.f97133a = iVar;
        this.f97134b = choosingPurchaseDetails;
        this.f97135c = aVar;
        this.f97136d = c14097b;
        this.f97137e = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaChoosingPurchaseInternalAction> b(InterfaceC13983a interfaceC13983a, Hf.c cVar) {
        return C43175k.G(new a(interfaceC13983a, cVar, this, null));
    }
}
