package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.Q1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/persistence/messenger/Q1;", "metaInfos", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32062c f191205b;

    public r(C32062c c32062c) {
        this.f191205b = c32062c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C32062c c32062c = this.f191205b;
            if (!zHasNext) {
                return AbstractC41768a.p(arrayList).g(c32062c.f191127d.X(list)).l(new C32090q(c32062c)).r();
            }
            String str = ((Q1) it.next()).f215286e;
            if (str != null) {
                arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.v(c32062c.f191125b.k(str)).l(new C32088p(c32062c, str)).r());
            }
        }
    }
}
