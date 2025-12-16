package com.avito.android.tariff_cpt.info.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wC0.s;

/* compiled from: CptInfoV2InternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeFeatureGroups", "Content", "Error", "HandleDeeplink", "HeaderItemChangeState", "Loading", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Back;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$ChangeFeatureGroups;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Content;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$HeaderItemChangeState;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Loading;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CptInfoV2InternalAction extends n {

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Back;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements CptInfoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f298239b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1237342075;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$ChangeFeatureGroups;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFeatureGroups implements CptInfoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f298240b;

        public ChangeFeatureGroups(@l String str) {
            this.f298240b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeFeatureGroups) && L.f(this.f298240b, ((ChangeFeatureGroups) obj).f298240b);
        }

        public final int hashCode() {
            String str = this.f298240b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeFeatureGroups(groupSlug="), this.f298240b, ')');
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Content;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CptInfoV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final s f298241b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f298242c;

        public Content(@k s sVar, @l String str) {
            this.f298241b = sVar;
            this.f298242c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF205712d() {
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
            return L.f(this.f298241b, content.f298241b) && L.f(this.f298242c, content.f298242c);
        }

        public final int hashCode() {
            int iHashCode = this.f298241b.hashCode() * 31;
            String str = this.f298242c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(result=");
            sb2.append(this.f298241b);
            sb2.append(", remoteContext=");
            return C22026a.c(sb2, this.f298242c, ')');
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "OnScreen", "Screen", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error$OnScreen;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error$Screen;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements CptInfoV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f298243b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f298244c;

        /* compiled from: CptInfoV2InternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error$OnScreen;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OnScreen extends Error {
        }

        /* compiled from: CptInfoV2InternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error$Screen;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Error;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Screen extends Error {
        }

        public Error(Throwable th2, C42822w c42822w) {
            this.f298243b = th2;
            this.f298244c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF205712d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF205711c() {
            return this.f298244c;
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CptInfoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f298245b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f298245b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f298245b, ((HandleDeeplink) obj).f298245b);
        }

        public final int hashCode() {
            return this.f298245b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f298245b, ')');
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$HeaderItemChangeState;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeaderItemChangeState implements CptInfoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f298246b;

        public HeaderItemChangeState(boolean z12) {
            this.f298246b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderItemChangeState) && this.f298246b == ((HeaderItemChangeState) obj).f298246b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f298246b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("HeaderItemChangeState(isVisible="), this.f298246b, ')');
        }
    }

    /* compiled from: CptInfoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction$Loading;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CptInfoV2InternalAction {
    }
}
