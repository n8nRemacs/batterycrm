package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import androidx.work.NetworkType;
import j.N;
import j.X;

/* compiled from: SystemJobInfoConverter.java */
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo
@X
/* loaded from: classes10.dex */
class d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f55658d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f55659a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.X f55660b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55661c;

    /* compiled from: SystemJobInfoConverter.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55662a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f55662a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55662a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55662a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55662a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55662a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        G.b("SystemJobInfoConverter");
    }

    public d(@N Context context, androidx.work.X x12, boolean z12) {
        this.f55660b = x12;
        this.f55659a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f55661c = z12;
    }
}
