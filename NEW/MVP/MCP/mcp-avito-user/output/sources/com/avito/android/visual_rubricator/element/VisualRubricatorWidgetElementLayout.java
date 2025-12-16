package com.avito.android.visual_rubricator.element;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VisualRubricatorWidgetElementLayout.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/visual_rubricator/element/VisualRubricatorWidgetElementLayout;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "a", "X_SMALL", "SMALL", "MEDIUM", "LARGE", "X_LARGE", "CHIPS", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VisualRubricatorWidgetElementLayout implements Parcelable {

    @com.google.gson.annotations.c("chips")
    public static final VisualRubricatorWidgetElementLayout CHIPS;

    @Y61.k
    public static final Parcelable.Creator<VisualRubricatorWidgetElementLayout> CREATOR;

    @com.google.gson.annotations.c("L")
    public static final VisualRubricatorWidgetElementLayout LARGE;

    @com.google.gson.annotations.c("M")
    public static final VisualRubricatorWidgetElementLayout MEDIUM;

    @com.google.gson.annotations.c("S")
    public static final VisualRubricatorWidgetElementLayout SMALL;

    @com.google.gson.annotations.c("XL")
    public static final VisualRubricatorWidgetElementLayout X_LARGE;

    @com.google.gson.annotations.c("XS")
    public static final VisualRubricatorWidgetElementLayout X_SMALL;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f327381b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ VisualRubricatorWidgetElementLayout[] f327382c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f327383d;

    /* compiled from: VisualRubricatorWidgetElementLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/element/VisualRubricatorWidgetElementLayout$a;", "", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static VisualRubricatorWidgetElementLayout a(@Y61.l String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 76) {
                    if (iHashCode != 77) {
                        if (iHashCode != 83) {
                            if (iHashCode != 2804) {
                                if (iHashCode != 2811) {
                                    if (iHashCode == 94631335 && str.equals("chips")) {
                                        return VisualRubricatorWidgetElementLayout.CHIPS;
                                    }
                                } else if (str.equals("XS")) {
                                    return VisualRubricatorWidgetElementLayout.X_SMALL;
                                }
                            } else if (str.equals("XL")) {
                                return VisualRubricatorWidgetElementLayout.X_LARGE;
                            }
                        } else if (str.equals("S")) {
                            return VisualRubricatorWidgetElementLayout.SMALL;
                        }
                    } else if (str.equals("M")) {
                        return VisualRubricatorWidgetElementLayout.MEDIUM;
                    }
                } else if (str.equals("L")) {
                    return VisualRubricatorWidgetElementLayout.LARGE;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = new VisualRubricatorWidgetElementLayout("X_SMALL", 0);
        X_SMALL = visualRubricatorWidgetElementLayout;
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout2 = new VisualRubricatorWidgetElementLayout("SMALL", 1);
        SMALL = visualRubricatorWidgetElementLayout2;
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout3 = new VisualRubricatorWidgetElementLayout("MEDIUM", 2);
        MEDIUM = visualRubricatorWidgetElementLayout3;
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout4 = new VisualRubricatorWidgetElementLayout("LARGE", 3);
        LARGE = visualRubricatorWidgetElementLayout4;
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout5 = new VisualRubricatorWidgetElementLayout("X_LARGE", 4);
        X_LARGE = visualRubricatorWidgetElementLayout5;
        VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout6 = new VisualRubricatorWidgetElementLayout("CHIPS", 5);
        CHIPS = visualRubricatorWidgetElementLayout6;
        VisualRubricatorWidgetElementLayout[] visualRubricatorWidgetElementLayoutArr = {visualRubricatorWidgetElementLayout, visualRubricatorWidgetElementLayout2, visualRubricatorWidgetElementLayout3, visualRubricatorWidgetElementLayout4, visualRubricatorWidgetElementLayout5, visualRubricatorWidgetElementLayout6};
        f327382c = visualRubricatorWidgetElementLayoutArr;
        f327383d = kotlin.enums.c.a(visualRubricatorWidgetElementLayoutArr);
        f327381b = new a(null);
        CREATOR = new Parcelable.Creator<VisualRubricatorWidgetElementLayout>() { // from class: com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout.b
            @Override // android.os.Parcelable.Creator
            public final VisualRubricatorWidgetElementLayout createFromParcel(Parcel parcel) {
                return VisualRubricatorWidgetElementLayout.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VisualRubricatorWidgetElementLayout[] newArray(int i12) {
                return new VisualRubricatorWidgetElementLayout[i12];
            }
        };
    }

    private VisualRubricatorWidgetElementLayout(String str, int i12) {
    }

    public static VisualRubricatorWidgetElementLayout valueOf(String str) {
        return (VisualRubricatorWidgetElementLayout) Enum.valueOf(VisualRubricatorWidgetElementLayout.class, str);
    }

    public static VisualRubricatorWidgetElementLayout[] values() {
        return (VisualRubricatorWidgetElementLayout[]) f327382c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
