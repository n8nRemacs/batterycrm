package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.avito.android.phone_reverification_info.events.PhoneReverificationButtonName;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import w70.C49460a;
import y70.InterfaceC50076a;

/* compiled from: PhoneReverificationInfoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Ly70/a;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Ly70/c;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC50076a, PhoneReverificationInfoInternalAction, y70.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f216147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A70.a f216148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f216149c;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k A70.a aVar, @Y61.k InterfaceC27663a interfaceC27663a) {
        this.f216147a = interfaceC28373a;
        this.f216148b = aVar;
        this.f216149c = interfaceC27663a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhoneReverificationInfoInternalAction> b(InterfaceC50076a interfaceC50076a, y70.c cVar) {
        InterfaceC50076a interfaceC50076a2 = interfaceC50076a;
        y70.c cVar2 = cVar;
        boolean zEquals = interfaceC50076a2.equals(InterfaceC50076a.b.f442944a);
        PhoneReverificationInfo phoneReverificationInfo = cVar2.f442950b;
        InterfaceC28373a interfaceC28373a = this.f216147a;
        if (!zEquals) {
            if (!interfaceC50076a2.equals(InterfaceC50076a.C12887a.f442943a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (phoneReverificationInfo != null) {
                interfaceC28373a.c(new C49460a(phoneReverificationInfo.c(), PhoneReverificationButtonName.f216102e));
            }
            return new C43210w(PhoneReverificationInfoInternalAction.FinishWithCancel.f216162b);
        }
        if (phoneReverificationInfo instanceof PhoneReverificationInfo.Allow) {
            PhoneReverificationInfo.Allow allow = (PhoneReverificationInfo.Allow) phoneReverificationInfo;
            PhoneReverificationButtonName phoneReverificationButtonName = PhoneReverificationButtonName.f216100c;
            allow.getClass();
            interfaceC28373a.c(new C49460a(true, phoneReverificationButtonName));
            return new C43210w(new PhoneReverificationInfoInternalAction.FinishWithSuccess(allow.f216034b));
        }
        if (phoneReverificationInfo instanceof PhoneReverificationInfo.Disallow) {
            return cVar2.f442952d ? C43175k.w() : C43175k.G(new a(this, (PhoneReverificationInfo.Disallow) phoneReverificationInfo, null));
        }
        if (phoneReverificationInfo == null) {
            return C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
