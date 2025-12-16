package com.avito.android.snippet.video;

import android.net.Uri;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.C35837l2;
import com.avito.beduin.v2.engine.component.G;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetVideoState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.l<G, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f284027l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LinkedHashMap linkedHashMap) {
        super(1);
        this.f284027l = linkedHashMap;
    }

    @Override // Y41.l
    public final G0 invoke(G g12) {
        Size sizeB;
        String string;
        Uri uri;
        G g13 = g12;
        String string2 = g13.getString("size");
        if (string2 == null || (sizeB = C35837l2.b(string2)) == null || (string = g13.getString(ContextActionHandler.Link.URL)) == null || (uri = Uri.parse(string)) == null) {
            return null;
        }
        this.f284027l.put(sizeB, uri);
        return G0.f406611a;
    }
}
