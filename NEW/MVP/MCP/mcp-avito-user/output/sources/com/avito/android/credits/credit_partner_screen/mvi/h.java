package com.avito.android.credits.credit_partner_screen.mvi;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ys.InterfaceC50287b;
import ys.InterfaceC50288c;

/* compiled from: CreditPartnerOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lys/b;", "Lys/c;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<InterfaceC50287b, InterfaceC50288c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50288c b(InterfaceC50287b interfaceC50287b) {
        InterfaceC50287b interfaceC50287b2 = interfaceC50287b;
        if (interfaceC50287b2 instanceof InterfaceC50287b.g) {
            ValueCallback<Uri[]> valueCallback = ((InterfaceC50287b.g) interfaceC50287b2).f443536a;
            if (valueCallback != null) {
                return new InterfaceC50288c.d(valueCallback);
            }
            return null;
        }
        if (interfaceC50287b2 instanceof InterfaceC50287b.f) {
            return InterfaceC50288c.C12924c.f443539a;
        }
        if (interfaceC50287b2 instanceof InterfaceC50287b.a) {
            return InterfaceC50288c.a.f443537a;
        }
        if (interfaceC50287b2 instanceof InterfaceC50287b.C12923b) {
            return new InterfaceC50288c.b(((InterfaceC50287b.C12923b) interfaceC50287b2).f443531a);
        }
        return null;
    }
}
