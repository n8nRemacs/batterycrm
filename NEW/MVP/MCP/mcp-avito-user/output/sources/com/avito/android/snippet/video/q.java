package com.avito.android.snippet.video;

import com.avito.android.remote.model.Image;
import com.avito.android.snippet.video.p;
import com.avito.beduin.v2.engine.component.G;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SnippetVideoStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/snippet/video/p$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/snippet/video/p$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<G, p.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f284035l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final p.a invoke(G g12) {
        G g13 = g12;
        p.a.f284032c.getClass();
        String string = g13.getString("videoURL");
        if (string == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g13.g("thumbnail", "thumbnail", new o(linkedHashMap));
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new p.a(com.avito.android.image_loader.b.b(new Image(linkedHashMap)), string);
    }
}
