package com.avito.android.publish.slots.link.item;

import Y61.k;
import com.avito.android.deep_linking.links.x;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlotAlert;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LinkSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/link/item/e;", "Lcom/avito/android/deep_linking/links/x;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f244493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f244494c;

    /* compiled from: LinkSlotItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f244495l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f244496m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str) {
            super(0);
            this.f244495l = gVar;
            this.f244496m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f244495l.f244504e.accept(this.f244496m);
            return G0.f406611a;
        }
    }

    public e(c cVar, g gVar) {
        this.f244493b = cVar;
        this.f244494c = gVar;
    }

    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(@k String str) {
        LinkSlotAlert linkSlotAlert = this.f244493b.f244492d;
        g gVar = this.f244494c;
        if (linkSlotAlert == null) {
            gVar.f244504e.accept(str);
            return true;
        }
        gVar.f244502c.accept(new com.avito.android.publish.slots.link.item.a(linkSlotAlert.getTitle(), linkSlotAlert.getSubtitle(), linkSlotAlert.getConfirmText(), linkSlotAlert.getCancelText(), new a(gVar, str)));
        return true;
    }
}
