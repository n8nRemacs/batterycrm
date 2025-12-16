package com.avito.android.job.interview.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.job.interview.domain.a;
import com.avito.android.job.interview.domain.j;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sQ.C48095e;

/* compiled from: JobInterviewInvitationActions.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeDate", "ChangeLocation", "ChangePhone", "ChangeTime", "CloseFlow", "ErrorDraft", "ErrorInvitation", "InvalidData", "LoadedDraft", "LoadedInvitation", "LoadingDraft", "LoadingInvitation", "OpenDatePicker", "OpenLocationPicker", "OpenTimePicker", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeDate;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeLocation;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangePhone;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeTime;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$CloseFlow;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ErrorDraft;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$ErrorInvitation;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$InvalidData;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadedDraft;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadedInvitation;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadingDraft;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadingInvitation;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenDatePicker;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenLocationPicker;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenTimePicker;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface InternalAction extends n {

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeDate;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDate implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f174567b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174568c;

        /* renamed from: d, reason: collision with root package name */
        public final int f174569d;

        /* renamed from: e, reason: collision with root package name */
        public final int f174570e;

        public ChangeDate(int i12, int i13, @k String str, int i14) {
            this.f174567b = i12;
            this.f174568c = str;
            this.f174569d = i13;
            this.f174570e = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeDate)) {
                return false;
            }
            ChangeDate changeDate = (ChangeDate) obj;
            return this.f174567b == changeDate.f174567b && L.f(this.f174568c, changeDate.f174568c) && this.f174569d == changeDate.f174569d && this.f174570e == changeDate.f174570e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f174570e) + r.e(this.f174569d, H.d(Integer.hashCode(this.f174567b) * 31, 31, this.f174568c), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeDate(pos=");
            sb2.append(this.f174567b);
            sb2.append(", title=");
            sb2.append(this.f174568c);
            sb2.append(", day=");
            sb2.append(this.f174569d);
            sb2.append(", month=");
            return r.t(sb2, this.f174570e, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeLocation;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeLocation implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AddressParameter.Value f174571b;

        public ChangeLocation(@k AddressParameter.Value value) {
            this.f174571b = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeLocation) && L.f(this.f174571b, ((ChangeLocation) obj).f174571b);
        }

        public final int hashCode() {
            return this.f174571b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeLocation(result=" + this.f174571b + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangePhone;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangePhone implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174572b;

        public ChangePhone(@k String str) {
            this.f174572b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangePhone) && L.f(this.f174572b, ((ChangePhone) obj).f174572b);
        }

        public final int hashCode() {
            return this.f174572b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangePhone(phone="), this.f174572b, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ChangeTime;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeTime implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f174573b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.job.interview.pickers.k f174574c;

        public ChangeTime(int i12, @k com.avito.android.job.interview.pickers.k kVar) {
            this.f174573b = i12;
            this.f174574c = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeTime)) {
                return false;
            }
            ChangeTime changeTime = (ChangeTime) obj;
            return this.f174573b == changeTime.f174573b && L.f(this.f174574c, changeTime.f174574c);
        }

        public final int hashCode() {
            return this.f174574c.hashCode() + (Integer.hashCode(this.f174573b) * 31);
        }

        @k
        public final String toString() {
            return "ChangeTime(pos=" + this.f174573b + ", result=" + this.f174574c + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$CloseFlow;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseFlow implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseFlow f174575b = new CloseFlow();

        private CloseFlow() {
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ErrorDraft;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorDraft implements TrackableError, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f174576b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f174577c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f174578d = "loadDraft";

        public ErrorDraft(@k ApiError apiError) {
            this.f174576b = apiError;
            this.f174577c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF116050d() {
            return this.f174578d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f174578d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDraft) && L.f(this.f174576b, ((ErrorDraft) obj).f174576b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF116048c() {
            return this.f174577c;
        }

        public final int hashCode() {
            return this.f174576b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ErrorDraft(error="), this.f174576b, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$ErrorInvitation;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorInvitation implements TrackableError, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f174579b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f174580c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f174581d = "loadInvitation";

        public ErrorInvitation(@k ApiError apiError) {
            this.f174579b = apiError;
            this.f174580c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF116050d() {
            return this.f174581d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f174581d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorInvitation) && L.f(this.f174579b, ((ErrorInvitation) obj).f174579b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF116048c() {
            return this.f174580c;
        }

        public final int hashCode() {
            return this.f174579b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ErrorInvitation(error="), this.f174579b, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$InvalidData;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidData implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f174582b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f174583c;

        public InvalidData(@k ArrayList arrayList, boolean z12) {
            this.f174582b = arrayList;
            this.f174583c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidData)) {
                return false;
            }
            InvalidData invalidData = (InvalidData) obj;
            return L.f(this.f174582b, invalidData.f174582b) && this.f174583c == invalidData.f174583c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f174583c) + (this.f174582b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InvalidData(dates=");
            sb2.append(this.f174582b);
            sb2.append(", isValidLocation=");
            return r.x(sb2, this.f174583c, ')');
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadedDraft;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedDraft implements TrackableContent, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j.b f174584b;

        public LoadedDraft(@k j.b bVar) {
            this.f174584b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF116050d() {
            return "loadDraft";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "loadDraft";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadedDraft) && L.f(this.f174584b, ((LoadedDraft) obj).f174584b);
        }

        public final int hashCode() {
            return this.f174584b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadedDraft(result=" + this.f174584b + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadedInvitation;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedInvitation implements TrackableContent, InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadedInvitation f174585b = new LoadedInvitation();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f174586c = "loadInvitation";

        private LoadedInvitation() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF116050d() {
            return f174586c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return f174586c;
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadingDraft;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingDraft extends TrackableLoadingStarted implements InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f174587d = "loadDraft";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF116050d() {
            return this.f174587d;
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$LoadingInvitation;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingInvitation extends TrackableLoadingStarted implements InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f174588d = "loadInvitation";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF116050d() {
            return this.f174588d;
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenDatePicker;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDatePicker implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f174589b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a f174590c;

        public OpenDatePicker(int i12, @k a aVar) {
            this.f174589b = i12;
            this.f174590c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDatePicker)) {
                return false;
            }
            OpenDatePicker openDatePicker = (OpenDatePicker) obj;
            return this.f174589b == openDatePicker.f174589b && L.f(this.f174590c, openDatePicker.f174590c);
        }

        public final int hashCode() {
            return this.f174590c.hashCode() + (Integer.hashCode(this.f174589b) * 31);
        }

        @k
        public final String toString() {
            return "OpenDatePicker(pos=" + this.f174589b + ", dateEntry=" + this.f174590c + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenLocationPicker;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLocationPicker implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C48095e f174591b;

        public OpenLocationPicker(@l C48095e c48095e) {
            this.f174591b = c48095e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLocationPicker) && L.f(this.f174591b, ((OpenLocationPicker) obj).f174591b);
        }

        public final int hashCode() {
            C48095e c48095e = this.f174591b;
            if (c48095e == null) {
                return 0;
            }
            return c48095e.hashCode();
        }

        @k
        public final String toString() {
            return "OpenLocationPicker(location=" + this.f174591b + ')';
        }
    }

    /* compiled from: JobInterviewInvitationActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/entity/InternalAction$OpenTimePicker;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenTimePicker implements InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f174592b;

        public OpenTimePicker(int i12) {
            this.f174592b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTimePicker) && this.f174592b == ((OpenTimePicker) obj).f174592b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f174592b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OpenTimePicker(pos="), this.f174592b, ')');
        }
    }
}
