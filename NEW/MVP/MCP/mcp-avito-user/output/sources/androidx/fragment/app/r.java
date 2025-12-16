package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class r<E> extends AbstractC22957o {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final ActivityC22955m f46583b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ActivityC22955m f46584c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Handler f46585d;

    /* renamed from: e, reason: collision with root package name */
    public final FragmentManager f46586e;

    public r(@j.N ActivityC22955m activityC22955m) {
        Handler handler = new Handler();
        this.f46586e = new C22964w();
        this.f46583b = activityC22955m;
        this.f46584c = activityC22955m;
        this.f46585d = handler;
    }

    @Override // androidx.fragment.app.AbstractC22957o
    @j.P
    public View b(int i12) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC22957o
    public boolean c() {
        return true;
    }

    @j.P
    public abstract ActivityC22955m e();

    @j.N
    public LayoutInflater f() {
        return LayoutInflater.from(this.f46584c);
    }

    public boolean g(@j.N String str) {
        return false;
    }

    public void h() {
    }

    public void d(@j.N PrintWriter printWriter, @j.P String[] strArr) {
    }
}
