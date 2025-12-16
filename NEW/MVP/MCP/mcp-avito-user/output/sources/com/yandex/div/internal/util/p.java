package com.yandex.div.internal.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import j.U;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final DisplayMetrics f370185a = Resources.getSystem().getDisplayMetrics();

    @U
    public static final int a(@j.r int i12) {
        return kotlin.math.b.b(i12 * f370185a.density);
    }
}
