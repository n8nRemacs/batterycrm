package n2;

import Y61.k;
import android.content.Context;
import android.view.WindowManager;
import androidx.core.view.J0;
import j.InterfaceC42164u;
import j.X;
import kotlin.Metadata;

/* compiled from: ContextCompatHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln2/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/core/view/J0;", "a", "(Landroid/content/Context;)Landroidx/core/view/J0;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f414853a = new d();

    @InterfaceC42164u
    @k
    public final J0 a(@k Context context) {
        return J0.s(null, ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets());
    }
}
