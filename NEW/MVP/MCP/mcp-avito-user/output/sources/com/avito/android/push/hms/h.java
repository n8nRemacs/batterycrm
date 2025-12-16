package com.avito.android.push.hms;

import Y61.k;
import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import fg0.InterfaceC40418b;
import fg0.InterfaceC40420d;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: HmsPushTokenProviderModuleImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/hms/h;", "Lfg0/b;", "<init>", "()V", "_avito_push-hms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements InterfaceC40418b {
    @Override // fg0.InterfaceC40418b
    @k
    public final Set<InterfaceC40420d> a(@k Context context, @k InterfaceC35745a5 interfaceC35745a5) {
        b.f245938a.getClass();
        return b.a(context) ? Collections.singleton(new e(context, interfaceC35745a5)) : B0.f406639b;
    }
}
