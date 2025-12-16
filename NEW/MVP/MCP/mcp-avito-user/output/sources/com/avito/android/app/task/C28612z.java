package com.avito.android.app.task;

import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EmptyChatsCleaner.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "idsOfChannelsToDelete", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28612z<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        X2.f318778a.i("EmptyChatsCleaner", "idsOfChannelsToDelete = " + list, null);
        if (list.isEmpty()) {
            return C41823n.f402260b;
        }
        throw null;
    }
}
