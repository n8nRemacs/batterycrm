package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.util.X2;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "sensorAccuracyIsAcceptable", "Lio/reactivex/rxjava3/core/E;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.akarnokd.rxjava3.schedulers.c f195150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f195151d;

    public d0(a0 a0Var, hu.akarnokd.rxjava3.schedulers.c cVar, float f12) {
        this.f195149b = a0Var;
        this.f195150c = cVar;
        this.f195151d = f12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            X2.f318778a.i("VoicePlayerPresenter", "OutputSwitchingOnProximityChanges: sensorAccuracyIsAcceptable = false => emit shouldSetOutputToEarpiece = false", null);
            return io.reactivex.rxjava3.core.z.c0(Boolean.FALSE);
        }
        com.jakewharton.rxrelay3.b<Float> bVar = this.f195149b.f195140a0;
        hu.akarnokd.rxjava3.schedulers.c cVar = this.f195150c;
        return bVar.j0(cVar).D0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(cVar).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new c0(this.f195151d)).x0(cVar);
    }
}
