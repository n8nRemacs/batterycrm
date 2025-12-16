package ru.avito.messenger.internal;

import k91.C42543a;
import k91.InterfaceC42546d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lk91/d;", "systemEvent", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lk91/d;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final y<T, R> f431807b = new y<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC42546d interfaceC42546d = (InterfaceC42546d) obj;
        Object value = interfaceC42546d.getValue();
        return value instanceof C42543a ? io.reactivex.rxjava3.core.z.X(((C42543a) value).a()) : io.reactivex.rxjava3.core.z.c0(interfaceC42546d);
    }
}
