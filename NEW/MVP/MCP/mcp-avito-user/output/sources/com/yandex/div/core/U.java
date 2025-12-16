package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38584w0;
import kotlin.Metadata;
import t21.InterfaceC48467b;

/* compiled from: DivCustomViewAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/U;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public interface U {

    /* compiled from: DivCustomViewAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/U$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f367263a = 0;

        static {
            new a();
        }
    }

    static {
        int i12 = a.f367263a;
    }

    void bindView(@Y61.k View view, @Y61.k C38584w0 c38584w0, @Y61.k C38029k c38029k);

    @Y61.k
    View createView(@Y61.k C38584w0 c38584w0, @Y61.k C38029k c38029k);

    boolean isCustomTypeSupported(@Y61.k String str);

    @Y61.k
    default h0.d preload(@Y61.k C38584w0 c38584w0, @Y61.k h0.a aVar) {
        h0.d.f367550a.getClass();
        return h0.d.a.f367552b;
    }

    void release(@Y61.k View view, @Y61.k C38584w0 c38584w0);
}
