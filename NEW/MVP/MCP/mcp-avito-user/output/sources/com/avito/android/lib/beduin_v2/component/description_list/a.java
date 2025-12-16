package com.avito.android.lib.beduin_v2.component.description_list;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.beduin.v2.avito.component.description_list.state.a;
import com.avito.beduin.v2.avito.component.description_list.state.l;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionListComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/description_list/state/a;", "Lcom/avito/android/lib/design/description_list/b;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_description-list"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.description_list.state.a, com.avito.android.lib.design.description_list.b> {

    /* compiled from: DescriptionListComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/description_list/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/description_list/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_description-list"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.description_list.a$a, reason: collision with other inner class name */
    public static final class C5184a extends n<com.avito.beduin.v2.avito.component.description_list.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5184a f175586c = new C5184a();

        public C5184a() {
            super(l.f334250c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.description_list.state.a aVar) {
        com.avito.android.lib.design.description_list.b bVar = (com.avito.android.lib.design.description_list.b) view;
        com.avito.beduin.v2.avito.component.description_list.state.a aVar2 = aVar;
        bVar.setStyle((com.avito.android.lib.design.description_list.d) D.a(aVar2.f334228b, kVar));
        ArrayList<a.C10373a> arrayList = aVar2.f334227a.f4014b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (a.C10373a c10373a : arrayList) {
            String str = c10373a.f334233a;
            a.b bVar2 = c10373a.f334235c;
            Drawable drawableC = bVar2 != null ? D.c(kVar, bVar2.f334237a, bVar2.f334238b, Integer.valueOf(s(bVar2.f334239c))) : null;
            Y41.a<G0> aVar3 = c10373a.f334236d;
            arrayList2.add(new com.avito.android.lib.design.description_list.a(str, c10373a.f334234b, aVar3 != null ? new ViewOnClickListenerC31042l(3, new b(aVar3)) : null, drawableC, null, 16, null));
        }
        bVar.setState(new com.avito.android.lib.design.description_list.c(arrayList2));
        M.a(bVar, aVar2.f334229c);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new com.avito.android.lib.design.description_list.b(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
