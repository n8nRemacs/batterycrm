package ru.mts.biometry.sdk.utils;

import Aa1.a;
import W91.h;
import androidx.core.content.j;
import kotlin.Metadata;
import ru.mts.biometry.sdk.base.p;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/utils/e;", "Lru/mts/biometry/sdk/base/p;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class e extends p {
    @Override // ru.mts.biometry.sdk.base.p
    public final void b() {
        j jVarL1 = l1();
        a aVar = jVarL1 instanceof a ? (a) jVarL1 : null;
        if (aVar != null) {
            BiometryActivity biometryActivity = (BiometryActivity) aVar;
            h hVar = biometryActivity.f436468c;
            if ((hVar != null ? hVar : null).f17823e) {
                return;
            }
            biometryActivity.setResult(11);
            biometryActivity.finish();
        }
    }
}
