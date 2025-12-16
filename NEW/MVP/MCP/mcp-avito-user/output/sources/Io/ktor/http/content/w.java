package io.ktor.http.content;

import io.ktor.http.C41524i;
import io.ktor.http.C41528k;
import io.ktor.http.C41535n0;
import io.ktor.http.content.p;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: TextContent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/w;", "Lio/ktor/http/content/p$a;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w extends p.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41524i f399992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final byte[] f399994d;

    public w(String str, C41524i c41524i, C41535n0 c41535n0, int i12, C42822w c42822w) {
        c41535n0 = (i12 & 4) != 0 ? null : c41535n0;
        this.f399991a = str;
        this.f399992b = c41524i;
        this.f399993c = c41535n0;
        Charset charsetA = C41528k.a(c41524i);
        charsetA = charsetA == null ? C43047d.f410589b : charsetA;
        Charset charset = C43047d.f410589b;
        this.f399994d = L.f(charsetA, charset) ? str.getBytes(charset) : W31.a.c(charsetA.newEncoder(), str, str.length());
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: a */
    public final Long getF399967d() {
        return Long.valueOf(this.f399994d.length);
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399992b() {
        return this.f399992b;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399993c() {
        return this.f399993c;
    }

    @Override // io.ktor.http.content.p.a
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final byte[] getF399994d() {
        return this.f399994d;
    }

    @Y61.k
    public final String toString() {
        return "TextContent[" + this.f399992b + "] \"" + C43066x.t0(30, this.f399991a) + '\"';
    }
}
