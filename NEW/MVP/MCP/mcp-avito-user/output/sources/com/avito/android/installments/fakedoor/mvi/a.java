package com.avito.android.installments.fakedoor.mvi;

import TN.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FakedoorActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installments/fakedoor/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LTN/a;", "LTN/b;", "LTN/c;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<TN.a, TN.b, TN.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.installments.fakedoor.e f172562a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f172563b;

    @Inject
    public a(@k com.avito.android.installments.fakedoor.e eVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f172562a = eVar;
        this.f172563b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TN.b> b(TN.a aVar, TN.c cVar) {
        TN.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            b.a.a(this.f172563b, ((a.b) aVar2).f15627a, null, null, 6);
            return C43175k.w();
        }
        if (aVar2 instanceof a.C1068a) {
            return this.f172562a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
