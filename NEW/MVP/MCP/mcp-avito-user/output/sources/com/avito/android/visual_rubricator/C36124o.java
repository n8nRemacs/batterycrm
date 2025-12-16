package com.avito.android.visual_rubricator;

import Oi0.C14700d;
import Oi0.C14701e;
import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: NoRecsVisualRubricatorBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/o;", "Lcom/avito/android/visual_rubricator/n;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.visual_rubricator.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36124o implements InterfaceC36123n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f327437a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Il.i f327438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C36121l f327439c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C14701e f327440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f327441e;

    /* compiled from: NoRecsVisualRubricatorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/visual_rubricator/W;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/visual_rubricator/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, W> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final W invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            C36124o c36124o = C36124o.this;
            com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) c36124o.f327438b.get();
            C14700d c14700dA = c36124o.f327440d.a(hVar);
            C36121l c36121l = c36124o.f327439c;
            return new W(view2, hVar, c14700dA, new AO0.a(c36121l), c36121l, c36124o.f327441e);
        }
    }

    public C36124o(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k AO0.f fVar, @Y61.k C36121l c36121l, @Y61.k C14701e c14701e, boolean z12) {
        this.f327437a = q12;
        this.f327438b = iVar;
        this.f327439c = c36121l;
        this.f327440d = c14701e;
        this.f327441e = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f327437a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.bx_content_widget_visual_rubricator_big_visual_rubricator, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof VisualRubricatorWidgetItem) {
            Space f327323d = ((VisualRubricatorWidgetItem) aVar).getF327323d();
            f327323d.getClass();
            if (f327323d == Space.f327301g) {
                return true;
            }
        }
        return false;
    }
}
