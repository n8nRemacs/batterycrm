package z01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ReceiverThreadPoolExecutor.java */
/* loaded from: classes7.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f443744a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f443745b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
}
