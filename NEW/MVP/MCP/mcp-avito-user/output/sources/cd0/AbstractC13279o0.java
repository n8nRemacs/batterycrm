package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yc.C50213a;

/* compiled from: PhotoUploadedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCd0/o0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "b", "LCd0/o0$a;", "LCd0/o0$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.o0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC13279o0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2460b;

    /* compiled from: PhotoUploadedEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/o0$a;", "LCd0/o0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cd0.o0$a */
    public static final class a extends AbstractC13279o0 {
        public a(@Y61.k C50213a c50213a, int i12, boolean z12) {
            super(c50213a, i12, false, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: PhotoUploadedEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/o0$b;", "LCd0/o0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cd0.o0$b */
    public static final class b extends AbstractC13279o0 {
    }

    public /* synthetic */ AbstractC13279o0(C50213a c50213a, int i12, boolean z12, Boolean bool, int i13, C42822w c42822w) {
        this(c50213a, i12, z12, (i13 & 8) != 0 ? null : bool, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f2460b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2460b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f2460b.f90248c;
    }

    public AbstractC13279o0(C50213a c50213a, int i12, boolean z12, Boolean bool, C42822w c42822w) {
        Map mapL = kotlin.collections.P0.l(kotlin.collections.P0.l(c50213a.a(), new kotlin.Q("at", Integer.valueOf(i12))), new kotlin.Q("image_status", Boolean.valueOf(z12)));
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            mapL = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("image_error", "service error", mapL);
        } else if (kotlin.jvm.internal.L.f(bool, Boolean.FALSE)) {
            mapL = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("image_error", "user client error", mapL);
        }
        this.f2460b = new ParametrizedClickStreamEvent(5657, 1, mapL, null, 8, null);
    }
}
