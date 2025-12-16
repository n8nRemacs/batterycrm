package com.avito.android.app.task;

import kotlin.Metadata;
import ru.avito.messenger.k0;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/k0;", "it", "Larrow/core/Y0;", "", "apply", "(Lru/avito/messenger/k0;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class X0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final X0<T, R> f91555b = new X0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        ru.avito.messenger.k0 k0Var = (ru.avito.messenger.k0) obj;
        k0.a aVar = k0Var instanceof k0.a ? (k0.a) k0Var : null;
        return arrow.core.Z0.b(aVar != null ? Long.valueOf(aVar.f431811a) : null);
    }
}
