package com.avito.android.util.text_style;

import AK.c;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UnsupportedTextStyleException.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/text_style/UnsupportedTextStyleException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedTextStyleException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public UnsupportedTextStyleException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UnsupportedTextStyleException(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public UnsupportedTextStyleException(@l String str, @l String str2) {
        StringBuilder sb2 = new StringBuilder("Текстовые стили ");
        ArrayList arrayListC = C42745f0.C(C42745f0.U(str2, str));
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add("'" + ((String) it.next()) + '\'');
        }
        super(c.s(sb2, C42745f0.O(arrayList, ", ", null, null, null, 62), " отсутствуют в Context, возможно они были удалены как legacy стили, присылайте новые стили или, если это ошибка, - напишите об этом в #apps-design-platform. Подробности http://links.k.avito.ru/SM"));
    }
}
