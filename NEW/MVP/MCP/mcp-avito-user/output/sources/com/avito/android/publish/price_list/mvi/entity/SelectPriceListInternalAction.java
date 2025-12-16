package com.avito.android.publish.price_list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HideLoading", "InitUiState", "InputSearchQuery", "NavigateToAddObjectScreen", "NavigateToEditObjectScreen", "NavigateToNextStep", "OnBack", "SaveDraftAndExitPublishing", "ScrollToFirstItemError", "ShowContent", "ShowDefaultMessage", "ShowErrorMessage", "ShowLoading", "ShowPriceListClearDialog", "ShowSearchItems", "UpdateExpandItems", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$HideLoading;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$InitUiState;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$InputSearchQuery;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToAddObjectScreen;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToEditObjectScreen;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToNextStep;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$OnBack;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$SaveDraftAndExitPublishing;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ScrollToFirstItemError;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowContent;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowDefaultMessage;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowErrorMessage;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowLoading;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowPriceListClearDialog;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowSearchItems;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$UpdateExpandItems;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface SelectPriceListInternalAction extends n {

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$HideLoading;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideLoading implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideLoading f238793b = new HideLoading();

        private HideLoading() {
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$InitUiState;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitUiState implements SelectPriceListInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<String> f238794b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f238795c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f238796d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f238797e;

        public InitUiState(@l String str, @l String str2, @k Set set, @k String str3) {
            this.f238794b = set;
            this.f238795c = str;
            this.f238796d = str2;
            this.f238797e = str3;
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
            if (!(obj instanceof InitUiState)) {
                return false;
            }
            InitUiState initUiState = (InitUiState) obj;
            return L.f(this.f238794b, initUiState.f238794b) && L.f(this.f238795c, initUiState.f238795c) && L.f(this.f238796d, initUiState.f238796d) && L.f(this.f238797e, initUiState.f238797e);
        }

        public final int hashCode() {
            int iHashCode = this.f238794b.hashCode() * 31;
            String str = this.f238795c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f238796d;
            return this.f238797e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitUiState(expandedState=");
            sb2.append(this.f238794b);
            sb2.append(", headerTitle=");
            sb2.append(this.f238795c);
            sb2.append(", subtitle=");
            sb2.append(this.f238796d);
            sb2.append(", searchInputHint=");
            return C22026a.c(sb2, this.f238797e, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$InputSearchQuery;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputSearchQuery implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f238798b;

        public InputSearchQuery(@k String str) {
            this.f238798b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputSearchQuery) && L.f(this.f238798b, ((InputSearchQuery) obj).f238798b);
        }

        public final int hashCode() {
            return this.f238798b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputSearchQuery(query="), this.f238798b, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToAddObjectScreen;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToAddObjectScreen implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ObjectsParameter f238799b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ObjectFillFormScreenParams.SelectedValue f238800c;

        public NavigateToAddObjectScreen(@k ObjectsParameter objectsParameter, @k ObjectFillFormScreenParams.SelectedValue selectedValue) {
            this.f238799b = objectsParameter;
            this.f238800c = selectedValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToAddObjectScreen)) {
                return false;
            }
            NavigateToAddObjectScreen navigateToAddObjectScreen = (NavigateToAddObjectScreen) obj;
            return L.f(this.f238799b, navigateToAddObjectScreen.f238799b) && L.f(this.f238800c, navigateToAddObjectScreen.f238800c);
        }

        public final int hashCode() {
            return this.f238800c.hashCode() + (this.f238799b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "NavigateToAddObjectScreen(parameter=" + this.f238799b + ", selectedValue=" + this.f238800c + ')';
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToEditObjectScreen;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToEditObjectScreen implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ObjectsParameter f238801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f238802c;

        public NavigateToEditObjectScreen(@k ObjectsParameter objectsParameter, int i12) {
            this.f238801b = objectsParameter;
            this.f238802c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToEditObjectScreen)) {
                return false;
            }
            NavigateToEditObjectScreen navigateToEditObjectScreen = (NavigateToEditObjectScreen) obj;
            return L.f(this.f238801b, navigateToEditObjectScreen.f238801b) && this.f238802c == navigateToEditObjectScreen.f238802c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238802c) + (this.f238801b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToEditObjectScreen(parameter=");
            sb2.append(this.f238801b);
            sb2.append(", position=");
            return r.t(sb2, this.f238802c, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$NavigateToNextStep;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigateToNextStep implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToNextStep f238803b = new NavigateToNextStep();

        private NavigateToNextStep() {
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$OnBack;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBack implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ObjectsParameter f238804b;

        public OnBack(@k ObjectsParameter objectsParameter) {
            this.f238804b = objectsParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBack) && L.f(this.f238804b, ((OnBack) obj).f238804b);
        }

        public final int hashCode() {
            return this.f238804b.hashCode();
        }

        @k
        public final String toString() {
            return "OnBack(parameter=" + this.f238804b + ')';
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$SaveDraftAndExitPublishing;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SaveDraftAndExitPublishing implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SaveDraftAndExitPublishing f238805b = new SaveDraftAndExitPublishing();

        private SaveDraftAndExitPublishing() {
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ScrollToFirstItemError;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToFirstItemError implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f238806b;

        public ScrollToFirstItemError(int i12) {
            this.f238806b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToFirstItemError) && this.f238806b == ((ScrollToFirstItemError) obj).f238806b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238806b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToFirstItemError(position="), this.f238806b, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowContent;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements SelectPriceListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f238807b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f238808c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f238809d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f238810e;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowContent(@l PrintableText printableText, boolean z12, boolean z13, @k List<? extends com.avito.conveyor_item.a> list) {
            this.f238807b = printableText;
            this.f238808c = z12;
            this.f238809d = z13;
            this.f238810e = list;
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
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f238807b, showContent.f238807b) && this.f238808c == showContent.f238808c && this.f238809d == showContent.f238809d && L.f(this.f238810e, showContent.f238810e);
        }

        public final int hashCode() {
            PrintableText printableText = this.f238807b;
            return this.f238810e.hashCode() + r.i(r.i((printableText == null ? 0 : printableText.hashCode()) * 31, 31, this.f238808c), 31, this.f238809d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(mainButtonTitle=");
            sb2.append(this.f238807b);
            sb2.append(", isActionButtonEnabled=");
            sb2.append(this.f238808c);
            sb2.append(", isClearIconVisible=");
            sb2.append(this.f238809d);
            sb2.append(", items=");
            return H.p(sb2, this.f238810e, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowDefaultMessage;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDefaultMessage implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f238811b;

        public ShowDefaultMessage(@k String str) {
            this.f238811b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDefaultMessage) && L.f(this.f238811b, ((ShowDefaultMessage) obj).f238811b);
        }

        public final int hashCode() {
            return this.f238811b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowDefaultMessage(message="), this.f238811b, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowErrorMessage;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorMessage implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f238812b;

        public ShowErrorMessage(@k String str) {
            this.f238812b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorMessage) && L.f(this.f238812b, ((ShowErrorMessage) obj).f238812b);
        }

        public final int hashCode() {
            return this.f238812b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorMessage(message="), this.f238812b, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowLoading;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f238813b = new ShowLoading();

        private ShowLoading() {
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowPriceListClearDialog;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPriceListClearDialog implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f238814b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f238815c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f238816d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f238817e;

        public ShowPriceListClearDialog(@k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4) {
            this.f238814b = printableText;
            this.f238815c = printableText2;
            this.f238816d = printableText3;
            this.f238817e = printableText4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPriceListClearDialog)) {
                return false;
            }
            ShowPriceListClearDialog showPriceListClearDialog = (ShowPriceListClearDialog) obj;
            return L.f(this.f238814b, showPriceListClearDialog.f238814b) && L.f(this.f238815c, showPriceListClearDialog.f238815c) && L.f(this.f238816d, showPriceListClearDialog.f238816d) && L.f(this.f238817e, showPriceListClearDialog.f238817e);
        }

        public final int hashCode() {
            return this.f238817e.hashCode() + com.avito.android.actions_sheet.a.f(this.f238816d, com.avito.android.actions_sheet.a.f(this.f238815c, this.f238814b.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPriceListClearDialog(title=");
            sb2.append(this.f238814b);
            sb2.append(", subtitle=");
            sb2.append(this.f238815c);
            sb2.append(", positiveButtonText=");
            sb2.append(this.f238816d);
            sb2.append(", negativeButtonText=");
            return AK.c.m(sb2, this.f238817e, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$ShowSearchItems;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSearchItems implements SelectPriceListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f238818b;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowSearchItems(@k List<? extends com.avito.conveyor_item.a> list) {
            this.f238818b = list;
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
            return (obj instanceof ShowSearchItems) && L.f(this.f238818b, ((ShowSearchItems) obj).f238818b);
        }

        public final int hashCode() {
            return this.f238818b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowSearchItems(items="), this.f238818b, ')');
        }
    }

    /* compiled from: SelectPriceListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction$UpdateExpandItems;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateExpandItems implements SelectPriceListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f238819b;

        public UpdateExpandItems(@k ArrayList arrayList) {
            this.f238819b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateExpandItems) && this.f238819b.equals(((UpdateExpandItems) obj).f238819b);
        }

        public final int hashCode() {
            return this.f238819b.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("UpdateExpandItems(items="), this.f238819b, ')');
        }
    }
}
