package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.B;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r implements B.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f347956a;

    @Override // com.google.android.exoplayer2.util.B.c
    public final void a(int i12) {
        s sVar = this.f347956a;
        AbstractC37401r1<Long> abstractC37401r1 = s.f347957n;
        synchronized (sVar) {
            int i13 = sVar.f347972i;
            if (i13 == 0 || sVar.f347968e) {
                if (i13 == i12) {
                    return;
                }
                sVar.f347972i = i12;
                if (i12 != 1 && i12 != 0 && i12 != 8) {
                    sVar.f347975l = sVar.i(i12);
                    long jA2 = sVar.f347967d.a();
                    sVar.j(sVar.f347969f > 0 ? (int) (jA2 - sVar.f347970g) : 0, sVar.f347971h, sVar.f347975l);
                    sVar.f347970g = jA2;
                    sVar.f347971h = 0L;
                    sVar.f347974k = 0L;
                    sVar.f347973j = 0L;
                    I i14 = sVar.f347966c;
                    i14.f347742b.clear();
                    i14.f347744d = -1;
                    i14.f347745e = 0;
                    i14.f347746f = 0;
                }
            }
        }
    }
}
