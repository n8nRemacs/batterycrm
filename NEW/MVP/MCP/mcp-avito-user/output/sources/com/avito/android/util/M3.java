package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: PayloadDataWrapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_konveyor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class M3 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PayloadDataWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends kotlin.jvm.internal.N implements Y41.l<T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T f318660l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t12) {
            super(1);
            this.f318660l = t12;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!kotlin.jvm.internal.L.f(obj, this.f318660l));
        }
    }

    @Y61.k
    public static final L3 a(@Y61.k Y41.l lVar, @Y61.l Object obj) {
        return new L3(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
    }

    @Y61.k
    public static final <T> L3<T> b(@Y61.l T t12, @Y61.l T t13) {
        return a(new a(t13), t12);
    }
}
