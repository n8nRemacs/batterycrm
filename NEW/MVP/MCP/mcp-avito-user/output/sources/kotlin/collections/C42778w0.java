package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Collections.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42778w0 extends C42768r0 {
    @Y61.k
    public static final void f(@Y61.k Iterable iterable, @Y61.k Appendable appendable, @Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, @Y61.k CharSequence charSequence3, @Y61.l Y41.l lVar) {
        appendable.append(charSequence2);
        int i12 = 0;
        for (Object obj : iterable) {
            i12++;
            if (i12 > 1) {
                appendable.append(charSequence);
            }
            C43066x.l(appendable, obj, lVar);
        }
        appendable.append(charSequence3);
    }

    @Y61.k
    public static final <T> List<T> g(@Y61.k Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C42745f0.I0(iterable, arrayList);
        return arrayList;
    }
}
