package com.avito.android.messenger.channels.mvi.data;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DraftRepo.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000b\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/j;", "", "errors", "Lorg/reactivestreams/c;", "Lj41/e;", "apply", "(Lio/reactivex/rxjava3/core/j;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class T<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f187193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f187194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f187195d;

    public T(V v12, String str, LinkedHashMap linkedHashMap) {
        this.f187193b = v12;
        this.f187194c = str;
        this.f187195d = linkedHashMap;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f187193b.f187199b.a(new C41960j0((AbstractC41777j) obj), this.f187194c, this.f187195d).G0(BackpressureStrategy.f401953b);
    }
}
