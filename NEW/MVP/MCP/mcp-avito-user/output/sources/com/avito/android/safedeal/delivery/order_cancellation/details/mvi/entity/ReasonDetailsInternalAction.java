package com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Option;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "CommentTextChanged", "ItemsConverted", "Loading", "OpenFbsScreen", "SelectedOptionChanged", "ShowSnackbarError", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$CommentTextChanged;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$ItemsConverted;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$Loading;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$OpenFbsScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$SelectedOptionChanged;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$ShowSnackbarError;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ReasonDetailsInternalAction extends n {

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ReasonDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f256248b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -504291392;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$CommentTextChanged;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommentTextChanged implements ReasonDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f256249b;

        public CommentTextChanged(@l String str) {
            this.f256249b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentTextChanged) && L.f(this.f256249b, ((CommentTextChanged) obj).f256249b);
        }

        public final int hashCode() {
            String str = this.f256249b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CommentTextChanged(commentText="), this.f256249b, ')');
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$ItemsConverted;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsConverted implements ReasonDetailsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f256250b;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemsConverted(@k List<? extends a> list) {
            this.f256250b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemsConverted) && L.f(this.f256250b, ((ItemsConverted) obj).f256250b);
        }

        public final int hashCode() {
            return this.f256250b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ItemsConverted(itemsList="), this.f256250b, ')');
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$Loading;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements ReasonDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f256251b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -971846024;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$OpenFbsScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFbsScreen implements ReasonDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenFbsScreen f256252b = new OpenFbsScreen();

        private OpenFbsScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenFbsScreen);
        }

        public final int hashCode() {
            return 470036373;
        }

        @k
        public final String toString() {
            return "OpenFbsScreen";
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$SelectedOptionChanged;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedOptionChanged implements ReasonDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Option f256253b;

        public SelectedOptionChanged(@l Option option) {
            this.f256253b = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedOptionChanged) && L.f(this.f256253b, ((SelectedOptionChanged) obj).f256253b);
        }

        public final int hashCode() {
            Option option = this.f256253b;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "SelectedOptionChanged(option=" + this.f256253b + ')';
        }
    }

    /* compiled from: ReasonDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction$ShowSnackbarError;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSnackbarError implements ReasonDetailsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f256254b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f256255c;

        public ShowSnackbarError(@k PrintableText printableText, @k ApiError apiError) {
            this.f256254b = printableText;
            this.f256255c = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSnackbarError)) {
                return false;
            }
            ShowSnackbarError showSnackbarError = (ShowSnackbarError) obj;
            return L.f(this.f256254b, showSnackbarError.f256254b) && L.f(this.f256255c, showSnackbarError.f256255c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF211602c() {
            return new J.a(this.f256255c);
        }

        public final int hashCode() {
            return this.f256255c.hashCode() + (this.f256254b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSnackbarError(errorText=");
            sb2.append(this.f256254b);
            sb2.append(", error=");
            return c.n(sb2, this.f256255c, ')');
        }
    }
}
