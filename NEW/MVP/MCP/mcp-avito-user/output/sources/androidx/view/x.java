package androidx.view;

import Y41.a;
import Y61.k;
import Y61.l;
import j.K;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnBackPressedCallback.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/x;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21286a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<j> f21287b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @l
    public a<G0> f21288c;

    public x(boolean z12) {
        this.f21286a = z12;
    }

    @K
    public abstract void c();

    @K
    public final void d(boolean z12) {
        this.f21286a = z12;
        a<G0> aVar = this.f21288c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
