package com.avito.android.autoteka.presentation.landing.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalColor;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentChanged", "ContentLoaded", "LoadingFailed", "LoadingStarted", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentChanged;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentLoaded;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$LoadingFailed;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$LoadingStarted;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutotekaLandingInternalAction extends n {

    /* compiled from: AutotekaLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentChanged;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements AutotekaLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f97345b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f97346c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f97347d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f97348e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f97349f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f97350g;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
            this.f97345b = str;
            this.f97346c = list;
            this.f97347d = str2;
            this.f97348e = list2;
            this.f97349f = str3;
            this.f97350g = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChanged)) {
                return false;
            }
            ContentChanged contentChanged = (ContentChanged) obj;
            return L.f(this.f97345b, contentChanged.f97345b) && L.f(this.f97346c, contentChanged.f97346c) && L.f(this.f97347d, contentChanged.f97347d) && L.f(this.f97348e, contentChanged.f97348e) && L.f(this.f97349f, contentChanged.f97349f) && L.f(this.f97350g, contentChanged.f97350g);
        }

        public final int hashCode() {
            return this.f97350g.hashCode() + H.d(H.e(H.d(H.e(this.f97345b.hashCode() * 31, 31, this.f97346c), 31, this.f97347d), 31, this.f97348e), 31, this.f97349f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentChanged(topFormId=");
            sb2.append(this.f97345b);
            sb2.append(", topComponents=");
            sb2.append(this.f97346c);
            sb2.append(", mainFormId=");
            sb2.append(this.f97347d);
            sb2.append(", mainComponents=");
            sb2.append(this.f97348e);
            sb2.append(", bottomFormId=");
            sb2.append(this.f97349f);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f97350g, ')');
        }
    }

    /* compiled from: AutotekaLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$ContentLoaded;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements AutotekaLandingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f97351b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalColor f97352c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<BeduinAction> f97353d;

        public ContentLoaded(@k List list, @l String str, @l UniversalColor universalColor) {
            this.f97351b = str;
            this.f97352c = universalColor;
            this.f97353d = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f97351b, contentLoaded.f97351b) && L.f(this.f97352c, contentLoaded.f97352c) && L.f(this.f97353d, contentLoaded.f97353d);
        }

        public final int hashCode() {
            String str = this.f97351b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.f97352c;
            return this.f97353d.hashCode() + ((iHashCode + (universalColor != null ? universalColor.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(navBarTitle=");
            sb2.append(this.f97351b);
            sb2.append(", navBarColor=");
            sb2.append(this.f97352c);
            sb2.append(", onOpenActions=");
            return H.p(sb2, this.f97353d, ')');
        }
    }

    /* compiled from: AutotekaLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$LoadingFailed;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements AutotekaLandingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f97354b;

        public LoadingFailed(@k ApiError apiError) {
            this.f97354b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            return (obj instanceof LoadingFailed) && L.f(this.f97354b, ((LoadingFailed) obj).f97354b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF111986c() {
            return new J.a(this.f97354b);
        }

        public final int hashCode() {
            return this.f97354b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingFailed(apiError="), this.f97354b, ')');
        }
    }

    /* compiled from: AutotekaLandingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted extends TrackableLoadingStarted implements AutotekaLandingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f97355d;

        public LoadingStarted() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStarted) && L.f(this.f97355d, ((LoadingStarted) obj).f97355d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f97355d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("LoadingStarted(stub="), this.f97355d, ')');
        }

        public LoadingStarted(G0 g02, int i12, C42822w c42822w) {
            this.f97355d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }
}
