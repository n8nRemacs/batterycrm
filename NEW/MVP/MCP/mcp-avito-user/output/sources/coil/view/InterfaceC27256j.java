package coil.view;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.view.AbstractC27249c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: ViewSizeResolver.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcoil/size/j;", "Landroid/view/View;", "T", "Lcoil/size/h;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27256j<T extends View> extends InterfaceC27254h {

    /* compiled from: ViewSizeResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.size.j$a */
    public static final class a {
    }

    static AbstractC27249c d(int i12, int i13, int i14) {
        if (i12 == -2) {
            return AbstractC27249c.b.f58760a;
        }
        int i15 = i12 - i14;
        if (i15 > 0) {
            return new AbstractC27249c.a(i15);
        }
        int i16 = i13 - i14;
        if (i16 > 0) {
            return new AbstractC27249c.a(i16);
        }
        return null;
    }

    @Override // coil.view.InterfaceC27254h
    @l
    default Object a(@k Continuation<? super C27253g> continuation) {
        Object size = getSize();
        if (size == null) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC27258l viewTreeObserverOnPreDrawListenerC27258l = new ViewTreeObserverOnPreDrawListenerC27258l(this, viewTreeObserver, rVar);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC27258l);
            rVar.r(new C27257k(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC27258l));
            size = rVar.o();
            if (size == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return size;
    }

    default void b(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean c() {
        return true;
    }

    default AbstractC27249c getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return d(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), c() ? getView().getPaddingBottom() + getView().getPaddingTop() : 0);
    }

    default C27253g getSize() {
        AbstractC27249c height;
        AbstractC27249c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new C27253g(width, height);
    }

    @k
    T getView();

    default AbstractC27249c getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), c() ? getView().getPaddingRight() + getView().getPaddingLeft() : 0);
    }
}
