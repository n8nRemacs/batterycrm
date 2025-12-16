package ru.avito.messenger.internal.connection;

import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47760m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431366b;

    public C47760m(C47754g c47754g) {
        this.f431366b = c47754g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f431366b.f431311f.e("ConnectionHolder", "Failed to save config", (Throwable) obj);
    }
}
