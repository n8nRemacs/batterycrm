package com.avito.android.cpx_promo.priceinput.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoPriceInputInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "InputChange", "Save", "UpdateErrorState", "UpdateHint", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$Content;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$InputChange;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$Save;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$UpdateErrorState;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$UpdateHint;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CpxPromoPriceInputInternalAction extends n {

    /* compiled from: CpxPromoPriceInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$Content;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CpxPromoPriceInputInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoPriceInputContent f127333b;

        public Content(@k CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            this.f127333b = cpxPromoPriceInputContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f127333b, ((Content) obj).f127333b);
        }

        public final int hashCode() {
            return this.f127333b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(content=" + this.f127333b + ')';
        }
    }

    /* compiled from: CpxPromoPriceInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$InputChange;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements CpxPromoPriceInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f127334b;

        public InputChange(@l String str) {
            this.f127334b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChange) && L.f(this.f127334b, ((InputChange) obj).f127334b);
        }

        public final int hashCode() {
            String str = this.f127334b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(value="), this.f127334b, ')');
        }
    }

    /* compiled from: CpxPromoPriceInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$Save;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Save implements CpxPromoPriceInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoInputSource f127335b;

        /* renamed from: c, reason: collision with root package name */
        public final long f127336c;

        public Save(@k CpxPromoInputSource cpxPromoInputSource, long j12) {
            this.f127335b = cpxPromoInputSource;
            this.f127336c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Save)) {
                return false;
            }
            Save save = (Save) obj;
            return this.f127335b == save.f127335b && this.f127336c == save.f127336c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127336c) + (this.f127335b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Save(source=");
            sb2.append(this.f127335b);
            sb2.append(", selectedValue=");
            return r.u(sb2, this.f127336c, ')');
        }
    }

    /* compiled from: CpxPromoPriceInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$UpdateErrorState;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateErrorState implements CpxPromoPriceInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127337b;

        public UpdateErrorState(boolean z12) {
            this.f127337b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateErrorState) && this.f127337b == ((UpdateErrorState) obj).f127337b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127337b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateErrorState(showError="), this.f127337b, ')');
        }
    }

    /* compiled from: CpxPromoPriceInputInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction$UpdateHint;", "Lcom/avito/android/cpx_promo/priceinput/mvi/entity/CpxPromoPriceInputInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateHint implements CpxPromoPriceInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f127338b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f127339c;

        public UpdateHint(@l String str, boolean z12) {
            this.f127338b = str;
            this.f127339c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateHint)) {
                return false;
            }
            UpdateHint updateHint = (UpdateHint) obj;
            return L.f(this.f127338b, updateHint.f127338b) && this.f127339c == updateHint.f127339c;
        }

        public final int hashCode() {
            String str = this.f127338b;
            return Boolean.hashCode(this.f127339c) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateHint(hint=");
            sb2.append(this.f127338b);
            sb2.append(", isValueValid=");
            return r.x(sb2, this.f127339c, ')');
        }
    }
}
