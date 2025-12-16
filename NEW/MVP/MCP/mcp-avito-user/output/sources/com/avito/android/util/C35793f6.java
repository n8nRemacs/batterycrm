package com.avito.android.util;

import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UUIDRandomKeyProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/f6;", "Lcom/avito/android/util/o4;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.f6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35793f6 implements InterfaceC35863o4 {
    @Inject
    public C35793f6() {
    }

    @Override // com.avito.android.util.InterfaceC35863o4
    @Y61.k
    public final String a() {
        return UUID.randomUUID().toString();
    }
}
