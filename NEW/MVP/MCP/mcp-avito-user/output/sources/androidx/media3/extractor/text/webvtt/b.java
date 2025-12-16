package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.C23110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: classes.dex */
final class b implements androidx.media3.extractor.text.e {

    /* renamed from: b, reason: collision with root package name */
    public final List<androidx.media3.common.text.a> f51440b;

    public b(ArrayList arrayList) {
        this.f51440b = Collections.unmodifiableList(arrayList);
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
        return j12 >= 0 ? this.f51440b : Collections.emptyList();
    }
}
