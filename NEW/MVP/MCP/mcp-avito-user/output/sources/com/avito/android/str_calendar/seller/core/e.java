package com.avito.android.str_calendar.seller.core;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import com.avito.android.str_calendar.seller.core.d;
import java.util.Date;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: StrSellerCalendarCoreRouter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/e;", "Lcom/avito/android/str_calendar/seller/core/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f287826a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f287827b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f287828c;

    @Inject
    public e() {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f287826a = f2.a(1, 1, bufferOverflow);
        this.f287827b = f2.a(1, 1, bufferOverflow);
        this.f287828c = f2.b(0, 1, null, 5);
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object a(@k SuspendLambda suspendLambda) {
        Object objEmit = this.f287826a.emit(d.b.f287805a, suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object b(@k Continuation continuation) {
        Object objEmit = this.f287828c.emit(Boxing.boxBoolean(true), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object c(@k String str, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.h(str), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object d(boolean z12, @l UpdatedParametersInfo updatedParametersInfo, @k SuspendLambda suspendLambda) {
        Object objEmit = this.f287826a.emit(new d.c(z12, updatedParametersInfo), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object e(@k String str, @l Date date, @l Date date2, boolean z12, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.i(str, date, date2, z12), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object f(@k String str, @l SelectedDateRange selectedDateRange, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.j(str, selectedDateRange), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    /* renamed from: g, reason: from getter */
    public final e2 getF287826a() {
        return this.f287826a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object h(@k SK0.f fVar, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.m(fVar), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    /* renamed from: i, reason: from getter */
    public final e2 getF287827b() {
        return this.f287827b;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object j(@k String str, @l String str2, @l String str3, boolean z12, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.l(str, str2, str3, z12), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object k(@k Continuation continuation) {
        Object objEmit = this.f287827b.emit(Boxing.boxBoolean(true), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object l(@k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(d.g.f287810a, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object m(boolean z12, @l UpdatedParametersInfo updatedParametersInfo, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.C8643d(z12, updatedParametersInfo), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    /* renamed from: n, reason: from getter */
    public final e2 getF287828c() {
        return this.f287828c;
    }

    @Override // com.avito.android.str_calendar.seller.core.c
    @l
    public final Object o(@k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo, @k Continuation<? super G0> continuation) {
        Object objEmit = this.f287826a.emit(new d.k(strSellerCalendarRejectInfo), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
