package e11;

import e11.D0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class J0<T extends D0> extends AbstractC39858c1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f394371b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final String f394372c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList<C39913v0<T>> f394373d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final ArrayList<C39882k1> f394374e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final ArrayList<C39882k1> f394375f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final ArrayList<C39882k1> f394376g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public int f394377h = 10;

    /* renamed from: i, reason: collision with root package name */
    public int f394378i = -1;

    public J0(@j.N String str) {
        this.f394372c = str;
        switch (str) {
            case "preroll":
                this.f394371b = 1;
                break;
            case "postroll":
                this.f394371b = 3;
                break;
            case "pauseroll":
                this.f394371b = 4;
                break;
            case "midroll":
                this.f394371b = 2;
                break;
            default:
                this.f394371b = 0;
                break;
        }
    }

    @Override // e11.AbstractC39858c1
    public final int a() {
        return this.f394373d.size();
    }

    public final void b(@j.N C39913v0<T> c39913v0, int i12) {
        ArrayList<C39913v0<T>> arrayList = this.f394373d;
        int size = arrayList.size();
        if (i12 < 0 || i12 > size) {
            return;
        }
        c39913v0.f394873a0 = this.f394371b;
        arrayList.add(i12, c39913v0);
        Iterator<C39882k1> it = this.f394376g.iterator();
        while (it.hasNext()) {
            C39882k1 next = it.next();
            int i13 = next.f394656n;
            if (i13 >= i12) {
                next.b(i13 + 1);
            }
        }
    }

    public final void c(@j.N C39882k1 c39882k1) {
        (c39882k1.f394664v ? this.f394375f : c39882k1.f394663u ? this.f394374e : this.f394376g).add(c39882k1);
    }

    public final void d() {
        this.f394376g.clear();
    }
}
