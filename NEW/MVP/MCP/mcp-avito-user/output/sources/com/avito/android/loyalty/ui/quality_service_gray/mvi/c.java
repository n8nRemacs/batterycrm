package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rX.AbstractC47609c;
import rX.InterfaceC47607a;

/* compiled from: QualityServiceGrayActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LrX/a;", "Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayInternalAction;", "LrX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC47607a, QualityServiceGrayInternalAction, AbstractC47609c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.quality_service_gray.f f184118a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IW.a f184119b;

    @Inject
    public c(@Y61.k com.avito.android.loyalty.ui.quality_service_gray.f fVar, @Y61.k IW.a aVar) {
        this.f184118a = fVar;
        this.f184119b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<QualityServiceGrayInternalAction> b(InterfaceC47607a interfaceC47607a, AbstractC47609c abstractC47609c) {
        C43210w c43210w;
        InterfaceC47607a interfaceC47607a2 = interfaceC47607a;
        AbstractC47609c abstractC47609c2 = abstractC47609c;
        if (interfaceC47607a2 instanceof InterfaceC47607a.b) {
            return new C43210w(new QualityServiceGrayInternalAction.OpenDeeplink(((InterfaceC47607a.b) interfaceC47607a2).f429856a));
        }
        if (interfaceC47607a2 instanceof InterfaceC47607a.c) {
            return new C43210w(new QualityServiceGrayInternalAction.OpenUrl(((InterfaceC47607a.c) interfaceC47607a2).f429857a));
        }
        if (interfaceC47607a2 instanceof InterfaceC47607a.C12378a) {
            c43210w = new C43210w(QualityServiceGrayInternalAction.NavigateBack.f184127b);
        } else {
            if (!interfaceC47607a2.equals(InterfaceC47607a.d.f429858a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(abstractC47609c2 instanceof AbstractC47609c.b)) {
                return C43175k.G(new a(this.f184118a.a(), null, this.f184119b));
            }
            c43210w = new C43210w(QualityServiceGrayInternalAction.NavigateToMain.f184128b);
        }
        return c43210w;
    }
}
