package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: Visibility.kt */
/* loaded from: classes8.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f407783a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f407784b;

    public p0(@Y61.k String str, boolean z12) {
        this.f407783a = str;
        this.f407784b = z12;
    }

    @Y61.l
    public Integer a(@Y61.k p0 p0Var) {
        o0.f407771a.getClass();
        if (this == p0Var) {
            return 0;
        }
        kotlin.collections.builders.d dVar = o0.f407772b;
        Integer num = (Integer) dVar.get(this);
        Integer num2 = (Integer) dVar.get(p0Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    @Y61.k
    public String b() {
        return this.f407783a;
    }

    @Y61.k
    public final String toString() {
        return b();
    }

    @Y61.k
    public p0 c() {
        return this;
    }
}
