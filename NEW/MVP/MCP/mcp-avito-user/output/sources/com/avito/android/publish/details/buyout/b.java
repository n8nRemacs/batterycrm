package com.avito.android.publish.details.buyout;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.InterfaceC33746e0;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CollectPublishParamsDelegate.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/buyout/b;", "Lcom/avito/android/publish/details/buyout/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.details.buyout.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributesTreeConverter f233559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.auction.a f233560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33746e0 f233561d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f233562e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f233563f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C0 f233564g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ItemDetailsView f233565h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f233566i;

    /* compiled from: CollectPublishParamsDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/details/buyout/b$a;", "", "<init>", "()V", "", "ATTRIBUTES_ID", "Ljava/lang/String;", "CATEGORY_ID", "DRAFT_ID", "ITEM_ID", "PUBLISH_PARAMS_LINK_RENDERER", "SLOTS_ID", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k AttributesTreeConverter attributesTreeConverter, @k com.avito.android.publish.details.auction.a aVar, @k InterfaceC33746e0 interfaceC33746e0, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k com.avito.android.details.a aVar3, @k C0 c02) {
        this.f233559b = attributesTreeConverter;
        this.f233560c = aVar;
        this.f233561d = interfaceC33746e0;
        this.f233562e = aVar2;
        this.f233563f = aVar3;
        this.f233564g = c02;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // com.avito.android.publish.details.buyout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B6(@Y61.k com.avito.android.deep_linking.links.CollectPublishParamsLink r7) {
        /*
            r6 = this;
            com.avito.android.publish.C0 r0 = r6.f233564g
            boolean r1 = r0.Ce()
            r2 = 0
            if (r1 == 0) goto L34
            com.avito.android.remote.model.ItemBrief r1 = r0.f231867e0
            if (r1 == 0) goto L13
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L19
        L13:
            java.lang.String r1 = r0.f231862Z
            if (r1 != 0) goto L19
            goto L99
        L19:
            com.avito.android.remote.model.ItemBrief r0 = r0.f231867e0
            if (r0 == 0) goto L21
            java.lang.String r2 = r0.getCategoryId()
        L21:
            kotlin.Q r0 = new kotlin.Q
            java.lang.String r3 = "itemId"
            r0.<init>(r3, r1)
            kotlin.Q r1 = new kotlin.Q
            java.lang.String r3 = "categoryId"
            r1.<init>(r3, r2)
            kotlin.Q[] r0 = new kotlin.Q[]{r0, r1}
            goto L44
        L34:
            java.lang.String r0 = r0.f231865c0
            if (r0 != 0) goto L39
            goto L99
        L39:
            kotlin.Q r1 = new kotlin.Q
            java.lang.String r2 = "draftId"
            r1.<init>(r2, r0)
            kotlin.Q[] r0 = new kotlin.Q[]{r1}
        L44:
            com.avito.android.details.a r1 = r6.f233563f
            com.avito.android.remote.model.category_parameters.CategoryParameters r1 = r1.C0()
            if (r1 == 0) goto L52
            java.util.List r1 = r1.getParametersExceptOwnedBySlots()
            if (r1 != 0) goto L54
        L52:
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
        L54:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.avito.android.remote.model.category_parameters.AttributesTreeConverter r2 = r6.f233559b
            java.util.List r3 = r2.convertToParameterAttributesTree(r1)
            java.util.List r1 = r2.convertToSlotAttributesTree(r1)
            com.avito.android.publish.details.auction.a r2 = r6.f233560c
            java.lang.String r3 = r2.a(r3)
            java.lang.String r1 = r2.a(r1)
            kotlin.jvm.internal.t0 r2 = new kotlin.jvm.internal.t0
            r4 = 3
            r2.<init>(r4)
            kotlin.Q r4 = new kotlin.Q
            java.lang.String r5 = "attributes"
            r4.<init>(r5, r3)
            r2.a(r4)
            kotlin.Q r3 = new kotlin.Q
            java.lang.String r4 = "slots"
            r3.<init>(r4, r1)
            r2.a(r3)
            r2.b(r0)
            java.util.ArrayList<java.lang.Object> r0 = r2.f406850a
            int r1 = r0.size()
            kotlin.Q[] r1 = new kotlin.Q[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            kotlin.Q[] r0 = (kotlin.Q[]) r0
            android.os.Bundle r2 = androidx.core.os.C22777e.b(r0)
        L99:
            com.avito.android.deeplink_handler.handler.composite.a r0 = r6.f233562e
            java.lang.String r1 = "collect_publish_params_link"
            r0.r6(r2, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.buyout.b.B6(com.avito.android.deep_linking.links.CollectPublishParamsLink):void");
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f233565h = null;
        y yVar = this.f233566i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        InterfaceC33746e0 interfaceC33746e0 = this.f233561d;
        if (z12) {
            ItemDetailsView itemDetailsView = this.f233565h;
            if (itemDetailsView != null) {
                itemDetailsView.a();
            }
            interfaceC33746e0.e();
            return;
        }
        ItemDetailsView itemDetailsView2 = this.f233565h;
        if (itemDetailsView2 != null) {
            itemDetailsView2.C0();
        }
        interfaceC33746e0.d(null);
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@k ItemDetailsView itemDetailsView) {
        this.f233565h = itemDetailsView;
        y yVar = this.f233566i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f233566i = (y) this.f233562e.V9().t0(new c(this));
    }
}
