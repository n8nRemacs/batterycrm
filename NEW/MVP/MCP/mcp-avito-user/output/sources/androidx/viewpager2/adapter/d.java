package androidx.viewpager2.adapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f55087b;

    public d(b bVar) {
        this.f55087b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f55087b;
        bVar.f55074i = false;
        bVar.m();
    }
}
