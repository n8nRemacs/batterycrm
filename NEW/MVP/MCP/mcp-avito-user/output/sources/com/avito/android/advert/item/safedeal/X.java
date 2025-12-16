package com.avito.android.advert.item.safedeal;

import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: NavigatorAfterCartItemAdded.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/safedeal/X;", "", "a", "b", "Lcom/avito/android/advert/item/safedeal/X$a;", "Lcom/avito/android/advert/item/safedeal/X$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface X {

    /* compiled from: NavigatorAfterCartItemAdded.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/X$a;", "Lcom/avito/android/advert/item/safedeal/X;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements X {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f78777a;

        public a(@Y61.k DeepLink deepLink) {
            this.f78777a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f78777a, ((a) obj).f78777a);
        }

        public final int hashCode() {
            return this.f78777a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f78777a, ')');
        }
    }

    /* compiled from: NavigatorAfterCartItemAdded.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/X$b;", "Lcom/avito/android/advert/item/safedeal/X;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements X {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Intent f78778a;

        public b(@Y61.k Intent intent) {
            this.f78778a = intent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f78778a, ((b) obj).f78778a);
        }

        public final int hashCode() {
            return this.f78778a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenIntent(intent=" + this.f78778a + ')';
        }
    }
}
