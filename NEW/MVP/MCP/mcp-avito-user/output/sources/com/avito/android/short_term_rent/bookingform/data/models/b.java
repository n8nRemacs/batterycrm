package com.avito.android.short_term_rent.bookingform.data.models;

import Y41.l;
import jw0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BookingFormDtoBlocksToBlockItemsMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw0/f;", "option", "", "invoke", "(Ljw0/f;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements l<f, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f281226l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(f fVar) {
        return Boolean.valueOf(fVar.getIsSelected());
    }
}
