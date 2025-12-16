package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.k0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/k0;", "connectionState", "", "apply", "(Lru/avito/messenger/k0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C<T, R> f190173b = new C<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(((k0) obj) instanceof k0.b);
    }
}
