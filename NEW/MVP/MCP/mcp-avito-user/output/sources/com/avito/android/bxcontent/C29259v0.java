package com.avito.android.bxcontent;

import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.v0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29259v0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PresentationType f113043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f113044c;

    public C29259v0(PresentationType presentationType, C29253t0 c29253t0) {
        this.f113043b = presentationType;
        this.f113044c = c29253t0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        C29253t0 c29253t0 = this.f113044c;
        if (!z12) {
            if (p22 instanceof P2.a) {
                c29253t0.f112964j.c();
                c29253t0.f112968n.invalidate();
                c29253t0.f112974t.invalidate();
                C29235n c29235n = c29253t0.f112947R;
                if (c29235n != null) {
                    c29235n.accept(new InterfaceC29127b.C29136e0(c29253t0.f112939J.W0()));
                    return;
                }
                return;
            }
            return;
        }
        T t12 = ((P2.b) p22).f318720a;
        if ((t12 instanceof ItemsSearchLink) && this.f113043b.isMap()) {
            c29253t0.B((DeepLink) t12);
            return;
        }
        C29235n c29235n2 = c29253t0.f112947R;
        if (c29235n2 != null) {
            DeepLink deepLinkA = (DeepLink) t12;
            ItemsSearchLink itemsSearchLink = deepLinkA instanceof ItemsSearchLink ? (ItemsSearchLink) deepLinkA : null;
            if (itemsSearchLink != null) {
                deepLinkA = ItemsSearchLink.a(itemsSearchLink, null, null, "homeFromQuerySearch", null, 262079);
            }
            c29235n2.accept(new InterfaceC29127b.B(deepLinkA, null, null, null, null, 30, null));
        }
    }
}
