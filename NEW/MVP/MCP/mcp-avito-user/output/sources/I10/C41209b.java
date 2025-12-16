package i10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import j10.C42175a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectedAppealAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li10/b;", "Li10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C41209b implements InterfaceC41208a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f398340a;

    @Inject
    public C41209b(@k InterfaceC28373a interfaceC28373a) {
        this.f398340a = interfaceC28373a;
    }

    @Override // i10.InterfaceC41208a
    public final void a(@k String str, @k String str2, @l String str3, @l String str4) {
        this.f398340a.c(new C42175a(str, str2, str3, str4));
    }
}
