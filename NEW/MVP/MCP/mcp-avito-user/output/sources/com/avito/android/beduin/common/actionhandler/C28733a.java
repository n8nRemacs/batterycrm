package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinLogFirebaseEventAction;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinActionFirebaseEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/a;", "LQc/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28733a implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f100155b;

    public C28733a(@Y61.k BeduinLogFirebaseEventAction beduinLogFirebaseEventAction) {
        this.f100155b = Qc.h.a(beduinLogFirebaseEventAction.getName(), beduinLogFirebaseEventAction.getParams());
    }

    @Override // Qc.f
    @Y61.k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f100155b.f13936b;
    }

    @Override // Qc.f
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f100155b.f13937c;
    }
}
