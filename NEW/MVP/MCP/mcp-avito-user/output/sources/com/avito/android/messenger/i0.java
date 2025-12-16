package com.avito.android.messenger;

import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: MessengerUserIdInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i0 {
    public static final MessengerUserHashInfo a(C32574w c32574w) {
        MessengerUserType company;
        String str = c32574w.f197461a;
        if (ru.avito.messenger.o0.a(str)) {
            InterfaceC42452c interfaceC42452c = c32574w.f197462b.f405963a;
            if (!kotlin.jvm.internal.L.f(interfaceC42452c.getF405972a(), InterfaceC42451b.C11596b.f405967a)) {
                interfaceC42452c = InterfaceC42452c.b.f405973a;
            }
            if (interfaceC42452c instanceof InterfaceC42452c.a.C11597a) {
                company = new MessengerUserType.Employee.Company(((InterfaceC42452c.a.C11597a) interfaceC42452c).f405971d);
            } else if (interfaceC42452c instanceof InterfaceC42452c.a.b) {
                company = MessengerUserType.Employee.Personal.f430685b;
            } else {
                if (!(interfaceC42452c instanceof InterfaceC42452c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                company = MessengerUserType.Default.f430683b;
            }
        } else {
            company = MessengerUserType.Default.f430683b;
        }
        return new MessengerUserHashInfo(str, company);
    }
}
