package com.avito.android.util.architecture_components;

import kotlin.Metadata;

/* compiled from: Event.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/architecture_components/b;", "T", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.architecture_components.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35748b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f318807a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f318808b;

    public C35748b(T t12) {
        this.f318807a = t12;
    }

    @Y61.l
    public final T a() {
        if (this.f318808b) {
            return null;
        }
        this.f318808b = true;
        return this.f318807a;
    }
}
