package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiLong;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallMeta.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u000267BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b1\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001d¨\u00068"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "item", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "peer", "", "scenario", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "gsmLink", "msgLink", "", "startCallDelayMs", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "extraInfo", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "getItem", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "getPeer", "Ljava/lang/String;", "getScenario", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getGsmLink", "getMsgLink", "Ljava/lang/Long;", "getStartCallDelayMs", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getExtraInfo", "Item", "User", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallMeta implements dL.d {
    public static final int $stable = 8;

    @Y61.l
    private final IacPiiMapStringString extraInfo;

    @Y61.l
    private final IacPiiDeepLink gsmLink;

    @Y61.l
    private final Item item;

    @Y61.l
    private final IacPiiDeepLink msgLink;

    @Y61.l
    private final User peer;

    @Y61.k
    private final String scenario;

    @Y61.l
    private final Long startCallDelayMs;

    /* compiled from: CallMeta.kt */
    @P
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "LdL/d;", "", "id", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "title", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "price", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "imageUrls", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "itemLink", "<init>", "(JLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "component1", "()J", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "component5", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "copy", "(JLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$Item;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getTitle", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiLong;", "getPrice", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getImageUrls", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getItemLink", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements dL.d {
        public static final int $stable = 8;
        private final long id;

        @Y61.l
        private final IacPiiMapStringString imageUrls;

        @Y61.l
        private final IacPiiDeepLink itemLink;

        @Y61.l
        private final IacPiiLong price;

        @Y61.l
        private final IacPiiString title;

        public Item(long j12, @Y61.l IacPiiString iacPiiString, @Y61.l IacPiiLong iacPiiLong, @Y61.l IacPiiMapStringString iacPiiMapStringString, @Y61.l IacPiiDeepLink iacPiiDeepLink) {
            this.id = j12;
            this.title = iacPiiString;
            this.price = iacPiiLong;
            this.imageUrls = iacPiiMapStringString;
            this.itemLink = iacPiiDeepLink;
        }

        public static /* synthetic */ Item copy$default(Item item, long j12, IacPiiString iacPiiString, IacPiiLong iacPiiLong, IacPiiMapStringString iacPiiMapStringString, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j12 = item.id;
            }
            long j13 = j12;
            if ((i12 & 2) != 0) {
                iacPiiString = item.title;
            }
            IacPiiString iacPiiString2 = iacPiiString;
            if ((i12 & 4) != 0) {
                iacPiiLong = item.price;
            }
            IacPiiLong iacPiiLong2 = iacPiiLong;
            if ((i12 & 8) != 0) {
                iacPiiMapStringString = item.imageUrls;
            }
            IacPiiMapStringString iacPiiMapStringString2 = iacPiiMapStringString;
            if ((i12 & 16) != 0) {
                iacPiiDeepLink = item.itemLink;
            }
            return item.copy(j13, iacPiiString2, iacPiiLong2, iacPiiMapStringString2, iacPiiDeepLink);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @Y61.l
        /* renamed from: component2, reason: from getter */
        public final IacPiiString getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final IacPiiLong getPrice() {
            return this.price;
        }

        @Y61.l
        /* renamed from: component4, reason: from getter */
        public final IacPiiMapStringString getImageUrls() {
            return this.imageUrls;
        }

        @Y61.l
        /* renamed from: component5, reason: from getter */
        public final IacPiiDeepLink getItemLink() {
            return this.itemLink;
        }

        @Y61.k
        public final Item copy(long id2, @Y61.l IacPiiString title, @Y61.l IacPiiLong price, @Y61.l IacPiiMapStringString imageUrls, @Y61.l IacPiiDeepLink itemLink) {
            return new Item(id2, title, price, imageUrls, itemLink);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.id == item.id && L.f(this.title, item.title) && L.f(this.price, item.price) && L.f(this.imageUrls, item.imageUrls) && L.f(this.itemLink, item.itemLink);
        }

        public final long getId() {
            return this.id;
        }

        @Y61.l
        public final IacPiiMapStringString getImageUrls() {
            return this.imageUrls;
        }

        @Y61.l
        public final IacPiiDeepLink getItemLink() {
            return this.itemLink;
        }

        @Y61.l
        public final IacPiiLong getPrice() {
            return this.price;
        }

        @Y61.l
        public final IacPiiString getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.id) * 31;
            IacPiiString iacPiiString = this.title;
            int iHashCode2 = (iHashCode + (iacPiiString == null ? 0 : iacPiiString.hashCode())) * 31;
            IacPiiLong iacPiiLong = this.price;
            int iHashCode3 = (iHashCode2 + (iacPiiLong == null ? 0 : iacPiiLong.hashCode())) * 31;
            IacPiiMapStringString iacPiiMapStringString = this.imageUrls;
            int iHashCode4 = (iHashCode3 + (iacPiiMapStringString == null ? 0 : iacPiiMapStringString.hashCode())) * 31;
            IacPiiDeepLink iacPiiDeepLink = this.itemLink;
            return iHashCode4 + (iacPiiDeepLink != null ? iacPiiDeepLink.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "Item(id=" + this.id + ", title=" + this.title + ", price=" + this.price + ", imageUrls=" + this.imageUrls + ", itemLink=" + this.itemLink + ')';
        }
    }

    /* compiled from: CallMeta.kt */
    @P
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "LdL/d;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "name", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "avatarUrls", "rating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "callerReviewCount", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "component3", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta$User;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiMapStringString;", "getAvatarUrls", "getRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "getCallerReviewCount", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class User implements dL.d {
        public static final int $stable = 8;

        @Y61.l
        private final IacPiiMapStringString avatarUrls;

        @Y61.l
        private final IacPiiInt callerReviewCount;

        @Y61.l
        private final IacPiiString name;

        @Y61.l
        private final IacPiiString rating;

        public User(@Y61.l IacPiiString iacPiiString, @Y61.l IacPiiMapStringString iacPiiMapStringString, @Y61.l IacPiiString iacPiiString2, @Y61.l IacPiiInt iacPiiInt) {
            this.name = iacPiiString;
            this.avatarUrls = iacPiiMapStringString;
            this.rating = iacPiiString2;
            this.callerReviewCount = iacPiiInt;
        }

        public static /* synthetic */ User copy$default(User user, IacPiiString iacPiiString, IacPiiMapStringString iacPiiMapStringString, IacPiiString iacPiiString2, IacPiiInt iacPiiInt, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacPiiString = user.name;
            }
            if ((i12 & 2) != 0) {
                iacPiiMapStringString = user.avatarUrls;
            }
            if ((i12 & 4) != 0) {
                iacPiiString2 = user.rating;
            }
            if ((i12 & 8) != 0) {
                iacPiiInt = user.callerReviewCount;
            }
            return user.copy(iacPiiString, iacPiiMapStringString, iacPiiString2, iacPiiInt);
        }

        @Y61.l
        /* renamed from: component1, reason: from getter */
        public final IacPiiString getName() {
            return this.name;
        }

        @Y61.l
        /* renamed from: component2, reason: from getter */
        public final IacPiiMapStringString getAvatarUrls() {
            return this.avatarUrls;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final IacPiiString getRating() {
            return this.rating;
        }

        @Y61.l
        /* renamed from: component4, reason: from getter */
        public final IacPiiInt getCallerReviewCount() {
            return this.callerReviewCount;
        }

        @Y61.k
        public final User copy(@Y61.l IacPiiString name, @Y61.l IacPiiMapStringString avatarUrls, @Y61.l IacPiiString rating, @Y61.l IacPiiInt callerReviewCount) {
            return new User(name, avatarUrls, rating, callerReviewCount);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return L.f(this.name, user.name) && L.f(this.avatarUrls, user.avatarUrls) && L.f(this.rating, user.rating) && L.f(this.callerReviewCount, user.callerReviewCount);
        }

        @Y61.l
        public final IacPiiMapStringString getAvatarUrls() {
            return this.avatarUrls;
        }

        @Y61.l
        public final IacPiiInt getCallerReviewCount() {
            return this.callerReviewCount;
        }

        @Y61.l
        public final IacPiiString getName() {
            return this.name;
        }

        @Y61.l
        public final IacPiiString getRating() {
            return this.rating;
        }

        public int hashCode() {
            IacPiiString iacPiiString = this.name;
            int iHashCode = (iacPiiString == null ? 0 : iacPiiString.hashCode()) * 31;
            IacPiiMapStringString iacPiiMapStringString = this.avatarUrls;
            int iHashCode2 = (iHashCode + (iacPiiMapStringString == null ? 0 : iacPiiMapStringString.hashCode())) * 31;
            IacPiiString iacPiiString2 = this.rating;
            int iHashCode3 = (iHashCode2 + (iacPiiString2 == null ? 0 : iacPiiString2.hashCode())) * 31;
            IacPiiInt iacPiiInt = this.callerReviewCount;
            return iHashCode3 + (iacPiiInt != null ? iacPiiInt.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "User(name=" + this.name + ", avatarUrls=" + this.avatarUrls + ", rating=" + this.rating + ", callerReviewCount=" + this.callerReviewCount + ')';
        }
    }

    public CallMeta(@Y61.l Item item, @Y61.l User user, @Y61.k String str, @Y61.l IacPiiDeepLink iacPiiDeepLink, @Y61.l IacPiiDeepLink iacPiiDeepLink2, @Y61.l Long l12, @Y61.l IacPiiMapStringString iacPiiMapStringString) {
        this.item = item;
        this.peer = user;
        this.scenario = str;
        this.gsmLink = iacPiiDeepLink;
        this.msgLink = iacPiiDeepLink2;
        this.startCallDelayMs = l12;
        this.extraInfo = iacPiiMapStringString;
    }

    public static /* synthetic */ CallMeta copy$default(CallMeta callMeta, Item item, User user, String str, IacPiiDeepLink iacPiiDeepLink, IacPiiDeepLink iacPiiDeepLink2, Long l12, IacPiiMapStringString iacPiiMapStringString, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            item = callMeta.item;
        }
        if ((i12 & 2) != 0) {
            user = callMeta.peer;
        }
        User user2 = user;
        if ((i12 & 4) != 0) {
            str = callMeta.scenario;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            iacPiiDeepLink = callMeta.gsmLink;
        }
        IacPiiDeepLink iacPiiDeepLink3 = iacPiiDeepLink;
        if ((i12 & 16) != 0) {
            iacPiiDeepLink2 = callMeta.msgLink;
        }
        IacPiiDeepLink iacPiiDeepLink4 = iacPiiDeepLink2;
        if ((i12 & 32) != 0) {
            l12 = callMeta.startCallDelayMs;
        }
        Long l13 = l12;
        if ((i12 & 64) != 0) {
            iacPiiMapStringString = callMeta.extraInfo;
        }
        return callMeta.copy(item, user2, str2, iacPiiDeepLink3, iacPiiDeepLink4, l13, iacPiiMapStringString);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final Item getItem() {
        return this.item;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final User getPeer() {
        return this.peer;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final IacPiiDeepLink getGsmLink() {
        return this.gsmLink;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final IacPiiDeepLink getMsgLink() {
        return this.msgLink;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final Long getStartCallDelayMs() {
        return this.startCallDelayMs;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final IacPiiMapStringString getExtraInfo() {
        return this.extraInfo;
    }

    @Y61.k
    public final CallMeta copy(@Y61.l Item item, @Y61.l User peer, @Y61.k String scenario, @Y61.l IacPiiDeepLink gsmLink, @Y61.l IacPiiDeepLink msgLink, @Y61.l Long startCallDelayMs, @Y61.l IacPiiMapStringString extraInfo) {
        return new CallMeta(item, peer, scenario, gsmLink, msgLink, startCallDelayMs, extraInfo);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallMeta)) {
            return false;
        }
        CallMeta callMeta = (CallMeta) other;
        return L.f(this.item, callMeta.item) && L.f(this.peer, callMeta.peer) && L.f(this.scenario, callMeta.scenario) && L.f(this.gsmLink, callMeta.gsmLink) && L.f(this.msgLink, callMeta.msgLink) && L.f(this.startCallDelayMs, callMeta.startCallDelayMs) && L.f(this.extraInfo, callMeta.extraInfo);
    }

    @Y61.l
    public final IacPiiMapStringString getExtraInfo() {
        return this.extraInfo;
    }

    @Y61.l
    public final IacPiiDeepLink getGsmLink() {
        return this.gsmLink;
    }

    @Y61.l
    public final Item getItem() {
        return this.item;
    }

    @Y61.l
    public final IacPiiDeepLink getMsgLink() {
        return this.msgLink;
    }

    @Y61.l
    public final User getPeer() {
        return this.peer;
    }

    @Y61.k
    public final String getScenario() {
        return this.scenario;
    }

    @Y61.l
    public final Long getStartCallDelayMs() {
        return this.startCallDelayMs;
    }

    public int hashCode() {
        Item item = this.item;
        int iHashCode = (item == null ? 0 : item.hashCode()) * 31;
        User user = this.peer;
        int iD2 = H.d((iHashCode + (user == null ? 0 : user.hashCode())) * 31, 31, this.scenario);
        IacPiiDeepLink iacPiiDeepLink = this.gsmLink;
        int iHashCode2 = (iD2 + (iacPiiDeepLink == null ? 0 : iacPiiDeepLink.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink2 = this.msgLink;
        int iHashCode3 = (iHashCode2 + (iacPiiDeepLink2 == null ? 0 : iacPiiDeepLink2.hashCode())) * 31;
        Long l12 = this.startCallDelayMs;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        IacPiiMapStringString iacPiiMapStringString = this.extraInfo;
        return iHashCode4 + (iacPiiMapStringString != null ? iacPiiMapStringString.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "CallMeta(item=" + this.item + ", peer=" + this.peer + ", scenario=" + this.scenario + ", gsmLink=" + this.gsmLink + ", msgLink=" + this.msgLink + ", startCallDelayMs=" + this.startCallDelayMs + ", extraInfo=" + this.extraInfo + ')';
    }
}
