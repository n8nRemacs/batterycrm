package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: ShortcutsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class B extends C42801a implements Y41.q<TypedResult<UserAdvertsShortcuts>, UI0.c, Continuation<? super kotlin.Q<? extends TypedResult<UserAdvertsShortcuts>, ? extends UI0.c>>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final B f313872b = new B();

    public B() {
        super(3, kotlin.Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(TypedResult<UserAdvertsShortcuts> typedResult, UI0.c cVar, Continuation<? super kotlin.Q<? extends TypedResult<UserAdvertsShortcuts>, ? extends UI0.c>> continuation) {
        int i12 = C35609a.f313967k;
        return new kotlin.Q(typedResult, cVar);
    }
}
