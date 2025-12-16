package com.avito.android.verification.verification_status_list.mvi;

import YM0.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StatusListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LYM0/a;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "LYM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<YM0.a, StatusListInternalAction, YM0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325789a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_status_list.g f325790b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f325791c;

    @Inject
    public c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_status_list.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f325789a = aVar;
        this.f325790b = gVar;
        this.f325791c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StatusListInternalAction> b(YM0.a aVar, YM0.b bVar) {
        YM0.a aVar2 = aVar;
        YM0.b bVar2 = bVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(this, aVar2, null));
        }
        if (aVar2 instanceof a.C1376a) {
            return C43175k.G(new b(bVar2, this, aVar2, null));
        }
        boolean zEquals = aVar2.equals(a.c.f19454a);
        com.avito.android.verification.verification_status_list.g gVar = this.f325790b;
        if (zEquals) {
            return gVar.a(false);
        }
        if (aVar2.equals(a.d.f19455a)) {
            return gVar.a(true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
