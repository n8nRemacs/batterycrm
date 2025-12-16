package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DoubleInputItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_search_filter_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {
    public static final boolean a(ParameterElement.o oVar, String str) {
        if (str.length() != 0) {
            String str2 = oVar.f262786e;
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb2 = new StringBuilder();
            int length = str2.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str2.charAt(i12);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            int length2 = str.length();
            for (int i13 = 0; i13 < length2; i13++) {
                char cCharAt2 = str.charAt(i13);
                if (Character.isDigit(cCharAt2)) {
                    sb3.append(cCharAt2);
                }
            }
            if (string.equals(sb3.toString())) {
                return false;
            }
        }
        return true;
    }
}
