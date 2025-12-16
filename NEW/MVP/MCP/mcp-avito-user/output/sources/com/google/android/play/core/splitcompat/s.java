package com.google.android.play.core.splitcompat;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f358680b;

    public s(a aVar) {
        this.f358680b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f358680b.f358653a.b();
        } catch (Exception unused) {
        }
    }
}
