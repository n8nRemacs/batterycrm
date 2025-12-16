package bf;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoSelectCancelBookingResult.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbf/a;", "", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C25641a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final DeepLink f57317a;

    /* JADX WARN: Multi-variable type inference failed */
    public C25641a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C25641a(@l DeepLink deepLink) {
        this.f57317a = deepLink;
    }

    public /* synthetic */ C25641a(DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink);
    }
}
