package com.avito.android.publish.edit_advert_request_mvi.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import ee0.InterfaceC40095b;
import ee0.InterfaceC40096c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EditRequestOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lee0/b;", "Lee0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements t<InterfaceC40095b, InterfaceC40096c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40096c b(InterfaceC40095b interfaceC40095b) {
        InterfaceC40095b interfaceC40095b2 = interfaceC40095b;
        if (interfaceC40095b2 instanceof InterfaceC40095b.C11097b) {
            return new InterfaceC40096c.b(((InterfaceC40095b.C11097b) interfaceC40095b2).f395292a);
        }
        if (interfaceC40095b2 instanceof InterfaceC40095b.a) {
            return new InterfaceC40096c.a(((InterfaceC40095b.a) interfaceC40095b2).f395291a);
        }
        if (interfaceC40095b2 instanceof InterfaceC40095b.c) {
            InterfaceC40095b.c cVar = (InterfaceC40095b.c) interfaceC40095b2;
            return new InterfaceC40096c.C11098c(cVar.f395293a, cVar.f395294b);
        }
        if (interfaceC40095b2.equals(InterfaceC40095b.e.f395296a) ? true : interfaceC40095b2 instanceof InterfaceC40095b.f ? true : interfaceC40095b2 instanceof InterfaceC40095b.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
