package com.avito.android.profile_phones.confirm_phone;

import com.avito.android.profile_phones.confirm_phone.l;
import com.avito.android.util.ApiException;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ConfirmPhoneViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f227099b;

    public q(o oVar) {
        this.f227099b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof ApiException) {
            this.f227099b.f227080Q.postValue(new l.c.b(((ApiException) th2).getMessage(), th2));
        } else {
            V2.f318762a.a("DEFAULT_TAG", "Failed to send confirm code", th2);
        }
    }
}
