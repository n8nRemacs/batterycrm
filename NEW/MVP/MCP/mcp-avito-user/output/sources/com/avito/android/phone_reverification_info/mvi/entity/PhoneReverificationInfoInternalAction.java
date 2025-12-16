package com.avito.android.phone_reverification_info.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneReverificationInfoInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FinishWithCancel", "FinishWithRouteToProfile", "FinishWithSuccess", "InitialContent", "LogoutLoading", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithCancel;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithRouteToProfile;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithSuccess;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$InitialContent;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$LogoutLoading;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PhoneReverificationInfoInternalAction extends n {

    /* compiled from: PhoneReverificationInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithCancel;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishWithCancel implements PhoneReverificationInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishWithCancel f216162b = new FinishWithCancel();

        private FinishWithCancel() {
        }
    }

    /* compiled from: PhoneReverificationInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithRouteToProfile;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishWithRouteToProfile implements PhoneReverificationInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishWithRouteToProfile f216163b = new FinishWithRouteToProfile();

        private FinishWithRouteToProfile() {
        }
    }

    /* compiled from: PhoneReverificationInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$FinishWithSuccess;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishWithSuccess implements PhoneReverificationInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f216164b;

        public FinishWithSuccess(@k String str) {
            this.f216164b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithSuccess) && L.f(this.f216164b, ((FinishWithSuccess) obj).f216164b);
        }

        public final int hashCode() {
            return this.f216164b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FinishWithSuccess(phone="), this.f216164b, ')');
        }
    }

    /* compiled from: PhoneReverificationInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$InitialContent;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialContent implements PhoneReverificationInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f216165b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PhoneReverificationInfo f216166c;

        public InitialContent(@k ArrayList arrayList, @k PhoneReverificationInfo phoneReverificationInfo) {
            this.f216165b = arrayList;
            this.f216166c = phoneReverificationInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialContent)) {
                return false;
            }
            InitialContent initialContent = (InitialContent) obj;
            return this.f216165b.equals(initialContent.f216165b) && L.f(this.f216166c, initialContent.f216166c);
        }

        public final int hashCode() {
            return this.f216166c.hashCode() + (this.f216165b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "InitialContent(items=" + this.f216165b + ", info=" + this.f216166c + ')';
        }
    }

    /* compiled from: PhoneReverificationInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction$LogoutLoading;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogoutLoading implements PhoneReverificationInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LogoutLoading f216167b = new LogoutLoading();

        private LogoutLoading() {
        }
    }
}
