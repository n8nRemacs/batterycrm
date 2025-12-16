package Gh;

import Y61.k;
import com.avito.android.C29270c0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.ownership.Owners;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kj.C42699b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: BeduinV1AnalyticsInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGh/b;", "Lkj/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13881b implements kj.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f6707a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C29270c0 f6708b;

    @Inject
    public C13881b(@k InterfaceC28373a interfaceC28373a, @k C29270c0 c29270c0) {
        this.f6707a = interfaceC28373a;
        this.f6708b = c29270c0;
    }

    @Override // kj.d
    public final void a(@k Screen screen) {
        this.f6707a.c(new g(screen.f90471b));
    }

    @Override // kj.d
    public final void b(@k C42699b c42699b) {
        if (c42699b.f406552d) {
            C29270c0 c29270c0 = this.f6708b;
            n<Object> nVar = C29270c0.f113263t[6];
            if (((Boolean) c29270c0.f113270h.a().invoke()).booleanValue()) {
                List<Owners> list = c42699b.f406550b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Owners) it.next()).f210562b.f444076b);
                }
                this.f6707a.c(new e(c42699b.f406549a, c42699b.f406551c, arrayList));
            }
        }
    }
}
