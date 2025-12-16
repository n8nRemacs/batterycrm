package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyResult;
import kotlin.Metadata;

/* compiled from: SuccessScreenAfterApplyInternalAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/i;", "", "a", "b", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: SuccessScreenAfterApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/i$a;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessScreenAfterApplyResult.Dismiss f291740a;

        public a(@Y61.k SuccessScreenAfterApplyResult.Dismiss dismiss) {
            this.f291740a = dismiss;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f291740a.equals(((a) obj).f291740a);
        }

        public final int hashCode() {
            return this.f291740a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Dismiss(result=" + this.f291740a + ')';
        }
    }

    /* compiled from: SuccessScreenAfterApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/i$b;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessScreenAfterApplyResult.OpenEdit f291741a;

        public b(@Y61.k SuccessScreenAfterApplyResult.OpenEdit openEdit) {
            this.f291741a = openEdit;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f291741a.equals(((b) obj).f291741a);
        }

        public final int hashCode() {
            return this.f291741a.f291776b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DismissForEdit(result=" + this.f291741a + ')';
        }
    }
}
