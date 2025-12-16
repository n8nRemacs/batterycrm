package sc1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f437929a = C42727D.b(LazyThreadSafetyMode.f406614b, i.f437928l);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    public static boolean a(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }
        return !((Context) f437929a.getValue()).getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0).isEmpty();
    }
}
