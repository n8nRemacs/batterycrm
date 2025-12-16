package com.avito.android.iac_dialer.impl_module.telecom;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: IacConnectionInputDataStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/c;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f166407a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashMap f166408b = new LinkedHashMap();

    @l
    public final synchronized IacConnectionInputData a(@l String str) {
        IacConnectionInputData iacConnectionInputData;
        iacConnectionInputData = str == null ? null : (IacConnectionInputData) f166408b.remove(str);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionInputDataStorage", "getAndRemove(callId=" + str + "): " + iacConnectionInputData, null);
        return iacConnectionInputData;
    }
}
