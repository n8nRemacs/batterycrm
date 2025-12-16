package u3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TestGroupWithClientExposure.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lu3/m;", "T", "Lu3/i;", "Lu3/n;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m<T> implements i<T>, n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final C48781e f439748a;

    /* renamed from: b, reason: collision with root package name */
    public final T f439749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Object f439750c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f439751d;

    public m(@Y61.l C48781e c48781e, T t12, @Y61.l Object obj, @Y61.k String str) {
        this.f439748a = c48781e;
        this.f439749b = t12;
        this.f439750c = obj;
        this.f439751d = str;
    }

    @Override // u3.InterfaceC48779c
    public final T a() {
        return this.f439749b;
    }

    public /* synthetic */ m(C48781e c48781e, Object obj, Object obj2, String str, int i12, C42822w c42822w) {
        this(c48781e, obj, (i12 & 4) != 0 ? null : obj2, (i12 & 8) != 0 ? "" : str);
    }
}
