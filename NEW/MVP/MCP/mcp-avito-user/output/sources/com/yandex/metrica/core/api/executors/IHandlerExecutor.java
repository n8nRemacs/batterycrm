package com.yandex.metrica.core.api.executors;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public interface IHandlerExecutor extends ICommonExecutor {
    Handler getHandler();

    Looper getLooper();
}
