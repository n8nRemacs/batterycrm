package com.avito.android.promoblock;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promoblock.TnsPromoBlockItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TnsPromoBlockItemAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/promoblock/a;", "", "a", "b", "c", "d", "Lcom/avito/android/promoblock/a$a;", "Lcom/avito/android/promoblock/a$b;", "Lcom/avito/android/promoblock/a$c;", "Lcom/avito/android/promoblock/a$d;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TnsPromoBlockItem f231772a;

    /* compiled from: TnsPromoBlockItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/a$a;", "Lcom/avito/android/promoblock/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.promoblock.a$a, reason: collision with other inner class name */
    public static final class C7060a extends a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TnsPromoBlockItem.Button f231773b;

        public C7060a(@Y61.k TnsPromoBlockItem tnsPromoBlockItem, @Y61.k TnsPromoBlockItem.Button button) {
            super(tnsPromoBlockItem, null);
            this.f231773b = button;
        }
    }

    /* compiled from: TnsPromoBlockItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/a$b;", "Lcom/avito/android/promoblock/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {
    }

    /* compiled from: TnsPromoBlockItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/a$c;", "Lcom/avito/android/promoblock/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f231774b;

        public c(@Y61.k TnsPromoBlockItem tnsPromoBlockItem, @Y61.k DeepLink deepLink) {
            super(tnsPromoBlockItem, null);
            this.f231774b = deepLink;
        }
    }

    /* compiled from: TnsPromoBlockItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/a$d;", "Lcom/avito/android/promoblock/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TnsPromoBlockItem.Button f231775b;

        public d(@Y61.k TnsPromoBlockItem tnsPromoBlockItem, @Y61.k TnsPromoBlockItem.Button button) {
            super(tnsPromoBlockItem, null);
            this.f231775b = button;
        }
    }

    public a(TnsPromoBlockItem tnsPromoBlockItem, C42822w c42822w) {
        this.f231772a = tnsPromoBlockItem;
    }
}
