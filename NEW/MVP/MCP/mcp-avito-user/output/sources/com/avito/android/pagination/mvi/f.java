package com.avito.android.pagination.mvi;

import com.avito.android.arch.mvi.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import r50.AbstractC47493a;
import r50.c;
import r50.e;
import r50.f;

/* compiled from: PaginationActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/pagination/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lr50/e;", "Lr50/f;", "Lr50/c;", "Lr50/d;", "_common_pagination_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.a<r50.e, r50.f, r50.c<r50.d>> {
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<r50.f> b(r50.e eVar, r50.c<r50.d> cVar) {
        r50.e eVar2 = eVar;
        r50.c<r50.d> cVar2 = cVar;
        if (cVar2 instanceof c.d) {
            if (L.f(eVar2, e.a.f429607a)) {
                throw null;
            }
            return C43175k.w();
        }
        if (cVar2 instanceof c.C12355c) {
            if (eVar2 instanceof e.d) {
                AbstractC47493a abstractC47493a = ((e.d) eVar2).f429609a;
                throw null;
            }
            if (eVar2 instanceof e.b) {
                throw null;
            }
            return C43175k.w();
        }
        if (!(cVar2 instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar2 instanceof e.C12356e) {
            return new C43210w(new f.C12357f(null));
        }
        if (eVar2 instanceof e.c) {
            new C32953b(cVar2);
            new c(cVar2);
            AbstractC47493a abstractC47493a2 = ((e.c) eVar2).f429608a;
            throw null;
        }
        if (!(eVar2 instanceof e.d)) {
            if (eVar2 instanceof e.b) {
                throw null;
            }
            return C43175k.w();
        }
        new d(cVar2);
        new e(cVar2);
        AbstractC47493a abstractC47493a3 = ((e.d) eVar2).f429609a;
        throw null;
    }
}
