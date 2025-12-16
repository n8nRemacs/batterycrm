package com.avito.android.bottom_navigation;

import com.avito.android.remote.model.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileButtonState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bottom_navigation/J;", "", "a", "b", "Lcom/avito/android/bottom_navigation/J$a;", "Lcom/avito/android/bottom_navigation/J$b;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface J {

    /* compiled from: ProfileButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/J$a;", "Lcom/avito/android/bottom_navigation/J;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f106953a;

        public a(boolean z12) {
            this.f106953a = z12;
        }

        @Override // com.avito.android.bottom_navigation.J
        /* renamed from: a, reason: from getter */
        public final boolean getF106954a() {
            return this.f106953a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f106953a == ((a) obj).f106953a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106953a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("DEFAULT(isPro="), this.f106953a, ')');
        }
    }

    /* renamed from: a */
    boolean getF106954a();

    /* compiled from: ProfileButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/J$b;", "Lcom/avito/android/bottom_navigation/J;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements J {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f106954a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Avatar f106955b;

        public b(boolean z12, @Y61.l Avatar avatar) {
            this.f106954a = z12;
            this.f106955b = avatar;
        }

        @Override // com.avito.android.bottom_navigation.J
        /* renamed from: a, reason: from getter */
        public final boolean getF106954a() {
            return this.f106954a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f106954a == bVar.f106954a && kotlin.jvm.internal.L.f(this.f106955b, bVar.f106955b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f106954a) * 31;
            Avatar avatar = this.f106955b;
            return iHashCode + (avatar == null ? 0 : avatar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "PASSPORT(isPro=" + this.f106954a + ", avatar=" + this.f106955b + ')';
        }

        public /* synthetic */ b(boolean z12, Avatar avatar, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? null : avatar);
        }
    }
}
