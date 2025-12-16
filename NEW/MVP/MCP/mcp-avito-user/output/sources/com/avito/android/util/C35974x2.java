package com.avito.android.util;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: Intents.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.x2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35974x2 {
    @Y61.k
    public static final List<Uri> a(@Y61.k Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        int itemCount = clipData.getItemCount();
        for (int i12 = 0; i12 < itemCount; i12++) {
            arrayList.add(clipData.getItemAt(i12).getUri());
        }
        return arrayList;
    }

    @Y61.l
    public static final Integer b(@Y61.k Intent intent, @Y61.k String str) {
        Bundle extras;
        if (!intent.hasExtra(str) || (extras = intent.getExtras()) == null) {
            return null;
        }
        return Integer.valueOf(extras.getInt(str));
    }

    @Y61.l
    public static final Long c(@Y61.k Intent intent, @Y61.k String str) {
        Bundle extras;
        if (!intent.hasExtra(str) || (extras = intent.getExtras()) == null) {
            return null;
        }
        return Long.valueOf(extras.getLong(str));
    }

    @Y61.k
    public static final void d(@Y61.k Intent intent) {
        Bundle extras;
        if (intent.getComponent() != null || (extras = intent.getExtras()) == null) {
            return;
        }
        for (String str : extras.keySet()) {
            Object obj = extras.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    G.f(bundle);
                    if (bundle.isEmpty()) {
                        intent.removeExtra(str);
                    } else {
                        intent.putExtra(str, bundle);
                    }
                } else {
                    String name = obj.getClass().getName();
                    if (!(C43066x.h0(name, "java.", false) | C43066x.h0(name, "android.", false))) {
                        intent.removeExtra(str);
                    }
                }
            }
        }
    }
}
