package Ki;

import FV0.e;
import Y61.k;
import androidx.fragment.app.FragmentManager;
import com.avito.beduin.v2.interaction.navigation.flow.p;
import com.avito.beduin.v2.interaction.navigation.flow.t;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultFragmentNavigationHost.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKi/a;", "LFV0/e;", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ki.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14316a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9629a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FragmentManager f9630b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f9631c;

    public C14316a(int i12, @k FragmentManager fragmentManager, @k p pVar) {
        this.f9629a = i12;
        this.f9630b = fragmentManager;
        this.f9631c = pVar;
    }

    public static void c(C14316a c14316a) {
        c14316a.getClass();
        t.f337543c.getClass();
        c14316a.f9631c.l(new t.c(null), true, true, null);
    }

    @Override // FV0.e
    @k
    /* renamed from: a, reason: from getter */
    public final FragmentManager getF9630b() {
        return this.f9630b;
    }

    @Override // FV0.e
    /* renamed from: b, reason: from getter */
    public final int getF9629a() {
        return this.f9629a;
    }
}
