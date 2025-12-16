package androidx.compose.material3.carousel;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Keyline.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselAlignment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CarouselAlignment[] f36137b = {new CarouselAlignment("Start", 0), new CarouselAlignment("Center", 1), new CarouselAlignment("End", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    CarouselAlignment EF5;

    public CarouselAlignment() {
        throw null;
    }

    public static CarouselAlignment valueOf(String str) {
        return (CarouselAlignment) Enum.valueOf(CarouselAlignment.class, str);
    }

    public static CarouselAlignment[] values() {
        return (CarouselAlignment[]) f36137b.clone();
    }
}
