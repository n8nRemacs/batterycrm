package com.yandex.metrica.impl.ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.d7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38747d7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final byte[] f380360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final C38722c7 f380361b;

    public C38747d7(@Y61.k byte[] bArr, @Y61.k C38722c7 c38722c7) {
        this.f380360a = bArr;
        this.f380361b = c38722c7;
    }

    @Y61.k
    public final byte[] a() {
        return this.f380360a;
    }

    @Y61.k
    public final C38722c7 b() {
        return this.f380361b;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38747d7)) {
            return false;
        }
        C38747d7 c38747d7 = (C38747d7) obj;
        return kotlin.jvm.internal.L.f(this.f380360a, c38747d7.f380360a) && kotlin.jvm.internal.L.f(this.f380361b, c38747d7.f380361b);
    }

    public int hashCode() {
        byte[] bArr = this.f380360a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C38722c7 c38722c7 = this.f380361b;
        return iHashCode + (c38722c7 != null ? c38722c7.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.f380360a) + ", handlerDescription=" + this.f380361b + ")";
    }
}
