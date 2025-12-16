package X50;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f18585c;

    public /* synthetic */ b(com.avito.android.deeplink_handler.handler.composite.a aVar, int i12) {
        this.f18584b = i12;
        this.f18585c = aVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f18585c;
        switch (this.f18584b) {
            case 0:
                c cVar = c.f18586a;
                b.a.a(aVar, deepLink, null, null, 6);
                break;
            default:
                b.a.a(aVar, deepLink, null, null, 6);
                break;
        }
    }
}
