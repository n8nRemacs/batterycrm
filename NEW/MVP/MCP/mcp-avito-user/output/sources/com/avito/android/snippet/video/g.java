package com.avito.android.snippet.video;

import com.avito.android.video_snippets.b;
import com.avito.android.video_snippets.g;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: SnippetVideoComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/video_snippets/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/video_snippets/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f284008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f284009c;

    public g(b bVar, String str) {
        this.f284008b = bVar;
        this.f284009c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.video_snippets.b bVar = (com.avito.android.video_snippets.b) obj;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar == null) {
            return;
        }
        m mVar = this.f284008b.f283998m;
        LinkedHashMap linkedHashMap = mVar.f284023g;
        String str = this.f284009c;
        g.c cVar2 = (g.c) linkedHashMap.get(str);
        if (cVar2 == null) {
            return;
        }
        mVar.f284020d.c(new mc.g(cVar.f326065a, str, mVar.f284019c.getF220326i(), Double.valueOf(cVar.f326066b), Double.valueOf(cVar.f326067c), Integer.valueOf(cVar2.f326089c), null, cVar.f326068d, null, 256, null));
    }
}
