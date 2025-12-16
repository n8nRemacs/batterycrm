package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.credit_broker.installments_block.InstallmentsBlockDto;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditBrokerProduct.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/InstallmentsV3Product;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "topBlock", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockDto;", "bottomBlock", "", "analyticsSlug", "", "Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "floatingViews", "<init>", "(Lcom/avito/android/remote/model/credit_broker/EntryPoint;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockDto;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "component2", "()Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockDto;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/remote/model/credit_broker/EntryPoint;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockDto;Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/remote/model/credit_broker/InstallmentsV3Product;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getTopBlock", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockDto;", "getBottomBlock", "Ljava/lang/String;", "getAnalyticsSlug", "Ljava/util/Map;", "getFloatingViews", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstallmentsV3Product implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<InstallmentsV3Product> CREATOR = new Creator();

    @c("analyticsSlug")
    @l
    private final String analyticsSlug;

    @c("bottomBlock")
    @l
    private final InstallmentsBlockDto bottomBlock;

    @c("floatingViews")
    @l
    private final Map<String, InstallmentsFloatingView> floatingViews;

    @c("topBlock")
    @l
    private final EntryPoint topBlock;

    /* compiled from: CreditBrokerProduct.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsV3Product> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsV3Product createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap = null;
            EntryPoint entryPointCreateFromParcel = parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel);
            InstallmentsBlockDto installmentsBlockDtoCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsBlockDto.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(InstallmentsV3Product.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new InstallmentsV3Product(entryPointCreateFromParcel, installmentsBlockDtoCreateFromParcel, string, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsV3Product[] newArray(int i12) {
            return new InstallmentsV3Product[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstallmentsV3Product(@l EntryPoint entryPoint, @l InstallmentsBlockDto installmentsBlockDto, @l String str, @l Map<String, ? extends InstallmentsFloatingView> map) {
        this.topBlock = entryPoint;
        this.bottomBlock = installmentsBlockDto;
        this.analyticsSlug = str;
        this.floatingViews = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstallmentsV3Product copy$default(InstallmentsV3Product installmentsV3Product, EntryPoint entryPoint, InstallmentsBlockDto installmentsBlockDto, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            entryPoint = installmentsV3Product.topBlock;
        }
        if ((i12 & 2) != 0) {
            installmentsBlockDto = installmentsV3Product.bottomBlock;
        }
        if ((i12 & 4) != 0) {
            str = installmentsV3Product.analyticsSlug;
        }
        if ((i12 & 8) != 0) {
            map = installmentsV3Product.floatingViews;
        }
        return installmentsV3Product.copy(entryPoint, installmentsBlockDto, str, map);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final EntryPoint getTopBlock() {
        return this.topBlock;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final InstallmentsBlockDto getBottomBlock() {
        return this.bottomBlock;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAnalyticsSlug() {
        return this.analyticsSlug;
    }

    @l
    public final Map<String, InstallmentsFloatingView> component4() {
        return this.floatingViews;
    }

    @k
    public final InstallmentsV3Product copy(@l EntryPoint topBlock, @l InstallmentsBlockDto bottomBlock, @l String analyticsSlug, @l Map<String, ? extends InstallmentsFloatingView> floatingViews) {
        return new InstallmentsV3Product(topBlock, bottomBlock, analyticsSlug, floatingViews);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsV3Product)) {
            return false;
        }
        InstallmentsV3Product installmentsV3Product = (InstallmentsV3Product) other;
        return L.f(this.topBlock, installmentsV3Product.topBlock) && L.f(this.bottomBlock, installmentsV3Product.bottomBlock) && L.f(this.analyticsSlug, installmentsV3Product.analyticsSlug) && L.f(this.floatingViews, installmentsV3Product.floatingViews);
    }

    @l
    public final String getAnalyticsSlug() {
        return this.analyticsSlug;
    }

    @l
    public final InstallmentsBlockDto getBottomBlock() {
        return this.bottomBlock;
    }

    @l
    public final Map<String, InstallmentsFloatingView> getFloatingViews() {
        return this.floatingViews;
    }

    @l
    public final EntryPoint getTopBlock() {
        return this.topBlock;
    }

    public int hashCode() {
        EntryPoint entryPoint = this.topBlock;
        int iHashCode = (entryPoint == null ? 0 : entryPoint.hashCode()) * 31;
        InstallmentsBlockDto installmentsBlockDto = this.bottomBlock;
        int iHashCode2 = (iHashCode + (installmentsBlockDto == null ? 0 : installmentsBlockDto.hashCode())) * 31;
        String str = this.analyticsSlug;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, InstallmentsFloatingView> map = this.floatingViews;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsV3Product(topBlock=");
        sb2.append(this.topBlock);
        sb2.append(", bottomBlock=");
        sb2.append(this.bottomBlock);
        sb2.append(", analyticsSlug=");
        sb2.append(this.analyticsSlug);
        sb2.append(", floatingViews=");
        return r.w(sb2, this.floatingViews, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        EntryPoint entryPoint = this.topBlock;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint.writeToParcel(parcel, flags);
        }
        InstallmentsBlockDto installmentsBlockDto = this.bottomBlock;
        if (installmentsBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsBlockDto.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analyticsSlug);
        Map<String, InstallmentsFloatingView> map = this.floatingViews;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }
}
