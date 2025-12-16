package x00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import y00.C50029a;

/* compiled from: ManagerUspAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx00/b;", "Lx00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x00.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49713b implements InterfaceC49712a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f441935a;

    @Inject
    public C49713b(@k InterfaceC28373a interfaceC28373a) {
        this.f441935a = interfaceC28373a;
    }

    @Override // x00.InterfaceC49712a
    public final void a(@l String str) {
        this.f441935a.c(new C50029a(str));
    }
}
