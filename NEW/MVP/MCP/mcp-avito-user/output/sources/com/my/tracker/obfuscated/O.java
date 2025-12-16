package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f365305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365306d;

    public /* synthetic */ O(n1 n1Var, long j12, int i12) {
        this.f365304b = i12;
        this.f365305c = n1Var;
        this.f365306d = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365304b) {
            case 0:
                this.f365305c.c(this.f365306d);
                break;
            default:
                this.f365305c.d(this.f365306d);
                break;
        }
    }
}
