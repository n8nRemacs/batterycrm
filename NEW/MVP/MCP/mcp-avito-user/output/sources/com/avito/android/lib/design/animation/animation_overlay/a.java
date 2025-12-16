package com.avito.android.lib.design.animation.animation_overlay;

import Y41.l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AnimationOverlay.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Lcom/avito/android/lib/design/animation/animation_overlay/b;", "it", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<WeakReference<b>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f178304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f178304l = bVar;
    }

    @Override // Y41.l
    public final Boolean invoke(WeakReference<b> weakReference) {
        return Boolean.valueOf(L.f(weakReference.get(), this.f178304l));
    }
}
