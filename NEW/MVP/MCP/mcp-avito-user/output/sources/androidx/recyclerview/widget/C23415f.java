package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23415f implements C {

    /* renamed from: b, reason: collision with root package name */
    public final C f54005b;

    /* renamed from: c, reason: collision with root package name */
    public int f54006c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f54007d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f54008e = -1;

    /* renamed from: f, reason: collision with root package name */
    public Object f54009f = null;

    public C23415f(@j.N C c12) {
        this.f54005b = c12;
    }

    public final void a() {
        int i12 = this.f54006c;
        if (i12 == 0) {
            return;
        }
        C c12 = this.f54005b;
        if (i12 == 1) {
            c12.c(this.f54007d, this.f54008e);
        } else if (i12 == 2) {
            c12.b(this.f54007d, this.f54008e);
        } else if (i12 == 3) {
            c12.i(this.f54007d, this.f54008e, this.f54009f);
        }
        this.f54009f = null;
        this.f54006c = 0;
    }

    @Override // androidx.recyclerview.widget.C
    public final void b(int i12, int i13) {
        int i14;
        if (this.f54006c == 2 && (i14 = this.f54007d) >= i12 && i14 <= i12 + i13) {
            this.f54008e += i13;
            this.f54007d = i12;
        } else {
            a();
            this.f54007d = i12;
            this.f54008e = i13;
            this.f54006c = 2;
        }
    }

    @Override // androidx.recyclerview.widget.C
    public final void c(int i12, int i13) {
        int i14;
        if (this.f54006c == 1 && i12 >= (i14 = this.f54007d)) {
            int i15 = this.f54008e;
            if (i12 <= i14 + i15) {
                this.f54008e = i15 + i13;
                this.f54007d = Math.min(i12, i14);
                return;
            }
        }
        a();
        this.f54007d = i12;
        this.f54008e = i13;
        this.f54006c = 1;
    }

    @Override // androidx.recyclerview.widget.C
    public final void d(int i12, int i13) {
        a();
        this.f54005b.d(i12, i13);
    }

    @Override // androidx.recyclerview.widget.C
    public final void i(int i12, int i13, Object obj) {
        int i14;
        int i15;
        int i16;
        if (this.f54006c == 3 && i12 <= (i15 = this.f54008e + (i14 = this.f54007d)) && (i16 = i12 + i13) >= i14 && this.f54009f == obj) {
            this.f54007d = Math.min(i12, i14);
            this.f54008e = Math.max(i15, i16) - this.f54007d;
            return;
        }
        a();
        this.f54007d = i12;
        this.f54008e = i13;
        this.f54009f = obj;
        this.f54006c = 3;
    }
}
