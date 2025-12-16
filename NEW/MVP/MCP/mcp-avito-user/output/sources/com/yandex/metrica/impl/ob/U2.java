package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* loaded from: classes7.dex */
class U2 {
    @j.N
    public ResultReceiverC38790f0 a(@j.N Handler handler, @j.N T2 t22) {
        return new ResultReceiverC38790f0(handler, t22);
    }

    @j.N
    public A3 a(@j.N Context context, @j.N ResultReceiverC38790f0 resultReceiverC38790f0) {
        return new A3(context, resultReceiverC38790f0);
    }

    @j.N
    public T1 a(@j.N A3 a32, @j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        return new T1(a32, context, new C39015o1(context, iCommonExecutor), new P6(), new C39188v6());
    }

    @j.N
    public C38858hi a(@j.N Context context, @j.N T1 t12, @j.N C38699b9 c38699b9, @j.N Handler handler) {
        return new C38858hi(context, t12, c38699b9, handler);
    }

    @j.N
    public C38706bg a(@j.N T1 t12, @j.N C38699b9 c38699b9, @j.N Handler handler) {
        return new C38706bg(t12, c38699b9, handler);
    }

    @j.N
    public R1 a(@j.N Context context, @j.N A3 a32, @j.N T1 t12, @j.N Handler handler, @j.N C38858hi c38858hi) {
        return new R1(context, a32, t12, handler, c38858hi);
    }
}
