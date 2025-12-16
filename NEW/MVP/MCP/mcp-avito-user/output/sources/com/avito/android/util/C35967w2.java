package com.avito.android.util;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.CalledFrom;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import kotlin.Metadata;

/* compiled from: Intents.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-app_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.w2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35967w2 {
    @Y61.l
    public static final CalledFrom a(@Y61.k Intent intent) {
        return (CalledFrom) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("called_from", CalledFrom.class) : intent.getParcelableExtra("called_from"));
    }

    @Y61.k
    public static final void b(@Y61.k Intent intent, @Y61.k TreeClickStreamParent treeClickStreamParent) {
        intent.putExtra("treeAnalyticsParent", treeClickStreamParent);
    }

    public static final void c(@Y61.k Intent intent, @Y61.l CalledFrom calledFrom) {
        intent.putExtra("called_from", calledFrom);
    }
}
