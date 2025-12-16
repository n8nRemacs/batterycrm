package com.avito.android.gsm_call_starter.impl_module.link;

import java.util.Map;
import kotlin.Metadata;
import l41.r;

/* compiled from: GsmCallStartLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "it", "", "test", "(Ljava/util/Map;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final b<T> f161231b = new b<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((Map) obj).containsKey("android.permission.CALL_PHONE");
    }
}
