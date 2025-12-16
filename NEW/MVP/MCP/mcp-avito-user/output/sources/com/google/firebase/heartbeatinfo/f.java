package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import j.N;
import j.k0;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes6.dex */
public class f implements i, HeartBeatInfo {

    /* renamed from: a, reason: collision with root package name */
    public final e f361618a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f361619b;

    /* renamed from: c, reason: collision with root package name */
    public final wZ0.b<com.google.firebase.platforminfo.i> f361620c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<g> f361621d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f361622e;

    @k0
    public f() {
        throw null;
    }

    public f(Context context, String str, Set<g> set, wZ0.b<com.google.firebase.platforminfo.i> bVar, Executor executor) {
        this.f361618a = new e(context, str);
        this.f361621d = set;
        this.f361622e = executor;
        this.f361620c = bVar;
        this.f361619b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @N
    public final synchronized HeartBeatInfo.HeartBeat a() {
        boolean zG2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        j jVar = (j) this.f361618a.get();
        synchronized (jVar) {
            zG2 = jVar.g(jCurrentTimeMillis);
        }
        if (!zG2) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (jVar) {
            String strD = jVar.d(System.currentTimeMillis());
            jVar.f361623a.edit().putString("last-used-date", strD).commit();
            jVar.f(strD);
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.i
    public final Task<String> b() {
        return !androidx.core.os.N.a(this.f361619b) ? C37030m.f("") : C37030m.c(new c(this, 1), this.f361622e);
    }

    public final void c() {
        if (this.f361621d.size() <= 0) {
            C37030m.f(null);
        } else if (androidx.core.os.N.a(this.f361619b)) {
            C37030m.c(new c(this, 0), this.f361622e);
        } else {
            C37030m.f(null);
        }
    }
}
