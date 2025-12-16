package coil.view;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.r;

/* compiled from: ViewSizeResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/l;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnPreDrawListenerC27258l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public boolean f58770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27256j<View> f58771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f58772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f58773e;

    public ViewTreeObserverOnPreDrawListenerC27258l(InterfaceC27256j interfaceC27256j, ViewTreeObserver viewTreeObserver, r rVar) {
        this.f58771c = interfaceC27256j;
        this.f58772d = viewTreeObserver;
        this.f58773e = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        InterfaceC27256j<View> interfaceC27256j = this.f58771c;
        C27253g size = interfaceC27256j.getSize();
        if (size != null) {
            interfaceC27256j.b(this.f58772d, this);
            if (!this.f58770b) {
                this.f58770b = true;
                int i12 = Z.f406624c;
                this.f58773e.resumeWith(size);
            }
        }
        return true;
    }
}
