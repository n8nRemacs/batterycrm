package com.vk.push.core.utils;

import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: CoroutineExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    public static final synchronized <T> void a(@Y61.k InterfaceC43271q<? super T> interfaceC43271q, T t12) {
        if (interfaceC43271q.isActive()) {
            int i12 = Z.f406624c;
            interfaceC43271q.resumeWith(t12);
        }
    }
}
