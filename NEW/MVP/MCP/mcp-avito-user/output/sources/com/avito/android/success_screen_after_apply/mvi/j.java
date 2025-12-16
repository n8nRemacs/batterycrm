package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuccessScreenAfterApplyOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/j;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/success_screen_after_apply/mvi/j$a;", "Lcom/avito/android/success_screen_after_apply/mvi/j$b;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class j {

    /* compiled from: SuccessScreenAfterApplyOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/j$a;", "Lcom/avito/android/success_screen_after_apply/mvi/j;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessScreenAfterApplyResult.Dismiss f291742a;

        public a(@Y61.k SuccessScreenAfterApplyResult.Dismiss dismiss) {
            super(null);
            this.f291742a = dismiss;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f291742a, ((a) obj).f291742a);
        }

        public final int hashCode() {
            return this.f291742a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Dismiss(result=" + this.f291742a + ')';
        }
    }

    /* compiled from: SuccessScreenAfterApplyOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/j$b;", "Lcom/avito/android/success_screen_after_apply/mvi/j;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessScreenAfterApplyResult.OpenEdit f291743a;

        public b(@Y61.k SuccessScreenAfterApplyResult.OpenEdit openEdit) {
            super(null);
            this.f291743a = openEdit;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f291743a, ((b) obj).f291743a);
        }

        public final int hashCode() {
            return this.f291743a.f291776b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DismissForEdit(result=" + this.f291743a + ')';
        }
    }

    public /* synthetic */ j(C42822w c42822w) {
        this();
    }

    public j() {
    }
}
