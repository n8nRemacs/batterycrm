package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/sequences/t", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43034q implements InterfaceC43030m<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RestrictedSuspendLambda f410561a;

    /* JADX WARN: Multi-variable type inference failed */
    public C43034q(Y41.p pVar) {
        this.f410561a = (RestrictedSuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
    @Override // kotlin.sequences.InterfaceC43030m
    public final Iterator<Object> iterator() {
        return C43033p.v(this.f410561a);
    }
}
