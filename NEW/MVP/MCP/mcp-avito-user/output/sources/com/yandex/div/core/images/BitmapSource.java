package com.yandex.div.core.images;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BitmapSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/images/BitmapSource;", "", "div-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapSource {

    /* renamed from: b, reason: collision with root package name */
    public static final BitmapSource f367560b;

    /* renamed from: c, reason: collision with root package name */
    public static final BitmapSource f367561c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BitmapSource[] f367562d;

    static {
        BitmapSource bitmapSource = new BitmapSource("NETWORK", 0);
        f367560b = bitmapSource;
        BitmapSource bitmapSource2 = new BitmapSource("DISK", 1);
        BitmapSource bitmapSource3 = new BitmapSource("MEMORY", 2);
        f367561c = bitmapSource3;
        f367562d = new BitmapSource[]{bitmapSource, bitmapSource2, bitmapSource3};
    }

    public BitmapSource() {
        throw null;
    }

    public static BitmapSource valueOf(String str) {
        return (BitmapSource) Enum.valueOf(BitmapSource.class, str);
    }

    public static BitmapSource[] values() {
        return (BitmapSource[]) f367562d.clone();
    }
}
