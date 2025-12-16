package ru.tinkoff.scrollingpagerindicator;

/* compiled from: ScrollingPagerIndicator.java */
/* loaded from: classes9.dex */
class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f437145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f437146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScrollingPagerIndicator f437147d;

    public f(ScrollingPagerIndicator scrollingPagerIndicator, Object obj, e eVar) {
        this.f437147d = scrollingPagerIndicator;
        this.f437145b = obj;
        this.f437146c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollingPagerIndicator scrollingPagerIndicator = this.f437147d;
        scrollingPagerIndicator.f437121n = -1;
        scrollingPagerIndicator.b(this.f437145b, this.f437146c);
    }
}
