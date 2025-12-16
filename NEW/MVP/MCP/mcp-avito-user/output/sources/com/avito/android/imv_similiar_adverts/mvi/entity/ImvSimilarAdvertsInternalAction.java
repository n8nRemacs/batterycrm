package com.avito.android.imv_similiar_adverts.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import uk0.C49072b;

/* compiled from: ImvSimilarAdvertsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "OpenAdvert", "ShowContent", "ShowError", "ShowLoading", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$Close;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$OpenAdvert;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowContent;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowError;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowLoading;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImvSimilarAdvertsInternalAction extends n {

    /* compiled from: ImvSimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$Close;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements ImvSimilarAdvertsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f170907b = new Close();

        private Close() {
        }
    }

    /* compiled from: ImvSimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$OpenAdvert;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAdvert implements ImvSimilarAdvertsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f170908b;

        public OpenAdvert(@k DeepLink deepLink) {
            this.f170908b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAdvert) && L.f(this.f170908b, ((OpenAdvert) obj).f170908b);
        }

        public final int hashCode() {
            return this.f170908b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenAdvert(deeplink="), this.f170908b, ')');
        }
    }

    /* compiled from: ImvSimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowContent;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ImvSimilarAdvertsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C49072b f170909b;

        public ShowContent(@k C49072b c49072b) {
            this.f170909b = c49072b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF308074d() {
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
            return (obj instanceof ShowContent) && L.f(this.f170909b, ((ShowContent) obj).f170909b);
        }

        public final int hashCode() {
            return this.f170909b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(data=" + this.f170909b + ')';
        }
    }

    /* compiled from: ImvSimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowError;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ImvSimilarAdvertsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f170910b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f170911c;

        public ShowError(@k ApiError apiError) {
            this.f170910b = apiError;
            this.f170911c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF308074d() {
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
            return (obj instanceof ShowError) && L.f(this.f170910b, ((ShowError) obj).f170910b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF326226c() {
            return this.f170911c;
        }

        public final int hashCode() {
            return this.f170910b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f170910b, ')');
        }
    }

    /* compiled from: ImvSimilarAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements ImvSimilarAdvertsInternalAction {
    }
}
