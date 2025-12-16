package com.avito.android.user_address.suggest.mvi;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressSuggestMviAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f;", "", "a", "b", "c", "d", "Lcom/avito/android/user_address/suggest/mvi/f$a;", "Lcom/avito/android/user_address/suggest/mvi/f$b;", "Lcom/avito/android/user_address/suggest/mvi/f$c;", "Lcom/avito/android/user_address/suggest/mvi/f$d;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: UserAddressSuggestMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f$a;", "Lcom/avito/android/user_address/suggest/mvi/f;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f308106a = new a();
    }

    /* compiled from: UserAddressSuggestMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f$b;", "Lcom/avito/android/user_address/suggest/mvi/f;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f308107a = new b();
    }

    /* compiled from: UserAddressSuggestMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f$c;", "Lcom/avito/android/user_address/suggest/mvi/f;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final int f308108a;

        public c(int i12) {
            this.f308108a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f308108a == ((c) obj).f308108a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f308108a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("SelectSuggest(position="), this.f308108a, ')');
        }
    }

    /* compiled from: UserAddressSuggestMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f$d;", "Lcom/avito/android/user_address/suggest/mvi/f;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308109a;

        public d(@Y61.k String str) {
            this.f308109a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f308109a, ((d) obj).f308109a);
        }

        public final int hashCode() {
            return this.f308109a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UserInput(query="), this.f308109a, ')');
        }
    }
}
