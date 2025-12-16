package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ub0.C49016d;
import ub0.InterfaceC49013a;
import ub0.InterfaceC49014b;

/* compiled from: DeleteDeviceBottomSheetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/delete_device_bottomsheet/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lub0/a;", "Lub0/b;", "Lub0/d;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC49013a, InterfaceC49014b, C49016d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ML.a f227603a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f227604b;

    @Inject
    public c(@Y61.k ML.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f227603a = aVar;
        this.f227604b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC49014b> b(InterfaceC49013a interfaceC49013a, C49016d c49016d) {
        InterfaceC49013a interfaceC49013a2 = interfaceC49013a;
        C49016d c49016d2 = c49016d;
        if (interfaceC49013a2 instanceof InterfaceC49013a.c) {
            return new C43210w(new InterfaceC49014b.d(c49016d2.f440118b));
        }
        if (interfaceC49013a2 instanceof InterfaceC49013a.b) {
            return new C43210w(new InterfaceC49014b.c(((InterfaceC49013a.b) interfaceC49013a2).f440107a));
        }
        if (interfaceC49013a2 instanceof InterfaceC49013a.C12721a) {
            return new C43152f0(C43175k.G(new a(this, c49016d2, null)), new b(3, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
