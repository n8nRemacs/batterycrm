package com.avito.android.image_loader;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ForegroundConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/From;", "", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class From {

    /* renamed from: b, reason: collision with root package name */
    public static final From f169442b;

    /* renamed from: c, reason: collision with root package name */
    public static final From f169443c;

    /* renamed from: d, reason: collision with root package name */
    public static final From f169444d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ From[] f169445e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f169446f;

    static {
        From from = new From("GALLERY", 0);
        f169442b = from;
        From from2 = new From("NONE_OVERLAY", 1);
        f169443c = from2;
        From from3 = new From("OTHER", 2);
        f169444d = from3;
        From[] fromArr = {from, from2, from3};
        f169445e = fromArr;
        f169446f = kotlin.enums.c.a(fromArr);
    }

    public From() {
        throw null;
    }

    public static From valueOf(String str) {
        return (From) Enum.valueOf(From.class, str);
    }

    public static From[] values() {
        return (From[]) f169445e.clone();
    }
}
