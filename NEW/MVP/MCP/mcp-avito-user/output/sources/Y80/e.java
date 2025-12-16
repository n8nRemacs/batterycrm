package Y80;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToastConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY80/e;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<String, G0> f19364a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f19365b;

    /* compiled from: ToastConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PositionInfoPeriod.AdditionalToast.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionInfoPeriod.AdditionalToast.Type type = PositionInfoPeriod.AdditionalToast.Type.f220435b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super String, G0> lVar, @k l<? super String, G0> lVar2) {
        this.f19364a = lVar;
        this.f19365b = lVar2;
    }
}
