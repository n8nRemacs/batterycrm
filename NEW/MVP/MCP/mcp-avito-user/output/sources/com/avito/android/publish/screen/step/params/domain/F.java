package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "args", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "([Ljava/lang/Object;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final F<T, R> f241134b = new F<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        for (Object obj2 : (Object[]) obj) {
            if (obj2 instanceof P2.a) {
                return (P2) obj2;
            }
        }
        return new P2.b(G0.f406611a);
    }
}
