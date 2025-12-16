package com.avito.android.edit_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import jy.InterfaceC42444b;
import jy.InterfaceC42445c;
import kotlin.Metadata;

/* compiled from: EditAddressOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_address/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Ljy/b;", "Ljy/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<InterfaceC42444b, InterfaceC42445c> {
    @Inject
    public h() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42445c b(InterfaceC42444b interfaceC42444b) {
        InterfaceC42445c aVar;
        InterfaceC42444b interfaceC42444b2 = interfaceC42444b;
        if (interfaceC42444b2 instanceof InterfaceC42444b.f) {
            return InterfaceC42445c.C11593c.f405927a;
        }
        if (interfaceC42444b2 instanceof InterfaceC42444b.k) {
            InterfaceC42444b.k kVar = (InterfaceC42444b.k) interfaceC42444b2;
            aVar = new InterfaceC42445c.d(kVar.f405912a, kVar.f405913b, kVar.f405914c);
        } else if (interfaceC42444b2 instanceof InterfaceC42444b.l) {
            InterfaceC42444b.l lVar = (InterfaceC42444b.l) interfaceC42444b2;
            aVar = new InterfaceC42445c.b(lVar.f405915a, lVar.f405916b, lVar.f405917c);
        } else if (interfaceC42444b2 instanceof InterfaceC42444b.m) {
            aVar = new InterfaceC42445c.e(((InterfaceC42444b.m) interfaceC42444b2).f405918a);
        } else if (interfaceC42444b2 instanceof InterfaceC42444b.n) {
            aVar = new InterfaceC42445c.f(((InterfaceC42444b.n) interfaceC42444b2).f405919a);
        } else {
            if (!(interfaceC42444b2 instanceof InterfaceC42444b.d)) {
                return null;
            }
            aVar = new InterfaceC42445c.a(((InterfaceC42444b.d) interfaceC42444b2).f405904a);
        }
        return aVar;
    }
}
