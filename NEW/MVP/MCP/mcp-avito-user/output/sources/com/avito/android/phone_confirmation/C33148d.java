package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationTime;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33148d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33146b f215904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215905c;

    public C33148d(C33146b c33146b, String str) {
        this.f215904b = c33146b;
        this.f215905c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        return new PhoneConfirmationTime(this.f215905c, TimeUnit.MILLISECONDS.convert(jLongValue, TimeUnit.SECONDS) + this.f215904b.f215898e.now());
    }
}
