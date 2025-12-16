package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Sequences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/sequences/t", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class P implements InterfaceC43030m<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f413022a;

    public P(Iterator it) {
        this.f413022a = it;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Iterator<java.lang.Object>] */
    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<Object> iterator() {
        return this.f413022a;
    }
}
