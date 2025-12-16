package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes8.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final m51.e f409957a;

    /* renamed from: b, reason: collision with root package name */
    public final m51.e f409958b;

    /* renamed from: c, reason: collision with root package name */
    public final m51.e f409959c;

    /* renamed from: d, reason: collision with root package name */
    public final m51.e f409960d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f409961e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f409962f;

    public u(m51.e eVar, m51.e eVar2, m51.e eVar3, m51.e eVar4, @Y61.k String str, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.f409957a = eVar;
        this.f409958b = eVar2;
        this.f409959c = eVar3;
        this.f409960d = eVar4;
        this.f409961e = str;
        this.f409962f = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f409957a.equals(uVar.f409957a) && kotlin.jvm.internal.L.f(this.f409958b, uVar.f409958b) && kotlin.jvm.internal.L.f(this.f409959c, uVar.f409959c) && this.f409960d.equals(uVar.f409960d) && kotlin.jvm.internal.L.f(this.f409961e, uVar.f409961e) && kotlin.jvm.internal.L.f(this.f409962f, uVar.f409962f);
    }

    public final int hashCode() {
        int iHashCode = this.f409957a.hashCode() * 31;
        m51.e eVar = this.f409958b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        m51.e eVar2 = this.f409959c;
        return this.f409962f.hashCode() + androidx.compose.foundation.H.d((this.f409960d.hashCode() + ((iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31)) * 31, 31, this.f409961e);
    }

    @Y61.k
    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f409957a + ", compilerVersion=" + this.f409958b + ", languageVersion=" + this.f409959c + ", expectedVersion=" + this.f409960d + ", filePath=" + this.f409961e + ", classId=" + this.f409962f + ')';
    }
}
