package y41;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MessageInterface.java */
/* renamed from: y41.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50058d implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final String f442914b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f442915c;

    /* renamed from: d, reason: collision with root package name */
    public final String f442916d;

    public C50058d() {
        throw null;
    }

    public C50058d(String str, List<String> list, String str2) {
        this.f442914b = str;
        this.f442915c = Collections.unmodifiableList(new ArrayList(list));
        this.f442916d = str2;
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "sentry.interfaces.Message";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C50058d c50058d = (C50058d) obj;
        return Objects.equals(this.f442914b, c50058d.f442914b) && Objects.equals(this.f442915c, c50058d.f442915c) && Objects.equals(this.f442916d, c50058d.f442916d);
    }

    public final int hashCode() {
        return Objects.hash(this.f442914b, this.f442915c, this.f442916d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageInterface{message='");
        sb2.append(this.f442914b);
        sb2.append("', parameters=");
        sb2.append(this.f442915c);
        sb2.append(", formatted=");
        return C22026a.c(sb2, this.f442916d, '}');
    }
}
