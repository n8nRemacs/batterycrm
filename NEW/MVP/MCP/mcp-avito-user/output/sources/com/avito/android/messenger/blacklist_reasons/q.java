package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist_reasons.m;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: BlacklistReasonsProvider.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/q;", "Lcom/avito/android/messenger/blacklist_reasons/m;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q extends AbstractC32892c<m.b> implements m {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f186646V;

    /* compiled from: BlacklistReasonsProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/q$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<m.b> {
        public a() {
            throw null;
        }
    }

    /* compiled from: BlacklistReasonsProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/q$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<m.b> {
        public b() {
            throw null;
        }
    }

    public q() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public q(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("BlacklistReasonsProvider", new m.b.a(null, 1, null), interfaceC35745a5, null, new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f186646V = interfaceC47842z;
    }

    @Override // com.avito.android.messenger.blacklist_reasons.m
    public final void J3(boolean z12) {
        le().s(new b(null, null, new r(this, z12), 3, null));
    }
}
