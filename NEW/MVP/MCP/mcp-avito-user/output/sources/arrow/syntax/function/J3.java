package arrow.syntax.function;

import kotlin.Metadata;

/* compiled from: currying.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"P1", "P2", "P3", "P4", "P5", "P6", "R", "p5", "Lkotlin/Function1;", "invoke", "(Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes10.dex */
final class J3 extends kotlin.jvm.internal.N implements Y41.l<Object, Y41.l<Object, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K3 f56381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56382m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(K3 k32, Object obj) {
        super(1);
        this.f56381l = k32;
        this.f56382m = obj;
    }

    @Override // Y41.l
    public final Y41.l<Object, Object> invoke(Object obj) {
        return new I3(this, obj);
    }
}
