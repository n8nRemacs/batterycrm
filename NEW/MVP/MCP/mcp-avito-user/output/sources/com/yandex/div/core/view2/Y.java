package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div2.w8;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Handler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V", "androidx/core/os/m"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public final class Y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f367903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C38029k f367904c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f367905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f367906e;

    public Y(X x12, C38029k c38029k, View view, Map map) {
        this.f367903b = x12;
        this.f367904c = c38029k;
        this.f367905d = view;
        this.f367906e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = com.yandex.div.internal.p.f370124a;
        U u12 = this.f367903b.f367890b;
        Object[] array = this.f367906e.values().toArray(new w8[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        u12.getClass();
        View view = this.f367905d;
        C38029k c38029k = this.f367904c;
        c38029k.m(new V((w8[]) array, u12, c38029k, view));
    }
}
