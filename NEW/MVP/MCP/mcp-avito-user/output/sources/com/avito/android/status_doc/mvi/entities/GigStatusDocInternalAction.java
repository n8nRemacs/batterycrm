package com.avito.android.status_doc.mvi.entities;

import AK.c;
import Ax0.C13102f;
import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigStatusDocInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "ShowContent", "ShowError", "ShowLoading", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$Close;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowContent;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowError;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowLoading;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GigStatusDocInternalAction extends n {

    /* compiled from: GigStatusDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$Close;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "<init>", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements GigStatusDocInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f284910b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -43805947;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigStatusDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowContent;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements GigStatusDocInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Image f284911b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C13102f f284912c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C13102f f284913d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f284914e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f284915f;

        public ShowContent(@k Image image, @k C13102f c13102f, @l C13102f c13102f2, @k ArrayList arrayList, @l DeepLink deepLink) {
            this.f284911b = image;
            this.f284912c = c13102f;
            this.f284913d = c13102f2;
            this.f284914e = arrayList;
            this.f284915f = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206990d() {
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
            return this.f284911b.equals(showContent.f284911b) && this.f284912c.equals(showContent.f284912c) && L.f(this.f284913d, showContent.f284913d) && this.f284914e.equals(showContent.f284914e) && L.f(this.f284915f, showContent.f284915f);
        }

        public final int hashCode() {
            int iHashCode = (this.f284912c.hashCode() + (this.f284911b.hashCode() * 31)) * 31;
            C13102f c13102f = this.f284913d;
            int iG2 = e.g(this.f284914e, (iHashCode + (c13102f == null ? 0 : c13102f.hashCode())) * 31, 31);
            DeepLink deepLink = this.f284915f;
            return iG2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(image=");
            sb2.append(this.f284911b);
            sb2.append(", mainInfo=");
            sb2.append(this.f284912c);
            sb2.append(", additionalInfo=");
            sb2.append(this.f284913d);
            sb2.append(", buttons=");
            sb2.append(this.f284914e);
            sb2.append(", supportButtonDeepLink=");
            return a.v(sb2, this.f284915f, ')');
        }
    }

    /* compiled from: GigStatusDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowError;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements GigStatusDocInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f284916b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f284917c;

        public ShowError(@k ApiError apiError) {
            this.f284916b = apiError;
            this.f284917c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206990d() {
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
            return (obj instanceof ShowError) && L.f(this.f284916b, ((ShowError) obj).f284916b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF267033b() {
            return this.f284917c;
        }

        public final int hashCode() {
            return this.f284916b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f284916b, ')');
        }
    }

    /* compiled from: GigStatusDocInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements GigStatusDocInternalAction {
    }
}
