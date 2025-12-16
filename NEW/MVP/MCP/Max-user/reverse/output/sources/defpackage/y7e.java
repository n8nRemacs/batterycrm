package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class y7e {
    public final qha a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public y7e(x7e x7eVar) {
        this.a = x7eVar.a;
        this.b = x7eVar.b;
        this.c = x7eVar.c;
        this.d = x7eVar.d;
        this.e = x7eVar.e;
        this.f = x7eVar.f;
        this.g = x7eVar.g;
        this.i = x7eVar.i;
        this.h = x7eVar.h;
        this.j = x7eVar.j;
        this.k = x7eVar.k;
        this.l = x7eVar.l;
        this.m = x7eVar.m;
        this.n = x7eVar.n;
    }

    public final String toString() {
        int iA = zdi.a(this.d);
        int iA2 = zdi.a(this.e);
        int iA3 = zdi.a(this.k);
        int iA4 = zdi.a(this.l);
        int iA5 = zdi.a(this.n);
        StringBuilder sb = new StringBuilder("Section{type=");
        sb.append(this.a);
        sb.append(", id='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', stickers=");
        sb.append(iA);
        sb.append(", stickerSets=");
        sb.append(iA2);
        sb.append(", marker=");
        sb.append(this.g);
        sb.append(", totalCount=");
        sb.append(this.h);
        sb.append(", collapsed=");
        sb.append(this.i);
        az1.r(this.j, ", updateTime=", ", recentEmojiList=", sb);
        hf3.g(sb, iA3, ", recentsList=", iA4, ", animojiSets=");
        sb.append(iA5);
        sb.append(", mode='");
        sb.append(this.m);
        sb.append("'}");
        return sb.toString();
    }
}
