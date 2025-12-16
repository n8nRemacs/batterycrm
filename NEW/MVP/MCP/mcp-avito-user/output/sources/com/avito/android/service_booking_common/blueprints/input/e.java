package com.avito.android.service_booking_common.blueprints.input;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SbInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/input/e;", "Lcom/avito/android/service_booking_common/blueprints/input/d;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f276441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f276442c;

    public e() {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f276441b = f2.b(0, 1, bufferOverflow, 1);
        this.f276442c = f2.b(0, 1, bufferOverflow, 1);
    }

    @Override // com.avito.android.service_booking_common.blueprints.input.c
    @Y61.k
    /* renamed from: O0, reason: from getter */
    public final e2 getF276441b() {
        return this.f276441b;
    }

    @Override // com.avito.android.service_booking_common.blueprints.input.c
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final e2 getF276442c() {
        return this.f276442c;
    }
}
