package com.yandex.div.core.view2;

import android.view.View;
import androidx.collection.C20199a;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivViewIdProvider.kt */
@com.yandex.div.core.dagger.A
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/S;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20199a f367874a = new C20199a();

    @Inject
    public S() {
    }

    public final int a(@Y61.l String str) {
        if (str == null) {
            return -1;
        }
        C20199a c20199a = this.f367874a;
        Object objValueOf = c20199a.get(str);
        if (objValueOf == null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            objValueOf = Integer.valueOf(View.generateViewId());
            c20199a.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }
}
