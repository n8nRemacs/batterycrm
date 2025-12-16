package androidx.metrics.performance;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.metrics.performance.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JankStats.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/metrics/performance/f;", "", "a", "b", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f52702e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f52703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    @RestrictTo
    public final k f52704b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52705c;

    /* renamed from: d, reason: collision with root package name */
    public final float f52706d;

    /* compiled from: JankStats.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/metrics/performance/f$a;", "", "<init>", "()V", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JankStats.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/metrics/performance/f$b;", "", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void a(@Y61.k c cVar);
    }

    public f(Window window, b bVar, C42822w c42822w) {
        this.f52703a = bVar;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        p.f52728f.getClass();
        p.b bVarA = p.a.a(viewPeekDecorView);
        if (bVarA.f52734a == null) {
            bVarA.f52734a = new p(null);
        }
        k lVar = Build.VERSION.SDK_INT >= 31 ? new l(this, viewPeekDecorView, window) : new k(this, viewPeekDecorView, window);
        this.f52704b = lVar;
        lVar.f52719h.getDecorView().post(new h(true, lVar));
        this.f52705c = true;
        this.f52706d = 2.0f;
    }
}
