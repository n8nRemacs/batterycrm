package com.avito.android.tariff.cpx.limit.sheet.mvi.entity;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLimitInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CloseWithResult", "Content", "HandleCancelDeeplink", "HandleChangeDeeplink", "HandleSaveDeeplink", "InputChange", "InvalidLimit", "ProgressChange", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$Close;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$CloseWithResult;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$Content;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleCancelDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleChangeDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleSaveDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$InputChange;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$InvalidLimit;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$ProgressChange;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxLimitInternalAction extends n {

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$Close;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f297315b = new Close();

        private Close() {
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$CloseWithResult;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Bundle f297316b;

        public CloseWithResult(@k Bundle bundle) {
            this.f297316b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f297316b, ((CloseWithResult) obj).f297316b);
        }

        public final int hashCode() {
            return this.f297316b.hashCode();
        }

        @k
        public final String toString() {
            return H.m(new StringBuilder("CloseWithResult(result="), this.f297316b, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$Content;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCpxLimitInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TariffCpxLimitContent f297317b;

        public Content(@k TariffCpxLimitContent tariffCpxLimitContent) {
            this.f297317b = tariffCpxLimitContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Content) && L.f(this.f297317b, ((Content) obj).f297317b);
        }

        public final int hashCode() {
            return this.f297317b.f297293b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f297317b + ')';
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleCancelDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleCancelDeeplink implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297318b;

        public HandleCancelDeeplink(@l DeepLink deepLink) {
            this.f297318b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleCancelDeeplink) && L.f(this.f297318b, ((HandleCancelDeeplink) obj).f297318b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297318b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleCancelDeeplink(deepLink="), this.f297318b, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleChangeDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleChangeDeeplink implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297319b;

        /* renamed from: c, reason: collision with root package name */
        public final int f297320c;

        public HandleChangeDeeplink(@l DeepLink deepLink, int i12) {
            this.f297319b = deepLink;
            this.f297320c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleChangeDeeplink)) {
                return false;
            }
            HandleChangeDeeplink handleChangeDeeplink = (HandleChangeDeeplink) obj;
            return L.f(this.f297319b, handleChangeDeeplink.f297319b) && this.f297320c == handleChangeDeeplink.f297320c;
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297319b;
            return Integer.hashCode(this.f297320c) + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleChangeDeeplink(deepLink=");
            sb2.append(this.f297319b);
            sb2.append(", limit=");
            return r.t(sb2, this.f297320c, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$HandleSaveDeeplink;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSaveDeeplink implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297321b;

        /* renamed from: c, reason: collision with root package name */
        public final int f297322c;

        public HandleSaveDeeplink(@l DeepLink deepLink, int i12) {
            this.f297321b = deepLink;
            this.f297322c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleSaveDeeplink)) {
                return false;
            }
            HandleSaveDeeplink handleSaveDeeplink = (HandleSaveDeeplink) obj;
            return L.f(this.f297321b, handleSaveDeeplink.f297321b) && this.f297322c == handleSaveDeeplink.f297322c;
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297321b;
            return Integer.hashCode(this.f297322c) + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleSaveDeeplink(deepLink=");
            sb2.append(this.f297321b);
            sb2.append(", limit=");
            return r.t(sb2, this.f297322c, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$InputChange;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f297323b;

        /* renamed from: c, reason: collision with root package name */
        public final int f297324c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f297325d;

        public InputChange(int i12, int i13, @l AttributedText attributedText) {
            this.f297323b = i12;
            this.f297324c = i13;
            this.f297325d = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputChange)) {
                return false;
            }
            InputChange inputChange = (InputChange) obj;
            return this.f297323b == inputChange.f297323b && this.f297324c == inputChange.f297324c && L.f(this.f297325d, inputChange.f297325d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f297324c, Integer.hashCode(this.f297323b) * 31, 31);
            AttributedText attributedText = this.f297325d;
            return iE2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputChange(limit=");
            sb2.append(this.f297323b);
            sb2.append(", remains=");
            sb2.append(this.f297324c);
            sb2.append(", hint=");
            return a.w(sb2, this.f297325d, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$InvalidLimit;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidLimit implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f297326b;

        public InvalidLimit(@l AttributedText attributedText) {
            this.f297326b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidLimit) && L.f(this.f297326b, ((InvalidLimit) obj).f297326b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f297326b;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return a.w(new StringBuilder("InvalidLimit(hint="), this.f297326b, ')');
        }
    }

    /* compiled from: TariffCpxLimitInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction$ProgressChange;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChange implements TariffCpxLimitInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f297327b;

        public ProgressChange(boolean z12) {
            this.f297327b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChange) && this.f297327b == ((ProgressChange) obj).f297327b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f297327b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChange(isLoading="), this.f297327b, ')');
        }
    }
}
