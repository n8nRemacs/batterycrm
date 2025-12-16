package com.avito.android.messenger.conversation.mvi.messages;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.sync.K;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32147k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193021c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f193023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f193024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C32141e.b f193025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f193026h;

    public C32147k(C32141e c32141e, C32141e.b bVar, String str, Integer num, Integer num2, C32141e.b bVar2, String str2) {
        this.f193020b = c32141e;
        this.f193021c = bVar;
        this.f193022d = str;
        this.f193023e = num;
        this.f193024f = num2;
        this.f193025g = bVar2;
        this.f193026h = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        boolean z12 = y02 instanceof X0;
        C32141e c32141e = this.f193020b;
        if (z12) {
            com.avito.android.messenger.conversation.mvi.sync.K k12 = c32141e.f192903W;
            C32141e.b bVar = this.f193021c;
            return k12.d(bVar.f192921d, c32141e.f192907a0, this.f193022d, (16 & 8) != 0 ? null : c32141e.f192909c0, (16 & 16) != 0 ? null : null, this.f193023e).n(new C32150n(c32141e, bVar, this.f193022d)).t(new C32152p(c32141e, this.f193023e, bVar));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        int iIntValue = ((Number) ((C23703n1) y02).f56288b).intValue();
        c32141e.getClass();
        int iNe = C32141e.ne(iIntValue, null);
        Integer num = this.f193024f;
        int iIntValue2 = (num != null ? num.intValue() : 100) * iNe;
        C32141e.b bVar2 = this.f193025g;
        return K.a.a(c32141e.f192903W, bVar2.f192921d, c32141e.f192907a0, iNe, this.f193024f, 8).n(new r(iIntValue2, bVar2, c32141e)).t(new C32180t(iIntValue2, bVar2, c32141e)).k(new C32181u(c32141e, this.f193026h, iNe));
    }
}
