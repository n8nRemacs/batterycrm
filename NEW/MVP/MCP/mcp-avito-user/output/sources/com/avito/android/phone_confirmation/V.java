package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import com.avito.android.remote.model.PhoneConfirmationStatus;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/phone_confirmation/state/PhoneConfirmationTime;", "it", "Lcom/avito/android/remote/model/PhoneConfirmationStatus;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class V<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f215885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215886c;

    public V(X x12, String str) {
        this.f215885b = x12;
        this.f215886c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhoneConfirmationStatus phoneConfirmationStatus = (PhoneConfirmationStatus) obj;
        long nextTryTime = phoneConfirmationStatus.getNextTryTime() - phoneConfirmationStatus.getLastTryTime();
        return new PhoneConfirmationTime(this.f215886c, TimeUnit.MILLISECONDS.convert(nextTryTime, TimeUnit.SECONDS) + this.f215885b.f215889e.now());
    }
}
