package com.avito.android.extended_profile_personal_link_edit.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalLinkEditInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "FailSave", "InitState", "OnTyped", "Saving", "SuccessfulSave", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$FailSave;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$InitState;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$OnTyped;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$Saving;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$SuccessfulSave;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PersonalLinkEditInternalAction extends n {

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements PersonalLinkEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f151525b;

        public CloseScreen() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreen) && this.f151525b == ((CloseScreen) obj).f151525b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f151525b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(resultOk="), this.f151525b, ')');
        }

        public CloseScreen(boolean z12) {
            this.f151525b = z12;
        }

        public /* synthetic */ CloseScreen(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$FailSave;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FailSave implements PersonalLinkEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f151526b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f151527c;

        public FailSave(@k PrintableText printableText, @l Throwable th2) {
            this.f151526b = printableText;
            this.f151527c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailSave)) {
                return false;
            }
            FailSave failSave = (FailSave) obj;
            return L.f(this.f151526b, failSave.f151526b) && L.f(this.f151527c, failSave.f151527c);
        }

        public final int hashCode() {
            int iHashCode = this.f151526b.hashCode() * 31;
            Throwable th2 = this.f151527c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FailSave(message=");
            sb2.append(this.f151526b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f151527c, ')');
        }
    }

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$InitState;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitState implements PersonalLinkEditInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitState f151528b = new InitState();

        private InitState() {
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$OnTyped;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTyped implements PersonalLinkEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f151529b;

        public OnTyped(@k String str) {
            this.f151529b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTyped) && L.f(this.f151529b, ((OnTyped) obj).f151529b);
        }

        public final int hashCode() {
            return this.f151529b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTyped(text="), this.f151529b, ')');
        }
    }

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$Saving;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Saving implements PersonalLinkEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Saving f151530b = new Saving();

        private Saving() {
        }
    }

    /* compiled from: PersonalLinkEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction$SuccessfulSave;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuccessfulSave implements PersonalLinkEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SuccessfulSave f151531b = new SuccessfulSave();

        private SuccessfulSave() {
        }
    }
}
