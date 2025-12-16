package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "shouldListenToProximitySensorEvents", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32316k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32306a f195167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.akarnokd.rxjava3.schedulers.c f195168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f195169d;

    public C32316k(C32306a c32306a, hu.akarnokd.rxjava3.schedulers.c cVar, float f12) {
        this.f195167b = c32306a;
        this.f195168c = cVar;
        this.f195169d = f12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            X2.f318778a.i("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: shouldListenToProximitySensorEvents = false => emit shouldSetOutputToEarpiece = false", null);
            return io.reactivex.rxjava3.core.z.c0(Boolean.FALSE);
        }
        C32306a c32306a = this.f195167b;
        com.jakewharton.rxrelay3.b<Integer> bVar = c32306a.f195117d0;
        hu.akarnokd.rxjava3.schedulers.c cVar = this.f195168c;
        B0 b0D0 = bVar.j0(cVar).D0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(C32313h.f195160b);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.core.z<R> zVarY0 = b0D0.D(oVar).y0(new C32315j(c32306a, cVar, this.f195169d));
        zVarY0.getClass();
        return zVarY0.D(oVar).x0(cVar);
    }
}
