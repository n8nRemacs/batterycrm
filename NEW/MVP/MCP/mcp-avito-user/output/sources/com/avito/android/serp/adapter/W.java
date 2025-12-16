package com.avito.android.serp.adapter;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoriteStatusResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/conveyor_item/a;", "T", "", "", "", "idToFavorites", "", "apply", "(Ljava/util/Map;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class W<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<T> f268594b;

    /* JADX WARN: Multi-variable type inference failed */
    public W(List<? extends T> list) {
        this.f268594b = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        List<T> list = this.f268594b;
        for (T t12 : list) {
            if (t12 instanceof S) {
                S s5 = (S) t12;
                Boolean bool = (Boolean) map.get(t12.getF266318b());
                s5.setFavorite(bool != null ? bool.booleanValue() : s5.getF268783f());
            }
        }
        return list;
    }
}
