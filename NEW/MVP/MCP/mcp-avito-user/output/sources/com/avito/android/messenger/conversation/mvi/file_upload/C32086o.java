package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.C33136x2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/persistence/messenger/x2;", "messageUploadParts", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32086o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32062c f191197b;

    public C32086o(C32062c c32062c) {
        this.f191197b = c32062c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C32062c c32062c = this.f191197b;
            if (!zHasNext) {
                return AbstractC41768a.p(arrayList).g(c32062c.f191127d.D(list)).l(new C32084n(c32062c)).r();
            }
            C33136x2 c33136x2 = (C33136x2) it.next();
            arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.v(c32062c.f191125b.k(c33136x2.f215576f)).l(new C32082m(c33136x2, c32062c)).r());
        }
    }
}
