package sA0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.suggest_locations.analytics.FromBlock;
import com.avito.android.suggest_locations.di.j;
import javax.inject.Inject;
import kotlin.Metadata;
import tA0.C48528a;

/* compiled from: SuggestLocationsAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsA0/b;", "LsA0/a;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48021b implements InterfaceC48020a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f437503a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437504b;

    @Inject
    public C48021b(@k InterfaceC28373a interfaceC28373a, @j @l String str) {
        this.f437503a = interfaceC28373a;
        this.f437504b = str;
    }

    @Override // sA0.InterfaceC48020a
    public final void a(@l String str, @l String str2, @k String str3, @k FromBlock fromBlock, @l Integer num, @l String str4, @l String str5) {
        this.f437503a.c(new C48528a(str, str2, str3, fromBlock, num, str4, str5, this.f437504b));
    }

    @Override // sA0.InterfaceC48020a
    public final void b(@l Integer num, @l String str, @l String str2, @l String str3) {
        this.f437503a.c(new tA0.b(str, str2, str3, this.f437504b, num));
    }
}
