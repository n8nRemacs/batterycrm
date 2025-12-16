package d31;

import Yb1.a;
import android.content.Context;
import com.avito.android.R;
import ic1.C41382a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;

/* renamed from: d31.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39497c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f393647a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f393648b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        f393647a = C42727D.b(lazyThreadSafetyMode, C39495a.f393645l);
        f393648b = C42727D.b(lazyThreadSafetyMode, C39496b.f393646l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
    public static void a() {
        ?? r02 = f393647a;
        int color = androidx.core.content.d.getColor((Context) r02.getValue(), R.color.color_sber_id_button_primary);
        int iA2 = C41382a.a((Context) r02.getValue(), null);
        C39499e c39499e = (C39499e) f393648b.getValue();
        boolean z12 = color == iA2;
        String strA = ((e.h) c39499e.f393654c).a();
        String str = (String) y31.c.f442880b.getValue();
        c39499e.f393653b.a(new a.k(null, null, ((e.h) c39499e.f393654c).f394234g, c39499e.f393655d.f395679a, str, "android_4.0.0", strA, String.valueOf(z12), null, 259, null));
    }
}
