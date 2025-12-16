package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.remote.model.model_card.DisplayType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ModelSpecsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/O5;", "Lcom/avito/android/advert/item/blocks/items_factories/N5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O5 implements N5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73825a;

    /* compiled from: ModelSpecsItemFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73826a;

        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                iArr[DisplayType.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f73826a = iArr;
        }
    }

    @Inject
    public O5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73825a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    @Override // com.avito.android.advert.item.blocks.items_factories.N5
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.modelSpecs.ModelSpecsItem a(@Y61.k com.avito.android.remote.model.AdvertDetails r16) {
        /*
            r15 = this;
            com.avito.android.remote.model.model_card.ModelCardInfo r0 = r16.getModelCardInfo()
            r1 = 0
            if (r0 == 0) goto L7b
            com.avito.android.remote.model.model_card.LinkInfo r2 = r0.getLinkInfo()
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.getTitle()
            goto L13
        L12:
            r2 = r1
        L13:
            r3 = 1
            if (r2 == 0) goto L1f
            int r2 = r2.length()
            if (r2 != 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r2 != 0) goto L32
            com.avito.android.remote.model.model_card.LinkInfo r2 = r0.getLinkInfo()
            if (r2 == 0) goto L2d
            com.avito.android.deep_linking.links.DeepLink r2 = r2.getDeeplink()
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L32
            r9 = r0
            goto L33
        L32:
            r9 = r1
        L33:
            if (r9 == 0) goto L7b
            com.avito.android.remote.model.model_card.LinkInfo r0 = r9.getLinkInfo()
            if (r0 == 0) goto L3f
            com.avito.android.remote.model.model_card.DisplayType r1 = r0.getDisplayType()
        L3f:
            if (r1 != 0) goto L44
            r0 = -1
        L42:
            r2 = r15
            goto L4d
        L44:
            int[] r0 = com.avito.android.advert.item.blocks.items_factories.O5.a.f73826a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            goto L42
        L4d:
            com.avito.android.advert.item.similars.j r1 = r2.f73825a
            if (r0 != r3) goto L64
            int r8 = r1.a()
            com.avito.android.advert.item.modelSpecs.button.ModelSpecsButtonItem r0 = new com.avito.android.advert.item.modelSpecs.button.ModelSpecsButtonItem
            r12 = 51
            r13 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13)
            goto L7a
        L64:
            int r8 = r1.a()
            boolean r12 = r16.isRestyle()
            com.avito.android.advert.item.modelSpecs.link.ModelSpecsLinkItem r0 = new com.avito.android.advert.item.modelSpecs.link.ModelSpecsLinkItem
            r13 = 51
            r14 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14)
        L7a:
            return r0
        L7b:
            r2 = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.O5.a(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.modelSpecs.ModelSpecsItem");
    }
}
