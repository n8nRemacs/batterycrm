package com.avito.android.messenger;

import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserType;
import ru.avito.messenger.l0;

/* compiled from: MessengerUserIdInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/w;", "localInfo", "Lru/avito/messenger/l0;", "apply", "(Lcom/avito/android/messenger/w;)Lru/avito/messenger/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final O<T, R> f186170b = new O<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        C32574w c32574w = (C32574w) obj;
        String str = c32574w.f197461a;
        if (str == null || str.length() == 0) {
            ru.avito.messenger.l0.f431814O2.getClass();
            return l0.a.f431816b;
        }
        InterfaceC42452c interfaceC42452c = c32574w.f197462b.f405963a;
        if (!kotlin.jvm.internal.L.f(interfaceC42452c.getF405972a(), InterfaceC42451b.C11596b.f405967a)) {
            interfaceC42452c = InterfaceC42452c.b.f405973a;
        }
        if (interfaceC42452c instanceof InterfaceC42452c.a.C11597a) {
            InterfaceC42452c.a.C11597a c11597a = (InterfaceC42452c.a.C11597a) interfaceC42452c;
            return new l0.d(str, c11597a.f405969b, c11597a.f405970c, new MessengerUserType.Employee.Company(c11597a.f405971d));
        }
        if (interfaceC42452c instanceof InterfaceC42452c.a.b) {
            return new l0.e(str);
        }
        if (interfaceC42452c instanceof InterfaceC42452c.b) {
            return new l0.b(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
