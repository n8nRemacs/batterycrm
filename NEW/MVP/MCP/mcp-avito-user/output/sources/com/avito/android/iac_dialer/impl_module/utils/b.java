package com.avito.android.iac_dialer.impl_module.utils;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: HasIndex.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/utils/b;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f166511a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashMap f166512b = new LinkedHashMap();

    @l
    public final synchronized HasIndex a(@k HasIndex.Type type) {
        return (HasIndex) f166512b.get(type);
    }

    public final synchronized void b(@k HasIndex.Type type, @k HasIndex hasIndex) {
        f166512b.put(type, hasIndex);
    }
}
