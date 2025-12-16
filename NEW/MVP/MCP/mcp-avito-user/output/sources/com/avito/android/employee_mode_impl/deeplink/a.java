package com.avito.android.employee_mode_impl.deeplink;

import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink;", "a", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<EmployeeModeSwitchLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f147322f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f147323g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f147324h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final R0 f147325i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.g f147326j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.i f147327k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Resources f147328l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C43238h f147329m;

    /* compiled from: EmployeeModeSwitchLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "", "a", "b", "c", "Lcom/avito/android/employee_mode_impl/deeplink/a$a$a;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a$b;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a$c;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_mode_impl.deeplink.a$a, reason: collision with other inner class name */
    public interface InterfaceC4290a {

        /* compiled from: EmployeeModeSwitchLinkHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a$a$a;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C4291a implements InterfaceC4290a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f147330a;

            /* JADX WARN: Multi-variable type inference failed */
            public C4291a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public C4291a(@l ApiError apiError) {
                this.f147330a = apiError;
            }

            public /* synthetic */ C4291a(ApiError apiError, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : apiError);
            }
        }

        /* compiled from: EmployeeModeSwitchLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a$a$b;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.deeplink.a$a$b */
        public static final class b implements InterfaceC4290a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f147331a = new b();
        }

        /* compiled from: EmployeeModeSwitchLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/a$a$c;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.deeplink.a$a$c */
        public static final class c implements InterfaceC4290a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f147332a = new c();
        }
    }

    /* compiled from: EmployeeModeSwitchLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[EmployeeModeSwitchLink.SwitchSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EmployeeModeSwitchLink.SwitchSource switchSource = EmployeeModeSwitchLink.SwitchSource.f133303b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EmployeeModeSwitchLink.SwitchSource switchSource2 = EmployeeModeSwitchLink.SwitchSource.f133303b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k C25719a c25719a, @Y61.k R0 r02, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k Resources resources) {
        this.f147322f = aVar;
        this.f147323g = interfaceC41196a;
        this.f147324h = c25719a;
        this.f147325i = r02;
        this.f147326j = gVar;
        this.f147327k = iVar;
        this.f147328l = resources;
        this.f147329m = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    public static EmployeeModeSwitchSource l(EmployeeModeSwitchLink employeeModeSwitchLink) {
        int iOrdinal = employeeModeSwitchLink.f133302e.ordinal();
        if (iOrdinal == 0) {
            return EmployeeModeSwitchSource.f147573c;
        }
        if (iOrdinal == 1) {
            return EmployeeModeSwitchSource.f147574d;
        }
        if (iOrdinal == 2) {
            return EmployeeModeSwitchSource.f147575e;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        EmployeeModeSwitchLink employeeModeSwitchLink = (EmployeeModeSwitchLink) deepLink;
        this.f147324h.b(employeeModeSwitchLink, this, null, new c(this, employeeModeSwitchLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f147329m, null);
    }

    public final void k(EmployeeModeSwitchLink employeeModeSwitchLink) {
        DeepLink deepLink = employeeModeSwitchLink.f133300c;
        if (deepLink == null) {
            j(EmployeeModeSwitchLink.b.a.c.f133310b);
        } else {
            i(EmployeeModeSwitchLink.b.InterfaceC4000b.c.f133313b, this.f147322f, deepLink);
        }
    }
}
