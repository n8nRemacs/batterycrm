package com.avito.android.virtual_deal_room.deeplink.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Category.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/model/Category;", "", "Landroid/os/Parcelable;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Category implements Parcelable {

    @k
    public static final Parcelable.Creator<Category> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final Category f326469c;

    /* renamed from: d, reason: collision with root package name */
    public static final Category f326470d;

    /* renamed from: e, reason: collision with root package name */
    public static final Category f326471e;

    /* renamed from: f, reason: collision with root package name */
    public static final Category f326472f;

    /* renamed from: g, reason: collision with root package name */
    public static final Category f326473g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Category[] f326474h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f326475i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326476b;

    static {
        Category category = new Category("Demo2", 0, "example2");
        f326469c = category;
        Category category2 = new Category("Demo1", 1, "example1");
        f326470d = category2;
        Category category3 = new Category("NewDevelopments", 2, "nd-trx");
        f326471e = category3;
        Category category4 = new Category("ComfortableDeal", 3, "comfortable-deal");
        f326472f = category4;
        Category category5 = new Category("Mortgage", 4, "mortgage");
        f326473g = category5;
        Category[] categoryArr = {category, category2, category3, category4, category5};
        f326474h = categoryArr;
        f326475i = c.a(categoryArr);
        CREATOR = new Parcelable.Creator<Category>() { // from class: com.avito.android.virtual_deal_room.deeplink.model.Category.a
            @Override // android.os.Parcelable.Creator
            public final Category createFromParcel(Parcel parcel) {
                return Category.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Category[] newArray(int i12) {
                return new Category[i12];
            }
        };
    }

    public Category(String str, int i12, String str2) {
        this.f326476b = str2;
    }

    public static Category valueOf(String str) {
        return (Category) Enum.valueOf(Category.class, str);
    }

    public static Category[] values() {
        return (Category[]) f326474h.clone();
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
