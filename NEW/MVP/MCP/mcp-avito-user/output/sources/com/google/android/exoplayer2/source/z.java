package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.A;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.a f346702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f346703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36554q f346704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C36557u f346705f;

    public /* synthetic */ z(A.a aVar, A a12, C36554q c36554q, C36557u c36557u, int i12) {
        this.f346701b = i12;
        this.f346702c = aVar;
        this.f346703d = a12;
        this.f346704e = c36554q;
        this.f346705f = c36557u;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f346701b) {
            case 0:
                A.a aVar = this.f346702c;
                int i12 = aVar.f345902a;
                this.f346703d.k(i12, aVar.f345903b, this.f346704e, this.f346705f);
                break;
            case 1:
                A.a aVar2 = this.f346702c;
                int i13 = aVar2.f345902a;
                this.f346703d.m(i13, aVar2.f345903b, this.f346704e, this.f346705f);
                break;
            default:
                A.a aVar3 = this.f346702c;
                int i14 = aVar3.f345902a;
                this.f346703d.r(i14, aVar3.f345903b, this.f346704e, this.f346705f);
                break;
        }
    }
}
