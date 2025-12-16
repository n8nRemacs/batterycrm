package gi0;

import Y61.k;
import Y61.l;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeveloperSuggestFilterOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lgi0/c;", "", "a", "Lgi0/c$a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40688c {

    /* compiled from: DeveloperSuggestFilterOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/c$a;", "Lgi0/c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.c$a */
    public static final /* data */ class a implements InterfaceC40688c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DevelopmentSuggestV1Suggest f396743a;

        public a(@k DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
            this.f396743a = developmentSuggestV1Suggest;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396743a, ((a) obj).f396743a);
        }

        public final int hashCode() {
            return this.f396743a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithSelectedItem(selectedValue=" + this.f396743a + ')';
        }
    }
}
