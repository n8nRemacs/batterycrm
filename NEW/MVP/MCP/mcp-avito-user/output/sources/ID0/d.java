package Id0;

import Y61.k;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import j.X;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishKeyboardInsetsAnimation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LId0/d;", "Landroid/view/WindowInsetsAnimation$Callback;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes16.dex */
public final class d extends WindowInsetsAnimation$Callback {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8219b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f8220a;

    /* compiled from: PublishKeyboardInsetsAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LId0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(View view, C42822w c42822w) {
        super(0);
        this.f8220a = view;
    }

    public final void onEnd(@k WindowInsetsAnimation windowInsetsAnimation) {
        J0 j0O = C22823h0.o(this.f8220a);
        if (j0O == null || j0O.p(8)) {
            return;
        }
        View view = this.f8220a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, 0);
        view.setLayoutParams(marginLayoutParams);
    }

    @k
    public final WindowInsets onProgress(@k WindowInsets windowInsets, @k List<WindowInsetsAnimation> list) {
        Insets insetsMax = Insets.max(Insets.subtract(windowInsets.getInsets(WindowInsets.Type.ime()), windowInsets.getInsets(7)), Insets.NONE);
        View view = this.f8220a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, insetsMax.bottom);
        view.setLayoutParams(marginLayoutParams);
        return windowInsets;
    }
}
