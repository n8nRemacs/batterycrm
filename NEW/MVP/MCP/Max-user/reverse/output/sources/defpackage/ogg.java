package defpackage;

/* loaded from: classes.dex */
public final class ogg implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean d;

    public ogg(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ogg oggVar = (ogg) obj;
        int iCompare = Long.compare(this.b, oggVar.b);
        return iCompare == 0 ? Integer.compare(this.c, oggVar.c) : iCompare;
    }
}
