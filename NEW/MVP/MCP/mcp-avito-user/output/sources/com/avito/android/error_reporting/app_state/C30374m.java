package com.avito.android.error_reporting.app_state;

import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: AppStateCollectorExposedAbTests.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/m;", "Lcom/avito/android/error_reporting/app_state/a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.error_reporting.app_state.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30374m implements InterfaceC30362a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap<String, String> f147821b = new LinkedHashMap<>();

    @Inject
    public C30374m(@Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147820a = interfaceC4322a;
    }

    public final synchronized void a(@Y61.k String str, @Y61.k String str2) {
        try {
            if (!str2.equals(this.f147821b.put(str, str2))) {
                if (C43066x.K(str2) || str2.equals("control")) {
                    this.f147821b.remove(str);
                }
                List listO = P0.o(this.f147821b);
                InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147820a;
                interfaceC4322a.e("ab_tests.exposed", C35755b0.g(listO, interfaceC4322a.d(), C30373l.f147819l, ""));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
