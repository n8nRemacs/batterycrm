package com.avito.android.lib.beduin_v2.component.slider;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SliderStyleWrapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/slider/SliderStyleWrapper;", "", "StyleType", "_design-modules_beduin-v2_renderer_component_slider"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SliderStyleWrapper {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final StyleType f175897a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SliderStyleWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/slider/SliderStyleWrapper$StyleType;", "", "_design-modules_beduin-v2_renderer_component_slider"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StyleType {

        /* renamed from: b, reason: collision with root package name */
        public static final StyleType f175898b;

        /* renamed from: c, reason: collision with root package name */
        public static final StyleType f175899c;

        /* renamed from: d, reason: collision with root package name */
        public static final StyleType f175900d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ StyleType[] f175901e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f175902f;

        static {
            StyleType styleType = new StyleType("DEFAULT", 0);
            f175898b = styleType;
            StyleType styleType2 = new StyleType("OVERLAY", 1);
            f175899c = styleType2;
            StyleType styleType3 = new StyleType("INVERSE", 2);
            f175900d = styleType3;
            StyleType[] styleTypeArr = {styleType, styleType2, styleType3};
            f175901e = styleTypeArr;
            f175902f = kotlin.enums.c.a(styleTypeArr);
        }

        public StyleType() {
            throw null;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) f175901e.clone();
        }
    }

    /* compiled from: SliderStyleWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StyleType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StyleType styleType = StyleType.f175898b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StyleType styleType2 = StyleType.f175898b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SliderStyleWrapper(@k StyleType styleType) {
        this.f175897a = styleType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SliderStyleWrapper) && this.f175897a == ((SliderStyleWrapper) obj).f175897a;
    }

    public final int hashCode() {
        return this.f175897a.hashCode();
    }

    @k
    public final String toString() {
        return "SliderStyleWrapper(styleType=" + this.f175897a + ')';
    }
}
