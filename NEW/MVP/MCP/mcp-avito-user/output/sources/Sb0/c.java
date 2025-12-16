package sB0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffCpxConfigureLevelsAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LsB0/c;", "", "a", "b", "c", "d", "e", "LsB0/c$a;", "LsB0/c$b;", "LsB0/c$c;", "LsB0/c$d;", "LsB0/c$e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TariffCpxConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsB0/c$a;", "LsB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f437511a = new a();
    }

    /* compiled from: TariffCpxConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/c$c;", "LsB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sB0.c$c, reason: collision with other inner class name */
    public static final class C12610c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f437514a;

        /* renamed from: b, reason: collision with root package name */
        public final long f437515b;

        public C12610c(boolean z12, long j12) {
            this.f437514a = z12;
            this.f437515b = j12;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/c$d;", "LsB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f437516a;

        public d(boolean z12) {
            this.f437516a = z12;
        }
    }

    /* compiled from: TariffCpxConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsB0/c$e;", "LsB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f437517a = new e();
    }

    /* compiled from: TariffCpxConfigureLevelsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/c$b;", "LsB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f437512a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f437513b;

        public b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f437512a = deepLink;
            this.f437513b = bundle;
        }

        public /* synthetic */ b(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }
}
