package aY0;

import android.content.Context;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: aY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19841a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f20919a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public static Boolean f20920b;

    @RX0.a
    public static synchronized boolean a(@N Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f20919a;
        if (context2 != null && (bool = f20920b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f20920b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f20920b = boolValueOf;
        f20919a = applicationContext;
        return boolValueOf.booleanValue();
    }
}
