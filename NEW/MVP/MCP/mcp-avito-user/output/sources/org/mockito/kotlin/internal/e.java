package org.mockito.kotlin.internal;

import Y61.l;
import e81.InterfaceC39968b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import l81.g;

/* compiled from: SuspendableAnswer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/mockito/kotlin/internal/e;", "T", "Ll81/g;", "mockito-kotlin"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class e<T> implements g<T> {
    @Override // l81.g
    public final Object f(@l InterfaceC39968b interfaceC39968b) {
        Object objQ = C42756l.Q(((org.mockito.internal.invocation.e) interfaceC39968b).f421654e);
        if (objQ == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<T?>");
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
