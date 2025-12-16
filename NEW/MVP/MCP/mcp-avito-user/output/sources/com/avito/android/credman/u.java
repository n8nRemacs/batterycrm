package com.avito.android.credman;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.S;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;

/* compiled from: CredmanRx.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/u;", "Lcom/avito/android/credman/s;", "_avito_credman_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f129117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f129118b;

    @Inject
    public u(@Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f129117a = oVar;
        this.f129118b = interfaceC35745a5;
    }

    @Override // com.avito.android.credman.s
    @Y61.k
    public final S a(@Y61.k String str, @Y61.k String str2) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new t(this, str, str2, null)).s(this.f129118b.e());
    }
}
