package com.avito.android.developments_advice.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import com.avito.android.remote.model.ConsultationFormData;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mw.C44146c;
import mw.InterfaceC44144a;

/* compiled from: DevelopmentsAdviceActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_advice/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lmw/a;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lmw/c;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC44144a, DevelopmentsAdviceInternalAction, C44146c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_advice.data.a f136162a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ConsultationFormData f136163b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f136164c;

    @Inject
    public f(@Y61.k com.avito.android.developments_advice.data.a aVar, @Y61.l ConsultationFormData consultationFormData, @Y61.l @Named("mcid") String str) {
        this.f136162a = aVar;
        this.f136163b = consultationFormData;
        this.f136164c = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DevelopmentsAdviceInternalAction> b(InterfaceC44144a interfaceC44144a, C44146c c44146c) {
        InterfaceC44144a interfaceC44144a2 = interfaceC44144a;
        C44146c c44146c2 = c44146c;
        if (interfaceC44144a2 instanceof InterfaceC44144a.e) {
            return C43175k.G(new a(interfaceC44144a2, this, null));
        }
        if (interfaceC44144a2 instanceof InterfaceC44144a.C11848a) {
            return C43175k.G(new b(interfaceC44144a2, c44146c2, this, null));
        }
        if (interfaceC44144a2 instanceof InterfaceC44144a.d) {
            return C43175k.G(new c(interfaceC44144a2, null));
        }
        if (interfaceC44144a2 instanceof InterfaceC44144a.c) {
            return C43175k.G(new d(interfaceC44144a2, null));
        }
        if (interfaceC44144a2.equals(InterfaceC44144a.b.f414804a)) {
            return C43175k.G(new e(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ f(com.avito.android.developments_advice.data.a aVar, ConsultationFormData consultationFormData, String str, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : consultationFormData, str);
    }
}
