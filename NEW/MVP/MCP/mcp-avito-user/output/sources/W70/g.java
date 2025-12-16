package W70;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoGalleryTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW70/g;", "LW70/f;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f17755a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f17756b;

    @Inject
    public g(@k InterfaceC22983P interfaceC22983P, @k InterfaceC28499v interfaceC28499v, @k InterfaceC28501x interfaceC28501x, @k o oVar) {
        this.f17755a = interfaceC28499v;
        this.f17756b = interfaceC28501x;
        oVar.b(new a()).a(interfaceC22983P);
    }

    @Override // W70.f
    public final void a(long j12) {
        this.f17755a.a(j12);
    }

    @Override // W70.f
    public final void d() {
        this.f17756b.b(-1L);
    }

    @Override // W70.f
    public final void e() {
        this.f17756b.start();
    }
}
