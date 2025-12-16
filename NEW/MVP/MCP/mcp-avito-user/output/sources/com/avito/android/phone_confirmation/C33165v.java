package com.avito.android.phone_confirmation;

import com.avito.android.date_time_formatter.b;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/phone_confirmation/view/i;", "apply", "(J)Lcom/avito/android/phone_confirmation/view/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.phone_confirmation.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33165v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C33165v<T, R> f215970b = new C33165v<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue < 0) {
            return new com.avito.android.phone_confirmation.view.i(true, null);
        }
        com.avito.android.date_time_formatter.b.f132563a.getClass();
        return new com.avito.android.phone_confirmation.view.i(false, b.a.a(jLongValue));
    }
}
