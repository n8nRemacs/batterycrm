package io.ktor.http;

import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: HttpHeaderValueParser.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41517e0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final List<O> a(@Y61.l String str) {
        int i12;
        kotlin.Q q12;
        kotlin.Q q13;
        if (str == null) {
            return C42784z0.f406748b;
        }
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, C41511c0.f399944l);
        for (int i13 = 0; i13 <= str.length() - 1; i13 = i12) {
            InterfaceC42726C interfaceC42726CB2 = C42727D.b(LazyThreadSafetyMode.f406616d, C41515d0.f399999l);
            Integer numValueOf = null;
            i12 = i13;
            while (true) {
                if (i12 <= str.length() - 1) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC42726CB.getValue()).add(new O(C43066x.A0(str.substring(i13, numValueOf != null ? numValueOf.intValue() : i12)).toString(), interfaceC42726CB2.isInitialized() ? (List) interfaceC42726CB2.getValue() : C42784z0.f406748b));
                        i12++;
                    } else if (cCharAt == ';') {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i12);
                        }
                        int i14 = i12 + 1;
                        int i15 = i14;
                        while (i15 <= C43066x.F(str)) {
                            char cCharAt2 = str.charAt(i15);
                            if (cCharAt2 != '=') {
                                if (cCharAt2 == ';' || cCharAt2 == ',') {
                                    b(interfaceC42726CB2, str, i14, i15, "");
                                    break;
                                }
                                i15++;
                            } else {
                                int i16 = i15 + 1;
                                if (str.length() == i16) {
                                    q13 = new kotlin.Q(Integer.valueOf(i16), "");
                                } else {
                                    if (str.charAt(i16) == '\"') {
                                        int i17 = i15 + 2;
                                        StringBuilder sb2 = new StringBuilder();
                                        while (i17 <= str.length() - 1) {
                                            char cCharAt3 = str.charAt(i17);
                                            if (cCharAt3 == '\"') {
                                                int i18 = i17 + 1;
                                                int i19 = i18;
                                                while (i19 < str.length() && str.charAt(i19) == ' ') {
                                                    i19++;
                                                }
                                                if (i19 == str.length() || str.charAt(i19) == ';') {
                                                    q12 = new kotlin.Q(Integer.valueOf(i18), sb2.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i17 >= str.length() - 3) {
                                                sb2.append(cCharAt3);
                                                i17++;
                                            } else {
                                                sb2.append(str.charAt(i17 + 1));
                                                i17 += 2;
                                            }
                                        }
                                        q12 = new kotlin.Q(Integer.valueOf(i17), "\"".concat(sb2.toString()));
                                    } else {
                                        int i22 = i16;
                                        while (i22 <= str.length() - 1) {
                                            char cCharAt4 = str.charAt(i22);
                                            if (cCharAt4 == ';' || cCharAt4 == ',') {
                                                q12 = new kotlin.Q(Integer.valueOf(i22), C43066x.A0(str.substring(i16, i22)).toString());
                                                break;
                                            }
                                            i22++;
                                        }
                                        q12 = new kotlin.Q(Integer.valueOf(i22), C43066x.A0(str.substring(i16, i22)).toString());
                                    }
                                    q13 = q12;
                                }
                                int iIntValue = ((Number) q13.f406619b).intValue();
                                b(interfaceC42726CB2, str, i14, i15, (String) q13.f406620c);
                                i12 = iIntValue;
                            }
                        }
                        b(interfaceC42726CB2, str, i14, i15, "");
                        i12 = i15;
                    } else {
                        i12++;
                    }
                } else {
                    ((ArrayList) interfaceC42726CB.getValue()).add(new O(C43066x.A0(str.substring(i13, numValueOf != null ? numValueOf.intValue() : i12)).toString(), interfaceC42726CB2.isInitialized() ? (List) interfaceC42726CB2.getValue() : C42784z0.f406748b));
                }
            }
        }
        return interfaceC42726CB.isInitialized() ? (List) interfaceC42726CB.getValue() : C42784z0.f406748b;
    }

    public static final void b(InterfaceC42726C<? extends ArrayList<P>> interfaceC42726C, String str, int i12, int i13, String str2) {
        String string = C43066x.A0(str.substring(i12, i13)).toString();
        if (string.length() == 0) {
            return;
        }
        interfaceC42726C.getValue().add(new P(string, str2));
    }
}
