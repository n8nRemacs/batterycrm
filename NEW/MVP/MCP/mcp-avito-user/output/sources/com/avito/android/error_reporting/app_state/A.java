package com.avito.android.error_reporting.app_state;

import android.app.Application;
import android.content.SharedPreferences;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorRepeatedException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/A;", "Lcom/avito/android/error_reporting/app_state/a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements InterfaceC30362a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f147774a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Application f147775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147776c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147777d = C42727D.c(new a());

    /* compiled from: AppStateCollectorRepeatedException.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            A a12 = A.this;
            SharedPreferences sharedPreferences = a12.f147775b.getSharedPreferences("CrashReportUpdaterRepeatedException", 0);
            InterfaceC35950u interfaceC35950u = a12.f147774a;
            if (sharedPreferences.getInt("buildVersion", interfaceC35950u.a()) != interfaceC35950u.a()) {
                sharedPreferences.edit().clear().apply();
            }
            return sharedPreferences;
        }
    }

    @Inject
    public A(@Y61.k InterfaceC35950u interfaceC35950u, @Y61.k Application application, @Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147774a = interfaceC35950u;
        this.f147775b = application;
        this.f147776c = interfaceC4322a;
    }
}
