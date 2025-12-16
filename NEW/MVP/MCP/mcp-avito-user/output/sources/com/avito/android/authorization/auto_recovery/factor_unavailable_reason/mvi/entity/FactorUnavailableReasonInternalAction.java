package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FactorUnavailableReasonInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "", "a", "b", "c", "Select", "d", "e", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$a;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$b;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$c;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$Select;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$d;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FactorUnavailableReasonInternalAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$Select;", "", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Select implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public static final Select f93154b;

        /* renamed from: c, reason: collision with root package name */
        public static final Select f93155c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Select[] f93156d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f93157e;

        static {
            Select select = new Select("FACTOR_NOT_AVAILABLE", 0);
            f93154b = select;
            Select select2 = new Select("MESSAGE_NOT_COMING", 1);
            f93155c = select2;
            Select[] selectArr = {select, select2};
            f93156d = selectArr;
            f93157e = kotlin.enums.c.a(selectArr);
        }

        public Select() {
            throw null;
        }

        public static Select valueOf(String str) {
            return (Select) Enum.valueOf(Select.class, str);
        }

        public static Select[] values() {
            return (Select[]) f93156d.clone();
        }
    }

    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$a;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f93158b = new a();
    }

    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$b;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f93159b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f93160c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f93161d;

        public b() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f93159b, bVar.f93159b) && L.f(this.f93160c, bVar.f93160c) && L.f(this.f93161d, bVar.f93161d);
        }

        public final int hashCode() {
            PrintableText printableText = this.f93159b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f93160c;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f93161d;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f93159b);
            sb2.append(", apiError=");
            sb2.append(this.f93160c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f93161d, ')');
        }

        public b(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            printableText = (i12 & 1) != 0 ? null : printableText;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f93159b = printableText;
            this.f93160c = apiError;
            this.f93161d = th2;
        }
    }

    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$c;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f93162b = new c();
    }

    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$d;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f93163b;

        public d() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f93163b == ((d) obj).f93163b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93163b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetOkResult(andFinish="), this.f93163b, ')');
        }

        public d(boolean z12) {
            this.f93163b = z12;
        }

        public /* synthetic */ d(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: FactorUnavailableReasonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction$e;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements FactorUnavailableReasonInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final e f93164b = new e();
    }
}
