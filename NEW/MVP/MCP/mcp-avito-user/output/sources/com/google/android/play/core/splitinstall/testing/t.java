package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.U;
import com.google.android.play.core.splitinstall.W;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class t implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f358892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f358893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f358894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f358895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f358896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C37243a f358897f;

    public t(C37243a c37243a, List list, List list2, long j12, boolean z12, List list3) {
        this.f358897f = c37243a;
        this.f358892a = list;
        this.f358893b = list2;
        this.f358894c = j12;
        this.f358895d = z12;
        this.f358896e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zza() {
        int i12 = C37243a.f358839p;
        C37243a c37243a = this.f358897f;
        c37243a.f358851l.addAll(this.f358892a);
        c37243a.f358852m.addAll(this.f358893b);
        Long lValueOf = Long.valueOf(this.f358894c);
        c37243a.i(5, 0, lValueOf, lValueOf, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zzb(int i12) {
        int i13 = C37243a.f358839p;
        this.f358897f.i(6, i12, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zzc() {
        if (this.f358895d) {
            return;
        }
        int i12 = C37243a.f358839p;
        C37243a c37243a = this.f358897f;
        W wA2 = c37243a.f358848i.a();
        List list = this.f358892a;
        List list2 = this.f358893b;
        long j12 = this.f358894c;
        List list3 = this.f358896e;
        wA2.a(list3, new t(c37243a, list, list2, j12, true, list3));
    }
}
