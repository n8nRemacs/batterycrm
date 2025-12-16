package com.avito.android.payment.form;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/payment/form/P;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/payment/form/P$a;", "Lcom/avito/android/payment/form/P$b;", "Lcom/avito/android/payment/form/P$c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class P {

    /* compiled from: ScreenState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/P$a;", "Lcom/avito/android/payment/form/P;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends P {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f214336a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<TV0.a> f214337b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f214338c;

        public /* synthetic */ a(String str, List list, boolean z12, int i12, C42822w c42822w) {
            this(str, list, (i12 & 4) != 0 ? false : z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k String str, @Y61.k List<? extends TV0.a> list, boolean z12) {
            super(null);
            this.f214336a = str;
            this.f214337b = list;
            this.f214338c = z12;
        }
    }

    /* compiled from: ScreenState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/P$b;", "Lcom/avito/android/payment/form/P;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends P {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f214339a;

        public b(@Y61.k String str) {
            super(null);
            this.f214339a = str;
        }
    }

    /* compiled from: ScreenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/P$c;", "Lcom/avito/android/payment/form/P;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends P {
        public c() {
            super(null);
        }
    }

    public /* synthetic */ P(C42822w c42822w) {
        this();
    }

    public P() {
    }
}
