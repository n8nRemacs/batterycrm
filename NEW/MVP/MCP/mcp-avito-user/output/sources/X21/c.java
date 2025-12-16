package x21;

import Y61.k;
import Y61.l;
import android.view.View;
import kotlin.Metadata;

/* compiled from: BackKeyPressedHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx21/c;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49755a f442143a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f442144b;

    /* compiled from: BackKeyPressedHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lx21/c$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        boolean a();
    }

    public c(@k C49755a c49755a) {
        this.f442143a = c49755a;
    }

    public final void a() {
        View rootView;
        if (this.f442144b != null) {
            C49755a c49755a = this.f442143a;
            if (c49755a.hasWindowFocus()) {
                c49755a.setFocusable(true);
                c49755a.setFocusableInTouchMode(true);
                if (c49755a.isShown()) {
                    c49755a.requestFocus();
                } else {
                    if (!c49755a.hasFocus() || (rootView = c49755a.getRootView()) == null) {
                        return;
                    }
                    rootView.requestFocus(33);
                }
            }
        }
    }
}
