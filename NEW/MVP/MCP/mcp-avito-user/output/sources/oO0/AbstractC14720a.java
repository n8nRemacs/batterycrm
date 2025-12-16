package Oo0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SbcClientMetricsLogger.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LOo0/a;", "", "a", "b", "c", "d", "LOo0/a$a;", "LOo0/a$b;", "LOo0/a$c;", "LOo0/a$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14720a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f12523a;

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/a$a;", "LOo0/a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0806a extends AbstractC14720a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C0806a f12524b = new C0806a();

        public C0806a() {
            super("error.confirm_failed", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0806a);
        }

        public final int hashCode() {
            return 329408345;
        }

        @Y61.k
        public final String toString() {
            return "ConfirmFailed";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/a$b;", "LOo0/a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.a$b */
    public static final /* data */ class b extends AbstractC14720a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f12525b = new b();

        public b() {
            super("error.form_validation", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -734596377;
        }

        @Y61.k
        public final String toString() {
            return "FormValidationError";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/a$c;", "LOo0/a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.a$c */
    public static final /* data */ class c extends AbstractC14720a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f12526b = new c();

        public c() {
            super("error.payment_vas_failed", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -253993885;
        }

        @Y61.k
        public final String toString() {
            return "PaymentVasFailed";
        }
    }

    /* compiled from: SbcClientMetricsLogger.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOo0/a$d;", "LOo0/a;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oo0.a$d */
    public static final /* data */ class d extends AbstractC14720a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f12527b = new d();

        public d() {
            super("success", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 822945087;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }

    public AbstractC14720a(String str, C42822w c42822w) {
        this.f12523a = str;
    }
}
