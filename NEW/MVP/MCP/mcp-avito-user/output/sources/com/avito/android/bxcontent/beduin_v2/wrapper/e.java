package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.bxcontent.mvi.entity.C29126a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BxWrapperComponentModule.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lcom/avito/android/bxcontent/mvi/entity/a$b;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/bxcontent/mvi/entity/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<String, C29126a.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.bxcontent.mvi.entity.l> f109598l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y41.a<com.avito.android.bxcontent.mvi.entity.l> aVar) {
        super(1);
        this.f109598l = aVar;
    }

    @Override // Y41.l
    public final C29126a.b invoke(String str) {
        Object next;
        String str2 = str;
        Iterator<T> it = this.f109598l.invoke().f112324a0.f112057b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((C29126a.b) next).f112058a, str2)) {
                break;
            }
        }
        return (C29126a.b) next;
    }
}
