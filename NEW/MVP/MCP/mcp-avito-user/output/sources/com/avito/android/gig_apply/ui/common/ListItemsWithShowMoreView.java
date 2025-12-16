package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AbstractC22450a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ListItemsWithShowMoreWidget.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/ListItemsWithShowMoreView;", "Landroidx/compose/ui/platform/a;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListItemsWithShowMoreView extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<g> f159897j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f159898k;

    /* compiled from: ListItemsWithShowMoreWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                ListItemsWithShowMoreView listItemsWithShowMoreView = ListItemsWithShowMoreView.this;
                d.b((g) ((C22082i3) listItemsWithShowMoreView.f159897j).getF42167b(), new C30727c(listItemsWithShowMoreView), a13, 8);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ListItemsWithShowMoreWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            ListItemsWithShowMoreView.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    @X41.j
    public ListItemsWithShowMoreView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(399307606);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-25768911, new a(), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    public final void j(@Y61.k String str, @Y61.k List<String> list) {
        ((C22082i3) this.f159897j).setValue(new g(str, list, false));
    }

    public final void k(@Y61.k String str, @Y61.k List<String> list, @Y61.k Y41.a<G0> aVar) {
        this.f159898k = aVar;
        ((C22082i3) this.f159897j).setValue(new g(str, list, true));
    }

    public ListItemsWithShowMoreView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f159897j = C22126m3.g(new g(null, null, false, 7, null));
    }
}
