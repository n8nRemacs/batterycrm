package com.avito.android.phone_confirmation;

import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "untilTime", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/phone_confirmation/view/i;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.phone_confirmation.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33166w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f216004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f216005c;

    public C33166w(U u12, InterfaceC35745a5 interfaceC35745a5) {
        this.f216004b = interfaceC35745a5;
        this.f216005c = u12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(0L), io.reactivex.rxjava3.core.z.a0(1L, 1L, TimeUnit.SECONDS, this.f216004b.c())).d0(new C33163t(((Number) obj).longValue(), this.f216005c)).B0(C33164u.f215969b).d0(C33165v.f215970b);
    }
}
