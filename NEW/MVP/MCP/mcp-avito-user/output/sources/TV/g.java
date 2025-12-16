package TV;

import Y61.k;
import com.avito.android.analytics.event.C28449x0;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionRelay.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LTV/g;", "LTV/c;", "LTV/f;", "<init>", "()V", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements c, f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<C28449x0> f15686a = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<e> f15687b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<h> f15688c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<i> f15689d = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<b> f15690e = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<d> f15691f = new com.jakewharton.rxrelay3.c<>();

    @Override // TV.f
    @k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15687b() {
        return this.f15687b;
    }

    @Override // TV.f
    @k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15688c() {
        return this.f15688c;
    }

    @Override // TV.f
    @k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15686a() {
        return this.f15686a;
    }

    @Override // TV.c
    public final void d(@k b bVar) {
        this.f15690e.accept(bVar);
    }

    @Override // TV.c
    public final void e(@k C28449x0 c28449x0) {
        this.f15686a.accept(c28449x0);
    }

    @Override // TV.f
    @k
    /* renamed from: f, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15689d() {
        return this.f15689d;
    }

    @Override // TV.f
    @k
    /* renamed from: g, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15691f() {
        return this.f15691f;
    }

    @Override // TV.c
    public final void h(@k d dVar) {
        this.f15691f.accept(dVar);
    }

    @Override // TV.c
    public final void i(@k e eVar) {
        this.f15687b.accept(eVar);
    }

    @Override // TV.f
    @k
    /* renamed from: j, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF15690e() {
        return this.f15690e;
    }

    @Override // TV.c
    public final void k(@k i iVar) {
        this.f15689d.accept(iVar);
    }

    @Override // TV.c
    public final void l(@k h hVar) {
        this.f15688c.accept(hVar);
    }
}
