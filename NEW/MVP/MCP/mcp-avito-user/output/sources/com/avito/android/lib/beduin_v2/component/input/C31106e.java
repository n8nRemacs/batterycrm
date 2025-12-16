package com.avito.android.lib.beduin_v2.component.input;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InputCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.component.input.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C31106e extends kotlin.jvm.internal.H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        Y41.l<? super String, G0> lVar = ((k) this.receiver).onTextChanged;
        if (lVar != null) {
            lVar.invoke(str2);
        }
        return G0.f406611a;
    }
}
