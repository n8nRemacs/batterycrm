package com.avito.android.html_editor;

import android.text.Editable;
import android.text.Spannable;
import hJ.AbstractC40837b;
import hJ.C40836a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputOperationFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_editor/j;", "Lcom/avito/android/html_editor/i;", "<init>", "()V", "a", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public C40836a f164147a;

    /* compiled from: InputOperationFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/html_editor/j$a;", "", "<init>", "()V", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    public final void a(@Y61.l Spannable spannable) {
        this.f164147a = null;
        if (spannable != null) {
            a[] aVarArr = (a[]) spannable.getSpans(0, spannable.length(), a.class);
            if (aVarArr != null) {
                for (a aVar : aVarArr) {
                    spannable.removeSpan(aVar);
                }
            }
        }
    }

    @Y61.k
    public final List<AbstractC40837b> b(@Y61.k Editable editable) {
        List<AbstractC40837b> listSingletonList;
        Object[] spans = editable.getSpans(0, editable.length(), a.class);
        hJ.l lVar = null;
        a aVar = (a) (spans.length == 0 ? null : spans[0]);
        if (aVar != null) {
            int spanStart = editable.getSpanStart(aVar);
            lVar = new hJ.l(spanStart, editable.subSequence(spanStart, editable.getSpanEnd(aVar)).toString());
        }
        C40836a c40836a = this.f164147a;
        if (c40836a == null || lVar == null) {
            ArrayList arrayList = new ArrayList();
            if (c40836a != null) {
                arrayList.add(c40836a);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
            listSingletonList = arrayList;
        } else {
            listSingletonList = Collections.singletonList(new hJ.o(c40836a, Collections.singletonList(lVar)));
        }
        a(editable);
        return listSingletonList;
    }

    public final void c(@Y61.k Spannable spannable, int i12, int i13) {
        if (i13 != 0) {
            spannable.setSpan(new a(), i12, i13 + i12, 33);
        }
    }
}
