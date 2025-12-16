package com.avito.android.entry_point_client_room.report.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendReportInternalAction.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "<init>", "()V", "Close", "CloseWithOkResult", "ErrorOnPhoneInput", "UpdateDescriptionInput", "UpdatePhoneInput", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$Close;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$CloseWithOkResult;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$ErrorOnPhoneInput;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$UpdateDescriptionInput;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$UpdatePhoneInput;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SendReportInternalAction implements n {

    /* compiled from: SendReportInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$Close;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close extends SendReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f147715b = new Close();

        private Close() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 197411362;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SendReportInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$CloseWithOkResult;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithOkResult extends SendReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseWithOkResult f147716b = new CloseWithOkResult();

        private CloseWithOkResult() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseWithOkResult);
        }

        public final int hashCode() {
            return 1401114433;
        }

        @k
        public final String toString() {
            return "CloseWithOkResult";
        }
    }

    /* compiled from: SendReportInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$ErrorOnPhoneInput;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorOnPhoneInput extends SendReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ErrorOnPhoneInput f147717b = new ErrorOnPhoneInput();

        private ErrorOnPhoneInput() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ErrorOnPhoneInput);
        }

        public final int hashCode() {
            return -346911347;
        }

        @k
        public final String toString() {
            return "ErrorOnPhoneInput";
        }
    }

    /* compiled from: SendReportInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$UpdateDescriptionInput;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDescriptionInput extends SendReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f147718b;

        public UpdateDescriptionInput(@k String str) {
            super(null);
            this.f147718b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDescriptionInput) && L.f(this.f147718b, ((UpdateDescriptionInput) obj).f147718b);
        }

        public final int hashCode() {
            return this.f147718b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateDescriptionInput(value="), this.f147718b, ')');
        }
    }

    /* compiled from: SendReportInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction$UpdatePhoneInput;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePhoneInput extends SendReportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f147719b;

        public UpdatePhoneInput(@k String str) {
            super(null);
            this.f147719b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePhoneInput) && L.f(this.f147719b, ((UpdatePhoneInput) obj).f147719b);
        }

        public final int hashCode() {
            return this.f147719b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePhoneInput(value="), this.f147719b, ')');
        }
    }

    public /* synthetic */ SendReportInternalAction(C42822w c42822w) {
        this();
    }

    private SendReportInternalAction() {
    }
}
