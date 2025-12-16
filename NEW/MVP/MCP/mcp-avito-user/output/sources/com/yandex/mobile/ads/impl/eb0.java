package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.jd0;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class eb0 implements dd0, dd0.a {

    /* renamed from: b, reason: collision with root package name */
    public final jd0.b f384836b;

    /* renamed from: c, reason: collision with root package name */
    private final long f384837c;

    /* renamed from: d, reason: collision with root package name */
    private final h9 f384838d;

    /* renamed from: e, reason: collision with root package name */
    private jd0 f384839e;

    /* renamed from: f, reason: collision with root package name */
    private dd0 f384840f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private dd0.a f384841g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f384842h;

    /* renamed from: i, reason: collision with root package name */
    private long f384843i = -9223372036854775807L;

    public interface a {
        void a(jd0.b bVar);

        void a(jd0.b bVar, IOException iOException);
    }

    public eb0(jd0.b bVar, h9 h9Var, long j12) {
        this.f384836b = bVar;
        this.f384838d = h9Var;
        this.f384837c = j12;
    }

    @Override // com.yandex.mobile.ads.impl.g31.a
    public final void a(g31 g31Var) {
        dd0.a aVar = this.f384841g;
        int i12 = pc1.f388768a;
        aVar.a((dd0.a) this);
    }

    public final long b() {
        return this.f384837c;
    }

    public final void c() {
        if (this.f384840f != null) {
            jd0 jd0Var = this.f384839e;
            jd0Var.getClass();
            jd0Var.a(this.f384840f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean continueLoading(long j12) {
        dd0 dd0Var = this.f384840f;
        return dd0Var != null && dd0Var.continueLoading(j12);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void discardBuffer(long j12, boolean z12) {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        dd0Var.discardBuffer(j12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getBufferedPositionUs() {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long getNextLoadPositionUs() {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final w91 getTrackGroups() {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final boolean isLoading() {
        dd0 dd0Var = this.f384840f;
        return dd0Var != null && dd0Var.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void maybeThrowPrepareError() {
        dd0 dd0Var = this.f384840f;
        if (dd0Var != null) {
            dd0Var.maybeThrowPrepareError();
            return;
        }
        jd0 jd0Var = this.f384839e;
        if (jd0Var != null) {
            jd0Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long readDiscontinuity() {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void reevaluateBuffer(long j12) {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        dd0Var.reevaluateBuffer(j12);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long seekToUs(long j12) {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.seekToUs(j12);
    }

    public final void a(long j12) {
        this.f384843i = j12;
    }

    public final long a() {
        return this.f384843i;
    }

    public final void a(jd0 jd0Var) {
        db.b(this.f384839e == null);
        this.f384839e = jd0Var;
    }

    public final void a(jd0.b bVar) {
        long j12 = this.f384837c;
        long j13 = this.f384843i;
        if (j13 != -9223372036854775807L) {
            j12 = j13;
        }
        jd0 jd0Var = this.f384839e;
        jd0Var.getClass();
        dd0 dd0VarA = jd0Var.a(bVar, this.f384838d, j12);
        this.f384840f = dd0VarA;
        if (this.f384841g != null) {
            dd0VarA.a(this, j12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final void a(dd0.a aVar, long j12) {
        this.f384841g = aVar;
        dd0 dd0Var = this.f384840f;
        if (dd0Var != null) {
            long j13 = this.f384837c;
            long j14 = this.f384843i;
            if (j14 != -9223372036854775807L) {
                j13 = j14;
            }
            dd0Var.a(this, j13);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long a(cu[] cuVarArr, boolean[] zArr, n11[] n11VarArr, boolean[] zArr2, long j12) {
        long j13;
        long j14 = this.f384843i;
        if (j14 == -9223372036854775807L || j12 != this.f384837c) {
            j13 = j12;
        } else {
            this.f384843i = -9223372036854775807L;
            j13 = j14;
        }
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.a(cuVarArr, zArr, n11VarArr, zArr2, j13);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final long a(long j12, y21 y21Var) {
        dd0 dd0Var = this.f384840f;
        int i12 = pc1.f388768a;
        return dd0Var.a(j12, y21Var);
    }

    @Override // com.yandex.mobile.ads.impl.dd0.a
    public final void a(dd0 dd0Var) {
        dd0.a aVar = this.f384841g;
        int i12 = pc1.f388768a;
        aVar.a((dd0) this);
    }
}
