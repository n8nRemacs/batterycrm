package com.avito.android.personal_filters.filters_change_dialog.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.util.R0;
import e70.InterfaceC39961a;
import g70.InterfaceC40541a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PersonalFiltersChangeDialogActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lg70/a;", "Lg70/b;", "Lg70/d;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC40541a, g70.b, g70.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e70.g f215746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39961a f215747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f215748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f215749d;

    @Inject
    public e(@Y61.k e70.g gVar, @Y61.k InterfaceC39961a interfaceC39961a, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f215746a = gVar;
        this.f215747b = interfaceC39961a;
        this.f215748c = r02;
        this.f215749d = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<g70.b> b(InterfaceC40541a interfaceC40541a, g70.d dVar) {
        InterfaceC40541a interfaceC40541a2 = interfaceC40541a;
        boolean z12 = interfaceC40541a2 instanceof InterfaceC40541a.C11192a;
        R0 r02 = this.f215748c;
        if (z12) {
            return C43175k.I(r02.a(), new C43152f0(C43175k.G(new a(this, interfaceC40541a2, null)), new b(3, null)));
        }
        if (!(interfaceC40541a2 instanceof InterfaceC40541a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(r02.a(), new C43152f0(C43175k.G(new c(this, interfaceC40541a2, null)), new d(3, null)));
    }
}
