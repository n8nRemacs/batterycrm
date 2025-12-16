package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ThrowingCaller.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f407134a = new i();

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final List<Type> a() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.l
    public final Object call(@Y61.k Object[] objArr) {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final Type getReturnType() {
        return Void.TYPE;
    }
}
