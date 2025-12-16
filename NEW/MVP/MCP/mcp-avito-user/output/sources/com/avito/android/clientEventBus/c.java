package com.avito.android.clientEventBus;

import kotlin.Metadata;

/* compiled from: ClientEventBusImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lcom/avito/android/socketEvents/ConnectionState;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f118543b = new c<>();

    /* compiled from: ClientEventBusImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[com.avito.android.socketEvents.ConnectionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.avito.android.socketEvents.ConnectionState connectionState = com.avito.android.socketEvents.ConnectionState.f284728b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iOrdinal = ((com.avito.android.socketEvents.ConnectionState) obj).ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? ConnectionState.f118529c : ConnectionState.f118529c : ConnectionState.f118528b;
    }
}
