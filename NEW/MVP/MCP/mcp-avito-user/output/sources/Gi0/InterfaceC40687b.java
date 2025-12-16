package gi0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pi0.C47094a;

/* compiled from: DeveloperSuggestFilterInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lgi0/b;", "", "a", "b", "c", "Lgi0/b$a;", "Lgi0/b$b;", "Lgi0/b$c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40687b {

    /* compiled from: DeveloperSuggestFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/b$a;", "Lgi0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.b$a */
    public static final /* data */ class a implements InterfaceC40687b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DevelopmentSuggestV1Suggest f396738a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f396739b;

        public a(@l DevelopmentSuggestV1Suggest developmentSuggestV1Suggest, @l String str) {
            this.f396738a = developmentSuggestV1Suggest;
            this.f396739b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396738a, aVar.f396738a) && L.f(this.f396739b, aVar.f396739b);
        }

        public final int hashCode() {
            DevelopmentSuggestV1Suggest developmentSuggestV1Suggest = this.f396738a;
            int iHashCode = (developmentSuggestV1Suggest == null ? 0 : developmentSuggestV1Suggest.hashCode()) * 31;
            String str = this.f396739b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(initialSelectedValue=");
            sb2.append(this.f396738a);
            sb2.append(", locationId=");
            return C22026a.c(sb2, this.f396739b, ')');
        }
    }

    /* compiled from: DeveloperSuggestFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/b$b;", "Lgi0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11225b implements InterfaceC40687b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DevelopmentSuggestV1Suggest f396740a;

        public C11225b(@k DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
            this.f396740a = developmentSuggestV1Suggest;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11225b) && L.f(this.f396740a, ((C11225b) obj).f396740a);
        }

        public final int hashCode() {
            return this.f396740a.hashCode();
        }

        @k
        public final String toString() {
            return "SuggestItemSelected(selectedItem=" + this.f396740a + ')';
        }
    }

    /* compiled from: DeveloperSuggestFilterInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgi0/b$c;", "Lgi0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.b$c */
    public static final /* data */ class c implements InterfaceC40687b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396741a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47094a f396742b;

        public c(@k String str, @k C47094a c47094a) {
            this.f396741a = str;
            this.f396742b = c47094a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f396741a, cVar.f396741a) && L.f(this.f396742b, cVar.f396742b);
        }

        public final int hashCode() {
            return this.f396742b.hashCode() + (this.f396741a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "SuggestsLoaded(suggestQuery=" + this.f396741a + ", response=" + this.f396742b + ')';
        }
    }
}
