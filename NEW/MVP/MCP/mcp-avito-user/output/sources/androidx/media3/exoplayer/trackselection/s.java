package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.V;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.trackselection.m;
import j.P;

/* compiled from: TrackSelectorResult.java */
@J
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f50037a;

    /* renamed from: b, reason: collision with root package name */
    public final e0[] f50038b;

    /* renamed from: c, reason: collision with root package name */
    public final k[] f50039c;

    /* renamed from: d, reason: collision with root package name */
    public final V f50040d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final m.a f50041e;

    public s(e0[] e0VarArr, k[] kVarArr, V v12, @P m.a aVar) {
        this.f50038b = e0VarArr;
        this.f50039c = (k[]) kVarArr.clone();
        this.f50040d = v12;
        this.f50041e = aVar;
        this.f50037a = e0VarArr.length;
    }

    public final boolean a(@P s sVar, int i12) {
        return sVar != null && M.a(this.f50038b[i12], sVar.f50038b[i12]) && M.a(this.f50039c[i12], sVar.f50039c[i12]);
    }

    public final boolean b(int i12) {
        return this.f50038b[i12] != null;
    }
}
