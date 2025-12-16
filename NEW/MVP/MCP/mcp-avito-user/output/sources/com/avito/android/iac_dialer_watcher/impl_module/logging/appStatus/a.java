package com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacAppStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/a;", "", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C4968a f167853e = new C4968a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f167854f = new a(null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f167855a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Z<com.avito.android.connection_quality.reactive_network.a> f167856b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<IacProblem> f167857c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f167858d;

    /* compiled from: IacAppStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/a$a;", "", "<init>", "()V", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a$a, reason: collision with other inner class name */
    public static final class C4968a {
        public /* synthetic */ C4968a(C42822w c42822w) {
            this();
        }

        public C4968a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l Boolean bool, @l Z<com.avito.android.connection_quality.reactive_network.a> z12, @l List<? extends IacProblem> list, @l Boolean bool2) {
        this.f167855a = bool;
        this.f167856b = z12;
        this.f167857c = list;
        this.f167858d = bool2;
    }

    public static a a(a aVar, Boolean bool, Z z12, List list, Boolean bool2, int i12) {
        if ((i12 & 1) != 0) {
            bool = aVar.f167855a;
        }
        if ((i12 & 2) != 0) {
            z12 = aVar.f167856b;
        }
        if ((i12 & 4) != 0) {
            list = aVar.f167857c;
        }
        if ((i12 & 8) != 0) {
            bool2 = aVar.f167858d;
        }
        aVar.getClass();
        return new a(bool, z12, list, bool2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f167855a, aVar.f167855a) && L.f(this.f167856b, aVar.f167856b) && L.f(this.f167857c, aVar.f167857c) && L.f(this.f167858d, aVar.f167858d);
    }

    public final int hashCode() {
        Object obj;
        Boolean bool = this.f167855a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Z<com.avito.android.connection_quality.reactive_network.a> z12 = this.f167856b;
        int iHashCode2 = (iHashCode + ((z12 == null || (obj = z12.f406625b) == null) ? 0 : obj.hashCode())) * 31;
        List<IacProblem> list = this.f167857c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.f167858d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        String string;
        Z<com.avito.android.connection_quality.reactive_network.a> z12 = this.f167856b;
        if (z12 != null) {
            Object obj = z12.f406625b;
            Throwable thB = Z.b(obj);
            string = thB == null ? ((com.avito.android.connection_quality.reactive_network.a) obj).toString() : thB.toString();
        } else {
            string = null;
        }
        StringBuilder sb2 = new StringBuilder("IacAppStatus(isAppForeground=");
        sb2.append(this.f167855a);
        sb2.append(", connectivity=");
        sb2.append(string);
        sb2.append(", iacProblems=");
        sb2.append(this.f167857c);
        sb2.append(", isGsmBusy=");
        return C0.g(sb2, this.f167858d, ')');
    }
}
