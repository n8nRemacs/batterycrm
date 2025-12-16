package com.avito.android.comfortable_deal.phone_call.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneCallInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OpenCallScreen", "ShowContent", "ShowError", "ShowLoading", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$OpenCallScreen;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowContent;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowError;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowLoading;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PhoneCallInternalAction extends n {

    /* compiled from: PhoneCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$OpenCallScreen;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCallScreen implements PhoneCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122499b;

        public OpenCallScreen(@k String str) {
            this.f122499b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenCallScreen) && L.f(this.f122499b, ((OpenCallScreen) obj).f122499b);
        }

        public final int hashCode() {
            return this.f122499b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenCallScreen(phone="), this.f122499b, ')');
        }
    }

    /* compiled from: PhoneCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowContent;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements PhoneCallInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122500b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f122501c;

        public ShowContent(@k String str, boolean z12) {
            this.f122500b = str;
            this.f122501c = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f122500b, showContent.f122500b) && this.f122501c == showContent.f122501c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f122501c) + (this.f122500b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(number=");
            sb2.append(this.f122500b);
            sb2.append(", isVirtual=");
            return r.x(sb2, this.f122501c, ')');
        }
    }

    /* compiled from: PhoneCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowError;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements PhoneCallInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122502b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f122503c;

        public ShowError(@k ApiError apiError) {
            this.f122502b = apiError;
            this.f122503c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof ShowError) && L.f(this.f122502b, ((ShowError) obj).f122502b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF319814c() {
            return this.f122503c;
        }

        public final int hashCode() {
            return this.f122502b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f122502b, ')');
        }
    }

    /* compiled from: PhoneCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction$ShowLoading;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements PhoneCallInternalAction {
    }
}
