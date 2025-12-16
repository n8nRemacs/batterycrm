package n10;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SignAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: n10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44166a {
    public static final String a(String str) {
        return L.f(str, "borrower") ? "main_requester" : L.f(str, "co-borrower") ? "corequester" : str;
    }
}
