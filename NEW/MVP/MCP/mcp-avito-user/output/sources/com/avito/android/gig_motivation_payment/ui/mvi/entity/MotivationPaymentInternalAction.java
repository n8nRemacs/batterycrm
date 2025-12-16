package com.avito.android.gig_motivation_payment.ui.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sH.C48049a;
import sH.j;

/* compiled from: MotivationPaymentInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "", "a", "ContentLoaded", "b", "c", "d", "e", "f", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$a;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$ContentLoaded;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$b;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$c;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$d;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$e;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$f;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MotivationPaymentInternalAction {

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$ContentLoaded;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements MotivationPaymentInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48049a f160227b;

        public ContentLoaded(@k C48049a c48049a) {
            this.f160227b = c48049a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF305546e() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f160227b, ((ContentLoaded) obj).f160227b);
        }

        public final int hashCode() {
            return this.f160227b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(motivationPayment=" + this.f160227b + ')';
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$a;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f160228b = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -309953014;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$b;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f160229b;

        public b(@k String str) {
            this.f160229b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f160229b, ((b) obj).f160229b);
        }

        public final int hashCode() {
            return this.f160229b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f160229b, ')');
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$c;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f160230b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1138155970;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$d;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f160231b = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1886950241;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$e;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f160232b;

        public e(@k String str) {
            this.f160232b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f160232b, ((e) obj).f160232b);
        }

        public final int hashCode() {
            return this.f160232b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(error="), this.f160232b, ')');
        }
    }

    /* compiled from: MotivationPaymentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction$f;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements MotivationPaymentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j f160233b;

        public f(@k j jVar) {
            this.f160233b = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f160233b, ((f) obj).f160233b);
        }

        public final int hashCode() {
            return this.f160233b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToastInfo(toastInfo=" + this.f160233b + ')';
        }
    }
}
