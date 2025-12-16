package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.expand_items_button.ExpandSource;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.ExpandItemsButton;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/w1;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.w1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28070w1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f74050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f74051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43617a f74052c;

    @Inject
    public C28070w1(@Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.J0 j02, @Y61.k C43617a c43617a) {
        this.f74050a = interfaceC28240u;
        this.f74051b = j02;
        this.f74052c = c43617a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(C28070w1 c28070w1, List list, boolean z12, AttributedText attributedText, ExpandItemsButton expandItemsButton, AdvertDetailsFlatViewType advertDetailsFlatViewType, boolean z13, int i12, AttributedText attributedText2, boolean z14, ExpandSource expandSource, boolean z15, boolean z16, boolean z17, List list2, int i13) {
        boolean z18;
        AdvertDetailsFlatViewType advertDetailsFlatViewType2 = (i13 & 16) != 0 ? AdvertDetailsFlatViewType.f82420b : advertDetailsFlatViewType;
        boolean z19 = true;
        boolean z22 = (i13 & 256) != 0 ? true : z14;
        boolean z23 = (i13 & 2048) != 0 ? false : z16;
        boolean z24 = (i13 & 4096) != 0 ? false : z17;
        List list3 = (i13 & 8192) != 0 ? null : list2;
        c28070w1.getClass();
        List list4 = list;
        if (list4 == null || list4.isEmpty()) {
            return null;
        }
        com.avito.android.J0 j02 = c28070w1.f74051b;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = new AdvertDetailsFlatsItem(j02.a(), null, list, z12, z22 ? attributedText : null, attributedText2, null, advertDetailsFlatViewType2, z13, z23, i12, null, null, z24 && com.avito.android.util.O2.a(list3), list3, 6210, null);
        int size = list.size();
        Integer numValueOf = expandItemsButton != null ? Integer.valueOf(expandItemsButton.getLimit()) : null;
        if (numValueOf != null) {
            if (size <= numValueOf.intValue() && !z15) {
                z19 = false;
            }
            z18 = z19;
        } else {
            z18 = false;
        }
        if (expandItemsButton == null || !z18) {
            return new a(advertDetailsFlatsItem, null, 2, 0 == true ? 1 : 0);
        }
        int limit = expandItemsButton.getLimit();
        List<AdvertParameters.Parameter> list5 = advertDetailsFlatsItem.f84656d;
        return new a(AdvertDetailsFlatsItem.b(advertDetailsFlatsItem, list5.subList(0, Math.min(limit, list5.size())), 0, 32699), new ExpandItemsButtonItem(j02.a(), null, i12, null, null, attributedText != null ? attributedText.getText() : null, expandItemsButton.getTitle(), Collections.singletonList(advertDetailsFlatsItem), expandSource, attributedText != null ? attributedText.getText() : null, z23, z24, 26, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.advert.item.blocks.items_factories.C28070w1.a> b(@Y61.k com.avito.android.remote.model.AdvertDetails r27, @Y61.l com.avito.android.remote.model.AdvertParameters r28, boolean r29, boolean r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.C28070w1.b(com.avito.android.remote.model.AdvertDetails, com.avito.android.remote.model.AdvertParameters, boolean, boolean, int, boolean):java.util.List");
    }

    /* compiled from: AdvertDetailsFlatsItemFactory.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/w1$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.blocks.items_factories.w1$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsFlatsItem f74053a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ExpandItemsButtonItem f74054b;

        public a(@Y61.k AdvertDetailsFlatsItem advertDetailsFlatsItem, @Y61.l ExpandItemsButtonItem expandItemsButtonItem) {
            this.f74053a = advertDetailsFlatsItem;
            this.f74054b = expandItemsButtonItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f74053a, aVar.f74053a) && kotlin.jvm.internal.L.f(this.f74054b, aVar.f74054b);
        }

        public final int hashCode() {
            int iHashCode = this.f74053a.hashCode() * 31;
            ExpandItemsButtonItem expandItemsButtonItem = this.f74054b;
            return iHashCode + (expandItemsButtonItem == null ? 0 : expandItemsButtonItem.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "FlatsItemWithExpand(flatsItem=" + this.f74053a + ", expandButtonItem=" + this.f74054b + ')';
        }

        public /* synthetic */ a(AdvertDetailsFlatsItem advertDetailsFlatsItem, ExpandItemsButtonItem expandItemsButtonItem, int i12, C42822w c42822w) {
            this(advertDetailsFlatsItem, (i12 & 2) != 0 ? null : expandItemsButtonItem);
        }
    }
}
