package com.avito.android.referral_contacts.models;

import Ui0.C15527c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "<init>", "()V", "Close", "ContentLoaded", "Error", "StartLoading", "TextChanged", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$Close;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$ContentLoaded;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$Error;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$StartLoading;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$TextChanged;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ReferralContactsInternalAction implements n {

    /* compiled from: ReferralContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$Close;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close extends ReferralContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f252508b = new Close();

        private Close() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1421566861;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReferralContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$ContentLoaded;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded extends ReferralContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252509b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f252510c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f252511d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DeepLink f252512e;

        public ContentLoaded(@k DeepLink deepLink, @k String str, @k String str2, @k ArrayList arrayList) {
            super(null);
            this.f252509b = str;
            this.f252510c = arrayList;
            this.f252511d = str2;
            this.f252512e = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f252509b, contentLoaded.f252509b) && L.f(this.f252510c, contentLoaded.f252510c) && L.f(this.f252511d, contentLoaded.f252511d) && L.f(this.f252512e, contentLoaded.f252512e);
        }

        public final int hashCode() {
            return this.f252512e.hashCode() + H.d(e.g(this.f252510c, this.f252509b.hashCode() * 31, 31), 31, this.f252511d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(searchBarHint=");
            sb2.append(this.f252509b);
            sb2.append(", contacts=");
            sb2.append(this.f252510c);
            sb2.append(", buttonText=");
            sb2.append(this.f252511d);
            sb2.append(", buttonLink=");
            return a.v(sb2, this.f252512e, ')');
        }
    }

    /* compiled from: ReferralContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$Error;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends ReferralContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f252513b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C15527c f252514c;

        public /* synthetic */ Error(Throwable th2, C15527c c15527c, int i12, C42822w c42822w) {
            this(th2, (i12 & 2) != 0 ? null : c15527c);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f252513b, error.f252513b) && L.f(this.f252514c, error.f252514c);
        }

        public final int hashCode() {
            int iHashCode = this.f252513b.hashCode() * 31;
            C15527c c15527c = this.f252514c;
            return iHashCode + (c15527c == null ? 0 : c15527c.hashCode());
        }

        @k
        public final String toString() {
            return "Error(cause=" + this.f252513b + ", placeholder=" + this.f252514c + ')';
        }

        public Error(@k Throwable th2, @l C15527c c15527c) {
            super(null);
            this.f252513b = th2;
            this.f252514c = c15527c;
        }
    }

    /* compiled from: ReferralContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$StartLoading;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartLoading extends ReferralContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartLoading f252515b = new StartLoading();

        private StartLoading() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartLoading);
        }

        public final int hashCode() {
            return -38315195;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: ReferralContactsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction$TextChanged;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextChanged extends ReferralContactsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252516b;

        public TextChanged(@k String str) {
            super(null);
            this.f252516b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextChanged) && L.f(this.f252516b, ((TextChanged) obj).f252516b);
        }

        public final int hashCode() {
            return this.f252516b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChanged(text="), this.f252516b, ')');
        }
    }

    public /* synthetic */ ReferralContactsInternalAction(C42822w c42822w) {
        this();
    }

    private ReferralContactsInternalAction() {
    }
}
