package W70;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.photo_gallery.GalleryFragment;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GalleryTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW70/d;", "LW70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f17753a;

    @Inject
    public d(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f17753a = screenPerformanceTracker;
    }

    @Override // W70.c
    public final void a(long j12) {
        this.f17753a.a(j12);
    }

    @Override // W70.c
    public final void b() {
        ScreenPerformanceTracker.a.c(this.f17753a, "image", null, null, 6);
    }

    @Override // W70.c
    public final void c() {
        ScreenPerformanceTracker.a.b(this.f17753a, "image", 2);
    }

    @Override // W70.c
    public final void d() {
        this.f17753a.d();
    }

    @Override // W70.c
    public final void e() {
        this.f17753a.e();
    }

    @Override // W70.c
    public final void f() {
        ScreenPerformanceTracker.a.b(this.f17753a, "image", 2);
    }

    @Override // W70.c
    public final void g() {
        this.f17753a.m("image");
    }

    @Override // W70.c
    public final void h(@k f.a aVar, @k GalleryFragment galleryFragment) {
        this.f17753a.c(galleryFragment, aVar);
    }

    @Override // W70.c
    public final void i(@k Throwable th2) {
        ScreenPerformanceTracker.a.d(this.f17753a, "image", null, new J.a(th2), null, 10);
    }

    @Override // W70.c
    public final void j(@k Throwable th2) {
        ScreenPerformanceTracker.a.c(this.f17753a, "image", new J.a(th2), null, 4);
    }
}
