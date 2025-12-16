package O51;

import android.content.Context;
import android.content.SharedPreferences;
import e.InterfaceC39835a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y81.InterfaceC50084a;

/* loaded from: classes8.dex */
public final class b implements nc1.b, InterfaceC50084a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11997a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC39835a f11998b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f11999c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantReadWriteLock f12000d = new ReentrantReadWriteLock();

    public b(Context context, InterfaceC39835a interfaceC39835a) {
        this.f11997a = context;
        this.f11998b = interfaceC39835a;
        this.f11999c = nc1.a.a(this, context, 0, new a(this));
    }

    @Override // nc1.b
    public final SharedPreferences a(Context context, int i12, Y41.a aVar) {
        return nc1.a.a(this, context, i12, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e A[LOOP:1: B:78:0x0118->B:80:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X51.d b(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O51.b.b(java.lang.String):X51.d");
    }
}
