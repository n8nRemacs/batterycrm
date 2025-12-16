package com.avito.android.lib.beduin_v2.component.input;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InputCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.component.input.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C31107f extends kotlin.jvm.internal.H implements Y41.l<Boolean, G0> {
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        Y41.l<? super Boolean, G0> lVar = ((k) this.receiver).onFocusChanged;
        if (lVar != null) {
            lVar.invoke(bool2);
        }
        return G0.f406611a;
    }
}
