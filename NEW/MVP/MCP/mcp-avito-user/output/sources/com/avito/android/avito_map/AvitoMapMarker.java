package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: AvitoMapMarker.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0004!\"#$J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H&¢\u0006\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarker;", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getPosition", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "position", "Lkotlin/G0;", "setPosition", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "data", "setData", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "icon", "changeIcon", "(Landroid/graphics/Bitmap;)V", "", "imageId", "", "zIndex", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "(Landroid/graphics/Bitmap;Ljava/lang/String;FLcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;)V", "", "visible", "setVisibility", "(Z)V", "setZIndex", "(F)V", "isVisible", "()Z", "Anchor", "AvitoMapAnchor", "CustomAnchor", "Type", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoMapMarker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoMapMarker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarker$Anchor;", "", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "x", "", "y", "(Ljava/lang/String;IFF)V", "getX", "()F", "getY", "CENTER", "BOTTOM_CENTER", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Anchor implements AvitoMapAnchor {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Anchor[] $VALUES;
        private final float x;
        private final float y;
        public static final Anchor CENTER = new Anchor("CENTER", 0, 0.5f, 0.5f);
        public static final Anchor BOTTOM_CENTER = new Anchor("BOTTOM_CENTER", 1, 0.5f, 1.0f);

        private static final /* synthetic */ Anchor[] $values() {
            return new Anchor[]{CENTER, BOTTOM_CENTER};
        }

        static {
            Anchor[] anchorArr$values = $values();
            $VALUES = anchorArr$values;
            $ENTRIES = c.a(anchorArr$values);
        }

        private Anchor(String str, int i12, float f12, float f13) {
            this.x = f12;
            this.y = f13;
        }

        @k
        public static a<Anchor> getEntries() {
            return $ENTRIES;
        }

        public static Anchor valueOf(String str) {
            return (Anchor) Enum.valueOf(Anchor.class, str);
        }

        public static Anchor[] values() {
            return (Anchor[]) $VALUES.clone();
        }

        @Override // com.avito.android.avito_map.AvitoMapMarker.AvitoMapAnchor
        public float getX() {
            return this.x;
        }

        @Override // com.avito.android.avito_map.AvitoMapMarker.AvitoMapAnchor
        public float getY() {
            return this.y;
        }
    }

    /* compiled from: AvitoMapMarker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "", "x", "", "getX", "()F", "y", "getY", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AvitoMapAnchor {
        float getX();

        float getY();
    }

    /* compiled from: AvitoMapMarker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarker$CustomAnchor;", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CustomAnchor implements AvitoMapAnchor {
        private final float x;
        private final float y;

        public CustomAnchor(float f12, float f13) {
            this.x = f12;
            this.y = f13;
        }

        public static /* synthetic */ CustomAnchor copy$default(CustomAnchor customAnchor, float f12, float f13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = customAnchor.x;
            }
            if ((i12 & 2) != 0) {
                f13 = customAnchor.y;
            }
            return customAnchor.copy(f12, f13);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @k
        public final CustomAnchor copy(float x12, float y12) {
            return new CustomAnchor(x12, y12);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomAnchor)) {
                return false;
            }
            CustomAnchor customAnchor = (CustomAnchor) other;
            return Float.compare(this.x, customAnchor.x) == 0 && Float.compare(this.y, customAnchor.y) == 0;
        }

        @Override // com.avito.android.avito_map.AvitoMapMarker.AvitoMapAnchor
        public float getX() {
            return this.x;
        }

        @Override // com.avito.android.avito_map.AvitoMapMarker.AvitoMapAnchor
        public float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CustomAnchor(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return r.k(')', this.y, sb2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoMapMarker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarker$Type;", "", "drawableRes", "", "(Ljava/lang/String;II)V", "getDrawableRes", "()I", "MARKER_MY_LOCATION_RED", "MARKER_MY_LOCATION_BLUE", "MARKER_PIN_DEFAULT", "MARKER_PIN_DEFAULT_RED", "MARKER_PIN_ADDRESS_BLUE", "MARKER_PIN_ADDRESS_DARK", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final int drawableRes;
        public static final Type MARKER_MY_LOCATION_RED = new Type("MARKER_MY_LOCATION_RED", 0, R.drawable.my_location_pin);
        public static final Type MARKER_MY_LOCATION_BLUE = new Type("MARKER_MY_LOCATION_BLUE", 1, R.drawable.my_location_pin_blue);
        public static final Type MARKER_PIN_DEFAULT = new Type("MARKER_PIN_DEFAULT", 2, R.drawable.blue_pin);
        public static final Type MARKER_PIN_DEFAULT_RED = new Type("MARKER_PIN_DEFAULT_RED", 3, R.drawable.red_pin);
        public static final Type MARKER_PIN_ADDRESS_BLUE = new Type("MARKER_PIN_ADDRESS_BLUE", 4, R.drawable.ic_blue_pin_address);
        public static final Type MARKER_PIN_ADDRESS_DARK = new Type("MARKER_PIN_ADDRESS_DARK", 5, R.drawable.ic_dark_pin_selected_address);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{MARKER_MY_LOCATION_RED, MARKER_MY_LOCATION_BLUE, MARKER_PIN_DEFAULT, MARKER_PIN_DEFAULT_RED, MARKER_PIN_ADDRESS_BLUE, MARKER_PIN_ADDRESS_DARK};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = c.a(typeArr$values);
        }

        private Type(@InterfaceC42165v String str, int i12, int i13) {
            this.drawableRes = i13;
        }

        @k
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getDrawableRes() {
            return this.drawableRes;
        }
    }

    void changeIcon(@l Bitmap icon);

    void changeIcon(@k Bitmap icon, @k String imageId, float zIndex, @k AvitoMapAnchor anchor);

    @l
    Object getData();

    @k
    AvitoMapPoint getPosition();

    boolean isVisible();

    void setData(@k Object data);

    void setPosition(@k AvitoMapPoint position);

    void setVisibility(boolean visible);

    void setZIndex(float zIndex);
}
