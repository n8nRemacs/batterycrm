package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import j.P;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes6.dex */
public final class j implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f344343a;

    public j(DrmSession.DrmSessionException drmSessionException) {
        this.f344343a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID b() {
        return C36526i.f345417a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @P
    public final com.google.android.exoplayer2.decoder.c c() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @P
    public final DrmSession.DrmSessionException getError() {
        return this.f344343a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void e(@P e.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void f(@P e.a aVar) {
    }
}
