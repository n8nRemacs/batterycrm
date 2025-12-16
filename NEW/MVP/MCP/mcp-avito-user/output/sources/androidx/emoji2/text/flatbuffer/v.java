package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public int f46104a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f46105b;

    /* renamed from: c, reason: collision with root package name */
    public int f46106c;

    /* renamed from: d, reason: collision with root package name */
    public int f46107d;

    public v() {
        if (x.f46108a == null) {
            x.f46108a = new A();
        }
    }

    public final int a(int i12) {
        if (i12 < this.f46107d) {
            return this.f46105b.getShort(this.f46106c + i12);
        }
        return 0;
    }
}
