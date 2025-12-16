package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;

/* loaded from: classes8.dex */
public final class e20 implements is {

    /* renamed from: b, reason: collision with root package name */
    private x91 f384727b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f384728c;

    /* renamed from: e, reason: collision with root package name */
    private int f384730e;

    /* renamed from: f, reason: collision with root package name */
    private int f384731f;

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f384726a = new pr0(10);

    /* renamed from: d, reason: collision with root package name */
    private long f384729d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f384728c = false;
        this.f384729d = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
        int i12;
        db.b(this.f384727b);
        if (this.f384728c && (i12 = this.f384730e) != 0 && this.f384731f == i12) {
            long j12 = this.f384729d;
            if (j12 != -9223372036854775807L) {
                this.f384727b.a(j12, 1, i12, 0, null);
            }
            this.f384728c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        x91 x91VarA = tuVar.a(dVar.c(), 5);
        this.f384727b = x91VarA;
        x91VarA.a(new vw.a().c(dVar.b()).f("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f384728c = true;
        if (j12 != -9223372036854775807L) {
            this.f384729d = j12;
        }
        this.f384730e = 0;
        this.f384731f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) {
        db.b(this.f384727b);
        if (this.f384728c) {
            int iA2 = pr0Var.a();
            int i12 = this.f384731f;
            if (i12 < 10) {
                int iMin = Math.min(iA2, 10 - i12);
                System.arraycopy(pr0Var.c(), pr0Var.d(), this.f384726a.c(), this.f384731f, iMin);
                if (this.f384731f + iMin == 10) {
                    this.f384726a.e(0);
                    if (73 == this.f384726a.t() && 68 == this.f384726a.t() && 51 == this.f384726a.t()) {
                        this.f384726a.f(3);
                        this.f384730e = this.f384726a.s() + 10;
                    } else {
                        ka0.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f384728c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(iA2, this.f384730e - this.f384731f);
            this.f384727b.a(iMin2, pr0Var);
            this.f384731f += iMin2;
        }
    }
}
