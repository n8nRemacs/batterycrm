package arrow.syntax.function;

import kotlin.Metadata;

/* compiled from: currying.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00060\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"P1", "P2", "P3", "P4", "R", "p2", "Lkotlin/Function1;", "invoke", "(Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes10.dex */
final class B3 extends kotlin.jvm.internal.N implements Y41.l<Object, Y41.l<Object, ? extends Y41.l<Object, Object>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C3 f56313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(C3 c32, Object obj) {
        super(1);
        this.f56313l = c32;
        this.f56314m = obj;
    }

    @Override // Y41.l
    public final Y41.l<Object, ? extends Y41.l<Object, Object>> invoke(Object obj) {
        return new A3(this, obj);
    }
}
