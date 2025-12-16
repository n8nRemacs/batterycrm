package com.avito.android.auto_select.booking.mvi;

import af.InterfaceC19879a;
import androidx.compose.runtime.internal.P;
import cf.InterfaceC27184a;
import cf.InterfaceC27185b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kf.InterfaceC42678a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoSelectBookingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_select/booking/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lcf/a;", "Lcf/b;", "Lcf/d;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC27184a, InterfaceC27185b, cf.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19879a f95837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42678a f95838b;

    @Inject
    public b(@Y61.k InterfaceC19879a interfaceC19879a, @Y61.k InterfaceC42678a interfaceC42678a) {
        this.f95837a = interfaceC19879a;
        this.f95838b = interfaceC42678a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC27185b> b(InterfaceC27184a interfaceC27184a, cf.d dVar) {
        String str;
        InterfaceC27184a interfaceC27184a2 = interfaceC27184a;
        boolean z12 = interfaceC27184a2 instanceof InterfaceC27184a.C2052a;
        InterfaceC42678a interfaceC42678a = this.f95838b;
        if (z12) {
            InterfaceC27184a.C2052a c2052a = (InterfaceC27184a.C2052a) interfaceC27184a2;
            String str2 = c2052a.f58063a;
            InterfaceC43160i<InterfaceC27185b> interfaceC43160iA = this.f95837a.a(str2);
            interfaceC42678a.b(str2, c2052a.f58064b);
            return interfaceC43160iA;
        }
        if (!(interfaceC27184a2 instanceof InterfaceC27184a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC43160i<InterfaceC27185b> interfaceC43160iG = C43175k.G(new a(interfaceC27184a2, null));
        InterfaceC27184a.b bVar = (InterfaceC27184a.b) interfaceC27184a2;
        String str3 = bVar.f58065a;
        if (str3 == null || (str = bVar.f58066b) == null) {
            return interfaceC43160iG;
        }
        interfaceC42678a.b(str3, str);
        return interfaceC43160iG;
    }
}
