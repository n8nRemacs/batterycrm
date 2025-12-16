package com.avito.android.service_booking_common.blueprints.comment;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: SbCommentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/comment/c;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276272b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f276273c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f276274d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f276275e;

    public c(@k String str, @k String str2, @k String str3, @l String str4) {
        this.f276272b = str;
        this.f276273c = str2;
        this.f276274d = str3;
        this.f276275e = str4;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF276272b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF276272b() {
        return this.f276272b;
    }
}
