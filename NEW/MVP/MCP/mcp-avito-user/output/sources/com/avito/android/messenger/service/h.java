package com.avito.android.messenger.service;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.single.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.C0;

/* compiled from: MessengerSessionProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/h;", "Lru/avito/messenger/C0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements C0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f197258a;

    public h(@Y61.k G g12) {
        this.f197258a = g12;
    }

    @Override // ru.avito.messenger.C0
    @Y61.k
    public final B0 a() {
        return this.f197258a.getF68056k().d0(g.f197257b);
    }

    @Override // ru.avito.messenger.C0
    @Y61.k
    public final U d() {
        return this.f197258a.getF68056k().S().r(f.f197256b).u(new C32102w0(3));
    }
}
