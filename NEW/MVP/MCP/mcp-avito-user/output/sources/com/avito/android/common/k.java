package com.avito.android.common;

import kotlin.Metadata;

/* compiled from: InputData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/common/k;", "", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharSequence f123766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123768c;

    public k(int i12, int i13, @Y61.k CharSequence charSequence) {
        this.f123766a = charSequence;
        this.f123767b = Math.min(Math.max(0, i12), charSequence.length());
        this.f123768c = Math.min(Math.max(0, i13), charSequence.length());
    }
}
