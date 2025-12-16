package io.ktor.http.auth;

import Y61.k;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.text.C43059p;

/* compiled from: HttpAuthHeader.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Set<Character> f399932a = C42756l.l0(new Character[]{'!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Set<Character> f399933b = C42756l.l0(new Character[]{'-', '.', '_', '~', '+', '/'});

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C43059p f399934c = new C43059p("[a-zA-Z0-9\\-._~+/]+=*");

    static {
        new C43059p("\\\\.");
    }
}
