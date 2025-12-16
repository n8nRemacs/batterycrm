package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.C35755b0;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAiDesignImagesResponse.kt */
@d
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\n¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/RealtyAiDesignImagesResponse;", "Landroid/os/Parcelable;", "", "", "Lcom/avito/android/remote/model/RealtyAiDesignImagesResponse$Urls;", "images", "<init>", "(Ljava/util/Map;)V", "Lcom/avito/android/remote/model/Image;", "convert", "()Ljava/util/Map;", "component1", "copy", "(Ljava/util/Map;)Lcom/avito/android/remote/model/RealtyAiDesignImagesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getImages", "Urls", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RealtyAiDesignImagesResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyAiDesignImagesResponse> CREATOR = new Creator();

    @c("images")
    @l
    private final Map<Integer, Urls> images;

    /* compiled from: RealtyAiDesignImagesResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyAiDesignImagesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyAiDesignImagesResponse createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap2.put(Integer.valueOf(parcel.readInt()), Urls.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RealtyAiDesignImagesResponse(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyAiDesignImagesResponse[] newArray(int i12) {
            return new RealtyAiDesignImagesResponse[i12];
        }
    }

    /* compiled from: RealtyAiDesignImagesResponse.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/RealtyAiDesignImagesResponse$Urls;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "content", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "copy", "(Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/RealtyAiDesignImagesResponse$Urls;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getContent", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Urls implements Parcelable {

        @k
        public static final Parcelable.Creator<Urls> CREATOR = new Creator();

        @c("urls")
        @l
        private final Image content;

        /* compiled from: RealtyAiDesignImagesResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Urls> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Urls createFromParcel(@k Parcel parcel) {
                return new Urls((Image) parcel.readParcelable(Urls.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Urls[] newArray(int i12) {
                return new Urls[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Urls() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Urls copy$default(Urls urls, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = urls.content;
            }
            return urls.copy(image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getContent() {
            return this.content;
        }

        @k
        public final Urls copy(@l Image content) {
            return new Urls(content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Urls) && L.f(this.content, ((Urls) other).content);
        }

        @l
        public final Image getContent() {
            return this.content;
        }

        public int hashCode() {
            Image image = this.content;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @k
        public String toString() {
            return AK.c.o(new StringBuilder("Urls(content="), this.content, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.content, flags);
        }

        public Urls(@l Image image) {
            this.content = image;
        }

        public /* synthetic */ Urls(Image image, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : image);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealtyAiDesignImagesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealtyAiDesignImagesResponse copy$default(RealtyAiDesignImagesResponse realtyAiDesignImagesResponse, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = realtyAiDesignImagesResponse.images;
        }
        return realtyAiDesignImagesResponse.copy(map);
    }

    @l
    public final Map<Integer, Urls> component1() {
        return this.images;
    }

    @k
    public final Map<Integer, Image> convert() {
        LinkedHashMap linkedHashMapC;
        Map<Integer, Urls> map = this.images;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((Urls) entry.getValue()).getContent());
            }
            linkedHashMapC = C35755b0.c(linkedHashMap);
        } else {
            linkedHashMapC = null;
        }
        return linkedHashMapC == null ? P0.c() : linkedHashMapC;
    }

    @k
    public final RealtyAiDesignImagesResponse copy(@l Map<Integer, Urls> images) {
        return new RealtyAiDesignImagesResponse(images);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RealtyAiDesignImagesResponse) && L.f(this.images, ((RealtyAiDesignImagesResponse) other).images);
    }

    @l
    public final Map<Integer, Urls> getImages() {
        return this.images;
    }

    public int hashCode() {
        Map<Integer, Urls> map = this.images;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @k
    public String toString() {
        return r.w(new StringBuilder("RealtyAiDesignImagesResponse(images="), this.images, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<Integer, Urls> map = this.images;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeInt(((Number) entry.getKey()).intValue());
            ((Urls) entry.getValue()).writeToParcel(parcel, flags);
        }
    }

    public RealtyAiDesignImagesResponse(@l Map<Integer, Urls> map) {
        this.images = map;
    }

    public /* synthetic */ RealtyAiDesignImagesResponse(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map);
    }
}
