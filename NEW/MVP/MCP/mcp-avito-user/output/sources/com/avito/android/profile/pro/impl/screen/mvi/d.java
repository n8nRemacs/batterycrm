package com.avito.android.profile.pro.impl.screen.mvi;

import Y41.q;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: ProfileProActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class d extends C42801a implements q<Integer, Integer, Continuation<? super Q<? extends Integer, ? extends Integer>>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final d f223688b = new d();

    public d() {
        super(3, Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(Integer num, Integer num2, Continuation<? super Q<? extends Integer, ? extends Integer>> continuation) {
        int iIntValue = num.intValue();
        int i12 = a.f223623j;
        return new Q(Boxing.boxInt(iIntValue), num2);
    }
}
