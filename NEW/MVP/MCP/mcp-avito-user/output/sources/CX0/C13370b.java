package Cx0;

import Dx0.C13457a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoriesAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCx0/b;", "LCx0/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13370b implements InterfaceC13369a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f2808a;

    @Inject
    public C13370b(@k InterfaceC28373a interfaceC28373a) {
        this.f2808a = interfaceC28373a;
    }

    @Override // Cx0.InterfaceC13369a
    public final void a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f2808a.c(new C13457a(str, str3, str2, str4));
    }
}
