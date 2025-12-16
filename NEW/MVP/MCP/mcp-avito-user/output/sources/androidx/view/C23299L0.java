package androidx.view;

import X41.n;
import Y61.k;
import android.view.View;
import kotlin.Metadata;
import kotlin.sequences.C43033p;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/L0;", "", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.L0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23299L0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C23299L0 f52803a = new C23299L0();

    @n
    @k
    public static final C23397v a(@k View view) {
        f52803a.getClass();
        C23397v c23397v = (C23397v) C43033p.n(C43033p.y(C43033p.u(C23296J0.f52801l, view), View.f52802l));
        if (c23397v != null) {
            return c23397v;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
