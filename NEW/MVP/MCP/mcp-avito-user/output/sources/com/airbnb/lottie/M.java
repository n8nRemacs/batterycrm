package com.airbnb.lottie;

import androidx.collection.C20203c;
import androidx.core.util.C22807v;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes10.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f59148a = false;

    /* renamed from: b, reason: collision with root package name */
    public final C20203c f59149b = new C20203c();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f59150c = new HashMap();

    /* compiled from: PerformanceTracker.java */
    public class a implements Comparator<C22807v<String, Float>> {
        @Override // java.util.Comparator
        public final int compare(C22807v<String, Float> c22807v, C22807v<String, Float> c22807v2) {
            float fFloatValue = c22807v.f44896b.floatValue();
            float fFloatValue2 = c22807v2.f44896b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    public interface b {
        void a();
    }
}
