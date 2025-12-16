package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftCancelAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/gig_shift_cancel/mvi/a$a;", "Lcom/avito/android/gig_shift_cancel/mvi/a$b;", "Lcom/avito/android/gig_shift_cancel/mvi/a$c;", "Lcom/avito/android/gig_shift_cancel/mvi/a$d;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class a {

    /* compiled from: GigShiftCancelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/a$a;", "Lcom/avito/android/gig_shift_cancel/mvi/a;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gig_shift_cancel.mvi.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4698a extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C4698a f160628a = new C4698a();

        public C4698a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C4698a);
        }

        public final int hashCode() {
            return -1687174226;
        }

        @Y61.k
        public final String toString() {
            return "ClickOnPrimaryButton";
        }
    }

    /* compiled from: GigShiftCancelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/a$b;", "Lcom/avito/android/gig_shift_cancel/mvi/a;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160629a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -773080288;
        }

        @Y61.k
        public final String toString() {
            return "ClickOnSecondaryButton";
        }
    }

    /* compiled from: GigShiftCancelAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/a$c;", "Lcom/avito/android/gig_shift_cancel/mvi/a;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Reason f160630a;

        public c(@Y61.k Reason reason) {
            super(null);
            this.f160630a = reason;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f160630a, ((c) obj).f160630a);
        }

        public final int hashCode() {
            return this.f160630a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnReasonChecked(item=" + this.f160630a + ')';
        }
    }

    /* compiled from: GigShiftCancelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/a$d;", "Lcom/avito/android/gig_shift_cancel/mvi/a;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f160631a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1726585626;
        }

        @Y61.k
        public final String toString() {
            return "Refresh";
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
