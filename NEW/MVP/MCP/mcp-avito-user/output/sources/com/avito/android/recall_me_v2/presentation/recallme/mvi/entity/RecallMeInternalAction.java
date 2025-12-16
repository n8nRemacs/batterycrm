package com.avito.android.recall_me_v2.presentation.recallme.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OnCloseButtonClicked", "OnError", "OnInitError", "OnInitFinished", "OnInitStart", "OnLoadingChanged", "OnNameInputChanged", "OnNameInputResetClicked", "OnPhoneInputChanged", "OnPhoneInputErrorChanged", "OnPhoneInputResetClicked", "OnRequestSaved", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnCloseButtonClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnError;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitError;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitFinished;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitStart;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnLoadingChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnNameInputChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnNameInputResetClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputErrorChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputResetClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnRequestSaved;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RecallMeInternalAction extends n {

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnCloseButtonClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCloseButtonClicked implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnCloseButtonClicked f252142b = new OnCloseButtonClicked();

        private OnCloseButtonClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnCloseButtonClicked);
        }

        public final int hashCode() {
            return 711193904;
        }

        @k
        public final String toString() {
            return "OnCloseButtonClicked";
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnError;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnError implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252143b;

        public OnError(@k String str) {
            this.f252143b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnError) && L.f(this.f252143b, ((OnError) obj).f252143b);
        }

        public final int hashCode() {
            return this.f252143b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnError(errorMessage="), this.f252143b, ')');
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitError;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnInitError implements RecallMeInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f252144b;

        /* JADX WARN: Multi-variable type inference failed */
        public OnInitError(@k c<? extends ApiError, ? extends Throwable> cVar) {
            J.a aVar;
            if (cVar instanceof c.b) {
                aVar = new J.a((ApiError) ((c.b) cVar).f92027b);
            } else {
                if (!(cVar instanceof c.C2712c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new J.a((Throwable) ((c.C2712c) cVar).f92028b);
            }
            this.f252144b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF213439c() {
            return this.f252144b;
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitFinished;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnInitFinished implements RecallMeInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252145b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f252146c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f252147d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f252148e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ArrayList f252149f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AttributedText f252150g;

        public OnInitFinished(@k String str, @k String str2, @k String str3, @k String str4, @k ArrayList arrayList, @k AttributedText attributedText) {
            this.f252145b = str;
            this.f252146c = str2;
            this.f252147d = str3;
            this.f252148e = str4;
            this.f252149f = arrayList;
            this.f252150g = attributedText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            if (!(obj instanceof OnInitFinished)) {
                return false;
            }
            OnInitFinished onInitFinished = (OnInitFinished) obj;
            return L.f(this.f252145b, onInitFinished.f252145b) && L.f(this.f252146c, onInitFinished.f252146c) && this.f252147d.equals(onInitFinished.f252147d) && L.f(this.f252148e, onInitFinished.f252148e) && this.f252149f.equals(onInitFinished.f252149f) && L.f(this.f252150g, onInitFinished.f252150g);
        }

        public final int hashCode() {
            return this.f252150g.hashCode() + e.g(this.f252149f, r.i(H.d(r.i(H.d(H.d(this.f252145b.hashCode() * 31, 31, this.f252146c), 31, this.f252147d), 31, false), 31, this.f252148e), 31, false), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnInitFinished(formTitle=");
            sb2.append(this.f252145b);
            sb2.append(", formSubtitle=");
            sb2.append(this.f252146c);
            sb2.append(", name=");
            sb2.append(this.f252147d);
            sb2.append(", nameError=false, phone=");
            sb2.append(this.f252148e);
            sb2.append(", phoneError=false, confirmedPhones=");
            sb2.append(this.f252149f);
            sb2.append(", agreements=");
            return a.w(sb2, this.f252150g, ')');
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnInitStart;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnInitStart extends TrackableLoadingStarted implements RecallMeInternalAction {
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnLoadingChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnLoadingChanged implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f252151b;

        public OnLoadingChanged(boolean z12) {
            this.f252151b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLoadingChanged) && this.f252151b == ((OnLoadingChanged) obj).f252151b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f252151b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnLoadingChanged(newValue="), this.f252151b, ')');
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnNameInputChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnNameInputChanged implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252152b;

        public OnNameInputChanged(@k String str) {
            this.f252152b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNameInputChanged) && L.f(this.f252152b, ((OnNameInputChanged) obj).f252152b);
        }

        public final int hashCode() {
            return this.f252152b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnNameInputChanged(newValue="), this.f252152b, ')');
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnNameInputResetClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnNameInputResetClicked implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnNameInputResetClicked f252153b = new OnNameInputResetClicked();

        private OnNameInputResetClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnNameInputResetClicked);
        }

        public final int hashCode() {
            return -719089436;
        }

        @k
        public final String toString() {
            return "OnNameInputResetClicked";
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPhoneInputChanged implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252154b;

        public OnPhoneInputChanged(@k String str) {
            this.f252154b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPhoneInputChanged) && L.f(this.f252154b, ((OnPhoneInputChanged) obj).f252154b);
        }

        public final int hashCode() {
            return this.f252154b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnPhoneInputChanged(newValue="), this.f252154b, ')');
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputErrorChanged;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPhoneInputErrorChanged implements RecallMeInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPhoneInputErrorChanged)) {
                return false;
            }
            ((OnPhoneInputErrorChanged) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "OnPhoneInputErrorChanged(newValue=true)";
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnPhoneInputResetClicked;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPhoneInputResetClicked implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnPhoneInputResetClicked f252155b = new OnPhoneInputResetClicked();

        private OnPhoneInputResetClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnPhoneInputResetClicked);
        }

        public final int hashCode() {
            return -2063362265;
        }

        @k
        public final String toString() {
            return "OnPhoneInputResetClicked";
        }
    }

    /* compiled from: RecallMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction$OnRequestSaved;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnRequestSaved implements RecallMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252156b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f252157c;

        public OnRequestSaved(@k String str, @l Long l12) {
            this.f252156b = str;
            this.f252157c = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRequestSaved)) {
                return false;
            }
            OnRequestSaved onRequestSaved = (OnRequestSaved) obj;
            return L.f(this.f252156b, onRequestSaved.f252156b) && L.f(this.f252157c, onRequestSaved.f252157c);
        }

        public final int hashCode() {
            int iHashCode = this.f252156b.hashCode() * 31;
            Long l12 = this.f252157c;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnRequestSaved(successMessage=");
            sb2.append(this.f252156b);
            sb2.append(", requestId=");
            return m.m(sb2, this.f252157c, ')');
        }
    }
}
