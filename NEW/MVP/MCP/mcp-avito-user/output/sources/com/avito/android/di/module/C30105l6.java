package com.avito.android.di.module;

import com.avito.android.remote.model.payment.form.PaymentGenericFormResult;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import com.avito.android.util.C35866p0;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PaymentJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/l6;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.l6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30105l6 implements dagger.internal.h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C30105l6 f144389a = new C30105l6();

    @Override // javax.inject.Provider
    public final Object get() {
        C30094k6.f144366a.getClass();
        return kotlin.collections.b1.g(new C35866p0(PaymentGenericResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", PaymentGenericResult.Ok.class), new kotlin.Q("dublicate-payment-error", PaymentGenericResult.DuplicatePayment.class), new kotlin.Q("form-incorrect-data", PaymentGenericResult.FormIncorrectData.class), new kotlin.Q("forbidden", PaymentGenericResult.ForbiddenPayment.class))), new C35866p0(PaymentStatusResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", PaymentStatusResult.PaymentStatus.class), new kotlin.Q("forbidden", PaymentStatusResult.ForbiddenPayment.class))), new C35866p0(PaymentGenericFormResult.class, Collections.singletonMap("ok", PaymentGenericFormResult.Ok.class)), new C35866p0(PaymentStatusFormResult.class, Collections.singletonMap("ok", PaymentStatusFormResult.StatusForm.class)));
    }
}
