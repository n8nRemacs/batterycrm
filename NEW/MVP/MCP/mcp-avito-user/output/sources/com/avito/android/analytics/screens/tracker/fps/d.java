package com.avito.android.analytics.screens.tracker.fps;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenContextFpsTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/fps/a;", "it", "", "invoke", "(Lcom/avito/android/fps/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<com.avito.android.fps.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f90868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j12) {
        super(1);
        this.f90868l = j12;
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.fps.a aVar) {
        com.avito.android.fps.a aVar2 = aVar;
        return Boolean.valueOf(this.f90868l < aVar2.f158620d - aVar2.f158617a.toMillis());
    }
}
