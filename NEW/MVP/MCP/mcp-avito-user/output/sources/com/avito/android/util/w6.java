package com.avito.android.util;

import android.view.ViewPropertyAnimator;
import kotlin.Metadata;

/* compiled from: ViewPropertyAnimatorUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w6 {
    @Y61.k
    public static final void a(@Y61.k ViewPropertyAnimator viewPropertyAnimator, @Y61.k Y41.a aVar) {
        viewPropertyAnimator.withEndAction(new U2(aVar));
    }
}
