package com.avito.android.early_access_advert.feedback_screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ButtonVisibilityChanged", "CloseScreen", "Content", "FeedbackTextUpdated", "SendFeedbackError", "SendFeedbackLoading", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$ButtonVisibilityChanged;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$CloseScreen;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$Content;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$FeedbackTextUpdated;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$SendFeedbackError;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$SendFeedbackLoading;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EarlyAccessAdvertFeedbackInternalAction extends n {

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$ButtonVisibilityChanged;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonVisibilityChanged implements EarlyAccessAdvertFeedbackInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f145688b;

        public ButtonVisibilityChanged(boolean z12) {
            this.f145688b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonVisibilityChanged) && this.f145688b == ((ButtonVisibilityChanged) obj).f145688b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f145688b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ButtonVisibilityChanged(isVisible="), this.f145688b, ')');
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$CloseScreen;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements EarlyAccessAdvertFeedbackInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f145689b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$Content;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements EarlyAccessAdvertFeedbackInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145690b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final EarlyAccessAdvertFeedbackType f145691c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final EarlyAccessFeedback f145692d;

        public Content(@k String str, @k EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @k EarlyAccessFeedback earlyAccessFeedback) {
            this.f145690b = str;
            this.f145691c = earlyAccessAdvertFeedbackType;
            this.f145692d = earlyAccessFeedback;
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f145690b, content.f145690b) && this.f145691c == content.f145691c && L.f(this.f145692d, content.f145692d);
        }

        public final int hashCode() {
            return this.f145692d.hashCode() + ((this.f145691c.hashCode() + (this.f145690b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Content(advertId=" + this.f145690b + ", feedbackType=" + this.f145691c + ", feedback=" + this.f145692d + ')';
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$FeedbackTextUpdated;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeedbackTextUpdated implements EarlyAccessAdvertFeedbackInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145693b;

        public FeedbackTextUpdated(@k String str) {
            this.f145693b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeedbackTextUpdated) && L.f(this.f145693b, ((FeedbackTextUpdated) obj).f145693b);
        }

        public final int hashCode() {
            return this.f145693b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FeedbackTextUpdated(newText="), this.f145693b, ')');
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$SendFeedbackError;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendFeedbackError implements EarlyAccessAdvertFeedbackInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f145694b;

        public SendFeedbackError(@k PrintableText printableText) {
            this.f145694b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendFeedbackError) && L.f(this.f145694b, ((SendFeedbackError) obj).f145694b);
        }

        public final int hashCode() {
            return this.f145694b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("SendFeedbackError(message="), this.f145694b, ')');
        }
    }

    /* compiled from: EarlyAccessAdvertFeedbackInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction$SendFeedbackLoading;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SendFeedbackLoading implements EarlyAccessAdvertFeedbackInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendFeedbackLoading f145695b = new SendFeedbackLoading();

        private SendFeedbackLoading() {
        }
    }
}
