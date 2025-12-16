package io.ktor.http;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.text.C43066x;

/* compiled from: HeaderValueWithParameters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<Character> f399898a = C42756l.l0(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final boolean a(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.length() >= 2 && C43066x.D(str) == '\"' && C43066x.L(str) == '\"') {
            int i12 = 1;
            do {
                int iH2 = C43066x.H('\"', i12, 4, str);
                if (iH2 == str.length() - 1) {
                    break;
                }
                int i13 = 0;
                for (int i14 = iH2 - 1; str.charAt(i14) == '\\'; i14--) {
                    i13++;
                }
                if (i13 % 2 != 0) {
                    i12 = iH2 + 1;
                }
            } while (i12 < str.length());
            return false;
        }
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (f399898a.contains(Character.valueOf(str.charAt(i15)))) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public static final String b(@Y61.k String str) {
        StringBuilder sb2 = new StringBuilder("\"");
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append("\"");
        return sb2.toString();
    }
}
