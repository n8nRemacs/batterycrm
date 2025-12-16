package com.avito.android.model_card.screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.ApiException;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BottomComponentsChanged", "ContentLoaded", "Error", "Loading", "MainComponentsChanged", "NavBarMainComponentsChanged", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$BottomComponentsChanged;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$ContentLoaded;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$Error;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$Loading;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$MainComponentsChanged;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$NavBarMainComponentsChanged;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ModelCardInternalAction extends n {

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$BottomComponentsChanged;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomComponentsChanged implements ModelCardInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198084b;

        /* JADX WARN: Multi-variable type inference failed */
        public BottomComponentsChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f198084b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomComponentsChanged) && L.f(this.f198084b, ((BottomComponentsChanged) obj).f198084b);
        }

        public final int hashCode() {
            return this.f198084b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("BottomComponentsChanged(components="), this.f198084b, ')');
        }
    }

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$ContentLoaded;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements ModelCardInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198085b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f198086c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f198087d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198088e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198089f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198090g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198091h;

        public ContentLoaded() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
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
            return L.f(this.f198085b, contentLoaded.f198085b) && L.f(this.f198086c, contentLoaded.f198086c) && L.f(this.f198087d, contentLoaded.f198087d) && L.f(this.f198088e, contentLoaded.f198088e) && L.f(this.f198089f, contentLoaded.f198089f) && L.f(this.f198090g, contentLoaded.f198090g) && L.f(this.f198091h, contentLoaded.f198091h);
        }

        public final int hashCode() {
            return this.f198091h.hashCode() + H.e(H.e(H.e(H.d(H.d(this.f198085b.hashCode() * 31, 31, this.f198086c), 31, this.f198087d), 31, this.f198088e), 31, this.f198089f), 31, this.f198090g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(navBarFormId=");
            sb2.append(this.f198085b);
            sb2.append(", mainFormId=");
            sb2.append(this.f198086c);
            sb2.append(", bottomFormId=");
            sb2.append(this.f198087d);
            sb2.append(", navBarMainComponents=");
            sb2.append(this.f198088e);
            sb2.append(", navBarRightComponents=");
            sb2.append(this.f198089f);
            sb2.append(", bottomComponents=");
            sb2.append(this.f198090g);
            sb2.append(", mainComponents=");
            return H.p(sb2, this.f198091h, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(@k String str, @k String str2, @k String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list4) {
            this.f198085b = str;
            this.f198086c = str2;
            this.f198087d = str3;
            this.f198088e = list;
            this.f198089f = list2;
            this.f198090g = list3;
            this.f198091h = list4;
        }

        public ContentLoaded(String str, String str2, String str3, List list, List list2, List list3, List list4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) == 0 ? str3 : "", (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? C42784z0.f406748b : list2, (i12 & 32) != 0 ? C42784z0.f406748b : list3, (i12 & 64) != 0 ? C42784z0.f406748b : list4);
        }
    }

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$Error;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ModelCardInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f198092b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f198093c;

        public Error(@k ApiException apiException) {
            this.f198092b = apiException;
            this.f198093c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF261005e() {
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
            return (obj instanceof Error) && this.f198092b.equals(((Error) obj).f198092b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF137091c() {
            return this.f198093c;
        }

        public final int hashCode() {
            return this.f198092b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f198092b, ')');
        }
    }

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$Loading;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements ModelCardInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f198094d;

        public Loading() {
            this(false, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f198094d == ((Loading) obj).f198094d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f198094d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loading(isLoading="), this.f198094d, ')');
        }

        public Loading(boolean z12, int i12, C42822w c42822w) {
            this.f198094d = (i12 & 1) != 0 ? true : z12;
        }
    }

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$MainComponentsChanged;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainComponentsChanged implements ModelCardInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198095b;

        /* JADX WARN: Multi-variable type inference failed */
        public MainComponentsChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f198095b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MainComponentsChanged) && L.f(this.f198095b, ((MainComponentsChanged) obj).f198095b);
        }

        public final int hashCode() {
            return this.f198095b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("MainComponentsChanged(components="), this.f198095b, ')');
        }
    }

    /* compiled from: ModelCardInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction$NavBarMainComponentsChanged;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavBarMainComponentsChanged implements ModelCardInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f198096b;

        /* JADX WARN: Multi-variable type inference failed */
        public NavBarMainComponentsChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f198096b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavBarMainComponentsChanged) && L.f(this.f198096b, ((NavBarMainComponentsChanged) obj).f198096b);
        }

        public final int hashCode() {
            return this.f198096b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("NavBarMainComponentsChanged(components="), this.f198096b, ')');
        }
    }
}
