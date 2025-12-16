package com.avito.android.advert.navbar;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResovableColor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/navbar/r;", "", "a", "b", "c", "Lcom/avito/android/advert/navbar/r$a;", "Lcom/avito/android/advert/navbar/r$b;", "Lcom/avito/android/advert/navbar/r$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface r {

    /* compiled from: ResovableColor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/r$a;", "Lcom/avito/android/advert/navbar/r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements r {

        /* renamed from: a, reason: collision with root package name */
        public final int f80875a;

        public a(@InterfaceC42150f int i12) {
            this.f80875a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f80875a == ((a) obj).f80875a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f80875a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ByAttr(colorAttr="), this.f80875a, ')');
        }
    }

    /* compiled from: ResovableColor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/r$b;", "Lcom/avito/android/advert/navbar/r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements r {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @Y61.k
        public final String toString() {
            return "ByRes(colorRes=0)";
        }
    }

    /* compiled from: ResovableColor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/r$c;", "Lcom/avito/android/advert/navbar/r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f80876a;

        public c(@Y61.k UniversalColor universalColor) {
            this.f80876a = universalColor;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f80876a, ((c) obj).f80876a);
        }

        public final int hashCode() {
            return this.f80876a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("ByUniversalColor(universalColor="), this.f80876a, ')');
        }
    }
}
