package e21;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import i21.InterfaceC41215b;
import kotlin.Metadata;

/* compiled from: MetadataRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le21/c;", "Li21/b;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: e21.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39933c implements InterfaceC41215b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.vk.push.core.data.source.c f394931a;

    public C39933c(@k com.vk.push.core.data.source.c cVar) {
        this.f394931a = cVar;
    }

    @l
    public final String a(@k String str) {
        Bundle bundle = (Bundle) this.f394931a.f367025c.getValue();
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }
}
