package com.avito.android.tariff_lf_constructor.configure.remote.model.level;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ConfigureLevelFeature.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature;", "", "", "title", "Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature$IconType;", "iconType", "<init>", "(Ljava/lang/String;Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature$IconType;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature$IconType;", "getIconType", "()Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature$IconType;", "IconType", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfigureLevelFeature {

    @c("iconType")
    @k
    private final IconType iconType;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfigureLevelFeature.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/remote/model/level/ConfigureLevelFeature$IconType;", "", "(Ljava/lang/String;I)V", "CHECK", "PLUS", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {

        @c("check")
        public static final IconType CHECK;

        @c("plus")
        public static final IconType PLUS;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ IconType[] f300020b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f300021c;

        static {
            IconType iconType = new IconType("CHECK", 0);
            CHECK = iconType;
            IconType iconType2 = new IconType("PLUS", 1);
            PLUS = iconType2;
            IconType[] iconTypeArr = {iconType, iconType2};
            f300020b = iconTypeArr;
            f300021c = kotlin.enums.c.a(iconTypeArr);
        }

        private IconType(String str, int i12) {
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) f300020b.clone();
        }
    }

    public ConfigureLevelFeature(@k String str, @k IconType iconType) {
        this.title = str;
        this.iconType = iconType;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
