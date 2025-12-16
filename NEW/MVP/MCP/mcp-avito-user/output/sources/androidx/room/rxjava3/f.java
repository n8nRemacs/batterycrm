package androidx.room.rxjava3;

import androidx.room.Y;
import io.reactivex.rxjava3.core.B;
import j.N;
import java.util.Set;

/* compiled from: RxRoom.java */
/* loaded from: classes10.dex */
class f extends Y.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f54395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String[] strArr, B b12) {
        super(strArr);
        this.f54395b = b12;
    }

    @Override // androidx.room.Y.c
    public final void a(@N Set<String> set) {
        this.f54395b.onNext(g.f54396a);
    }
}
