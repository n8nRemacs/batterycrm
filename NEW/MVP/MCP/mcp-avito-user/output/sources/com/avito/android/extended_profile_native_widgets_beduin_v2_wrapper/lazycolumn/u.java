package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileLazyColumnItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/u;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/k;", "a", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final QH.a f151421a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f151422b;

    /* compiled from: ExtendedProfileLazyColumnItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/u$a;", "", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f151423a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f151424b;

        public a(@Y61.l Integer num, @Y61.l Integer num2) {
            this.f151423a = num;
            this.f151424b = num2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f151423a, aVar.f151423a) && L.f(this.f151424b, aVar.f151424b);
        }

        public final int hashCode() {
            Integer num = this.f151423a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f151424b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WidgetPadding(top=");
            sb2.append(this.f151423a);
            sb2.append(", bottom=");
            return com.akita.compose.component.accordion.s.j(sb2, this.f151424b, ')');
        }
    }

    public u(@Y61.k QH.a aVar, @Y61.k a aVar2) {
        this.f151421a = aVar;
        this.f151422b = aVar2;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k
    @Y61.k
    public final String getId() {
        return this.f151421a.getF145248b();
    }
}
