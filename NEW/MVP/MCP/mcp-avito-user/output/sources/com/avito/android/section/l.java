package com.avito.android.section;

import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionItemConverter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "items", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f264835b;

    public l(f fVar) {
        this.f264835b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        return this.f264835b.f264659e.a(list).m0(new k(list));
    }
}
