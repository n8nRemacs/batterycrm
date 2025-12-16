package rE;

import Oi0.C14699c;
import Oi0.C14701e;
import WQ.h;
import Y61.k;
import com.avito.android.feed_shortcuts.widget.g;
import com.avito.android.feed_shortcuts.widget.j;
import com.avito.android.publish.objects.C33947g;
import com.avito.android.util.C;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.Metadata;
import kotlin.Q;
import sE.C48036b;
import tE.C48540b;

/* compiled from: FeedShortcutsWidgetKonveyorItemMappingModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LrE/d;", "LWQ/d;", "Lcom/avito/android/feed_shortcuts/widget/g;", "Lcom/avito/android/feed_shortcuts/widget/c;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements WQ.d<g, com.avito.android.feed_shortcuts.widget.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tE.f f429661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f429662b;

    public d(tE.f fVar, sE.f fVar2, C48036b c48036b, C c12, C48540b c48540b) {
        this.f429661a = fVar;
        this.f429662b = c12;
    }

    @Override // WQ.d
    @k
    public final Q<g, com.avito.android.feed_shortcuts.widget.c> a(@k h hVar) throws BlueprintCollisionException {
        tE.f fVar = this.f429661a;
        j jVar = new j(fVar.f439203a, hVar.X());
        com.avito.android.feed_shortcuts.element.b bVar = new com.avito.android.feed_shortcuts.element.b(new com.avito.android.feed_shortcuts.element.d(jVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        return new Q<>(jVar, new com.avito.android.feed_shortcuts.widget.e(jVar, new C33947g(aVarA, 3), new C14701e(new C14699c(aVarA), this.f429662b)));
    }
}
