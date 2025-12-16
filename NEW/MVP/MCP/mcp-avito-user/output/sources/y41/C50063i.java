package y41;

import java.util.Objects;

/* compiled from: UserInterface.java */
/* renamed from: y41.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50063i implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final String f442928b;

    /* renamed from: c, reason: collision with root package name */
    public final String f442929c;

    /* renamed from: d, reason: collision with root package name */
    public final String f442930d;

    /* renamed from: e, reason: collision with root package name */
    public final String f442931e;

    public C50063i(String str, String str2, String str3, String str4) {
        this.f442928b = str;
        this.f442929c = str2;
        this.f442930d = str3;
        this.f442931e = str4;
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "sentry.interfaces.User";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C50063i c50063i = (C50063i) obj;
        return Objects.equals(this.f442928b, c50063i.f442928b) && Objects.equals(this.f442929c, c50063i.f442929c) && Objects.equals(this.f442930d, c50063i.f442930d) && Objects.equals(this.f442931e, c50063i.f442931e);
    }

    public final int hashCode() {
        return Objects.hash(this.f442928b, this.f442929c, this.f442930d, this.f442931e, null);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserInterface{id='");
        sb2.append(this.f442928b);
        sb2.append("', username='");
        sb2.append(this.f442929c);
        sb2.append("', ipAddress='");
        sb2.append(this.f442930d);
        sb2.append("', email='");
        return AK.c.s(sb2, this.f442931e, "', data=null}");
    }

    public C50063i(String str, String str2) {
        this(null, str, str2, null);
    }
}
