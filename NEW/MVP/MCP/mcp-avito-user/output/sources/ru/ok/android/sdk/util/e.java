package ru.ok.android.sdk.util;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u0;
import kotlin.text.C43047d;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/sdk/util/e;", "", "<init>", "()V", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f436720a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f436721b = new e();

    public static void a(@k Runnable runnable) {
        if (L.f(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
            return;
        }
        if (f436720a == null) {
            f436720a = new Handler(Looper.getMainLooper());
        }
        Handler handler = f436720a;
        if (handler != null) {
            handler.postDelayed(runnable, 10L);
        } else {
            L.k();
            throw null;
        }
    }

    @k
    public static String b(@k String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(C43047d.f410589b));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b12 : bArrDigest) {
                u0 u0Var = u0.f406856a;
                sb2.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b12)}, 1)));
            }
            return sb2.toString().toLowerCase();
        } catch (Exception e12) {
            throw new IllegalStateException(e12);
        }
    }
}
