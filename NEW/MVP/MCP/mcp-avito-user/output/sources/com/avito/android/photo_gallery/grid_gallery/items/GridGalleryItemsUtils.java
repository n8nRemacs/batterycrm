package com.avito.android.photo_gallery.grid_gallery.items;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.enums.c;

/* compiled from: GridGalleryItemsUtils.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemsUtils;", "", "<init>", "()V", "a", "GridGalleryDoubleItemInsidePositionType", "GridGalleryPreviewOrientation", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GridGalleryItemsUtils {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final GridGalleryItemsUtils f217216a = new GridGalleryItemsUtils();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGalleryItemsUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemsUtils$GridGalleryDoubleItemInsidePositionType;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GridGalleryDoubleItemInsidePositionType {

        /* renamed from: b, reason: collision with root package name */
        public static final GridGalleryDoubleItemInsidePositionType f217217b;

        /* renamed from: c, reason: collision with root package name */
        public static final GridGalleryDoubleItemInsidePositionType f217218c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ GridGalleryDoubleItemInsidePositionType[] f217219d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f217220e;

        static {
            GridGalleryDoubleItemInsidePositionType gridGalleryDoubleItemInsidePositionType = new GridGalleryDoubleItemInsidePositionType("DOUBLE_LEFT", 0);
            f217217b = gridGalleryDoubleItemInsidePositionType;
            GridGalleryDoubleItemInsidePositionType gridGalleryDoubleItemInsidePositionType2 = new GridGalleryDoubleItemInsidePositionType("DOUBLE_RIGHT", 1);
            f217218c = gridGalleryDoubleItemInsidePositionType2;
            GridGalleryDoubleItemInsidePositionType[] gridGalleryDoubleItemInsidePositionTypeArr = {gridGalleryDoubleItemInsidePositionType, gridGalleryDoubleItemInsidePositionType2};
            f217219d = gridGalleryDoubleItemInsidePositionTypeArr;
            f217220e = c.a(gridGalleryDoubleItemInsidePositionTypeArr);
        }

        public GridGalleryDoubleItemInsidePositionType() {
            throw null;
        }

        public static GridGalleryDoubleItemInsidePositionType valueOf(String str) {
            return (GridGalleryDoubleItemInsidePositionType) Enum.valueOf(GridGalleryDoubleItemInsidePositionType.class, str);
        }

        public static GridGalleryDoubleItemInsidePositionType[] values() {
            return (GridGalleryDoubleItemInsidePositionType[]) f217219d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGalleryItemsUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemsUtils$GridGalleryPreviewOrientation;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GridGalleryPreviewOrientation {

        /* renamed from: b, reason: collision with root package name */
        public static final GridGalleryPreviewOrientation f217221b;

        /* renamed from: c, reason: collision with root package name */
        public static final GridGalleryPreviewOrientation f217222c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ GridGalleryPreviewOrientation[] f217223d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f217224e;

        static {
            GridGalleryPreviewOrientation gridGalleryPreviewOrientation = new GridGalleryPreviewOrientation("HORIZONTAL", 0);
            f217221b = gridGalleryPreviewOrientation;
            GridGalleryPreviewOrientation gridGalleryPreviewOrientation2 = new GridGalleryPreviewOrientation("VERTICAl", 1);
            f217222c = gridGalleryPreviewOrientation2;
            GridGalleryPreviewOrientation[] gridGalleryPreviewOrientationArr = {gridGalleryPreviewOrientation, gridGalleryPreviewOrientation2};
            f217223d = gridGalleryPreviewOrientationArr;
            f217224e = c.a(gridGalleryPreviewOrientationArr);
        }

        public GridGalleryPreviewOrientation() {
            throw null;
        }

        public static GridGalleryPreviewOrientation valueOf(String str) {
            return (GridGalleryPreviewOrientation) Enum.valueOf(GridGalleryPreviewOrientation.class, str);
        }

        public static GridGalleryPreviewOrientation[] values() {
            return (GridGalleryPreviewOrientation[]) f217223d.clone();
        }
    }

    /* compiled from: GridGalleryItemsUtils.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemsUtils$a;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f217225a;

        /* renamed from: b, reason: collision with root package name */
        public final float f217226b;

        /* renamed from: c, reason: collision with root package name */
        public final float f217227c;

        /* renamed from: d, reason: collision with root package name */
        public final float f217228d;

        public a(float f12, float f13, float f14, float f15) {
            this.f217225a = f12;
            this.f217226b = f13;
            this.f217227c = f14;
            this.f217228d = f15;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f217225a, aVar.f217225a) == 0 && Float.compare(this.f217226b, aVar.f217226b) == 0 && Float.compare(this.f217227c, aVar.f217227c) == 0 && Float.compare(this.f217228d, aVar.f217228d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f217228d) + r.d(this.f217227c, r.d(this.f217226b, Float.hashCode(this.f217225a) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GridGalleryCornerRadii(topLeft=");
            sb2.append(this.f217225a);
            sb2.append(", topRight=");
            sb2.append(this.f217226b);
            sb2.append(", bottomRight=");
            sb2.append(this.f217227c);
            sb2.append(", bottomLeft=");
            return r.k(')', this.f217228d, sb2);
        }
    }

    /* compiled from: GridGalleryItemsUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217229a;

        static {
            int[] iArr = new int[GridGalleryDoubleItemInsidePositionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GridGalleryDoubleItemInsidePositionType gridGalleryDoubleItemInsidePositionType = GridGalleryDoubleItemInsidePositionType.f217217b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f217229a = iArr;
            int[] iArr2 = new int[GridGalleryItemEntity.PositionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GridGalleryItemEntity.PositionType positionType = GridGalleryItemEntity.PositionType.f217205b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GridGalleryItemEntity.PositionType positionType2 = GridGalleryItemEntity.PositionType.f217205b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GridGalleryItemEntity.PositionType positionType3 = GridGalleryItemEntity.PositionType.f217205b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[GridGalleryPreviewOrientation.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                GridGalleryPreviewOrientation gridGalleryPreviewOrientation = GridGalleryPreviewOrientation.f217221b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @k
    public static a a(float f12, @k GridGalleryItemEntity.PositionType positionType, @l GridGalleryDoubleItemInsidePositionType gridGalleryDoubleItemInsidePositionType) {
        List listU;
        int iOrdinal = positionType.ordinal();
        if (iOrdinal == 0) {
            int i12 = gridGalleryDoubleItemInsidePositionType == null ? -1 : b.f217229a[gridGalleryDoubleItemInsidePositionType.ordinal()];
            if (i12 == -1) {
                listU = C42745f0.U(Float.valueOf(f12), Float.valueOf(f12), Float.valueOf(f12), Float.valueOf(f12));
            } else if (i12 == 1) {
                listU = C42745f0.U(Float.valueOf(f12), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f12));
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(f12), Float.valueOf(f12), Float.valueOf(0.0f));
            }
        } else if (iOrdinal == 1) {
            int i13 = gridGalleryDoubleItemInsidePositionType == null ? -1 : b.f217229a[gridGalleryDoubleItemInsidePositionType.ordinal()];
            if (i13 == -1) {
                listU = C42745f0.U(Float.valueOf(f12), Float.valueOf(f12), Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else if (i13 == 1) {
                listU = C42745f0.U(Float.valueOf(f12), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(f12), Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
        } else if (iOrdinal == 2) {
            listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = gridGalleryDoubleItemInsidePositionType == null ? -1 : b.f217229a[gridGalleryDoubleItemInsidePositionType.ordinal()];
            if (i14 == -1) {
                listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f12), Float.valueOf(f12));
            } else if (i14 == 1) {
                listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f12));
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listU = C42745f0.U(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f12), Float.valueOf(0.0f));
            }
        }
        return new a(((Number) listU.get(0)).floatValue(), ((Number) listU.get(1)).floatValue(), ((Number) listU.get(2)).floatValue(), ((Number) listU.get(3)).floatValue());
    }

    @k
    public static void b(@k ImageRequest.a aVar, @k a aVar2, @k GridGalleryPreviewOrientation gridGalleryPreviewOrientation) {
        int iOrdinal = gridGalleryPreviewOrientation.ordinal();
        if (iOrdinal == 0) {
            aVar.f169488f = new ImageRequest.b((int) aVar2.f217225a, (int) aVar2.f217226b, (int) aVar2.f217227c, (int) aVar2.f217228d);
        } else if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
