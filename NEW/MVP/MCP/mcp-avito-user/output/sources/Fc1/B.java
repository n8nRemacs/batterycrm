package Fc1;

import java.util.List;

/* loaded from: classes9.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f4814a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f4815b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final xyz.n.a.c4 f4816c;

    public B(@Y61.k String str, @Y61.k List<String> list, @Y61.k xyz.n.a.c4 c4Var) {
        this.f4814a = str;
        this.f4815b = list;
        this.f4816c = c4Var;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return kotlin.jvm.internal.L.f(this.f4814a, b12.f4814a) && kotlin.jvm.internal.L.f(this.f4815b, b12.f4815b) && this.f4816c == b12.f4816c;
    }

    public final int hashCode() {
        return this.f4816c.hashCode() + androidx.compose.foundation.H.e(this.f4814a.hashCode() * 31, 31, this.f4815b);
    }

    @Y61.k
    public final String toString() {
        return "FeedbackFieldPrivacy(declaration=" + this.f4814a + ", privacyPages=" + this.f4815b + ", type=" + this.f4816c + ')';
    }
}
