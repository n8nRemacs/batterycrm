package com.avito.android.success.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "HandleDeepLink", "Loading", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Content;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Error;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction$HandleDeepLink;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Loading;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SuccessInternalAction extends n {

    /* compiled from: SuccessInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Error;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SuccessInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f291677b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f291678c;

        public Error(@k ApiError apiError) {
            this.f291677b = apiError;
            this.f291678c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
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
            return (obj instanceof Error) && L.f(this.f291677b, ((Error) obj).f291677b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211472c() {
            return this.f291678c;
        }

        public final int hashCode() {
            return this.f291677b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f291677b, ')');
        }
    }

    /* compiled from: SuccessInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/mvi/entity/SuccessInternalAction$HandleDeepLink;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeepLink implements SuccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f291679b;

        public HandleDeepLink(@l DeepLink deepLink) {
            this.f291679b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeepLink) && L.f(this.f291679b, ((HandleDeepLink) obj).f291679b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f291679b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeepLink(deepLink="), this.f291679b, ')');
        }
    }

    /* compiled from: SuccessInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Loading;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements SuccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f291680b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -570591299;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SuccessInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success/mvi/entity/SuccessInternalAction$Content;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements SuccessInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UV0.c<com.avito.conveyor_item.a> f291674b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ButtonAction> f291675c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<DeepLink> f291676d;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@k UV0.c<com.avito.conveyor_item.a> cVar, @k List<ButtonAction> list, @l List<? extends DeepLink> list2) {
            this.f291674b = cVar;
            this.f291675c = list;
            this.f291676d = list2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
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
            return L.f(this.f291674b, content.f291674b) && L.f(this.f291675c, content.f291675c) && L.f(this.f291676d, content.f291676d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f291674b.f16399b.hashCode() * 31, 31, this.f291675c);
            List<DeepLink> list = this.f291676d;
            return iE2 + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f291674b);
            sb2.append(", buttons=");
            sb2.append(this.f291675c);
            sb2.append(", onLoadedActions=");
            return H.p(sb2, this.f291676d, ')');
        }

        public /* synthetic */ Content(UV0.c cVar, List list, List list2, int i12, C42822w c42822w) {
            this(cVar, list, (i12 & 4) != 0 ? null : list2);
        }
    }
}
