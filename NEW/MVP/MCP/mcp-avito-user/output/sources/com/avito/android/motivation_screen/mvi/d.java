package com.avito.android.motivation_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import v20.AbstractC49150a;
import v20.C49152c;

/* compiled from: MotivationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/motivation_screen/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lv20/a;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "Lv20/c;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.a<AbstractC49150a, MotivationInternalAction, C49152c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f206350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f206351b;

    @Inject
    public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k o oVar) {
        this.f206350a = aVar;
        this.f206351b = oVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MotivationInternalAction> b(AbstractC49150a abstractC49150a, C49152c c49152c) {
        return C43175k.G(new c(abstractC49150a, this, null));
    }
}
