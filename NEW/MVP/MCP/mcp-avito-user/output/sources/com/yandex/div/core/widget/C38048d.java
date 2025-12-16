package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/widget/d;", "T", "Lkotlin/properties/h;", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.widget.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38048d<T> implements kotlin.properties.h<View, T> {

    /* renamed from: b, reason: collision with root package name */
    public T f369254b;

    @Override // kotlin.properties.g
    public final Object getValue(Object obj, kotlin.reflect.n nVar) {
        return this.f369254b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.h
    public final void setValue(View view, kotlin.reflect.n nVar, Object obj) {
        View view2 = view;
        if (this.f369254b.equals(obj)) {
            return;
        }
        this.f369254b = obj;
        view2.invalidate();
    }
}
