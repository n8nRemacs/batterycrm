package Cd0;

import android.annotation.SuppressLint;
import com.avito.android.analytics.publish.FromPage;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishParamsRequestedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCd0/C0;", "Lcom/avito/android/error_reporting/error_reporter/u;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes16.dex */
public final class C0 implements com.avito.android.error_reporting.error_reporter.u {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f2382c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.error_reporting.error_reporter.u f2383b;

    /* compiled from: PublishParamsRequestedEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCd0/C0$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C0(@Y61.k FromPage fromPage, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        f2382c.getClass();
        this.f2383b = com.avito.android.error_reporting.error_reporter.w.a("PublishParamsRequested (from:" + fromPage + ", nav:[" + C42745f0.O(C42756l.B(new String[]{str == null ? str2 : str, str3}), null, null, null, null, 63) + "])");
    }

    @Override // com.avito.android.error_reporting.error_reporter.u
    @Y61.k
    /* renamed from: getName */
    public final String getF147929e() {
        return this.f2383b.getF147929e();
    }
}
