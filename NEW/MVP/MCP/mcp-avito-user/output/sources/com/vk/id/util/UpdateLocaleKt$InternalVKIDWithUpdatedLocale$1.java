package com.vk.id.util;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UpdateLocale.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UpdateLocaleKt$InternalVKIDWithUpdatedLocale$1 implements p<A, Integer, G0> {
    final /* synthetic */ p<A, Integer, G0> $content;

    @Override // Y41.p
    public /* bridge */ /* synthetic */ G0 invoke(A a12, Integer num) {
        invoke(a12, num.intValue());
        return G0.f406611a;
    }

    @InterfaceC22132o
    public final void invoke(A a12, int i12) {
        if ((i12 & 3) == 2 && a12.c()) {
            a12.f();
        } else {
            this.$content.invoke(a12, 0);
        }
    }
}
