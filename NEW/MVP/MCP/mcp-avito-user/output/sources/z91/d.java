package z91;

import kotlin.jvm.internal.L;
import ru.mts.biometry.api.SDKEnvironment;
import ru.mts.biometry.sdk.PassportValidationScreenDesign;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f443903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f443904b;

    /* renamed from: c, reason: collision with root package name */
    public final SDKEnvironment f443905c;

    /* renamed from: d, reason: collision with root package name */
    public final PassportValidationScreenDesign f443906d;

    public d(String str, boolean z12, SDKEnvironment sDKEnvironment, PassportValidationScreenDesign passportValidationScreenDesign) {
        this.f443903a = str;
        this.f443904b = z12;
        this.f443905c = sDKEnvironment;
        this.f443906d = passportValidationScreenDesign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f443903a, dVar.f443903a) && this.f443904b == dVar.f443904b && this.f443905c == dVar.f443905c && this.f443906d == dVar.f443906d;
    }

    public final int hashCode() {
        return this.f443906d.hashCode() + ((this.f443905c.hashCode() + androidx.appcompat.app.r.i(this.f443903a.hashCode() * 31, 31, this.f443904b)) * 31);
    }

    public final String toString() {
        return "SdkSettings(clientToken=" + this.f443903a + ", useINN=" + this.f443904b + ", backend=" + this.f443905c + ", passportValidationScreenDesign=" + this.f443906d + ')';
    }
}
