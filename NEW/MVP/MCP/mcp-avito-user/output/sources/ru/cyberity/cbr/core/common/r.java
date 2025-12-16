package ru.cyberity.cbr.core.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: CharSequenceExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\r\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"", "", "", "a", "(Ljava/lang/CharSequence;)[Ljava/lang/String;", "splitMimeTypes", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class r {
    @Y61.k
    public static final String[] a(@Y61.k CharSequence charSequence) {
        List listE0 = C43066x.e0(charSequence, new char[]{',', ';', '|', ':'});
        ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            arrayList.add(C43066x.A0((String) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
