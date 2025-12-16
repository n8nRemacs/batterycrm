package io.ktor.http.parsing.regex;

import Y61.k;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RegexParserGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/parsing/regex/a;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f400109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f400110b;

    public a(@k String str, int i12, boolean z12) {
        this.f400109a = z12 ? C22491k0.a(')', "(", str) : str;
        this.f400110b = z12 ? i12 + 1 : i12;
    }

    public /* synthetic */ a(String str, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? false : z12);
    }
}
