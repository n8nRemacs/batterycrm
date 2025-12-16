package com.avito.beduin.v2.component.common.lazy;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: StyleAwareDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/g;", "", "T", "Landroidx/recyclerview/widget/o$f;", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class g<T> extends C23424o.f<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p<T, T, Boolean> f335697a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<T, T, Boolean> f335698b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f335699c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.beduin.v2.theme.k f335700d;

    /* compiled from: StyleAwareDiffUtilCallback.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "old", "new", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<T, T, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f335701l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(obj.equals(obj2));
        }
    }

    public /* synthetic */ g(p pVar, p pVar2, int i12, C42822w c42822w) {
        this(pVar, (i12 & 2) != 0 ? a.f335701l : pVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(@k T t12, @k T t13) {
        return this.f335698b.invoke(t12, t13).booleanValue() && L.f(this.f335700d, this.f335699c);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(@k T t12, @k T t13) {
        return this.f335697a.invoke(t12, t13).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k p<? super T, ? super T, Boolean> pVar, @k p<? super T, ? super T, Boolean> pVar2) {
        this.f335697a = pVar;
        this.f335698b = pVar2;
    }
}
