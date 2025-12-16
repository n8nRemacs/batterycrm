package com.avito.android.extended_profile_ui_components.search_input.suggest;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSuggestInteractorResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c;", "", "a", "b", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c$a;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c$b;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c {

    /* compiled from: ExtendedProfileSuggestInteractorResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c$a;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f153443a;

        public a(@Y61.k List<SuggestItem> list) {
            this.f153443a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f153443a, ((a) obj).f153443a);
        }

        public final int hashCode() {
            return this.f153443a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("SuggestLoaded(suggests="), this.f153443a, ')');
        }
    }

    /* compiled from: ExtendedProfileSuggestInteractorResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c$b;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f153444a;

        public b(@Y61.k Throwable th2) {
            this.f153444a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f153444a, ((b) obj).f153444a);
        }

        public final int hashCode() {
            return this.f153444a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SuggestLoadingError(throwable="), this.f153444a, ')');
        }
    }
}
