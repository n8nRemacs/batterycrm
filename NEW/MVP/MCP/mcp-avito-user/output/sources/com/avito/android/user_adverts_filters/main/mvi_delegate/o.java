package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class o extends C42801a implements Y41.q<Map<String, ? extends Object>, Map<String, ? extends Object>, Continuation<? super C35708a.b>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final o f316164b = new o();

    public o() {
        super(3, C35708a.b.class, "<init>", "<init>(Ljava/util/Map;Ljava/util/Map;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Continuation<? super C35708a.b> continuation) {
        int i12 = C35708a.f316084i;
        return new C35708a.b(map, map2);
    }
}
