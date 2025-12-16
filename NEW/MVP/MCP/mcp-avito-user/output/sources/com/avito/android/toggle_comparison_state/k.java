package com.avito.android.toggle_comparison_state;

import com.avito.android.toggle_comparison_state.s;
import f90.InterfaceC40258g;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangeComparisonStateUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/toggle_comparison_state/s;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f301615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f301616c;

    public k(p pVar, l lVar) {
        this.f301615b = pVar;
        this.f301616c = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if ((((s) obj) instanceof s.a) && L.f(this.f301615b.f301626b, "9")) {
            InterfaceC40258g interfaceC40258g = this.f301616c.f301618b;
            long epochSecond = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
            if (interfaceC40258g.b() == null) {
                interfaceC40258g.a(epochSecond);
            } else if (interfaceC40258g.c() == null) {
                interfaceC40258g.e(epochSecond);
            }
        }
    }
}
