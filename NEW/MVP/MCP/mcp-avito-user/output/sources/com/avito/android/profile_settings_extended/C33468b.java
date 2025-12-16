package com.avito.android.profile_settings_extended;

import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.remote.D0;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: CommonValueInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/b;", "Lcom/avito/android/profile_settings_extended/a;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33468b implements InterfaceC33467a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f229992a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f229993b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap.KeySetView f229994c = ConcurrentHashMap.newKeySet();

    /* compiled from: CommonValueInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a;", "", "a", "b", "c", "Lcom/avito/android/profile_settings_extended/b$a$a;", "Lcom/avito/android/profile_settings_extended/b$a$b;", "Lcom/avito/android/profile_settings_extended/b$a$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.b$a */
    public interface a {

        /* compiled from: CommonValueInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a$a;", "Lcom/avito/android/profile_settings_extended/b$a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7001a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommonValueId f229995a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f229996b;

            public C7001a(@Y61.k CommonValueId commonValueId, @Y61.k Throwable th2) {
                this.f229995a = commonValueId;
                this.f229996b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7001a)) {
                    return false;
                }
                C7001a c7001a = (C7001a) obj;
                return kotlin.jvm.internal.L.f(this.f229995a, c7001a.f229995a) && kotlin.jvm.internal.L.f(this.f229996b, c7001a.f229996b);
            }

            public final int hashCode() {
                return this.f229996b.hashCode() + (this.f229995a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Failure(id=");
                sb2.append(this.f229995a);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f229996b, ')');
            }
        }

        /* compiled from: CommonValueInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a$b;", "Lcom/avito/android/profile_settings_extended/b$a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C7002b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommonValueId f229997a;

            public C7002b(@Y61.k CommonValueId commonValueId) {
                this.f229997a = commonValueId;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7002b) && kotlin.jvm.internal.L.f(this.f229997a, ((C7002b) obj).f229997a);
            }

            public final int hashCode() {
                return this.f229997a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "InProgress(id=" + this.f229997a + ')';
            }
        }

        /* compiled from: CommonValueInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/b$a$c;", "Lcom/avito/android/profile_settings_extended/b$a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.b$a$c */
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CommonValueId f229998a;

            public c(@Y61.k CommonValueId commonValueId) {
                this.f229998a = commonValueId;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f229998a, ((c) obj).f229998a);
            }

            public final int hashCode() {
                return this.f229998a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(id=" + this.f229998a + ')';
            }
        }
    }

    @Inject
    public C33468b(@Y61.k Gson gson, @Y61.k h31.e eVar) {
        this.f229992a = eVar;
        this.f229993b = gson;
    }

    @Override // com.avito.android.profile_settings_extended.InterfaceC33467a
    public final boolean a(@Y61.k CommonValueId commonValueId) {
        return this.f229994c.contains(commonValueId);
    }

    @Override // com.avito.android.profile_settings_extended.InterfaceC33467a
    @Y61.k
    public final C43152f0 b(@Y61.k CommonValueId commonValueId) {
        return new C43152f0(C43175k.G(new C33469c(this, commonValueId, null)), new C33470d(this, commonValueId, null));
    }
}
