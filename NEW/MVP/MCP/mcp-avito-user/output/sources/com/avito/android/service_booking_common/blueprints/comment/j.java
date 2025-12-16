package com.avito.android.service_booking_common.blueprints.comment;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbCommentViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/comment/j;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public s f276282b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f276283c;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sb_comment);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f276283c = (Input) viewFindViewById;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        s sVar = this.f276282b;
        Input input = this.f276283c;
        if (sVar != null) {
            input.h(sVar);
        }
        input.setClearButtonListener(null);
    }
}
