package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.util.C35829k2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: Image.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\nJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/Image;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Size;", "Landroid/net/Uri;", "variants", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "width", "height", "", "find", "(II)Ljava/lang/String;", "findUri", "(II)Landroid/net/Uri;", "getImageId", "()Ljava/lang/String;", "", "isEmpty", "()Z", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/avito/android/remote/model/Image;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getVariants", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Image implements Parcelable {

    @k
    public static final Parcelable.Creator<Image> CREATOR = new Creator();

    @k
    private final Map<Size, Uri> variants;

    /* compiled from: Image.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Image> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Image createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(Size.CREATOR.createFromParcel(parcel), parcel.readParcelable(Image.class.getClassLoader()));
            }
            return new Image(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Image[] newArray(int i12) {
            return new Image[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Image(@k Map<Size, ? extends Uri> map) {
        this.variants = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Image copy$default(Image image, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = image.variants;
        }
        return image.copy(map);
    }

    @k
    public final Map<Size, Uri> component1() {
        return this.variants;
    }

    @k
    public final Image copy(@k Map<Size, ? extends Uri> variants) {
        return new Image(variants);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Image) && L.f(this.variants, ((Image) other).variants);
    }

    @l
    public final String find(int width, int height) {
        Uri uriFindUri = findUri(width, height);
        if (uriFindUri == null) {
            return null;
        }
        return uriFindUri.toString();
    }

    @l
    public final Uri findUri(int width, int height) {
        return C35829k2.b(this, width, height, 0.0f, 0, 60).d();
    }

    @k
    public final String getImageId() {
        String path;
        Uri uri = (Uri) C42745f0.F(this.variants.values());
        String strP0 = (uri == null || (path = uri.getPath()) == null) ? null : C43066x.p0(C43066x.n0('/', path, path), '.');
        return strP0 == null ? "" : strP0;
    }

    @k
    public final Map<Size, Uri> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return this.variants.hashCode();
    }

    public final boolean isEmpty() {
        return this.variants.isEmpty();
    }

    @k
    public String toString() {
        return r.w(new StringBuilder("Image(variants="), this.variants, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itI = C0.i(parcel, this.variants);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            ((Size) entry.getKey()).writeToParcel(parcel, flags);
            parcel.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }
}
