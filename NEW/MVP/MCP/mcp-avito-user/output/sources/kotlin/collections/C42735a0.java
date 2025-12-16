package kotlin.collections;

import java.util.AbstractSet;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42735a0 extends C42777w {
    @Y61.k
    public static final void c(@Y61.k Object[] objArr, @Y61.k StringBuilder sb2, @Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, @Y61.k CharSequence charSequence3, @Y61.l Y41.l lVar) {
        sb2.append(charSequence2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append(charSequence);
            }
            C43066x.l(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    @Y61.k
    public static final void d(@Y61.k Object[] objArr, @Y61.k AbstractSet abstractSet) {
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }
}
