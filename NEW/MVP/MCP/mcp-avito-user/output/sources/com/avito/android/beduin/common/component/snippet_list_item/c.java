package com.avito.android.beduin.common.component.snippet_list_item;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinSnippetListItemComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/c;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel;", "Lcom/avito/android/beduin/common/component/snippet_list_item/b;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends h<BeduinSnippetListItemModel, b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102656e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinSnippetListItemModel f102657f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.model_card.c f102658g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f102659h = true;

    /* compiled from: BeduinSnippetListItemComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/c$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f102660a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102661b = Collections.singletonList("snippetListItem");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinSnippetListItemModel> f102662c = BeduinSnippetListItemModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSnippetListItemModel> S() {
            return f102662c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102661b;
        }
    }

    public c(@k InterfaceC15523b interfaceC15523b, @k BeduinSnippetListItemModel beduinSnippetListItemModel, @k com.avito.android.model_card.c cVar) {
        this.f102656e = interfaceC15523b;
        this.f102657f = beduinSnippetListItemModel;
        this.f102658g = cVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102657f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102207l() {
        return this.f102659h;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        b bVar = new b(viewGroup.getContext(), null, 0, 6, null);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(layoutParams);
        D6.f(bVar, this.f395324b, 0, this.f395325c, 0, 10);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // com.avito.android.beduin.common.component.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r6) {
        /*
            r5 = this;
            com.avito.android.beduin.common.component.snippet_list_item.b r6 = (com.avito.android.beduin.common.component.snippet_list_item.b) r6
            com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel r0 = r5.f102657f
            java.util.List r1 = r0.getActions()
            Ui.b<com.avito.android.beduin_models.BeduinAction> r2 = r5.f102656e
            com.avito.android.beduin.common.component.j.a(r6, r1, r2)
            com.avito.android.remote.model.Image r1 = r0.getImage()
            r6.setImage(r1)
            java.util.List r1 = r0.getDescriptions()
            r6.setDescriptions(r1)
            android.content.Context r1 = r6.getContext()
            boolean r2 = r0.isFavorite()
            r3 = 0
            if (r2 == 0) goto L33
            com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel$FavoriteIcon r2 = r0.getFavoriteIcon()
            if (r2 == 0) goto L31
            com.avito.android.beduin.common.component.model.icon.LocalIcon r2 = r2.getActiveLocalIcon()
            goto L3d
        L31:
            r2 = r3
            goto L3d
        L33:
            com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel$FavoriteIcon r2 = r0.getFavoriteIcon()
            if (r2 == 0) goto L31
            com.avito.android.beduin.common.component.model.icon.LocalIcon r2 = r2.getInactiveLocalIcon()
        L3d:
            boolean r4 = r0.isFavorite()
            com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel$FavoriteIcon r0 = r0.getFavoriteIcon()
            if (r4 == 0) goto L4e
            if (r0 == 0) goto L54
            com.avito.android.beduin.common.component.model.icon.IconBase64 r3 = r0.getActiveBase64Icon()
            goto L54
        L4e:
            if (r0 == 0) goto L54
            com.avito.android.beduin.common.component.model.icon.IconBase64 r3 = r0.getInactiveBase64Icon()
        L54:
            android.graphics.drawable.Drawable r0 = com.avito.android.beduin.common.utils.v.c(r1, r2, r3)
            com.avito.android.autoteka.presentation.reportGeneration.a r1 = new com.avito.android.autoteka.presentation.reportGeneration.a
            r2 = 11
            r1.<init>(r5, r2)
            android.widget.ImageView r2 = r6.f102653e
            android.widget.FrameLayout r6 = r6.f102652d
            if (r0 == 0) goto L6c
            com.avito.android.util.D6.H(r6)
            com.avito.android.util.C35821j2.a(r2, r0)
            goto L6f
        L6c:
            com.avito.android.util.D6.w(r6)
        L6f:
            r2.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.snippet_list_item.c.q(android.view.View):void");
    }
}
