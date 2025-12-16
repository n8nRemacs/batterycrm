package org.koin.androidx.viewmodel.parameter;

import Y61.k;
import Y61.l;
import androidx.view.C23060r0;
import androidx.view.C23066u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import z1.AbstractC50339a;

/* compiled from: AndroidParametersHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/androidx/viewmodel/parameter/b;", "Lv71/a;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends C49177a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC50339a f421437d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidParametersHolder.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a<T> extends N implements Y41.a<T> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d<?> f421439m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<?> dVar) {
            super(0);
            this.f421439m = dVar;
        }

        @Override // Y41.a
        @l
        public final T invoke() {
            return (T) b.super.b(this.f421439m);
        }
    }

    public /* synthetic */ b(Y41.a aVar, AbstractC50339a abstractC50339a, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar, abstractC50339a);
    }

    @Override // kotlin.C49177a
    @l
    public final <T> T b(@k d<?> dVar) {
        return L.f(dVar, m0.f406844a.b(C23060r0.class)) ? (T) C23066u0.a(this.f421437d) : (T) new a(dVar).invoke();
    }

    public b(@l Y41.a<? extends C49177a> aVar, @k AbstractC50339a abstractC50339a) {
        C49177a c49177aInvoke;
        List<Object> list;
        super((aVar == null || (c49177aInvoke = aVar.invoke()) == null || (list = c49177aInvoke.f440473a) == null) ? new ArrayList() : new ArrayList(list), null, 2, null);
        this.f421437d = abstractC50339a;
    }
}
