package com.avito.android.publish.edit_advert_request_mvi.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import ee0.C40097d;
import ee0.InterfaceC40095b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditRequestReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lee0/b;", "Lee0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements u<InterfaceC40095b, C40097d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40097d a(InterfaceC40095b interfaceC40095b, C40097d c40097d) {
        InterfaceC40095b interfaceC40095b2 = interfaceC40095b;
        C40097d c40097d2 = c40097d;
        if (interfaceC40095b2.equals(InterfaceC40095b.e.f395296a)) {
            return C40097d.a(c40097d2, true, null, null, 4);
        }
        if (interfaceC40095b2 instanceof InterfaceC40095b.d) {
            return C40097d.a(c40097d2, false, ((InterfaceC40095b.d) interfaceC40095b2).f395295a, null, 4);
        }
        if (interfaceC40095b2 instanceof InterfaceC40095b.f) {
            return C40097d.a(c40097d2, false, null, ((InterfaceC40095b.f) interfaceC40095b2).f395297a, 3);
        }
        if (interfaceC40095b2 instanceof InterfaceC40095b.a ? true : interfaceC40095b2 instanceof InterfaceC40095b.C11097b ? true : interfaceC40095b2 instanceof InterfaceC40095b.c) {
            return c40097d2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
