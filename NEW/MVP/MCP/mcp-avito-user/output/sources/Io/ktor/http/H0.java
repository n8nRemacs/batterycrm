package io.ktor.http;

import kotlin.Metadata;

/* compiled from: CookieUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/H0;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399858a;

    /* renamed from: b, reason: collision with root package name */
    public int f399859b;

    public H0(@Y61.k String str) {
        this.f399858a = str;
    }

    public final boolean a(@Y61.k Y41.l<? super Character, Boolean> lVar) {
        boolean zC2 = c(lVar);
        if (zC2) {
            this.f399859b++;
        }
        return zC2;
    }

    public final void b(@Y61.k Y41.l lVar) {
        if (c(lVar)) {
            while (c(lVar)) {
                this.f399859b++;
            }
        }
    }

    public final boolean c(@Y61.k Y41.l<? super Character, Boolean> lVar) {
        int i12 = this.f399859b;
        String str = this.f399858a;
        return i12 < str.length() && lVar.invoke(Character.valueOf(str.charAt(this.f399859b))).booleanValue();
    }
}
