package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinDebounceAction;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: BeduinDebounceActionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinDebounceAction;", "kotlin.jvm.PlatformType", "action", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/beduin/common/action/BeduinDebounceAction;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f100061b;

    public D(I i12) {
        this.f100061b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return io.reactivex.rxjava3.core.z.F0((long) (((BeduinDebounceAction) obj).getDuration() * 1000), TimeUnit.MILLISECONDS, this.f100061b.f100087b.c());
    }
}
