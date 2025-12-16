package com.avito.android.error_reporting.app_state;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppStateCollectorAppSignature.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/f;", "Lcom/avito/android/error_reporting/app_state/a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.error_reporting.app_state.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30367f implements InterfaceC30362a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147807a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f147808b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f147809c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f147810d;

    @Inject
    public C30367f(@Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a, @Y61.k Context context, @Y61.k InterfaceC35950u interfaceC35950u, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f147807a = interfaceC4322a;
        this.f147808b = context;
        this.f147809c = interfaceC35950u;
        this.f147810d = interfaceC28373a;
    }
}
