package com.avito.android.suggest_addresses.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.geo_common.model.AddressSuggestionV2;
import com.avito.android.remote.model.SuggestAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddChips", "FinishScreen", "FinishScreenWithResult", "HideKeyboard", "LoadingStarted", "LoadingStopped", "NetworkError", "NoSuggestsError", "ResolveAddressError", "SelectSuggestion", "SetQuery", "SetSuggestions", "UnselectSuggestion", "UpdateSuggests", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$AddChips;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$FinishScreen;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$FinishScreenWithResult;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$HideKeyboard;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$LoadingStarted;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$LoadingStopped;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$NetworkError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$NoSuggestsError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$ResolveAddressError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SelectSuggestion;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SetQuery;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SetSuggestions;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$UnselectSuggestion;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$UpdateSuggests;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SuggestAddressesInternalAction extends n {

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$AddChips;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddChips implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SuggestAddress> f291916b;

        public AddChips(@k List<SuggestAddress> list) {
            this.f291916b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddChips) && L.f(this.f291916b, ((AddChips) obj).f291916b);
        }

        public final int hashCode() {
            return this.f291916b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("AddChips(addresses="), this.f291916b, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$FinishScreen;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishScreen implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishScreen f291917b = new FinishScreen();

        private FinishScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishScreen);
        }

        public final int hashCode() {
            return -1011466735;
        }

        @k
        public final String toString() {
            return "FinishScreen";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$FinishScreenWithResult;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishScreenWithResult implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList<SuggestAddress> f291918b;

        public FinishScreenWithResult(@k ArrayList<SuggestAddress> arrayList) {
            this.f291918b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishScreenWithResult) && L.f(this.f291918b, ((FinishScreenWithResult) obj).f291918b);
        }

        public final int hashCode() {
            return this.f291918b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("FinishScreenWithResult(addresses="), this.f291918b, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$HideKeyboard;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f291919b = new HideKeyboard();

        private HideKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 1578127995;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$LoadingStarted;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingStarted f291920b = new LoadingStarted();

        private LoadingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingStarted);
        }

        public final int hashCode() {
            return 101602903;
        }

        @k
        public final String toString() {
            return "LoadingStarted";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$LoadingStopped;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStopped implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingStopped f291921b = new LoadingStopped();

        private LoadingStopped() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingStopped);
        }

        public final int hashCode() {
            return 114468771;
        }

        @k
        public final String toString() {
            return "LoadingStopped";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$NetworkError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkError implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NetworkError f291922b = new NetworkError();

        private NetworkError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NetworkError);
        }

        public final int hashCode() {
            return 468628396;
        }

        @k
        public final String toString() {
            return "NetworkError";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$NoSuggestsError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoSuggestsError implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoSuggestsError f291923b = new NoSuggestsError();

        private NoSuggestsError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoSuggestsError);
        }

        public final int hashCode() {
            return -14512858;
        }

        @k
        public final String toString() {
            return "NoSuggestsError";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$ResolveAddressError;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResolveAddressError implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResolveAddressError f291924b = new ResolveAddressError();

        private ResolveAddressError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResolveAddressError);
        }

        public final int hashCode() {
            return -1728260338;
        }

        @k
        public final String toString() {
            return "ResolveAddressError";
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SelectSuggestion;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSuggestion implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f291925b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f291926c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SuggestAddress.Kind f291927d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f291928e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f291929f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f291930g;

        public SelectSuggestion(@l String str, @k String str2, @l String str3, @l String str4, @l SuggestAddress.Kind kind, @l String str5) {
            this.f291925b = str;
            this.f291926c = str2;
            this.f291927d = kind;
            this.f291928e = str3;
            this.f291929f = str4;
            this.f291930g = str5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectSuggestion)) {
                return false;
            }
            SelectSuggestion selectSuggestion = (SelectSuggestion) obj;
            return L.f(this.f291925b, selectSuggestion.f291925b) && L.f(this.f291926c, selectSuggestion.f291926c) && this.f291927d == selectSuggestion.f291927d && L.f(this.f291928e, selectSuggestion.f291928e) && L.f(this.f291929f, selectSuggestion.f291929f) && L.f(this.f291930g, selectSuggestion.f291930g);
        }

        public final int hashCode() {
            String str = this.f291925b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f291926c);
            SuggestAddress.Kind kind = this.f291927d;
            int iHashCode = (iD2 + (kind == null ? 0 : kind.hashCode())) * 31;
            String str2 = this.f291928e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f291929f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f291930g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectSuggestion(jsonWebToken=");
            sb2.append(this.f291925b);
            sb2.append(", addressId=");
            sb2.append(this.f291926c);
            sb2.append(", kind=");
            sb2.append(this.f291927d);
            sb2.append(", paramId=");
            sb2.append(this.f291928e);
            sb2.append(", address=");
            sb2.append(this.f291929f);
            sb2.append(", locality=");
            return C22026a.c(sb2, this.f291930g, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SetQuery;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetQuery implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291931b;

        public SetQuery(@k String str) {
            this.f291931b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetQuery) && L.f(this.f291931b, ((SetQuery) obj).f291931b);
        }

        public final int hashCode() {
            return this.f291931b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetQuery(query="), this.f291931b, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$SetSuggestions;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSuggestions implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AddressSuggestionV2> f291932b;

        public SetSuggestions(@k List<AddressSuggestionV2> list) {
            this.f291932b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSuggestions) && L.f(this.f291932b, ((SetSuggestions) obj).f291932b);
        }

        public final int hashCode() {
            return this.f291932b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SetSuggestions(suggests="), this.f291932b, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$UnselectSuggestion;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnselectSuggestion implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f291933b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f291934c;

        public UnselectSuggestion(@l String str, @l String str2) {
            this.f291933b = str;
            this.f291934c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnselectSuggestion)) {
                return false;
            }
            UnselectSuggestion unselectSuggestion = (UnselectSuggestion) obj;
            return L.f(this.f291933b, unselectSuggestion.f291933b) && L.f(this.f291934c, unselectSuggestion.f291934c);
        }

        public final int hashCode() {
            String str = this.f291933b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f291934c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnselectSuggestion(jsonWebToken=");
            sb2.append(this.f291933b);
            sb2.append(", addressId=");
            return C22026a.c(sb2, this.f291934c, ')');
        }
    }

    /* compiled from: SuggestAddressesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction$UpdateSuggests;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSuggests implements SuggestAddressesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateSuggests f291935b = new UpdateSuggests();

        private UpdateSuggests() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateSuggests);
        }

        public final int hashCode() {
            return 1503674378;
        }

        @k
        public final String toString() {
            return "UpdateSuggests";
        }
    }
}
