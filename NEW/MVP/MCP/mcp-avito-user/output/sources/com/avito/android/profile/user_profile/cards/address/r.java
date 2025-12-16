package com.avito.android.profile.user_profile.cards.address;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmptyAddressCardPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/r;", "", "<init>", "()V", "a", "Lcom/avito/android/profile/user_profile/cards/address/r$a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class r {

    /* compiled from: EmptyAddressCardPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/r$a;", "Lcom/avito/android/profile/user_profile/cards/address/r;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f224766a;

        /* renamed from: b, reason: collision with root package name */
        public final int f224767b;

        public a(@Y61.k String str, int i12) {
            super(null);
            this.f224766a = str;
            this.f224767b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f224766a, aVar.f224766a) && this.f224767b == aVar.f224767b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f224767b) + (this.f224766a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DismissAddress(geoSessionId=");
            sb2.append(this.f224766a);
            sb2.append(", suggestAddressId=");
            return androidx.appcompat.app.r.t(sb2, this.f224767b, ')');
        }
    }

    public /* synthetic */ r(C42822w c42822w) {
        this();
    }

    public r() {
    }
}
