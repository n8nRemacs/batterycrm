package io.ktor.serialization.kotlinx.json;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/serialization/kotlinx/json/a;", "", "ktor-serialization-kotlinx-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final byte[] f400344a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final byte[] f400345b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final byte[] f400346c;

    public a(@Y61.k Charset charset) {
        Charset charset2 = C43047d.f410589b;
        this.f400344a = charset.equals(charset2) ? "[".getBytes(charset2) : W31.a.c(charset.newEncoder(), "[", 1);
        this.f400345b = charset.equals(charset2) ? "]".getBytes(charset2) : W31.a.c(charset.newEncoder(), "]", 1);
        this.f400346c = charset.equals(charset2) ? ",".getBytes(charset2) : W31.a.c(charset.newEncoder(), ",", 1);
    }
}
