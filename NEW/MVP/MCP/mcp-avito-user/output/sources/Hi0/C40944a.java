package hi0;

import Y61.k;
import Y61.l;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DeveloperSuggestUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_inline-filters_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: hi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40944a {

    /* compiled from: DeveloperSuggestUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hi0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11268a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f397373a;

        static {
            int[] iArr = new int[DevelopmentSuggestV1Suggest.Type.values().length];
            try {
                iArr[DevelopmentSuggestV1Suggest.Type.Developer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DevelopmentSuggestV1Suggest.Type.Development.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f397373a = iArr;
        }
    }

    @k
    public static final InlineFilterValue.InlineFilterDeveloperDevelopmentValue a(@l DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
        if (developmentSuggestV1Suggest == null) {
            return new InlineFilterValue.InlineFilterDeveloperDevelopmentValue(null, null, null);
        }
        int i12 = C11268a.f397373a[developmentSuggestV1Suggest.getType().ordinal()];
        if (i12 == 1) {
            return new InlineFilterValue.InlineFilterDeveloperDevelopmentValue(developmentSuggestV1Suggest.getName(), Long.valueOf(developmentSuggestV1Suggest.getId()), null);
        }
        if (i12 == 2) {
            return new InlineFilterValue.InlineFilterDeveloperDevelopmentValue(developmentSuggestV1Suggest.getName(), null, Long.valueOf(developmentSuggestV1Suggest.getId()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
