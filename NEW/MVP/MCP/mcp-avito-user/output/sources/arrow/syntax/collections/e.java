package arrow.syntax.collections;

import Y41.l;
import arrow.core.C23694k1;
import arrow.core.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;

/* compiled from: list.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Larrow/core/Y0;", "Lkotlin/S;", "name", "a", "p1", "invoke", "(Larrow/core/Y0;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes10.dex */
final class e extends G implements l<Y0<Object>, Y0<Object>> {
    static {
        new e();
    }

    public e() {
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
    public final Y0<Object> invoke(Y0<Object> y02) {
        return y02;
    }
}
