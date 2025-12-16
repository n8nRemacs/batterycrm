package androidx.media3.session;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.session.J;
import com.google.common.util.concurrent.AbstractC37532c;

/* compiled from: MediaControllerHolder.java */
/* loaded from: classes.dex */
class L<T extends J> extends AbstractC37532c<T> implements J.b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52118l = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f52119i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public T f52120j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52121k;

    public L(Looper looper) {
        this.f52119i = new Handler(looper);
    }
}
