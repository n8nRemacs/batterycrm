package com.avito.beduin.v2.client.permission;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import androidx.view.n;
import com.avito.beduin.v2.logger.LogLevel;
import i.b;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPermissionsClient.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/client/permission/a;", "Lcom/avito/beduin/v2/client/permission/h;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final androidx.view.result.h<String> f335468a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public g f335469b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f335470c;

    /* compiled from: AndroidPermissionsClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.client.permission.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10382a implements androidx.view.result.a, D {
        public C10382a() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            a.a(a.this, ((Boolean) obj).booleanValue());
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, a.this, a.class, "handlePermissionResult", "handlePermissionResult(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: AndroidPermissionsClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b implements androidx.view.result.a, D {
        public b() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            a.a(a.this, ((Boolean) obj).booleanValue());
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, a.this, a.class, "handlePermissionResult", "handlePermissionResult(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public a(@k n nVar, @l g gVar) {
        this.f335470c = nVar;
        this.f335468a = nVar.registerForActivityResult(new b.l(), new C10382a());
        this.f335469b = gVar;
    }

    public static final void a(a aVar, boolean z12) {
        G0 g02;
        aVar.getClass();
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (1 >= RU0.b.f14469c) {
            RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":PermissionsClient"), "Permission is granted: " + z12);
        }
        g gVar = aVar.f335469b;
        if (gVar != null) {
            if (z12) {
                ((com.avito.beduin.v2.client.permission.b) gVar.f335481a).invoke();
            } else {
                ((c) gVar.f335482b).invoke();
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 != null || 3 < RU0.b.f14469c) {
            return;
        }
        RU0.b.f14468b.e(RU0.b.f14470d + ":PermissionsClient", "PendingResult is null. Unable to handle activity result");
    }

    public a(@k Fragment fragment, @l g gVar) {
        this.f335470c = fragment.requireActivity();
        this.f335468a = fragment.registerForActivityResult(new b.l(), new b());
        this.f335469b = gVar;
    }
}
