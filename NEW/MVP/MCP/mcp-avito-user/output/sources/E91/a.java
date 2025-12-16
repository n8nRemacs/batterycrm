package E91;

import androidx.appcompat.app.r;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3811c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3812d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3813e;

    /* renamed from: f, reason: collision with root package name */
    public final ru.mts.biometry.sdk.domain.entity.selector.f f3814f;

    public a(String str, String str2, String str3, String str4, boolean z12, ru.mts.biometry.sdk.domain.entity.selector.f fVar) {
        this.f3809a = str;
        this.f3810b = str2;
        this.f3811c = str3;
        this.f3812d = str4;
        this.f3813e = z12;
        this.f3814f = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f3809a, aVar.f3809a) && L.f(this.f3810b, aVar.f3810b) && L.f(this.f3811c, aVar.f3811c) && L.f(this.f3812d, aVar.f3812d) && this.f3813e == aVar.f3813e && L.f(this.f3814f, aVar.f3814f);
    }

    public final int hashCode() {
        String str = this.f3809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3810b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3811c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3812d;
        return this.f3814f.hashCode() + r.i((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f3813e);
    }

    public final String toString() {
        return "ChooseDocumentState(title=" + this.f3809a + ", description=" + this.f3810b + ", documentTypeTitle=" + this.f3811c + ", countryTitle=" + this.f3812d + ", skipDocumentSelection=" + this.f3813e + ", selector=" + this.f3814f + ')';
    }
}
