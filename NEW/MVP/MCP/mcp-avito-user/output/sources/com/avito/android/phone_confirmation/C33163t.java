package com.avito.android.phone_confirmation;

import kotlin.Metadata;

/* compiled from: PhoneConfirmationBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "apply", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33163t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f215967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f215968c;

    public C33163t(long j12, U u12) {
        this.f215967b = j12;
        this.f215968c = u12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        return Long.valueOf(this.f215967b - this.f215968c.c().now());
    }
}
