package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi;

import U3.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity.AutoFlatsTwoColumnDialogInternalAction;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoFlatsTwoColumnDialogActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LU3/a;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "LU3/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<U3.a, AutoFlatsTwoColumnDialogInternalAction, U3.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.i f68708a;

    @Inject
    public a(@Y61.k com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.i iVar) {
        this.f68708a = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutoFlatsTwoColumnDialogInternalAction> b(U3.a aVar, U3.c cVar) {
        U3.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            return this.f68708a.a();
        }
        if (aVar2 instanceof a.C1094a) {
            return new C43210w(AutoFlatsTwoColumnDialogInternalAction.CloseScreen.f68717b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
