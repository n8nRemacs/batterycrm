package com.avito.android.horizontal_list.widget;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HorizontalWidgetType.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType;", "", "Landroid/os/Parcelable;", "", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "RECENT_SEARCH", "NONE", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalWidgetType implements Parcelable {

    @k
    public static final Parcelable.Creator<HorizontalWidgetType> CREATOR;

    @c("")
    public static final HorizontalWidgetType NONE;

    @c("recentSearch")
    public static final HorizontalWidgetType RECENT_SEARCH;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f162604c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ HorizontalWidgetType[] f162605d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162606e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162607b;

    /* compiled from: HorizontalWidgetType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType$a;", "", "<init>", "()V", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        HorizontalWidgetType horizontalWidgetType = new HorizontalWidgetType("RECENT_SEARCH", 0, "recentSearch");
        RECENT_SEARCH = horizontalWidgetType;
        HorizontalWidgetType horizontalWidgetType2 = new HorizontalWidgetType("NONE", 1, "");
        NONE = horizontalWidgetType2;
        HorizontalWidgetType[] horizontalWidgetTypeArr = {horizontalWidgetType, horizontalWidgetType2};
        f162605d = horizontalWidgetTypeArr;
        f162606e = kotlin.enums.c.a(horizontalWidgetTypeArr);
        f162604c = new a(null);
        CREATOR = new Parcelable.Creator<HorizontalWidgetType>() { // from class: com.avito.android.horizontal_list.widget.HorizontalWidgetType.b
            @Override // android.os.Parcelable.Creator
            public final HorizontalWidgetType createFromParcel(Parcel parcel) {
                return HorizontalWidgetType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HorizontalWidgetType[] newArray(int i12) {
                return new HorizontalWidgetType[i12];
            }
        };
    }

    private HorizontalWidgetType(String str, int i12, String str2) {
        this.f162607b = str2;
    }

    public static HorizontalWidgetType valueOf(String str) {
        return (HorizontalWidgetType) Enum.valueOf(HorizontalWidgetType.class, str);
    }

    public static HorizontalWidgetType[] values() {
        return (HorizontalWidgetType[]) f162605d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
