package arrow.syntax.function;

import kotlin.Metadata;

/* compiled from: currying.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u0006\"\u0004\b\u0007\u0010\u0007\"\u0004\b\b\u0010\b2\u0006\u0010\t\u001a\u00028\u0006H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "R", "p7", "Lkotlin/Function1;", "invoke", "(Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes10.dex */
final class W3 extends kotlin.jvm.internal.N implements Y41.l<Object, Y41.l<Object, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X3 f56499l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56500m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(X3 x32, Object obj) {
        super(1);
        this.f56499l = x32;
        this.f56500m = obj;
    }

    @Override // Y41.l
    public final Y41.l<Object, Object> invoke(Object obj) {
        return new V3(this, obj);
    }
}
