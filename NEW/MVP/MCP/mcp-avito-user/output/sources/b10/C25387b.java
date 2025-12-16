package b10;

import Y61.k;
import androidx.compose.runtime.internal.P;
import c10.C26920a;
import c10.C26921b;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImmutableInfoDescriptionAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb10/b;", "Lb10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C25387b implements InterfaceC25386a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f56816a;

    @Inject
    public C25387b(@k InterfaceC28373a interfaceC28373a) {
        this.f56816a = interfaceC28373a;
    }

    @Override // b10.InterfaceC25386a
    public final void a(@k String str, @k String str2, @k String str3) {
        this.f56816a.c(new C26920a(str, str2, str3));
    }

    @Override // b10.InterfaceC25386a
    public final void b(@k String str, @k String str2) {
        this.f56816a.c(new C26921b(str, str2));
    }
}
