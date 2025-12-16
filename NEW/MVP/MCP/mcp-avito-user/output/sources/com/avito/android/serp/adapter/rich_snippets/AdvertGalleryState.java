package com.avito.android.serp.adapter.rich_snippets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/AdvertGalleryState;", "Landroid/os/Parcelable;", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdvertGalleryState implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<AdvertGalleryState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f270773b;

    /* compiled from: AdvertGalleryState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/rich_snippets/AdvertGalleryState;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Parcel, AdvertGalleryState> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f270774l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final AdvertGalleryState invoke(Parcel parcel) {
            C20199a c20199a;
            Parcel parcel2 = parcel;
            int i12 = parcel2.readInt();
            if (i12 < 0) {
                c20199a = null;
            } else {
                C20199a c20199a2 = new C20199a(i12);
                while (i12 > 0) {
                    Object value = parcel2.readValue(String.class.getClassLoader());
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) value;
                    Object value2 = parcel2.readValue(Parcelable.class.getClassLoader());
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                    }
                    c20199a2.put(str, (Parcelable) value2);
                    i12--;
                }
                c20199a = c20199a2;
            }
            return new AdvertGalleryState(c20199a);
        }
    }

    /* compiled from: AdvertGalleryState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/AdvertGalleryState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/serp/adapter/rich_snippets/AdvertGalleryState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f270774l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertGalleryState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Y61.l
    public final Parcelable a(@Y61.k String str) {
        return (Parcelable) this.f270773b.get(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        J3.f(parcel, this.f270773b);
    }

    public AdvertGalleryState(@Y61.l Map<String, ? extends Parcelable> map) {
        this.f270773b = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
    }

    public /* synthetic */ AdvertGalleryState(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map);
    }
}
