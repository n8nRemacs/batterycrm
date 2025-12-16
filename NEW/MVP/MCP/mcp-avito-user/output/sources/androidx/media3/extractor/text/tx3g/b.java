package androidx.media3.extractor.text.tx3g;

import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.text.e;
import java.util.Collections;
import java.util.List;

/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes.dex */
final class b implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f51437c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final List<androidx.media3.common.text.a> f51438b;

    public b(androidx.media3.common.text.a aVar) {
        this.f51438b = Collections.singletonList(aVar);
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        C23110a.b(i12 == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        return j12 < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        return j12 >= 0 ? this.f51438b : Collections.emptyList();
    }

    public b() {
        this.f51438b = Collections.emptyList();
    }
}
