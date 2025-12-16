package com.avito.android.messenger.conversation.mvi.voice;

import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPlaying", "Lio/reactivex/rxjava3/core/E;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32319n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32319n<T, R> f195179b = new C32319n<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        C41998x0 c41998x0C0 = io.reactivex.rxjava3.core.z.c0(bool);
        return !zBooleanValue ? c41998x0C0.z(1L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b) : c41998x0C0;
    }
}
