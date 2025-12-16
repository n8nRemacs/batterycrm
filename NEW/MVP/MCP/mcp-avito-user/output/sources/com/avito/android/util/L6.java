package com.avito.android.util;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: WeakHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/L6;", "Landroid/os/Handler;", "<init>", "()V", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class L6 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public WeakReference<a> f318653a;

    /* compiled from: WeakHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/L6$a;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void handleMessage(@Y61.k Message message);
    }

    @Override // android.os.Handler
    public final void handleMessage(@Y61.k Message message) {
        WeakReference<a> weakReference = this.f318653a;
        a aVar = weakReference == null ? null : weakReference.get();
        if (aVar != null) {
            aVar.handleMessage(message);
        }
    }
}
