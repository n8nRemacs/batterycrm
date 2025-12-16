package com.avito.android.util;

import android.text.Editable;
import kotlin.Metadata;

/* compiled from: TemplateFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/D5;", "", "<init>", "()V", "a", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D5 {

    /* compiled from: TemplateFormatter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/D5$a;", "", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k Editable editable, @Y61.k String str, int i12, int i13);
    }

    @Y61.k
    public static void a(@Y61.k Editable editable, @Y61.k a aVar) {
        if (editable.length() == 0) {
            return;
        }
        int length = 0;
        char cCharAt = editable.charAt(0);
        char c12 = 55296;
        int i12 = -1;
        while (length < editable.length()) {
            if (c12 == '{' && cCharAt == '{') {
                i12 = length - 1;
            } else if (c12 == '}' && cCharAt == '}' && i12 != -1) {
                int length2 = editable.length();
                aVar.a(editable, editable.subSequence(i12 + 2, length - 1).toString(), i12, length + 1);
                length += editable.length() - length2;
                i12 = -1;
            }
            length++;
            if (length < editable.length()) {
                c12 = cCharAt;
                cCharAt = editable.charAt(length);
            } else {
                c12 = cCharAt;
            }
        }
    }
}
