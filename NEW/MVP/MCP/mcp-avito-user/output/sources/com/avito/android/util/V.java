package com.avito.android.util;

import android.content.ClipboardManager;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClipboardManagers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/V;", "Lcom/avito/android/util/U;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V implements U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClipboardManager f318759a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q f318760b;

    @Inject
    public V(@Y61.k ClipboardManager clipboardManager, @Y61.k Q q12) {
        this.f318759a = clipboardManager;
        this.f318760b = q12;
    }

    @Override // com.avito.android.util.U
    public final void a(@Y61.k String str) {
        this.f318759a.setPrimaryClip(this.f318760b.a(str));
    }
}
