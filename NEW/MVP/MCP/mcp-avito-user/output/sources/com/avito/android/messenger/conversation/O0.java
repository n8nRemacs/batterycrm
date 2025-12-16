package com.avito.android.messenger.conversation;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "text", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final O0<T, R> f189126b = new O0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return io.reactivex.rxjava3.core.z.F0(C43066x.K((String) obj) ? 900L : 500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
