package com.avito.android.publish.input_vin.mvi.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.items.ItemWithAdditionalButton;
import javax.inject.Inject;
import kotlin.Metadata;
import ne0.InterfaceC44385b;
import ne0.InterfaceC44386c;

/* compiled from: InputVinMviOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lne0/b;", "Lne0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<InterfaceC44385b, InterfaceC44386c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44386c b(InterfaceC44385b interfaceC44385b) {
        String str;
        InterfaceC44385b interfaceC44385b2 = interfaceC44385b;
        if (interfaceC44385b2 instanceof InterfaceC44385b.a) {
            ItemWithAdditionalButton.AdditionalButton f117488m = ((InterfaceC44385b.a) interfaceC44385b2).f415230a.getF117488m();
            if (f117488m == null || (str = f117488m.f173891c) == null) {
                return null;
            }
            return new InterfaceC44386c.d(Uri.parse(str));
        }
        if (interfaceC44385b2.equals(InterfaceC44385b.C11866b.f415231a) ? true : interfaceC44385b2 instanceof InterfaceC44385b.j) {
            return InterfaceC44386c.C11868c.f415250a;
        }
        if (interfaceC44385b2.equals(InterfaceC44385b.c.f415232a)) {
            return InterfaceC44386c.a.f415248a;
        }
        if (interfaceC44385b2 instanceof InterfaceC44385b.d) {
            return new InterfaceC44386c.i(((InterfaceC44385b.d) interfaceC44385b2).f415233a);
        }
        if (interfaceC44385b2 instanceof InterfaceC44385b.f) {
            return new InterfaceC44386c.h(((InterfaceC44385b.f) interfaceC44385b2).f415235a);
        }
        if (interfaceC44385b2 instanceof InterfaceC44385b.k) {
            return new InterfaceC44386c.e(((InterfaceC44385b.k) interfaceC44385b2).f415241a);
        }
        if (interfaceC44385b2 instanceof InterfaceC44385b.n) {
            InterfaceC44385b.n nVar = (InterfaceC44385b.n) interfaceC44385b2;
            return new InterfaceC44386c.f(nVar.f415246a, nVar.f415247b);
        }
        if (interfaceC44385b2 instanceof InterfaceC44385b.m) {
            InterfaceC44385b.m mVar = (InterfaceC44385b.m) interfaceC44385b2;
            return new InterfaceC44386c.g(mVar.f415243a, mVar.f415244b, mVar.f415245c);
        }
        if (interfaceC44385b2.equals(InterfaceC44385b.e.f415234a) ? true : interfaceC44385b2.equals(InterfaceC44385b.h.a.f415237a) ? true : interfaceC44385b2.equals(InterfaceC44385b.h.C11867b.f415238a)) {
            return InterfaceC44386c.b.f415249a;
        }
        return null;
    }
}
