package com.avito.android.profile.edit;

import com.avito.android.profile.edit.h0;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/h0;", "result", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/profile/edit/h0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile.edit.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33327h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f222211b;

    /* JADX WARN: Multi-variable type inference failed */
    public C33327h(Y41.l<? super h0, ? extends io.reactivex.rxjava3.core.z<h0>> lVar) {
        this.f222211b = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.o
    public final Object apply(Object obj) {
        h0 h0Var = (h0) obj;
        return h0Var instanceof h0.a ? (io.reactivex.rxjava3.core.z) this.f222211b.invoke(h0Var) : io.reactivex.rxjava3.core.z.c0(h0Var);
    }
}
