package x31;

import Y41.p;
import android.net.Uri;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class d extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f442153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f442154m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f442155n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f442156o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g0.h f442157p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Uri f442158q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, String str4, g0.h hVar, Uri uri) {
        super(2);
        this.f442153l = str;
        this.f442154m = str2;
        this.f442155n = str3;
        this.f442156o = str4;
        this.f442157p = hVar;
        this.f442158q = uri;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        A a12 = (A) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && a12.c()) {
            a12.f();
        } else {
            g0.h hVar = this.f442157p;
            String str = this.f442155n;
            Uri uri = this.f442158q;
            C49758a c49758a = new C49758a(hVar, str, uri);
            String str2 = this.f442156o;
            b bVar = new b(hVar, str2, uri);
            String str3 = this.f442153l;
            n.a(str3, this.f442154m, str, c49758a, str2, bVar, new c(hVar, str3), a12, 0);
        }
        return G0.f406611a;
    }
}
