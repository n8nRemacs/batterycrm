package defpackage;

/* loaded from: classes.dex */
public final class fc4 extends hc4 {
    public static final fc4 c = new fc4("", 0);
    public static final fc4 d = new fc4("", 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc4(Comparable comparable, int i) {
        super(comparable);
        this.b = i;
    }

    @Override // defpackage.hc4
    /* renamed from: a */
    public int compareTo(hc4 hc4Var) {
        switch (this.b) {
            case 0:
                return hc4Var == this ? 0 : 1;
            case 1:
                return hc4Var == this ? 0 : -1;
            default:
                return super.compareTo(hc4Var);
        }
    }

    @Override // defpackage.hc4
    public final void c(StringBuilder sb) {
        switch (this.b) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.a);
                return;
        }
    }

    @Override // defpackage.hc4, java.lang.Comparable
    public int compareTo(Object obj) {
        switch (this.b) {
            case 0:
                return ((hc4) obj) == this ? 0 : 1;
            case 1:
                return ((hc4) obj) == this ? 0 : -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override // defpackage.hc4
    public final void d(StringBuilder sb) {
        switch (this.b) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.a);
                sb.append(')');
                return;
        }
    }

    @Override // defpackage.hc4
    public Comparable e() {
        switch (this.b) {
            case 0:
                throw new IllegalStateException("range unbounded on this side");
            case 1:
                throw new IllegalStateException("range unbounded on this side");
            default:
                return super.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Comparable, java.lang.Object] */
    @Override // defpackage.hc4
    public final boolean g(Comparable comparable) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            default:
                int i = o7d.c;
                if (this.a.compareTo(comparable) <= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.hc4
    public final int hashCode() {
        switch (this.b) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.a.hashCode();
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.a + "/";
        }
    }
}
