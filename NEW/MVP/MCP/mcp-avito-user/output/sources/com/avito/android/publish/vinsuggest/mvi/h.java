package com.avito.android.publish.vinsuggest.mvi;

import If0.InterfaceC14100b;
import If0.InterfaceC14101c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VinSuggestOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/vinsuggest/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LIf0/b;", "LIf0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<InterfaceC14100b, InterfaceC14101c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14101c b(InterfaceC14100b interfaceC14100b) {
        InterfaceC14100b interfaceC14100b2 = interfaceC14100b;
        if (interfaceC14100b2 instanceof InterfaceC14100b.c ? true : interfaceC14100b2 instanceof InterfaceC14100b.C0481b) {
            return InterfaceC14101c.b.f8472a;
        }
        if (interfaceC14100b2 instanceof InterfaceC14100b.e) {
            return InterfaceC14101c.C0482c.f8473a;
        }
        if (interfaceC14100b2 instanceof InterfaceC14100b.a ? true : interfaceC14100b2 instanceof InterfaceC14100b.d) {
            return InterfaceC14101c.a.f8471a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
