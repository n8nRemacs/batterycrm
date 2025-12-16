package com.avito.android.snippet.video;

import com.avito.android.J0;
import com.avito.android.di.B;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SnippetVideoStateFactory.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/snippet/video/s;", "Lcom/avito/beduin/v2/engine/component/j;", "_avito_snippet_video_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final J0 f284037c;

    @Inject
    public s(@Y61.k J0 j02) {
        super("SnippetVideo", false, 2, null);
        this.f284037c = j02;
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (p) E.b(bVar, bVar.f336563b, new r(this));
    }
}
