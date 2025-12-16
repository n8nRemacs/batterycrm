package com.avito.android.early_access_advert.info_screen.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertInfoInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "ShowFeedbackScreen", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction$Content;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction$ShowFeedbackScreen;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EarlyAccessAdvertInfoInternalAction extends n {

    /* compiled from: EarlyAccessAdvertInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction$Content;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements EarlyAccessAdvertInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EarlyAccessAdvert f145740b;

        public Content(@k EarlyAccessAdvert earlyAccessAdvert) {
            this.f145740b = earlyAccessAdvert;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof Content) && L.f(this.f145740b, ((Content) obj).f145740b);
        }

        public final int hashCode() {
            return this.f145740b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f145740b + ')';
        }
    }

    /* compiled from: EarlyAccessAdvertInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction$ShowFeedbackScreen;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFeedbackScreen implements EarlyAccessAdvertInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EarlyAccessAdvertFeedbackType f145741b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final EarlyAccessFeedback f145742c;

        public ShowFeedbackScreen(@k EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @k EarlyAccessFeedback earlyAccessFeedback) {
            this.f145741b = earlyAccessAdvertFeedbackType;
            this.f145742c = earlyAccessFeedback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowFeedbackScreen)) {
                return false;
            }
            ShowFeedbackScreen showFeedbackScreen = (ShowFeedbackScreen) obj;
            return this.f145741b == showFeedbackScreen.f145741b && L.f(this.f145742c, showFeedbackScreen.f145742c);
        }

        public final int hashCode() {
            return this.f145742c.hashCode() + (this.f145741b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowFeedbackScreen(feedbackType=" + this.f145741b + ", feedback=" + this.f145742c + ')';
        }
    }
}
