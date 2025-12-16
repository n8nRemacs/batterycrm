package qC;

import SK0.b;
import SK0.f;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteItemFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqC/c;", "LqC/b;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qC.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47277c implements InterfaceC47276b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f429102a;

    @Inject
    public C47277c(@k SK0.b bVar) {
        this.f429102a = bVar;
    }

    @Override // qC.InterfaceC47276b
    public final void a(@k String str) {
        SK0.a aVar = new SK0.a();
        aVar.a("from_page", str);
        f fVar = new f();
        fVar.a("from_page", str);
        b.a.a(this.f429102a, new C47275a(), aVar, fVar, null, 8);
    }
}
