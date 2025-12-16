package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.J;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;
import androidx.media3.extractor.r;

/* compiled from: StartOffsetExtractorOutput.java */
@J
/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: b, reason: collision with root package name */
    public final long f50603b;

    /* renamed from: c, reason: collision with root package name */
    public final r f50604c;

    /* compiled from: StartOffsetExtractorOutput.java */
    public class a implements H {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H f50605a;

        public a(H h12) {
            this.f50605a = h12;
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            return this.f50605a.d();
        }

        @Override // androidx.media3.extractor.H
        public final H.a f(long j12) {
            H.a aVarF = this.f50605a.f(j12);
            I i12 = aVarF.f50373a;
            long j13 = i12.f50378a;
            long j14 = i12.f50379b;
            long j15 = d.this.f50603b;
            I i13 = new I(j13, j14 + j15);
            I i14 = aVarF.f50374b;
            return new H.a(i13, new I(i14.f50378a, i14.f50379b + j15));
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return this.f50605a.g();
        }
    }

    public d(long j12, r rVar) {
        this.f50603b = j12;
        this.f50604c = rVar;
    }

    @Override // androidx.media3.extractor.r
    public final void b() {
        this.f50604c.b();
    }

    @Override // androidx.media3.extractor.r
    public final androidx.media3.extractor.J c(int i12, int i13) {
        return this.f50604c.c(i12, i13);
    }

    @Override // androidx.media3.extractor.r
    public final void e(H h12) {
        this.f50604c.e(new a(h12));
    }
}
