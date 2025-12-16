package i9;

import com.avito.android.advert_core.analytics.toolbar.NoteAction;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ActionWithNoteTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C41252a extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AdvertDetails f398365f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final NoteAction f398366g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f398367h;

    public C41252a(@Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k AdvertDetails advertDetails, @Y61.k NoteAction noteAction, @Y61.l String str) {
        super(0L, treeClickStreamParent, 3185, 2);
        this.f398365f = advertDetails;
        this.f398366g = noteAction;
        this.f398367h = str;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f398365f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "action", this.f398366g.name().toLowerCase());
        j(linkedHashMap, "note_text", this.f398367h);
        return linkedHashMap;
    }
}
