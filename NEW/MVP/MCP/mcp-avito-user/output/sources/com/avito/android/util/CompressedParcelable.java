package com.avito.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.BaseCompressedParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompressedParcelable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/CompressedParcelable;", "Lcom/avito/android/util/BaseCompressedParcelable;", "Landroid/os/Parcelable;", "b", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompressedParcelable extends BaseCompressedParcelable<Parcelable> {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<CompressedParcelable> CREATOR;

    /* compiled from: CompressedParcelable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/util/CompressedParcelable;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Parcel, CompressedParcelable> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f318573l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CompressedParcelable invoke(Parcel parcel) {
            byte[] bArr;
            Parcel parcel2 = parcel;
            BaseCompressedParcelable.a aVar = BaseCompressedParcelable.f318561b;
            C35803h0 c35803h0 = C35803h0.f318889l;
            BaseCompressedParcelable.f318561b.getClass();
            boolean zC2 = J3.c(parcel2);
            boolean zC3 = zC2 ? J3.c(parcel2) : false;
            if (zC2) {
                bArr = new byte[parcel2.readInt()];
                parcel2.readByteArray(bArr);
            } else {
                bArr = new byte[0];
            }
            return (CompressedParcelable) ((BaseCompressedParcelable) c35803h0.invoke(bArr, Boolean.valueOf(zC3)));
        }
    }

    /* compiled from: CompressedParcelable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/util/CompressedParcelable$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/util/CompressedParcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f318573l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    public CompressedParcelable(byte[] bArr, boolean z12, C42822w c42822w) {
    }
}
