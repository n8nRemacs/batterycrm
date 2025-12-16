package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: GlobalAnimations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/C1;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C1 f318564a = new C1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static Float f318565b;

    public static boolean a() {
        Float f12 = f318565b;
        if (f12 != null) {
            return f12.floatValue() > 0.0f;
        }
        throw new IllegalArgumentException("Animations settings must be initialized before usage");
    }
}
