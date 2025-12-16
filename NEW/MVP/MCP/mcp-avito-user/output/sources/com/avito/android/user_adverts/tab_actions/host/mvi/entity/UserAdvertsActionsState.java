package com.avito.android.user_adverts.tab_actions.host.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionsState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "ActionState", "a", "c", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsActionsState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsActionsState> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f314463b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ActionState f314464c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f314465d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f314466e;

    /* compiled from: UserAdvertsActionsState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState;", "Landroid/os/Parcelable;", "AwaitConfirmation", "AwaitResult", "None", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$AwaitConfirmation;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$AwaitResult;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$None;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ActionState extends Parcelable {

        /* compiled from: UserAdvertsActionsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$AwaitConfirmation;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AwaitConfirmation implements ActionState {

            @k
            public static final Parcelable.Creator<AwaitConfirmation> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertActionType f314467b;

            /* compiled from: UserAdvertsActionsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AwaitConfirmation> {
                @Override // android.os.Parcelable.Creator
                public final AwaitConfirmation createFromParcel(Parcel parcel) {
                    return new AwaitConfirmation((UserAdvertActionType) parcel.readParcelable(AwaitConfirmation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final AwaitConfirmation[] newArray(int i12) {
                    return new AwaitConfirmation[i12];
                }
            }

            public AwaitConfirmation(@k UserAdvertActionType userAdvertActionType) {
                this.f314467b = userAdvertActionType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AwaitConfirmation) && L.f(this.f314467b, ((AwaitConfirmation) obj).f314467b);
            }

            public final int hashCode() {
                return this.f314467b.hashCode();
            }

            @k
            public final String toString() {
                return "AwaitConfirmation(action=" + this.f314467b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f314467b, i12);
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$AwaitResult;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AwaitResult implements ActionState {

            @k
            public static final Parcelable.Creator<AwaitResult> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertActionType f314468b;

            /* compiled from: UserAdvertsActionsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AwaitResult> {
                @Override // android.os.Parcelable.Creator
                public final AwaitResult createFromParcel(Parcel parcel) {
                    return new AwaitResult((UserAdvertActionType) parcel.readParcelable(AwaitResult.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final AwaitResult[] newArray(int i12) {
                    return new AwaitResult[i12];
                }
            }

            public AwaitResult(@k UserAdvertActionType userAdvertActionType) {
                this.f314468b = userAdvertActionType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AwaitResult) && L.f(this.f314468b, ((AwaitResult) obj).f314468b);
            }

            public final int hashCode() {
                return this.f314468b.hashCode();
            }

            @k
            public final String toString() {
                return "AwaitResult(action=" + this.f314468b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f314468b, i12);
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState$None;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$ActionState;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class None implements ActionState {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final None f314469b = new None();

            @k
            public static final Parcelable.Creator<None> CREATOR = new a();

            /* compiled from: UserAdvertsActionsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return None.f314469b;
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
                return 1664470587;
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

    /* compiled from: UserAdvertsActionsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a;", "", "a", "b", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9709a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertActionsInfoDomain f314470a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertsGroupData f314471b;

            public C9709a(@k UserAdvertsGroupData userAdvertsGroupData, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
                this.f314470a = userAdvertActionsInfoDomain;
                this.f314471b = userAdvertsGroupData;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9709a)) {
                    return false;
                }
                C9709a c9709a = (C9709a) obj;
                return L.f(this.f314470a, c9709a.f314470a) && L.f(this.f314471b, c9709a.f314471b);
            }

            public final int hashCode() {
                return this.f314471b.f312182b.hashCode() + (this.f314470a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Multiple(actionsInfo=" + this.f314470a + ", groupData=" + this.f314471b + ')';
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f314472a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f314473b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AvailableActionsDomain f314474c;

            public b(@k String str, @k String str2, @k AvailableActionsDomain availableActionsDomain) {
                this.f314472a = str;
                this.f314473b = str2;
                this.f314474c = availableActionsDomain;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f314472a, bVar.f314472a) && L.f(this.f314473b, bVar.f314473b) && L.f(this.f314474c, bVar.f314474c);
            }

            public final int hashCode() {
                return this.f314474c.f314259b.hashCode() + H.d(this.f314472a.hashCode() * 31, 31, this.f314473b);
            }

            @k
            public final String toString() {
                return "Single(advertId=" + this.f314472a + ", advertTitle=" + this.f314473b + ", availableActions=" + this.f314474c + ')';
            }
        }
    }

    /* compiled from: UserAdvertsActionsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAdvertsActionsState> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionsState createFromParcel(Parcel parcel) {
            return new UserAdvertsActionsState(parcel.readString(), (ActionState) parcel.readParcelable(UserAdvertsActionsState.class.getClassLoader()), null, null, 12, null);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsActionsState[] newArray(int i12) {
            return new UserAdvertsActionsState[i12];
        }
    }

    /* compiled from: UserAdvertsActionsState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c;", "", "a", "b", "c", "d", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$c;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f314475a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -769643020;
            }

            @k
            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f314476a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f314477b;

            public b(@k PrintableText printableText, @k PrintableText printableText2) {
                this.f314476a = printableText;
                this.f314477b = printableText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f314476a, bVar.f314476a) && L.f(this.f314477b, bVar.f314477b);
            }

            public final int hashCode() {
                return this.f314477b.hashCode() + (this.f314476a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Limit(selectedCountText=");
                sb2.append(this.f314476a);
                sb2.append(", limitText=");
                return AK.c.m(sb2, this.f314477b, ')');
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$c;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$c$c, reason: collision with other inner class name */
        public static final /* data */ class C9710c implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f314478a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<com.avito.android.user_adverts.tab_actions.host.items.a> f314479b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f314480c;

            public C9710c(@k PrintableText printableText, @k List<com.avito.android.user_adverts.tab_actions.host.items.a> list, boolean z12) {
                this.f314478a = printableText;
                this.f314479b = list;
                this.f314480c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9710c)) {
                    return false;
                }
                C9710c c9710c = (C9710c) obj;
                return L.f(this.f314478a, c9710c.f314478a) && L.f(this.f314479b, c9710c.f314479b) && this.f314480c == c9710c.f314480c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f314480c) + H.e(this.f314478a.hashCode() * 31, 31, this.f314479b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MultipleActions(selectedCountText=");
                sb2.append(this.f314478a);
                sb2.append(", actionItems=");
                sb2.append(this.f314479b);
                sb2.append(", isLoading=");
                return r.x(sb2, this.f314480c, ')');
            }
        }

        /* compiled from: UserAdvertsActionsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c$d;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f314481a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f314482b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<UserAdvertSingleActionItem> f314483c;

            public d(@k PrintableText printableText, @k String str, @k List list) {
                this.f314481a = str;
                this.f314482b = printableText;
                this.f314483c = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f314481a, dVar.f314481a) && L.f(this.f314482b, dVar.f314482b) && L.f(this.f314483c, dVar.f314483c);
            }

            public final int hashCode() {
                return this.f314483c.hashCode() + com.avito.android.actions_sheet.a.f(this.f314482b, this.f314481a.hashCode() * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SingleAction(advertId=");
                sb2.append(this.f314481a);
                sb2.append(", advertTitle=");
                sb2.append(this.f314482b);
                sb2.append(", actionItems=");
                return H.p(sb2, this.f314483c, ')');
            }
        }
    }

    public UserAdvertsActionsState() {
        this(null, null, null, null, 15, null);
    }

    public static UserAdvertsActionsState a(UserAdvertsActionsState userAdvertsActionsState, String str, ActionState actionState, a aVar, c cVar, int i12) {
        if ((i12 & 1) != 0) {
            str = userAdvertsActionsState.f314463b;
        }
        if ((i12 & 2) != 0) {
            actionState = userAdvertsActionsState.f314464c;
        }
        if ((i12 & 4) != 0) {
            aVar = userAdvertsActionsState.f314465d;
        }
        if ((i12 & 8) != 0) {
            cVar = userAdvertsActionsState.f314466e;
        }
        userAdvertsActionsState.getClass();
        return new UserAdvertsActionsState(str, actionState, aVar, cVar);
    }

    @l
    public final UserAdvertActionType c() {
        ActionState actionState = this.f314464c;
        ActionState.AwaitResult awaitResult = actionState instanceof ActionState.AwaitResult ? (ActionState.AwaitResult) actionState : null;
        if (awaitResult != null) {
            return awaitResult.f314468b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsActionsState)) {
            return false;
        }
        UserAdvertsActionsState userAdvertsActionsState = (UserAdvertsActionsState) obj;
        return L.f(this.f314463b, userAdvertsActionsState.f314463b) && L.f(this.f314464c, userAdvertsActionsState.f314464c) && L.f(this.f314465d, userAdvertsActionsState.f314465d) && L.f(this.f314466e, userAdvertsActionsState.f314466e);
    }

    public final int hashCode() {
        int iHashCode = (this.f314464c.hashCode() + (this.f314463b.hashCode() * 31)) * 31;
        a aVar = this.f314465d;
        return this.f314466e.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "UserAdvertsActionsState(shortcut=" + this.f314463b + ", actionState=" + this.f314464c + ", actionsInfo=" + this.f314465d + ", viewState=" + this.f314466e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f314463b);
        parcel.writeParcelable(this.f314464c, i12);
    }

    public /* synthetic */ UserAdvertsActionsState(String str, ActionState actionState, a aVar, c cVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? ActionState.None.f314469b : actionState, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? c.a.f314475a : cVar);
    }

    public UserAdvertsActionsState(@k String str, @k ActionState actionState, @l a aVar, @k c cVar) {
        this.f314463b = str;
        this.f314464c = actionState;
        this.f314465d = aVar;
        this.f314466e = cVar;
    }
}
