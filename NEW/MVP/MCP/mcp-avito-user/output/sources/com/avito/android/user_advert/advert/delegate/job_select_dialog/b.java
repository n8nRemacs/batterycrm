package com.avito.android.user_advert.advert.delegate.job_select_dialog;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobSelectBottomSheetDialogDelegateAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b;", "LfH0/b;", "a", "b", "c", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$a;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$b;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b extends InterfaceC40292b {

    /* compiled from: JobSelectBottomSheetDialogDelegateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$a;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f308627a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1666989249;
        }

        @k
        public final String toString() {
            return "RefreshPage";
        }
    }

    /* compiled from: JobSelectBottomSheetDialogDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$b;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.delegate.job_select_dialog.b$b, reason: collision with other inner class name */
    public static final /* data */ class C9468b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f308628a;

        public C9468b(@k ApiError apiError) {
            this.f308628a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9468b) && L.f(this.f308628a, ((C9468b) obj).f308628a);
        }

        public final int hashCode() {
            return this.f308628a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f308628a, ')');
        }
    }

    /* compiled from: JobSelectBottomSheetDialogDelegateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b$c;", "Lcom/avito/android/user_advert/advert/delegate/job_select_dialog/b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f308629a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 125766117;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }
}
