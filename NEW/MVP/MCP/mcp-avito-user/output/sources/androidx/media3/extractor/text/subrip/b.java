package androidx.media3.extractor.text.subrip;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.extractor.text.e;
import java.util.Collections;
import java.util.List;

/* compiled from: SubripSubtitle.java */
/* loaded from: classes.dex */
final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.text.a[] f51359b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f51360c;

    public b(androidx.media3.common.text.a[] aVarArr, long[] jArr) {
        this.f51359b = aVarArr;
        this.f51360c = jArr;
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        C23110a.b(i12 >= 0);
        long[] jArr = this.f51360c;
        C23110a.b(i12 < jArr.length);
        return jArr[i12];
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return this.f51360c.length;
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        long[] jArr = this.f51360c;
        int iB2 = M.b(jArr, j12, false);
        if (iB2 < jArr.length) {
            return iB2;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        androidx.media3.common.text.a aVar;
        int iF2 = M.f(this.f51360c, j12, false);
        return (iF2 == -1 || (aVar = this.f51359b[iF2]) == androidx.media3.common.text.a.f47814s) ? Collections.emptyList() : Collections.singletonList(aVar);
    }
}
