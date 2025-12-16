package UU0;

import Y61.k;
import android.content.Context;
import com.avito.beduin.v2.component.video.android_view.h;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoPlayerProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUU0/b;", "Lcom/avito/beduin/v2/component/video/android_view/h;", "player_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f16397b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashSet f16398c = new LinkedHashSet();

    public b(@k Context context) {
        this.f16397b = context;
    }

    @Override // FV0.h
    public final void P() {
        LinkedHashSet linkedHashSet = this.f16398c;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).release();
        }
        linkedHashSet.clear();
    }

    @Override // com.avito.beduin.v2.component.video.android_view.h
    @k
    public final com.avito.beduin.v2.component.video.android_view.b a() {
        com.avito.beduin.v2.component.video.android_view.b bVar = new com.avito.beduin.v2.component.video.android_view.b(new InterfaceC36534o.c(this.f16397b).a());
        bVar.f336320b = new a(bVar, this);
        this.f16398c.add(bVar);
        return bVar;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
    }
}
