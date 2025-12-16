package com.avito.android.connection_quality.connectivity;

import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: ConnectivityProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Z;", "Lcom/avito/android/connection_quality/reactive_network/a;", "connectivityResult", "", "apply", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f125698b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Object obj2 = ((Z) obj).f406625b;
        if (Z.b(obj2) == null) {
            return Boolean.valueOf(((com.avito.android.connection_quality.reactive_network.a) obj2).f125716a == NetworkInfo.State.CONNECTED);
        }
        return Boolean.TRUE;
    }
}
