package com.avito.android.remote.config;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: AppConfig.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/config/AppConfig;", "", "UpdateSource", "UpdateSourceType", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AppConfig {

    /* renamed from: a, reason: collision with root package name */
    public final long f253322a;

    /* renamed from: b, reason: collision with root package name */
    public final long f253323b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f253324c;

    /* renamed from: d, reason: collision with root package name */
    public final int f253325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UpdateSource f253326e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f253327f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UpdateSourceType f253328g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f253329h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f253330i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<Long> f253331j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<Long> f253332k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppConfig.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/config/AppConfig$UpdateSource;", "", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSource {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateSource f253333c;

        /* renamed from: d, reason: collision with root package name */
        public static final UpdateSource f253334d;

        /* renamed from: e, reason: collision with root package name */
        public static final UpdateSource f253335e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ UpdateSource[] f253336f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f253337g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f253338b;

        static {
            UpdateSource updateSource = new UpdateSource("OFFICIAL", 0, "OFFICIAL");
            f253333c = updateSource;
            UpdateSource updateSource2 = new UpdateSource("CUSTOM", 1, "CUSTOM");
            f253334d = updateSource2;
            UpdateSource updateSource3 = new UpdateSource("NONE", 2, "NONE");
            f253335e = updateSource3;
            UpdateSource[] updateSourceArr = {updateSource, updateSource2, updateSource3};
            f253336f = updateSourceArr;
            f253337g = c.a(updateSourceArr);
        }

        public UpdateSource(String str, int i12, String str2) {
            this.f253338b = str2;
        }

        public static UpdateSource valueOf(String str) {
            return (UpdateSource) Enum.valueOf(UpdateSource.class, str);
        }

        public static UpdateSource[] values() {
            return (UpdateSource[]) f253336f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppConfig.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/config/AppConfig$UpdateSourceType;", "", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSourceType {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateSourceType f253339c;

        /* renamed from: d, reason: collision with root package name */
        public static final UpdateSourceType f253340d;

        /* renamed from: e, reason: collision with root package name */
        public static final UpdateSourceType f253341e;

        /* renamed from: f, reason: collision with root package name */
        public static final UpdateSourceType f253342f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ UpdateSourceType[] f253343g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f253344h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f253345b;

        static {
            UpdateSourceType updateSourceType = new UpdateSourceType("OFFICIAL", 0, "OFFICIAL");
            f253339c = updateSourceType;
            UpdateSourceType updateSourceType2 = new UpdateSourceType("CUSTOM", 1, "CUSTOM");
            f253340d = updateSourceType2;
            UpdateSourceType updateSourceType3 = new UpdateSourceType("SELF_UPDATE", 2, "SELF_UPDATE");
            f253341e = updateSourceType3;
            UpdateSourceType updateSourceType4 = new UpdateSourceType("NONE", 3, "NONE");
            f253342f = updateSourceType4;
            UpdateSourceType[] updateSourceTypeArr = {updateSourceType, updateSourceType2, updateSourceType3, updateSourceType4};
            f253343g = updateSourceTypeArr;
            f253344h = c.a(updateSourceTypeArr);
        }

        public UpdateSourceType(String str, int i12, String str2) {
            this.f253345b = str2;
        }

        public static UpdateSourceType valueOf(String str) {
            return (UpdateSourceType) Enum.valueOf(UpdateSourceType.class, str);
        }

        public static UpdateSourceType[] values() {
            return (UpdateSourceType[]) f253343g.clone();
        }
    }

    public AppConfig(long j12, long j13, @l Long l12, int i12, @k UpdateSource updateSource, @l String str, @l UpdateSourceType updateSourceType, @l String str2, @l String str3, @l List<Long> list, @l List<Long> list2) {
        this.f253322a = j12;
        this.f253323b = j13;
        this.f253324c = l12;
        this.f253325d = i12;
        this.f253326e = updateSource;
        this.f253327f = str;
        this.f253328g = updateSourceType;
        this.f253329h = str2;
        this.f253330i = str3;
        this.f253331j = list;
        this.f253332k = list2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return this.f253322a == appConfig.f253322a && this.f253323b == appConfig.f253323b && L.f(this.f253324c, appConfig.f253324c) && this.f253325d == appConfig.f253325d && this.f253326e == appConfig.f253326e && L.f(this.f253327f, appConfig.f253327f) && this.f253328g == appConfig.f253328g && L.f(this.f253329h, appConfig.f253329h) && L.f(this.f253330i, appConfig.f253330i) && L.f(this.f253331j, appConfig.f253331j) && L.f(this.f253332k, appConfig.f253332k);
    }

    public final int hashCode() {
        int iG2 = r.g(Long.hashCode(this.f253322a) * 31, 31, this.f253323b);
        Long l12 = this.f253324c;
        int iHashCode = (this.f253326e.hashCode() + r.e(this.f253325d, (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31)) * 31;
        String str = this.f253327f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UpdateSourceType updateSourceType = this.f253328g;
        int iHashCode3 = (iHashCode2 + (updateSourceType == null ? 0 : updateSourceType.hashCode())) * 31;
        String str2 = this.f253329h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f253330i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Long> list = this.f253331j;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.f253332k;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppConfig(versionMin=");
        sb2.append(this.f253322a);
        sb2.append(", versionMax=");
        sb2.append(this.f253323b);
        sb2.append(", versionLatest=");
        sb2.append(this.f253324c);
        sb2.append(", platformVersion=");
        sb2.append(this.f253325d);
        sb2.append(", updateSource=");
        sb2.append(this.f253326e);
        sb2.append(", updateSourceUrl=");
        sb2.append(this.f253327f);
        sb2.append(", updateSourceType=");
        sb2.append(this.f253328g);
        sb2.append(", updateSourceTypeUrl=");
        sb2.append(this.f253329h);
        sb2.append(", updateApkSourceLink=");
        sb2.append(this.f253330i);
        sb2.append(", excludedForceUpdateVersions=");
        sb2.append(this.f253331j);
        sb2.append(", includedHardUpdateVersions=");
        return H.p(sb2, this.f253332k, ')');
    }
}
