package com.avito.android.messenger.channels.mvi.data;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DraftRepo.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/z;", "", "errors", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lio/reactivex/rxjava3/core/z;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class U<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f187196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f187197c;

    public U(V v12, LinkedHashMap linkedHashMap) {
        this.f187196b = v12;
        this.f187197c = linkedHashMap;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f187196b.f187199b.a((io.reactivex.rxjava3.core.z) obj, "getDraft", this.f187197c);
    }
}
