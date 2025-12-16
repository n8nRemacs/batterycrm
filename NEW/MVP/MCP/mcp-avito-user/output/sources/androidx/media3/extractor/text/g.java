package androidx.media3.extractor.text;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.C;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.F;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import com.google.common.primitives.l;

/* compiled from: SubtitleExtractor.java */
@J
/* loaded from: classes.dex */
public class g implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f51296a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.extractor.J f51297b;

    /* renamed from: c, reason: collision with root package name */
    public int f51298c;

    /* renamed from: d, reason: collision with root package name */
    public long f51299d;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        int i12 = this.f51298c;
        C23110a.g((i12 == 0 || i12 == 5) ? false : true);
        this.f51299d = j13;
        if (this.f51298c == 2) {
            this.f51298c = 1;
        }
        if (this.f51298c == 4) {
            this.f51298c = 3;
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return true;
    }

    @Override // androidx.media3.extractor.p
    public final int h(q qVar, F f12) {
        int i12 = this.f51298c;
        C23110a.g((i12 == 0 || i12 == 5) ? false : true);
        int i13 = this.f51298c;
        if (i13 == 1) {
            if (((C23191j) qVar).f50582c == -1) {
                throw null;
            }
            l.b(((C23191j) qVar).f50582c);
            throw null;
        }
        if (i13 == 2) {
            throw null;
        }
        if (i13 == 3) {
            if (((C23191j) qVar).o(((C23191j) qVar).f50582c != -1 ? l.b(((C23191j) qVar).f50582c) : 1024) == -1) {
                C23110a.h(this.f51297b);
                throw null;
            }
        }
        return this.f51298c == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        C23110a.g(this.f51298c == 0);
        this.f51296a = rVar;
        this.f51297b = rVar.c(0, 3);
        this.f51296a.b();
        this.f51296a.e(new C(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f51297b.b(null);
        this.f51298c = 1;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
        if (this.f51298c != 5) {
            throw null;
        }
    }
}
