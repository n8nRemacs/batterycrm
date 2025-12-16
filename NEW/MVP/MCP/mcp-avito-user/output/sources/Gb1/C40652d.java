package gb1;

import T11.f;
import Xa1.l;
import Y61.k;
import android.content.Context;
import bb1.r;
import eb1.C40084a;
import java.util.Collections;
import java.util.List;
import ob1.g;

/* renamed from: gb1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40652d implements InterfaceC40649a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f396496a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396497b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f396498c;

    public C40652d(@k Context context, @k String str, @k f fVar) {
        this.f396496a = context;
        this.f396497b = str;
        this.f396498c = fVar;
    }

    @Override // gb1.InterfaceC40649a
    @k
    public final C40084a a(@k T11.a aVar, @k r rVar) {
        List listSingletonList = Collections.singletonList(aVar);
        C40650b c40650b = new C40650b(rVar, null);
        Context context = this.f396496a;
        f fVar = this.f396498c;
        return new C40084a(new l(context, listSingletonList, fVar, c40650b), new g(this.f396497b, context, listSingletonList, fVar, new C40651c(rVar, null)), null);
    }
}
