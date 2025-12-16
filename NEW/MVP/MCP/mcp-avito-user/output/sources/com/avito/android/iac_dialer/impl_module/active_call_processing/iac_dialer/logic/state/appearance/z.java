package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallInit.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00010\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class z extends N implements Y41.l<Map<String, ? extends CallInit>, CallInit> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f165544l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str) {
        super(1);
        this.f165544l = str;
    }

    @Override // Y41.l
    public final CallInit invoke(Map<String, ? extends CallInit> map) {
        return map.get(this.f165544l);
    }
}
