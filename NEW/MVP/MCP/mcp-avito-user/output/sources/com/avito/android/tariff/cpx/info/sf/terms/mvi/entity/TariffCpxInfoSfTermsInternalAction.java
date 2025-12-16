package com.avito.android.tariff.cpx.info.sf.terms.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.tariff.cpx.info.sf.terms.domain.TariffCpxInfoSfTermsContent;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "OpenScreen", "PostSaveContent", "PostSaveError", "PostSaveLoading", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$CloseDialog;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$OpenScreen;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveContent;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveError;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveLoading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxInfoSfTermsInternalAction extends n {

    /* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$CloseDialog;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements TariffCpxInfoSfTermsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f296907b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return 911508765;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$OpenScreen;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements TariffCpxInfoSfTermsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TariffCpxInfoSfTermsContent f296908b;

        public OpenScreen(@k TariffCpxInfoSfTermsContent tariffCpxInfoSfTermsContent) {
            this.f296908b = tariffCpxInfoSfTermsContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof OpenScreen) && L.f(this.f296908b, ((OpenScreen) obj).f296908b);
        }

        public final int hashCode() {
            return this.f296908b.f296858b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(content=" + this.f296908b + ')';
        }
    }

    /* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveContent;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveContent implements TariffCpxInfoSfTermsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f296909b;

        public PostSaveContent(@k String str) {
            this.f296909b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostSaveContent) && L.f(this.f296909b, ((PostSaveContent) obj).f296909b);
        }

        public final int hashCode() {
            return this.f296909b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PostSaveContent(successMessage="), this.f296909b, ')');
        }
    }

    /* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveError;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveError implements TariffCpxInfoSfTermsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f296910b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f296911c;

        public PostSaveError(@k ApiException apiException) {
            this.f296910b = apiException;
            this.f296911c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof PostSaveError) && this.f296910b.equals(((PostSaveError) obj).f296910b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF208324d() {
            return this.f296911c;
        }

        public final int hashCode() {
            return this.f296910b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("PostSaveError(throwable="), this.f296910b, ')');
        }
    }

    /* compiled from: TariffCpxInfoSfTermsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction$PostSaveLoading;", "Lcom/avito/android/tariff/cpx/info/sf/terms/mvi/entity/TariffCpxInfoSfTermsInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveLoading implements TariffCpxInfoSfTermsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PostSaveLoading f296912b = new PostSaveLoading();

        private PostSaveLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PostSaveLoading);
        }

        public final int hashCode() {
            return -169026180;
        }

        @k
        public final String toString() {
            return "PostSaveLoading";
        }
    }
}
