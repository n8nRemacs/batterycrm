package v3;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27647j;
import com.avito.android.error_reporting.app_state.C30365d;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AbTestsProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv3/a;", "Lcom/avito/android/error_reporting/app_state/d$a;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49154a implements C30365d.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27647j f440423a;

    @Inject
    public C49154a(@k InterfaceC27647j interfaceC27647j) {
        this.f440423a = interfaceC27647j;
    }

    @Override // com.avito.android.error_reporting.app_state.C30365d.a
    @k
    public final Map<String, String> b() {
        return this.f440423a.b();
    }
}
