package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public abstract class uoi implements lh4, yl3 {
    public static String E(long j) {
        long j2 = 1000;
        long j3 = j / j2;
        long jAbs = Math.abs(j - (j2 * j3));
        String str = (j3 != 0 || j >= 0) ? "" : "-";
        if (jAbs == 0) {
            return String.valueOf(j3);
        }
        long j4 = 100;
        long j5 = jAbs % j4;
        if (((int) (j5 + ((((j5 ^ j4) & ((-j5) | j5)) >> 63) & j4))) == 0) {
            return String.format(Locale.US, "%s%d.%d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(jAbs / j4)}, 3));
        }
        long j6 = 10;
        long j7 = jAbs % j6;
        return ((int) (j7 + ((((j7 ^ j6) & ((-j7) | j7)) >> 63) & j6))) == 0 ? String.format(Locale.US, "%s%d.%02d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(jAbs / j6)}, 3)) : String.format(Locale.US, "%s%d.%03d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(jAbs)}, 3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class F(jy7 jy7Var) {
        Class clsA = ((aa3) jy7Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    @Override // defpackage.lh4
    public abstract short A();

    @Override // defpackage.lh4
    public float B() {
        D();
        throw null;
    }

    @Override // defpackage.lh4
    public double C() {
        D();
        throw null;
    }

    public void D() {
        throw new SerializationException(vid.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.yl3
    public lh4 a(f9c f9cVar, int i) {
        return o(f9cVar.i(i));
    }

    @Override // defpackage.lh4
    public boolean b() {
        D();
        throw null;
    }

    @Override // defpackage.lh4
    public char c() {
        D();
        throw null;
    }

    @Override // defpackage.lh4
    public Object d(zy7 zy7Var) {
        return zy7Var.b(this);
    }

    @Override // defpackage.yl3
    public double f(f9c f9cVar, int i) {
        return C();
    }

    @Override // defpackage.yl3
    public char g(f9c f9cVar, int i) {
        return c();
    }

    @Override // defpackage.yl3
    public float h(f9c f9cVar, int i) {
        return B();
    }

    @Override // defpackage.yl3
    public byte i(f9c f9cVar, int i) {
        return z();
    }

    @Override // defpackage.yl3
    public String j(ree reeVar, int i) {
        return q();
    }

    @Override // defpackage.lh4
    public abstract int k();

    @Override // defpackage.yl3
    public short l(f9c f9cVar, int i) {
        return A();
    }

    public void m(ree reeVar) {
    }

    @Override // defpackage.lh4
    public lh4 o(ree reeVar) {
        return this;
    }

    public Object p(ree reeVar, int i, zy7 zy7Var, Object obj) {
        return d(zy7Var);
    }

    @Override // defpackage.lh4
    public String q() {
        D();
        throw null;
    }

    @Override // defpackage.lh4
    public yl3 r(ree reeVar) {
        return this;
    }

    @Override // defpackage.lh4
    public int s(ree reeVar) {
        D();
        throw null;
    }

    @Override // defpackage.lh4
    public abstract long t();

    @Override // defpackage.yl3
    public int u(f9c f9cVar, int i) {
        return k();
    }

    @Override // defpackage.lh4
    public boolean v() {
        return true;
    }

    @Override // defpackage.yl3
    public Object w(ree reeVar, int i, zy7 zy7Var, Object obj) {
        if (zy7Var.d().c() || v()) {
            return d(zy7Var);
        }
        return null;
    }

    @Override // defpackage.yl3
    public long x(f9c f9cVar, int i) {
        return t();
    }

    @Override // defpackage.yl3
    public boolean y(ree reeVar, int i) {
        return b();
    }

    @Override // defpackage.lh4
    public abstract byte z();
}
