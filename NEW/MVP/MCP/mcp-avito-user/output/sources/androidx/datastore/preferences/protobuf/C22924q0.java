package androidx.datastore.preferences.protobuf;

/* compiled from: LazyFieldLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22924q0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile F0 f45912a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AbstractC22934w f45913b;

    static {
        T.a();
    }

    public final F0 a(F0 f02) {
        if (this.f45912a == null) {
            synchronized (this) {
                if (this.f45912a == null) {
                    try {
                        this.f45912a = f02;
                        this.f45913b = AbstractC22934w.f45925c;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f45912a = f02;
                        this.f45913b = AbstractC22934w.f45925c;
                    }
                }
            }
        }
        return this.f45912a;
    }

    public final AbstractC22934w b() {
        if (this.f45913b != null) {
            return this.f45913b;
        }
        synchronized (this) {
            try {
                if (this.f45913b != null) {
                    return this.f45913b;
                }
                if (this.f45912a == null) {
                    this.f45913b = AbstractC22934w.f45925c;
                } else {
                    this.f45913b = this.f45912a.toByteString();
                }
                return this.f45913b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22924q0)) {
            return false;
        }
        C22924q0 c22924q0 = (C22924q0) obj;
        F0 f02 = this.f45912a;
        F0 f03 = c22924q0.f45912a;
        return (f02 == null && f03 == null) ? b().equals(c22924q0.b()) : (f02 == null || f03 == null) ? f02 != null ? f02.equals(c22924q0.a(f02.a())) : a(f03.a()).equals(f03) : f02.equals(f03);
    }

    public int hashCode() {
        return 1;
    }
}
