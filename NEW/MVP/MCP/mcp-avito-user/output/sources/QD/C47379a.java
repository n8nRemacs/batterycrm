package qd;

import Y61.k;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: SafeTrace.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqd/a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47379a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C47379a f429325a = new C47379a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ArrayList f429326b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Object f429327c = new Object();

    public static void a(@k String str, double d12) {
        synchronized (f429327c) {
            f429326b.add(new Q(str, Double.valueOf(d12)));
            G0 g02 = G0.f406611a;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        Trace.setCounter(str, (long) d12);
    }
}
