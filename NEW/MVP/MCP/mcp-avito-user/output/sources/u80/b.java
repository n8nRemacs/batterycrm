package U80;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInfoMapperV1.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* compiled from: PositionInfoMapperV1.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16217a;

        static {
            int[] iArr = new int[ApiButtonOptional.Style.values().length];
            try {
                iArr[ApiButtonOptional.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiButtonOptional.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16217a = iArr;
        }
    }

    public static final PositionInfoButton a(ApiButtonOptional apiButtonOptional) {
        PositionInfoButton.Style style;
        String title = apiButtonOptional.getTitle();
        DeepLink deepLink = apiButtonOptional.getDeepLink();
        int i12 = a.f16217a[apiButtonOptional.getStyle().ordinal()];
        if (i12 == 1) {
            style = PositionInfoButton.Style.f220427b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            style = PositionInfoButton.Style.f220428c;
        }
        return new PositionInfoButton(title, deepLink, style);
    }
}
