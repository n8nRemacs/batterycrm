package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/widget/g;", "T", "Lkotlin/properties/h;", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class g<T> implements kotlin.properties.h<View, T> {

    /* renamed from: b, reason: collision with root package name */
    public T f369255b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final N f369256c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.l Y41.l lVar, Object obj) {
        this.f369255b = obj;
        this.f369256c = (N) lVar;
    }

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        return this.f369255b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.properties.h
    public final void setValue(View view, kotlin.reflect.n nVar, Object obj) {
        Object objInvoke;
        View view2 = view;
        ?? r22 = this.f369256c;
        if (r22 != 0 && (objInvoke = r22.invoke(obj)) != null) {
            obj = (T) objInvoke;
        }
        if (L.f(this.f369255b, obj)) {
            return;
        }
        this.f369255b = (T) obj;
        view2.requestLayout();
    }
}
