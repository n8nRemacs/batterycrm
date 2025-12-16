package arrow.syntax.collections;

import Y41.l;
import arrow.core.C23694k1;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;

/* compiled from: list.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"L", "R", "Larrow/legacy/a;", "Lkotlin/S;", "name", "a", "p1", "invoke", "(Larrow/legacy/a;)Larrow/legacy/a;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes10.dex */
final class c extends G implements l<arrow.legacy.a<Object, Object>, arrow.legacy.a<Object, Object>> {
    static {
        new c();
    }

    public c() {
        super(1);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    /* renamed from: getName */
    public final String getF407039i() {
        return "identity";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.c(C23694k1.class, "arrow-syntax");
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    public final String getSignature() {
        return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
    }

    @Override // Y41.l
    public final arrow.legacy.a<Object, Object> invoke(arrow.legacy.a<Object, Object> aVar) {
        return aVar;
    }
}
