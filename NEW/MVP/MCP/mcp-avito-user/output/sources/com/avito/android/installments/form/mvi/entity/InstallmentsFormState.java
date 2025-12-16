package com.avito.android.installments.form.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFormState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState;", "", "a", "Status", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsFormState {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f172766d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final InstallmentsFormState f172767e = new InstallmentsFormState(Status.f172771b, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Status f172768a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f172769b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f172770c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstallmentsFormState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState$Status;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f172771b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f172772c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f172773d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f172774e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f172775f;

        static {
            Status status = new Status("LOADING", 0);
            f172771b = status;
            Status status2 = new Status("LOADED", 1);
            f172772c = status2;
            Status status3 = new Status("ERROR", 2);
            f172773d = status3;
            Status[] statusArr = {status, status2, status3};
            f172774e = statusArr;
            f172775f = c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f172774e.clone();
        }
    }

    /* compiled from: InstallmentsFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState$a;", "", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public InstallmentsFormState(@k Status status, @l String str, @l String str2) {
        this.f172768a = status;
        this.f172769b = str;
        this.f172770c = str2;
    }

    public static InstallmentsFormState a(InstallmentsFormState installmentsFormState, Status status, String str, int i12) {
        if ((i12 & 1) != 0) {
            status = installmentsFormState.f172768a;
        }
        if ((i12 & 2) != 0) {
            str = installmentsFormState.f172769b;
        }
        String str2 = (i12 & 4) != 0 ? installmentsFormState.f172770c : null;
        installmentsFormState.getClass();
        return new InstallmentsFormState(status, str, str2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsFormState)) {
            return false;
        }
        InstallmentsFormState installmentsFormState = (InstallmentsFormState) obj;
        return this.f172768a == installmentsFormState.f172768a && L.f(this.f172769b, installmentsFormState.f172769b) && L.f(this.f172770c, installmentsFormState.f172770c);
    }

    public final int hashCode() {
        int iHashCode = this.f172768a.hashCode() * 31;
        String str = this.f172769b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172770c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFormState(status=");
        sb2.append(this.f172768a);
        sb2.append(", formUrl=");
        sb2.append(this.f172769b);
        sb2.append(", requestFormUrl=");
        return C22026a.c(sb2, this.f172770c, ')');
    }

    public /* synthetic */ InstallmentsFormState(Status status, String str, String str2, int i12, C42822w c42822w) {
        this(status, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
