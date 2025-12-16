package ru.rustore.sdk.reactive.observable;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObservableSwitchMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "R", "", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class V extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y<Object, Object>.a f436905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y<Object, Object>.a aVar) {
        super(1);
        this.f436905l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Y<Object, Object>.a aVar = this.f436905l;
        if (!aVar.f436915b.compareAndSet(false, true) || !Y.this.f436911b.compareAndSet(false, true)) {
            return G0.f406611a;
        }
        ru.rustore.sdk.reactive.core.g andSet = aVar.f436914a.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        throw null;
    }
}
