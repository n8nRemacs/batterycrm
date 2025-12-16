package Fc1;

@androidx.compose.runtime.internal.P
/* loaded from: classes9.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13617g2 f4818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13751v2 f4819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M2 f4820c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C13600e3 f4821d;

    public B1(@Y61.k C13617g2 c13617g2, @Y61.k C13751v2 c13751v2, @Y61.k M2 m22, @Y61.k C13600e3 c13600e3) {
        this.f4818a = c13617g2;
        this.f4819b = c13751v2;
        this.f4820c = m22;
        this.f4821d = c13600e3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b12 = (B1) obj;
        return this.f4818a.equals(b12.f4818a) && this.f4819b.equals(b12.f4819b) && this.f4820c.equals(b12.f4820c) && this.f4821d.equals(b12.f4821d);
    }

    public final int hashCode() {
        return this.f4821d.hashCode() + ((this.f4820c.hashCode() + ((this.f4819b.hashCode() + (this.f4818a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ScreenshotTakeCallbacks(takeClick=" + this.f4818a + ", dismissClick=" + this.f4819b + ", onGloballyPositioned=" + this.f4820c + ", flashDone=" + this.f4821d + ')';
    }
}
