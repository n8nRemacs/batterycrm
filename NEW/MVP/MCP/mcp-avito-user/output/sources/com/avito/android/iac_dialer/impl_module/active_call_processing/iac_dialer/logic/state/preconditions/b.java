package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Preconditions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b extends N implements l<IncomingPreconditions, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f165622l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Integer invoke(IncomingPreconditions incomingPreconditions) {
        return Integer.valueOf(incomingPreconditions.getScreenId());
    }
}
