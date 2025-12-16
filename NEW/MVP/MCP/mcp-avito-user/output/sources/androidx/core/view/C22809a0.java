package androidx.core.view;

import android.view.VelocityTracker;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VelocityTrackerCompat.java */
/* renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22809a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<VelocityTracker, C22811b0> f44994a = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: VelocityTrackerCompat.java */
    @j.X
    /* renamed from: androidx.core.view.a0$a */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i12) {
            return velocityTracker.getAxisVelocity(i12);
        }
    }

    /* compiled from: VelocityTrackerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.a0$b */
    public @interface b {
    }
}
