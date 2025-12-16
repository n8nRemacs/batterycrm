package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.c7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38722c7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final EnumC38822g7 f380286a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f380287b;

    /* JADX WARN: Multi-variable type inference failed */
    public C38722c7() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Y61.l
    public final String a() {
        return this.f380287b;
    }

    @Y61.k
    public final EnumC38822g7 b() {
        return this.f380286a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38722c7)) {
            return false;
        }
        C38722c7 c38722c7 = (C38722c7) obj;
        return kotlin.jvm.internal.L.f(this.f380286a, c38722c7.f380286a) && kotlin.jvm.internal.L.f(this.f380287b, c38722c7.f380287b);
    }

    public int hashCode() {
        EnumC38822g7 enumC38822g7 = this.f380286a;
        int iHashCode = (enumC38822g7 != null ? enumC38822g7.hashCode() : 0) * 31;
        String str = this.f380287b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeCrashHandlerDescription(source=");
        sb2.append(this.f380286a);
        sb2.append(", handlerVersion=");
        return AK.c.s(sb2, this.f380287b, ")");
    }

    public C38722c7(@Y61.k EnumC38822g7 enumC38822g7, @Y61.l String str) {
        this.f380286a = enumC38822g7;
        this.f380287b = str;
    }

    public /* synthetic */ C38722c7(EnumC38822g7 enumC38822g7, String str, int i12) {
        this((i12 & 1) != 0 ? EnumC38822g7.UNKNOWN : null, null);
    }
}
