package com.avito.android.html_editor;

import android.text.Spanned;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpannedUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_html-editor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s {
    @Y61.k
    public static final ArrayList a(@Y61.k Spanned spanned, int i12, int i13, @Y61.k Y41.r rVar) {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (true) {
            int iNextSpanTransition = spanned.nextSpanTransition(i12, i13, com.avito.android.html_formatter.span.a.class);
            Object[] spans = spanned.getSpans(i12, iNextSpanTransition, com.avito.android.html_formatter.span.a.class);
            if (spans != null) {
                for (Object obj : spans) {
                    arrayList.add(rVar.invoke(Integer.valueOf(i14), obj, Integer.valueOf(spanned.getSpanStart(obj)), Integer.valueOf(spanned.getSpanEnd(obj))));
                }
            }
            i14++;
            if (iNextSpanTransition == i13) {
                return arrayList;
            }
            i12 = iNextSpanTransition;
        }
    }
}
