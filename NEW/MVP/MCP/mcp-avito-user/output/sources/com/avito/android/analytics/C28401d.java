package com.avito.android.analytics;

import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: Analytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00000\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/analytics/o;", "E", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/analytics/o;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.analytics.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28401d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C28401d<T, R> f89883b = new C28401d<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC28464o interfaceC28464o = (InterfaceC28464o) obj;
        return interfaceC28464o instanceof InterfaceC28459j ? io.reactivex.rxjava3.core.z.X(b1.i(((InterfaceC28459j) interfaceC28464o).getEvents(), interfaceC28464o)) : io.reactivex.rxjava3.core.z.c0(interfaceC28464o);
    }
}
