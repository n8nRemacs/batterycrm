package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivContainer;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivViewCreator.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/P;", "LF21/a;", "Landroid/view/View;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class P extends F21.a<View> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f367867d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f367868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.internal.viewpool.h f367869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L f367870c;

    /* compiled from: DivViewCreator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/P$a;", "", "<init>", "()V", "", "TAG_CUSTOM", "Ljava/lang/String;", "TAG_GALLERY", "TAG_GIF_IMAGE", "TAG_GRID", "TAG_IMAGE", "TAG_INDICATOR", "TAG_INPUT", "TAG_LINEAR_CONTAINER", "TAG_OVERLAP_CONTAINER", "TAG_PAGER", "TAG_SELECT", "TAG_SLIDER", "TAG_STATE", "TAG_TABS", "TAG_TEXT", "TAG_VIDEO", "TAG_WRAP_CONTAINER", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public P(@Y61.k @Named("themed_context") Context context, @Y61.k com.yandex.div.internal.viewpool.h hVar, @Y61.k L l12) {
        this.f367868a = context;
        this.f367869b = hVar;
        this.f367870c = l12;
        hVar.a("DIV2.TEXT_VIEW", new O(this, 0), 20);
        hVar.a("DIV2.IMAGE_VIEW", new O(this, 15), 20);
        hVar.a("DIV2.IMAGE_GIF_VIEW", new O(this, 16), 3);
        hVar.a("DIV2.OVERLAP_CONTAINER_VIEW", new O(this, 1), 8);
        hVar.a("DIV2.LINEAR_CONTAINER_VIEW", new O(this, 2), 12);
        hVar.a("DIV2.WRAP_CONTAINER_VIEW", new O(this, 3), 4);
        hVar.a("DIV2.GRID_VIEW", new O(this, 4), 4);
        hVar.a("DIV2.GALLERY_VIEW", new O(this, 5), 6);
        hVar.a("DIV2.PAGER_VIEW", new O(this, 6), 2);
        hVar.a("DIV2.TAB_VIEW", new O(this, 7), 2);
        hVar.a("DIV2.STATE", new O(this, 8), 4);
        hVar.a("DIV2.CUSTOM", new O(this, 9), 2);
        hVar.a("DIV2.INDICATOR", new O(this, 10), 2);
        hVar.a("DIV2.SLIDER", new O(this, 11), 2);
        hVar.a("DIV2.INPUT", new O(this, 12), 2);
        hVar.a("DIV2.SELECT", new O(this, 13), 2);
        hVar.a("DIV2.VIDEO", new O(this, 14), 2);
    }

    @Override // F21.a
    public final View b(AbstractC38330g.c cVar, com.yandex.div.json.expressions.e eVar) {
        ViewGroup viewGroup = (ViewGroup) a(cVar, eVar);
        Iterator<T> it = cVar.f375015c.f371377t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(n((AbstractC38330g) it.next(), eVar));
        }
        return viewGroup;
    }

    @Override // F21.a
    public final View f(AbstractC38330g.C10942g c10942g, com.yandex.div.json.expressions.e eVar) {
        ViewGroup viewGroup = (ViewGroup) a(c10942g, eVar);
        Iterator<T> it = c10942g.f375019c.f374833t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(n((AbstractC38330g) it.next(), eVar));
        }
        return viewGroup;
    }

    @Override // F21.a
    public final View i(AbstractC38330g.m mVar, com.yandex.div.json.expressions.e eVar) {
        return new com.yandex.div.core.view2.divs.widgets.q(this.f367868a, null, 0, 6, null);
    }

    @Y61.k
    public final View n(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar) {
        return this.f367870c.m(abstractC38330g, eVar).booleanValue() ? m(abstractC38330g, eVar) : new Space(this.f367868a);
    }

    @Override // F21.a
    @Y61.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final View a(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar) {
        String str;
        f367867d.getClass();
        if (abstractC38330g instanceof AbstractC38330g.c) {
            DivContainer divContainer = ((AbstractC38330g.c) abstractC38330g).f375015c;
            str = C37931a.A(divContainer, eVar) ? "DIV2.WRAP_CONTAINER_VIEW" : divContainer.f371382y.a(eVar) == DivContainer.Orientation.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.d) {
            str = "DIV2.CUSTOM";
        } else if (abstractC38330g instanceof AbstractC38330g.e) {
            str = "DIV2.GALLERY_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.f) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            str = "DIV2.GRID_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.h) {
            str = "DIV2.IMAGE_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.i) {
            str = "DIV2.INDICATOR";
        } else if (abstractC38330g instanceof AbstractC38330g.j) {
            str = "DIV2.INPUT";
        } else if (abstractC38330g instanceof AbstractC38330g.k) {
            str = "DIV2.PAGER_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.l) {
            str = "DIV2.SELECT";
        } else if (abstractC38330g instanceof AbstractC38330g.n) {
            str = "DIV2.SLIDER";
        } else if (abstractC38330g instanceof AbstractC38330g.o) {
            str = "DIV2.STATE";
        } else if (abstractC38330g instanceof AbstractC38330g.p) {
            str = "DIV2.TAB_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.q) {
            str = "DIV2.TEXT_VIEW";
        } else if (abstractC38330g instanceof AbstractC38330g.r) {
            str = "DIV2.VIDEO";
        } else {
            if (!(abstractC38330g instanceof AbstractC38330g.m)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        return this.f367869b.b(str);
    }
}
