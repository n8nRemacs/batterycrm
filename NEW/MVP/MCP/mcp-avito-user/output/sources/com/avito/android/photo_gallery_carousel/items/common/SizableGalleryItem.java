package com.avito.android.photo_gallery_carousel.items.common;

import kotlin.Metadata;

/* compiled from: SizableGalleryItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/common/SizableGalleryItem;", "", "Type", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SizableGalleryItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SizableGalleryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/common/SizableGalleryItem$Type;", "", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f217904b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f217905c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f217906d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f217907e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f217908f;

        static {
            Type type = new Type("BIG", 0);
            f217904b = type;
            Type type2 = new Type("BIG_ADAPTIVE", 1);
            f217905c = type2;
            Type type3 = new Type("SMALL_ADAPTIVE", 2);
            f217906d = type3;
            Type[] typeArr = {type, type2, type3};
            f217907e = typeArr;
            f217908f = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f217907e.clone();
        }
    }
}
