package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class s extends C42801a implements Y41.q<C35708a.b, C35708a.b, Continuation<? super Q<? extends C35708a.b, ? extends C35708a.b>>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final s f316180b = new s();

    public s() {
        super(3, Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(C35708a.b bVar, C35708a.b bVar2, Continuation<? super Q<? extends C35708a.b, ? extends C35708a.b>> continuation) {
        int i12 = C35708a.f316084i;
        return new Q(bVar, bVar2);
    }
}
