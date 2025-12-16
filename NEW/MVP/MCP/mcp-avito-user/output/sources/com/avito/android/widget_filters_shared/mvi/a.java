package com.avito.android.widget_filters_shared.mvi;

import UP0.a;
import UP0.b;
import Y61.k;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WidgetFiltersSharedActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/widget_filters_shared/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUP0/a;", "LUP0/b;", "LUP0/d;", "<init>", "()V", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<UP0.a, UP0.b, UP0.d> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UP0.b> b(UP0.a aVar, UP0.d dVar) {
        UP0.a aVar2 = aVar;
        if (aVar2 instanceof a.C1124a) {
            return new C43210w(new b.a(((a.C1124a) aVar2).f16373a));
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(b.C1125b.f16376a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
