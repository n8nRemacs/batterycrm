package com.avito.android.user_adverts_filters.main.vm;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import qJ0.InterfaceC47308d;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class r extends C42801a implements Y41.q<rJ0.c, InterfaceC47308d, Continuation<? super Q<? extends rJ0.c, ? extends InterfaceC47308d>>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final r f316463b = new r();

    public r() {
        super(3, Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(rJ0.c cVar, InterfaceC47308d interfaceC47308d, Continuation<? super Q<? extends rJ0.c, ? extends InterfaceC47308d>> continuation) {
        return new Q(cVar, interfaceC47308d);
    }
}
