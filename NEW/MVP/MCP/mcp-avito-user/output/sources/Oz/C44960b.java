package oz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import pz.C47166a;
import pz.C47167b;
import pz.C47168c;
import pz.C47169d;

/* compiled from: SendReportAnalyticsInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loz/b;", "Loz/a;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44960b implements InterfaceC44959a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f422382a;

    @Inject
    public C44960b(@k InterfaceC28373a interfaceC28373a) {
        this.f422382a = interfaceC28373a;
    }

    @Override // oz.InterfaceC44959a
    public final void a(int i12, @k String str) {
        this.f422382a.c(new C47166a(str, i12));
    }

    @Override // oz.InterfaceC44959a
    public final void b(int i12, @k String str) {
        this.f422382a.c(new C47167b(str, i12));
    }

    @Override // oz.InterfaceC44959a
    public final void c(@k String str, @k String str2, @l String str3, @l String str4, @l Integer num) {
        this.f422382a.c(new C47169d(str2, String.valueOf(num), str, str4, str3));
    }

    @Override // oz.InterfaceC44959a
    public final void d(int i12, @k String str) {
        this.f422382a.c(new C47168c(str, i12));
    }
}
