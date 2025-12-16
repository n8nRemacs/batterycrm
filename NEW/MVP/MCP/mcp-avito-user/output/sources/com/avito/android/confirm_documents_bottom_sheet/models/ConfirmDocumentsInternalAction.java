package com.avito.android.confirm_documents_bottom_sheet.models;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmDocumentsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "", "a", "ShowContent", "ShowError", "ShowLoading", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$a;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowContent;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowError;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowLoading;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ConfirmDocumentsInternalAction {

    /* compiled from: ConfirmDocumentsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowContent;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ConfirmDocumentsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f125583b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f125584c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f125585d;

        public ShowContent(@k String str, @k String str2, @k ArrayList arrayList) {
            this.f125583b = str;
            this.f125584c = str2;
            this.f125585d = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return L.f(this.f125583b, showContent.f125583b) && L.f(this.f125584c, showContent.f125584c) && this.f125585d.equals(showContent.f125585d);
        }

        public final int hashCode() {
            return this.f125585d.hashCode() + H.d(this.f125583b.hashCode() * 31, 31, this.f125584c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(title=");
            sb2.append(this.f125583b);
            sb2.append(", description=");
            sb2.append(this.f125584c);
            sb2.append(", documents=");
            return e.p(sb2, this.f125585d, ')');
        }
    }

    /* compiled from: ConfirmDocumentsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowError;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ConfirmDocumentsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f125586b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f125587c;

        public ShowError(@k ApiError apiError) {
            this.f125586b = apiError;
            this.f125587c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof ShowError) && L.f(this.f125586b, ((ShowError) obj).f125586b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97806c() {
            return this.f125587c;
        }

        public final int hashCode() {
            return this.f125586b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f125586b, ')');
        }
    }

    /* compiled from: ConfirmDocumentsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements ConfirmDocumentsInternalAction {
    }

    /* compiled from: ConfirmDocumentsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction$a;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements ConfirmDocumentsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f125588b;

        public a(boolean z12) {
            this.f125588b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f125588b == ((a) obj).f125588b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f125588b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Dismiss(withResult="), this.f125588b, ')');
        }
    }
}
