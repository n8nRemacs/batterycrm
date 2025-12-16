package com.avito.android.service_booking.mvi.step;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceBookingMviStepRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.service_booking.mvi.step.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34914h extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final C34914h f274647l = new C34914h();

    public C34914h() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        com.avito.android.bxcontent.mvi.entity.f.t("Error while observing days click: ", th2, V2.f318762a, null);
        return G0.f406611a;
    }
}
