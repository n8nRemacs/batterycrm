package com.avito.android.profile.edit;

import com.avito.android.profile.edit.h0;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/h0;", "it", "Lio/reactivex/rxjava3/core/z;", "invoke", "(Lcom/avito/android/profile/edit/h0;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile.edit.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33332m extends kotlin.jvm.internal.N implements Y41.l<h0, io.reactivex.rxjava3.core.z<h0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33339t f222226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33332m(C33339t c33339t) {
        super(1);
        this.f222226l = c33339t;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.z<h0> invoke(h0 h0Var) {
        String str = this.f222226l.f222298f;
        return io.reactivex.rxjava3.core.z.c0(str != null ? new h0.e(str) : new h0.a());
    }
}
