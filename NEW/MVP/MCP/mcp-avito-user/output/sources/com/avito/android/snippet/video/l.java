package com.avito.android.snippet.video;

import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetVideoComponentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/snippet/video/l;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/snippet/video/b;", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.beduin.v2.render.android_view.n<b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f284015c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f284016d;

    public l(@Y61.k m mVar, @Y61.k s sVar) {
        super(sVar);
        this.f284015c = mVar;
        this.f284016d = new ArrayList();
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        b bVar = new b(this.f284015c);
        this.f284016d.add(bVar);
        return bVar;
    }

    public final void o() {
        ArrayList arrayList = this.f284016d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).u();
        }
        arrayList.clear();
        m mVar = this.f284015c;
        mVar.f284023g.clear();
        mVar.f284024h.clear();
        mVar.f284017a.g();
        mVar.i();
    }
}
