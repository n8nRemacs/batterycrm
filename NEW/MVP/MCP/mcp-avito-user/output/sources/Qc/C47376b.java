package qc;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.LoggingType;
import com.avito.android.analytics.event.d1;
import com.avito.android.analytics.event.e1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SnippetScrollDepthAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqc/b;", "Lqc/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47376b implements InterfaceC47375a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429323a;

    @Inject
    public C47376b(@k InterfaceC28373a interfaceC28373a) {
        this.f429323a = interfaceC28373a;
    }

    @Override // qc.InterfaceC47375a
    public final void a(int i12, @k List<String> list, @l Integer num, @k String str, int i13, @k LoggingType loggingType) {
        this.f429323a.c(new d1(i12, list, num, str, i13, loggingType.f89664b));
    }

    @Override // qc.InterfaceC47375a
    public final void b(int i12, @k List<String> list, @l Integer num, @k String str, int i13, @k LoggingType loggingType) {
        this.f429323a.c(new e1(i12, list, num, str, i13, loggingType.f89664b));
    }
}
