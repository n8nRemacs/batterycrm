package coil.view;

import Y41.l;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ViewSizeResolver.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: coil.size.k, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27257k extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27256j<View> f58767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f58768m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC27258l f58769n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27257k(InterfaceC27256j interfaceC27256j, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC27258l viewTreeObserverOnPreDrawListenerC27258l) {
        super(1);
        this.f58767l = interfaceC27256j;
        this.f58768m = viewTreeObserver;
        this.f58769n = viewTreeObserverOnPreDrawListenerC27258l;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f58767l.b(this.f58768m, this.f58769n);
        return G0.f406611a;
    }
}
