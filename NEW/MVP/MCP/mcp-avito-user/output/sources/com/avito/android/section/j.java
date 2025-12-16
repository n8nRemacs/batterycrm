package com.avito.android.section;

import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionItemConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "kotlin.jvm.PlatformType", "items", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f264833b;

    public j(f fVar) {
        this.f264833b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        return this.f264833b.f264658d.a(list).m0(new i(list));
    }
}
