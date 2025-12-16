package com.avito.android.publish.screen.step.params.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00000\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "items", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class V<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241159b;

    public V(C34076c c34076c) {
        this.f241159b = c34076c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        return this.f241159b.f241193h.h(list, B0.f406639b).r(new U(list));
    }
}
