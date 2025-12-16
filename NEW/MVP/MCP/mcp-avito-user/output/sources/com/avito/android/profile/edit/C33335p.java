package com.avito.android.profile.edit;

import com.avito.android.profile.edit.h0;
import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.remote.model.Profile;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/profile/edit/h0;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile.edit.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33335p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33339t f222233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvatarItem f222234c;

    public C33335p(C33339t c33339t, AvatarItem avatarItem) {
        this.f222233b = c33339t;
        this.f222234c = avatarItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        C33339t c33339t = this.f222233b;
        Profile profileA = c33339t.f222293a.getF222071e();
        if (!(profileA != null ? profileA.isIncomplete() : false)) {
            return io.reactivex.rxjava3.core.z.c0(new h0.b(th2));
        }
        V v12 = c33339t.f222293a;
        v12.invalidate();
        B0 b0D0 = v12.g().x0(c33339t.f222297e.a()).N(C33325f.f222205b).d0(new C33326g(c33339t));
        AvatarItem avatarItem = this.f222234c;
        return io.reactivex.rxjava3.core.z.K0(b0D0, io.reactivex.rxjava3.core.z.c0(org.funktionale.option.e.a(avatarItem != null ? avatarItem.f222247c : null)), new C33324e(c33339t)).d0(new C33328i(avatarItem)).d0(new C33333n(th2)).m0(new C33334o(th2));
    }
}
