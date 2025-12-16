package com.avito.android.rating_form.select_item.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormSearchItemsResult;
import com.avito.android.rating_form.custom_params.m;
import com.avito.android.util.ApiException;
import fh0.InterfaceC40422a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormSelectItemInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Empty", "Error", "Initial", "Loading", "ShowErrorToastBar", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Content;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Empty;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Error;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Initial;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Loading;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$ShowErrorToastBar;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormSelectItemInternalAction extends n {

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Empty;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements RatingFormSelectItemInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f249085b = new Empty();

        private Empty() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -1733847244;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Error;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements RatingFormSelectItemInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f249086b;

        public Error(@k ApiException apiException) {
            this.f249086b = apiException;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f249086b.equals(((Error) obj).f249086b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF328632c() {
            J.a.C2676a c2676a = J.a.f90383b;
            ApiException apiException = this.f249086b;
            c2676a.getClass();
            return J.a.C2676a.c(apiException);
        }

        public final int hashCode() {
            return this.f249086b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f249086b, ')');
        }
    }

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Initial;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial implements RatingFormSelectItemInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final m.a f249087b;

        public Initial(@l m.a aVar) {
            this.f249087b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && L.f(this.f249087b, ((Initial) obj).f249087b);
        }

        public final int hashCode() {
            m.a aVar = this.f249087b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Initial(search=" + this.f249087b + ')';
        }
    }

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Loading;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements RatingFormSelectItemInternalAction {
    }

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$ShowErrorToastBar;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToastBar implements RatingFormSelectItemInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f249088b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f249089c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final PrintableText f249090d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final InterfaceC40422a f249091e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final InterfaceC40422a f249092f;

        public ShowErrorToastBar(PrintableText printableText, Throwable th2, PrintableText printableText2, InterfaceC40422a interfaceC40422a, InterfaceC40422a interfaceC40422a2, int i12, C42822w c42822w) {
            th2 = (i12 & 2) != 0 ? null : th2;
            printableText2 = (i12 & 4) != 0 ? null : printableText2;
            interfaceC40422a = (i12 & 8) != 0 ? null : interfaceC40422a;
            interfaceC40422a2 = (i12 & 16) != 0 ? null : interfaceC40422a2;
            this.f249088b = printableText;
            this.f249089c = th2;
            this.f249090d = printableText2;
            this.f249091e = interfaceC40422a;
            this.f249092f = interfaceC40422a2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToastBar)) {
                return false;
            }
            ShowErrorToastBar showErrorToastBar = (ShowErrorToastBar) obj;
            return L.f(this.f249088b, showErrorToastBar.f249088b) && L.f(this.f249089c, showErrorToastBar.f249089c) && L.f(this.f249090d, showErrorToastBar.f249090d) && L.f(this.f249091e, showErrorToastBar.f249091e) && L.f(this.f249092f, showErrorToastBar.f249092f);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF328632c() {
            J.a.f90383b.getClass();
            return J.a.C2676a.c(this.f249089c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f249088b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            Throwable th2 = this.f249089c;
            int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
            PrintableText printableText2 = this.f249090d;
            int iHashCode3 = (iHashCode2 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
            InterfaceC40422a interfaceC40422a = this.f249091e;
            int iHashCode4 = (iHashCode3 + (interfaceC40422a == null ? 0 : interfaceC40422a.hashCode())) * 31;
            InterfaceC40422a interfaceC40422a2 = this.f249092f;
            return iHashCode4 + (interfaceC40422a2 != null ? interfaceC40422a2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=" + this.f249088b + ", error=" + this.f249089c + ", actionText=" + this.f249090d + ", onClickedAction=" + this.f249091e + ", onDismissedAction=" + this.f249092f + ')';
        }
    }

    /* compiled from: RatingFormSelectItemInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction$Content;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements RatingFormSelectItemInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<RatingFormSearchItemsResult.RatingFormSearchItem> f249081b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f249082c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f249083d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f249084e;

        public Content(@l String str, @l String str2, @l List list, boolean z12) {
            this.f249081b = list;
            this.f249082c = str;
            this.f249083d = str2;
            this.f249084e = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f249081b, content.f249081b) && L.f(this.f249082c, content.f249082c) && L.f(this.f249083d, content.f249083d) && this.f249084e == content.f249084e;
        }

        public final int hashCode() {
            List<RatingFormSearchItemsResult.RatingFormSearchItem> list = this.f249081b;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f249082c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f249083d;
            return Boolean.hashCode(this.f249084e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(this.f249081b);
            sb2.append(", nextPage=");
            sb2.append(this.f249082c);
            sb2.append(", query=");
            sb2.append(this.f249083d);
            sb2.append(", hasPreselectedItem=");
            return r.x(sb2, this.f249084e, ')');
        }

        public /* synthetic */ Content(List list, String str, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, list, (i12 & 8) != 0 ? false : z12);
        }
    }
}
