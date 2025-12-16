package com.avito.android.user_adverts.tab_screens.adverts.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertsListNextPageDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import org.webrtc.h;

/* compiled from: UserAdvertsListState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "ChoiceMode", "DataState", "ViewState", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsListState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsListState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f315384b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserAdvertsSpace f315385c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f315386d;

    /* renamed from: e, reason: collision with root package name */
    public final int f315387e;

    /* renamed from: f, reason: collision with root package name */
    public final int f315388f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f315389g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f315390h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f315391i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final UserAdvertsSearchStartFromType f315392j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f315393k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Map<String, Object> f315394l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Map<String, Object> f315395m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final DataState f315396n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ChoiceMode f315397o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ViewState f315398p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final UserAdvertsListParams f315399q;

    /* compiled from: UserAdvertsListState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode;", "Landroid/os/Parcelable;", "Multiply", "None", "Single", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Multiply;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$None;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ChoiceMode extends Parcelable {

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Multiply;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Multiply implements ChoiceMode {

            @k
            public static final Parcelable.Creator<Multiply> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertsGroupData f315400b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UserAdvertActionsInfoDomain f315401c;

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Multiply> {
                @Override // android.os.Parcelable.Creator
                public final Multiply createFromParcel(Parcel parcel) {
                    return new Multiply(UserAdvertsGroupData.CREATOR.createFromParcel(parcel), UserAdvertActionsInfoDomain.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Multiply[] newArray(int i12) {
                    return new Multiply[i12];
                }
            }

            public Multiply(@k UserAdvertsGroupData userAdvertsGroupData, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
                this.f315400b = userAdvertsGroupData;
                this.f315401c = userAdvertActionsInfoDomain;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Multiply)) {
                    return false;
                }
                Multiply multiply = (Multiply) obj;
                return L.f(this.f315400b, multiply.f315400b) && L.f(this.f315401c, multiply.f315401c);
            }

            public final int hashCode() {
                return this.f315401c.hashCode() + (this.f315400b.f312182b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Multiply(groupData=" + this.f315400b + ", actionsInfo=" + this.f315401c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                this.f315400b.writeToParcel(parcel, i12);
                this.f315401c.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$None;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class None implements ChoiceMode {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final None f315402b = new None();

            @k
            public static final Parcelable.Creator<None> CREATOR = new a();

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return None.f315402b;
                }

                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i12) {
                    return new None[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -1255334856;
            }

            @k
            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UserAdvertsListState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode;", "Loaded", "Loading", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single$Loaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single$Loading;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Single extends ChoiceMode {

            /* compiled from: UserAdvertsListState.kt */
            @d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single$Loaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Loaded implements Single {

                @k
                public static final Parcelable.Creator<Loaded> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f315403b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f315404c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final AvailableActionsDomain f315405d;

                /* compiled from: UserAdvertsListState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Loaded> {
                    @Override // android.os.Parcelable.Creator
                    public final Loaded createFromParcel(Parcel parcel) {
                        return new Loaded(parcel.readString(), parcel.readString(), AvailableActionsDomain.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Loaded[] newArray(int i12) {
                        return new Loaded[i12];
                    }
                }

                public Loaded(@k String str, @k String str2, @k AvailableActionsDomain availableActionsDomain) {
                    this.f315403b = str;
                    this.f315404c = str2;
                    this.f315405d = availableActionsDomain;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Loaded)) {
                        return false;
                    }
                    Loaded loaded = (Loaded) obj;
                    return L.f(this.f315403b, loaded.f315403b) && L.f(this.f315404c, loaded.f315404c) && L.f(this.f315405d, loaded.f315405d);
                }

                @Override // com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF315406b() {
                    return this.f315403b;
                }

                public final int hashCode() {
                    return this.f315405d.f314259b.hashCode() + H.d(this.f315403b.hashCode() * 31, 31, this.f315404c);
                }

                @k
                public final String toString() {
                    return "Loaded(advertId=" + this.f315403b + ", advertTitle=" + this.f315404c + ", availableActions=" + this.f315405d + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f315403b);
                    parcel.writeString(this.f315404c);
                    this.f315405d.writeToParcel(parcel, i12);
                }
            }

            /* compiled from: UserAdvertsListState.kt */
            @d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single$Loading;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ChoiceMode$Single;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Loading implements Single {

                @k
                public static final Parcelable.Creator<Loading> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f315406b;

                /* compiled from: UserAdvertsListState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Loading> {
                    @Override // android.os.Parcelable.Creator
                    public final Loading createFromParcel(Parcel parcel) {
                        return new Loading(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Loading[] newArray(int i12) {
                        return new Loading[i12];
                    }
                }

                public Loading(@k String str) {
                    this.f315406b = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Loading) && L.f(this.f315406b, ((Loading) obj).f315406b);
                }

                @Override // com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single
                @k
                /* renamed from: getAdvertId, reason: from getter */
                public final String getF315406b() {
                    return this.f315406b;
                }

                public final int hashCode() {
                    return this.f315406b.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Loading(advertId="), this.f315406b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f315406b);
                }
            }

            @k
            /* renamed from: getAdvertId */
            String getF315406b();
        }
    }

    /* compiled from: UserAdvertsListState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState;", "Landroid/os/Parcelable;", "Error", "Loaded", "Loading", "None", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Error;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Loaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Loading;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$None;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DataState extends Parcelable {

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Error;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements DataState {

            @k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f315407b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Throwable f315408c;

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error((ApiError) parcel.readParcelable(Error.class.getClassLoader()), (Throwable) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error(@k ApiError apiError, @l Throwable th2) {
                this.f315407b = apiError;
                this.f315408c = th2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return L.f(this.f315407b, error.f315407b) && L.f(this.f315408c, error.f315408c);
            }

            public final int hashCode() {
                int iHashCode = this.f315407b.hashCode() * 31;
                Throwable th2 = this.f315408c;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f315407b);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f315408c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f315407b, i12);
                parcel.writeSerializable(this.f315408c);
            }
        }

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Loaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements DataState {

            @k
            public static final Parcelable.Creator<Loaded> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<UserAdvertsBaseItemDomain> f315409b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UserAdvertsListNextPageDomain f315410c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Integer f315411d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final UserAdvertActionsInfoDomain f315412e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f315413f;

            /* renamed from: g, reason: collision with root package name */
            public final int f315414g;

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loaded> {
                @Override // android.os.Parcelable.Creator
                public final Loaded createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Loaded.class, parcel, arrayList, iL2, 1);
                    }
                    return new Loaded(arrayList, (UserAdvertsListNextPageDomain) parcel.readParcelable(Loaded.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? UserAdvertActionsInfoDomain.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Loaded[] newArray(int i12) {
                    return new Loaded[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Loaded(@k List<? extends UserAdvertsBaseItemDomain> list, @k UserAdvertsListNextPageDomain userAdvertsListNextPageDomain, @l Integer num, @l UserAdvertActionsInfoDomain userAdvertActionsInfoDomain, boolean z12, int i12) {
                this.f315409b = list;
                this.f315410c = userAdvertsListNextPageDomain;
                this.f315411d = num;
                this.f315412e = userAdvertActionsInfoDomain;
                this.f315413f = z12;
                this.f315414g = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return L.f(this.f315409b, loaded.f315409b) && L.f(this.f315410c, loaded.f315410c) && L.f(this.f315411d, loaded.f315411d) && L.f(this.f315412e, loaded.f315412e) && this.f315413f == loaded.f315413f && this.f315414g == loaded.f315414g;
            }

            public final int hashCode() {
                int iHashCode = (this.f315410c.hashCode() + (this.f315409b.hashCode() * 31)) * 31;
                Integer num = this.f315411d;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = this.f315412e;
                return Integer.hashCode(this.f315414g) + r.i((iHashCode2 + (userAdvertActionsInfoDomain != null ? userAdvertActionsInfoDomain.hashCode() : 0)) * 31, 31, this.f315413f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(list=");
                sb2.append(this.f315409b);
                sb2.append(", nextPage=");
                sb2.append(this.f315410c);
                sb2.append(", totalCount=");
                sb2.append(this.f315411d);
                sb2.append(", actionsInfo=");
                sb2.append(this.f315412e);
                sb2.append(", isLoadingMore=");
                sb2.append(this.f315413f);
                sb2.append(", nextPageIndex=");
                return r.t(sb2, this.f315414g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Iterator itJ = C0.j(this.f315409b, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
                parcel.writeParcelable(this.f315410c, i12);
                Integer num = this.f315411d;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = this.f315412e;
                if (userAdvertActionsInfoDomain == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    userAdvertActionsInfoDomain.writeToParcel(parcel, i12);
                }
                parcel.writeInt(this.f315413f ? 1 : 0);
                parcel.writeInt(this.f315414g);
            }
        }

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$Loading;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading implements DataState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Loading f315415b = new Loading();

            @k
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.f315415b;
                }

                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i12) {
                    return new Loading[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1773606965;
            }

            @k
            public final String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UserAdvertsListState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState$None;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$DataState;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class None implements DataState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final None f315416b = new None();

            @k
            public static final Parcelable.Creator<None> CREATOR = new a();

            /* compiled from: UserAdvertsListState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return None.f315416b;
                }

                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i12) {
                    return new None[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -1417622775;
            }

            @k
            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: UserAdvertsListState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState$ViewState;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ViewState implements Parcelable {

        @k
        public static final Parcelable.Creator<ViewState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f315417b;

        /* compiled from: UserAdvertsListState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readValue(ViewState.class.getClassLoader()));
                }
                return new ViewState(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i12) {
                return new ViewState[i12];
            }
        }

        public ViewState() {
            this(null, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && L.f(this.f315417b, ((ViewState) obj).f315417b);
        }

        public final int hashCode() {
            return this.f315417b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ViewState(items="), this.f315417b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f315417b, parcel);
            while (itJ.hasNext()) {
                parcel.writeValue(itJ.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(@k List<? extends com.avito.conveyor_item.a> list) {
            this.f315417b = list;
        }

        public ViewState(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: UserAdvertsListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsListState> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            UserAdvertsSpace userAdvertsSpaceValueOf = UserAdvertsSpace.valueOf(parcel.readString());
            int i12 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UserAdvertsSearchStartFromType userAdvertsSearchStartFromTypeValueOf = parcel.readInt() == 0 ? null : UserAdvertsSearchStartFromType.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            int iC2 = 0;
            while (iC2 != i15) {
                iC2 = h.c(UserAdvertsListState.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                linkedHashMap = linkedHashMap;
                i15 = i15;
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            int i16 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i16);
            while (i12 != i16) {
                int iC3 = h.c(UserAdvertsListState.class, parcel, linkedHashMap3, parcel.readString(), i12, 1);
                i16 = i16;
                linkedHashMap3 = linkedHashMap3;
                i12 = iC3;
            }
            return new UserAdvertsListState(string, userAdvertsSpaceValueOf, z12, i13, i14, string2, string3, string4, userAdvertsSearchStartFromTypeValueOf, z13, linkedHashMap2, linkedHashMap3, (DataState) parcel.readParcelable(UserAdvertsListState.class.getClassLoader()), (ChoiceMode) parcel.readParcelable(UserAdvertsListState.class.getClassLoader()), ViewState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UserAdvertsListParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListState[] newArray(int i12) {
            return new UserAdvertsListState[i12];
        }
    }

    public /* synthetic */ UserAdvertsListState(String str, UserAdvertsSpace userAdvertsSpace, boolean z12, int i12, int i13, String str2, String str3, String str4, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, boolean z13, Map map, Map map2, DataState dataState, ChoiceMode choiceMode, ViewState viewState, UserAdvertsListParams userAdvertsListParams, int i14, C42822w c42822w) {
        this(str, userAdvertsSpace, z12, i12, i13, str2, str3, (i14 & 128) != 0 ? "" : str4, (i14 & 256) != 0 ? null : userAdvertsSearchStartFromType, (i14 & 512) != 0 ? false : z13, (i14 & 1024) != 0 ? P0.c() : map, (i14 & 2048) != 0 ? P0.c() : map2, (i14 & 4096) != 0 ? DataState.None.f315416b : dataState, (i14 & 8192) != 0 ? ChoiceMode.None.f315402b : choiceMode, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new ViewState(null, 1, null) : viewState, (i14 & 32768) != 0 ? null : userAdvertsListParams);
    }

    public static UserAdvertsListState a(UserAdvertsListState userAdvertsListState, UserAdvertsSpace userAdvertsSpace, boolean z12, int i12, int i13, String str, String str2, String str3, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, boolean z13, Map map, Map map2, DataState dataState, ChoiceMode choiceMode, ViewState viewState, UserAdvertsListParams userAdvertsListParams, int i14) {
        String str4 = userAdvertsListState.f315384b;
        UserAdvertsSpace userAdvertsSpace2 = (i14 & 2) != 0 ? userAdvertsListState.f315385c : userAdvertsSpace;
        boolean z14 = (i14 & 4) != 0 ? userAdvertsListState.f315386d : z12;
        int i15 = (i14 & 8) != 0 ? userAdvertsListState.f315387e : i12;
        int i16 = (i14 & 16) != 0 ? userAdvertsListState.f315388f : i13;
        String str5 = (i14 & 32) != 0 ? userAdvertsListState.f315389g : str;
        String str6 = (i14 & 64) != 0 ? userAdvertsListState.f315390h : str2;
        String str7 = (i14 & 128) != 0 ? userAdvertsListState.f315391i : str3;
        UserAdvertsSearchStartFromType userAdvertsSearchStartFromType2 = (i14 & 256) != 0 ? userAdvertsListState.f315392j : userAdvertsSearchStartFromType;
        boolean z15 = (i14 & 512) != 0 ? userAdvertsListState.f315393k : z13;
        Map map3 = (i14 & 1024) != 0 ? userAdvertsListState.f315394l : map;
        Map map4 = (i14 & 2048) != 0 ? userAdvertsListState.f315395m : map2;
        DataState dataState2 = (i14 & 4096) != 0 ? userAdvertsListState.f315396n : dataState;
        ChoiceMode choiceMode2 = (i14 & 8192) != 0 ? userAdvertsListState.f315397o : choiceMode;
        ViewState viewState2 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? userAdvertsListState.f315398p : viewState;
        UserAdvertsListParams userAdvertsListParams2 = (i14 & 32768) != 0 ? userAdvertsListState.f315399q : userAdvertsListParams;
        userAdvertsListState.getClass();
        return new UserAdvertsListState(str4, userAdvertsSpace2, z14, i15, i16, str5, str6, str7, userAdvertsSearchStartFromType2, z15, map3, map4, dataState2, choiceMode2, viewState2, userAdvertsListParams2);
    }

    public final boolean c() {
        UserAdvertsListParams userAdvertsListParams = this.f315399q;
        if (userAdvertsListParams == null) {
            return (C43066x.K(this.f315391i) && L.f(this.f315394l, this.f315395m)) ? false : true;
        }
        UserAdvertsListParams.SearchInfo searchInfo = userAdvertsListParams.f314698d;
        return (C43066x.K(searchInfo.f314700b) && L.f(searchInfo.f314702d, searchInfo.f314703e)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsListState)) {
            return false;
        }
        UserAdvertsListState userAdvertsListState = (UserAdvertsListState) obj;
        return L.f(this.f315384b, userAdvertsListState.f315384b) && this.f315385c == userAdvertsListState.f315385c && this.f315386d == userAdvertsListState.f315386d && this.f315387e == userAdvertsListState.f315387e && this.f315388f == userAdvertsListState.f315388f && L.f(this.f315389g, userAdvertsListState.f315389g) && L.f(this.f315390h, userAdvertsListState.f315390h) && L.f(this.f315391i, userAdvertsListState.f315391i) && this.f315392j == userAdvertsListState.f315392j && this.f315393k == userAdvertsListState.f315393k && L.f(this.f315394l, userAdvertsListState.f315394l) && L.f(this.f315395m, userAdvertsListState.f315395m) && L.f(this.f315396n, userAdvertsListState.f315396n) && L.f(this.f315397o, userAdvertsListState.f315397o) && L.f(this.f315398p, userAdvertsListState.f315398p) && L.f(this.f315399q, userAdvertsListState.f315399q);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(r.e(this.f315388f, r.e(this.f315387e, r.i((this.f315385c.hashCode() + (this.f315384b.hashCode() * 31)) * 31, 31, this.f315386d), 31), 31), 31, this.f315389g), 31, this.f315390h), 31, this.f315391i);
        UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = this.f315392j;
        int iE2 = H.e((this.f315397o.hashCode() + ((this.f315396n.hashCode() + c.c(c.c(r.i((iD2 + (userAdvertsSearchStartFromType == null ? 0 : userAdvertsSearchStartFromType.hashCode())) * 31, 31, this.f315393k), 31, this.f315394l), 31, this.f315395m)) * 31)) * 31, 31, this.f315398p.f315417b);
        UserAdvertsListParams userAdvertsListParams = this.f315399q;
        return iE2 + (userAdvertsListParams != null ? userAdvertsListParams.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UserAdvertsListState(shortcut=" + this.f315384b + ", userAdvertsSpace=" + this.f315385c + ", userIsPro=" + this.f315386d + ", shortcutIndex=" + this.f315387e + ", shortcutAdvertCount=" + this.f315388f + ", profileSettingsIdempotencyKey=" + this.f315389g + ", reAgentProfileStateIdempotencyKey=" + this.f315390h + ", searchQuery=" + this.f315391i + ", searchStartFrom=" + this.f315392j + ", queryByTitle=" + this.f315393k + ", filterParams=" + this.f315394l + ", defaultFilterParams=" + this.f315395m + ", dataState=" + this.f315396n + ", choiceMode=" + this.f315397o + ", viewState=" + this.f315398p + ", params=" + this.f315399q + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f315384b);
        parcel.writeString(this.f315385c.name());
        parcel.writeInt(this.f315386d ? 1 : 0);
        parcel.writeInt(this.f315387e);
        parcel.writeInt(this.f315388f);
        parcel.writeString(this.f315389g);
        parcel.writeString(this.f315390h);
        parcel.writeString(this.f315391i);
        UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = this.f315392j;
        if (userAdvertsSearchStartFromType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(userAdvertsSearchStartFromType.name());
        }
        parcel.writeInt(this.f315393k ? 1 : 0);
        Iterator itI = C0.i(parcel, this.f315394l);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
        Iterator itI2 = C0.i(parcel, this.f315395m);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            h.h(parcel, (String) entry2.getKey(), entry2);
        }
        parcel.writeParcelable(this.f315396n, i12);
        parcel.writeParcelable(this.f315397o, i12);
        this.f315398p.writeToParcel(parcel, i12);
        UserAdvertsListParams userAdvertsListParams = this.f315399q;
        if (userAdvertsListParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userAdvertsListParams.writeToParcel(parcel, i12);
        }
    }

    public UserAdvertsListState(@k String str, @k UserAdvertsSpace userAdvertsSpace, boolean z12, int i12, int i13, @k String str2, @k String str3, @k String str4, @l UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, boolean z13, @k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2, @k DataState dataState, @k ChoiceMode choiceMode, @k ViewState viewState, @l UserAdvertsListParams userAdvertsListParams) {
        this.f315384b = str;
        this.f315385c = userAdvertsSpace;
        this.f315386d = z12;
        this.f315387e = i12;
        this.f315388f = i13;
        this.f315389g = str2;
        this.f315390h = str3;
        this.f315391i = str4;
        this.f315392j = userAdvertsSearchStartFromType;
        this.f315393k = z13;
        this.f315394l = map;
        this.f315395m = map2;
        this.f315396n = dataState;
        this.f315397o = choiceMode;
        this.f315398p = viewState;
        this.f315399q = userAdvertsListParams;
    }
}
