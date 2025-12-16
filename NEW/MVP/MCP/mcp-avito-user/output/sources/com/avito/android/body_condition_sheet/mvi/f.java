package com.avito.android.body_condition_sheet.mvi;

import Nj.InterfaceC14580a;
import Nj.d;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BodyConditionSheetActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/body_condition_sheet/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LNj/a;", "LNj/b;", "LNj/d;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC14580a, Nj.b, Nj.d> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Nj.b> b(InterfaceC14580a interfaceC14580a, Nj.d dVar) {
        InterfaceC14580a interfaceC14580a2 = interfaceC14580a;
        if (dVar instanceof d.a) {
            return C43175k.w();
        }
        if (interfaceC14580a2 instanceof InterfaceC14580a.e) {
            return C43175k.G(new a(interfaceC14580a2, null));
        }
        if (interfaceC14580a2 instanceof InterfaceC14580a.d) {
            return C43175k.G(new b(interfaceC14580a2, null));
        }
        if (interfaceC14580a2.equals(InterfaceC14580a.c.f11716a)) {
            return C43175k.G(new c(2, null));
        }
        if (interfaceC14580a2.equals(InterfaceC14580a.b.f11715a)) {
            return C43175k.G(new d(2, null));
        }
        if (interfaceC14580a2.equals(InterfaceC14580a.C0756a.f11714a)) {
            return C43175k.G(new e(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
