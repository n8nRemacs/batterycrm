package y31;

import android.content.Context;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* renamed from: y31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50052a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public static final C50052a f442877l = new C50052a();

    public C50052a() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final Object invoke() {
        ?? r02 = c.f442879a;
        CharSequence applicationLabel = ((Context) r02.getValue()).getPackageManager().getApplicationLabel(((Context) r02.getValue()).getApplicationInfo());
        return !C43066x.K(applicationLabel) ? applicationLabel.toString() : ((Context) r02.getValue()).getPackageName();
    }
}
