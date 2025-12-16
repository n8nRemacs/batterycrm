package com.avito.android.service_booking_user_profile.view.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import du0.C39805a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState;", "", "Type", "a", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockState {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ServiceBookingBlockParams f278246a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C39805a f278247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Type f278248c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f278249d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlockState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$Type;", "", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f278250b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f278251c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f278252d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f278253e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f278254f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278255g;

        static {
            Type type = new Type("NONE", 0);
            f278250b = type;
            Type type2 = new Type("LOADING", 1);
            f278251c = type2;
            Type type3 = new Type("LOADED", 2);
            f278252d = type3;
            Type type4 = new Type("ERROR", 3);
            f278253e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f278254f = typeArr;
            f278255g = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f278254f.clone();
        }
    }

    /* compiled from: ServiceBookingBlockState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a;", "", "a", "b", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a$a;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a$b;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ServiceBookingBlockState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a$a;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8270a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.service_booking_user_profile.view.item.a f278256a;

            public C8270a(@k com.avito.android.service_booking_user_profile.view.item.a aVar) {
                this.f278256a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8270a) && L.f(this.f278256a, ((C8270a) obj).f278256a);
            }

            public final int hashCode() {
                return this.f278256a.hashCode();
            }

            @k
            public final String toString() {
                return "Data(item=" + this.f278256a + ')';
            }
        }

        /* compiled from: ServiceBookingBlockState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a$b;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState$a;", "<init>", "()V", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f278257a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 943939383;
            }

            @k
            public final String toString() {
                return "Empty";
            }
        }
    }

    public ServiceBookingBlockState() {
        this(null, null, null, null, 15, null);
    }

    public static ServiceBookingBlockState a(ServiceBookingBlockState serviceBookingBlockState, C39805a c39805a, Type type, a aVar, int i12) {
        ServiceBookingBlockParams serviceBookingBlockParams = serviceBookingBlockState.f278246a;
        if ((i12 & 2) != 0) {
            c39805a = serviceBookingBlockState.f278247b;
        }
        serviceBookingBlockState.getClass();
        return new ServiceBookingBlockState(serviceBookingBlockParams, c39805a, type, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockState)) {
            return false;
        }
        ServiceBookingBlockState serviceBookingBlockState = (ServiceBookingBlockState) obj;
        return L.f(this.f278246a, serviceBookingBlockState.f278246a) && L.f(this.f278247b, serviceBookingBlockState.f278247b) && this.f278248c == serviceBookingBlockState.f278248c && L.f(this.f278249d, serviceBookingBlockState.f278249d);
    }

    public final int hashCode() {
        ServiceBookingBlockParams serviceBookingBlockParams = this.f278246a;
        int iHashCode = (serviceBookingBlockParams == null ? 0 : serviceBookingBlockParams.hashCode()) * 31;
        C39805a c39805a = this.f278247b;
        return this.f278249d.hashCode() + ((this.f278248c.hashCode() + ((iHashCode + (c39805a != null ? c39805a.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ServiceBookingBlockState(blockParams=" + this.f278246a + ", blockData=" + this.f278247b + ", stateType=" + this.f278248c + ", viewState=" + this.f278249d + ')';
    }

    public ServiceBookingBlockState(@l ServiceBookingBlockParams serviceBookingBlockParams, @l C39805a c39805a, @k Type type, @k a aVar) {
        this.f278246a = serviceBookingBlockParams;
        this.f278247b = c39805a;
        this.f278248c = type;
        this.f278249d = aVar;
    }

    public /* synthetic */ ServiceBookingBlockState(ServiceBookingBlockParams serviceBookingBlockParams, C39805a c39805a, Type type, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : serviceBookingBlockParams, (i12 & 2) != 0 ? null : c39805a, (i12 & 4) != 0 ? Type.f278250b : type, (i12 & 8) != 0 ? a.b.f278257a : aVar);
    }
}
