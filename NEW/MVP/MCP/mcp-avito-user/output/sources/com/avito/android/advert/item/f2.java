package com.avito.android.advert.item;

import android.graphics.Rect;
import com.avito.android.util.C35758b3;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/f2;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f2 {

    /* compiled from: AdvertDetailsView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/f2$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Rect f75365a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C35758b3 f75366b;

        public a(@Y61.k Rect rect, @Y61.k C35758b3 c35758b3) {
            this.f75365a = rect;
            this.f75366b = c35758b3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f75365a, aVar.f75365a) && kotlin.jvm.internal.L.f(this.f75366b, aVar.f75366b);
        }

        public final int hashCode() {
            return this.f75366b.hashCode() + (this.f75365a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "LocationOnScreen(coordinates=" + this.f75365a + ", margins=" + this.f75366b + ')';
        }
    }
}
