package P91;

import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12873a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.mts.biometry.sdk.feature.document.intro.domain.d f12874b;

    public e(String str, ru.mts.biometry.sdk.feature.document.intro.domain.d dVar) {
        this.f12873a = str;
        this.f12874b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f12873a, eVar.f12873a) && this.f12874b == eVar.f12874b;
    }

    public final int hashCode() {
        return this.f12874b.hashCode() + (this.f12873a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedDocument(countryCode=" + this.f12873a + ", type=" + this.f12874b + ')';
    }
}
