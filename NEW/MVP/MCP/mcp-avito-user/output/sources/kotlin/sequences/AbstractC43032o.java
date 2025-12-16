package kotlin.sequences;

import java.util.Iterator;
import kotlin.G0;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SequenceBuilder.kt */
@RestrictsSuspension
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/sequences/o;", "T", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.sequences.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43032o<T> {
    @Y61.l
    public abstract Object a(T t12, @Y61.k Continuation<? super G0> continuation);

    @Y61.l
    public abstract Object b(@Y61.k Iterator it, @Y61.k RestrictedSuspendLambda restrictedSuspendLambda);
}
