package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationInnItem.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "", "id", "", "getId", "()Ljava/lang/String;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "Style", "Lcom/avito/android/remote/model/inn/items/VerificationBannerItem;", "Lcom/avito/android/remote/model/inn/items/VerificationButtonGroupItem;", "Lcom/avito/android/remote/model/inn/items/VerificationButtonItem;", "Lcom/avito/android/remote/model/inn/items/VerificationCheckboxItem;", "Lcom/avito/android/remote/model/inn/items/VerificationDisclosureItem;", "Lcom/avito/android/remote/model/inn/items/VerificationGroupItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnInfoItem;", "Lcom/avito/android/remote/model/inn/items/VerificationMultiLineInputItem;", "Lcom/avito/android/remote/model/inn/items/VerificationSelectItem;", "Lcom/avito/android/remote/model/inn/items/VerificationSingleLineInputItem;", "Lcom/avito/android/remote/model/inn/items/VerificationTextItem;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface VerificationInnItem {

    /* compiled from: VerificationInnItem.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "", "marginTop", "", "marginBottom", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMarginBottom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginTop", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Style {

        @c("marginBottom")
        @l
        private final Integer marginBottom;

        @c("marginTop")
        @l
        private final Integer marginTop;

        /* JADX WARN: Multi-variable type inference failed */
        public Style() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Style copy$default(Style style, Integer num, Integer num2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = style.marginTop;
            }
            if ((i12 & 2) != 0) {
                num2 = style.marginBottom;
            }
            return style.copy(num, num2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getMarginTop() {
            return this.marginTop;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getMarginBottom() {
            return this.marginBottom;
        }

        @k
        public final Style copy(@l Integer marginTop, @l Integer marginBottom) {
            return new Style(marginTop, marginBottom);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return L.f(this.marginTop, style.marginTop) && L.f(this.marginBottom, style.marginBottom);
        }

        @l
        public final Integer getMarginBottom() {
            return this.marginBottom;
        }

        @l
        public final Integer getMarginTop() {
            return this.marginTop;
        }

        public int hashCode() {
            Integer num = this.marginTop;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.marginBottom;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Style(marginTop=");
            sb2.append(this.marginTop);
            sb2.append(", marginBottom=");
            return s.j(sb2, this.marginBottom, ')');
        }

        public Style(@l Integer num, @l Integer num2) {
            this.marginTop = num;
            this.marginBottom = num2;
        }

        public /* synthetic */ Style(Integer num, Integer num2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
        }
    }

    @k
    String getId();

    @l
    Style getStyle();
}
