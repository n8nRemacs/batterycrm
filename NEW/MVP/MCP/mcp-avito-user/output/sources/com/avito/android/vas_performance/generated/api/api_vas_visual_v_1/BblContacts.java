package com.avito.android.vas_performance.generated.api.api_vas_visual_v_1;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiVasVisualV1Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts;", "", "", "count", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$Icon;", "icon", "", "progress", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$ProgressColor;", "progressColor", "<init>", "(JLcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$Icon;DLcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$ProgressColor;)V", "J", "a", "()J", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$Icon;", "b", "()Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$Icon;", "D", "c", "()D", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$ProgressColor;", "d", "()Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$ProgressColor;", "Icon", "ProgressColor", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BblContacts {

    @c("count")
    private final long count;

    @c("icon")
    @l
    private final Icon icon;

    @c("progress")
    private final double progress;

    @c("progressColor")
    @l
    private final ProgressColor progressColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiVasVisualV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$Icon;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Infinity20", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        @c("infinity20")
        public static final Icon Infinity20;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f320211b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f320212c;

        static {
            Icon icon = new Icon("Infinity20", 0, "infinity20");
            Infinity20 = icon;
            Icon[] iconArr = {icon};
            f320211b = iconArr;
            f320212c = kotlin.enums.c.a(iconArr);
        }

        private Icon(String str, int i12, String str2) {
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f320211b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiVasVisualV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/BblContacts$ProgressColor;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Orange", "Green", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProgressColor {

        @c("green")
        public static final ProgressColor Green;

        @c("orange")
        public static final ProgressColor Orange;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ProgressColor[] f320213b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f320214c;

        static {
            ProgressColor progressColor = new ProgressColor("Orange", 0, "orange");
            Orange = progressColor;
            ProgressColor progressColor2 = new ProgressColor("Green", 1, "green");
            Green = progressColor2;
            ProgressColor[] progressColorArr = {progressColor, progressColor2};
            f320213b = progressColorArr;
            f320214c = kotlin.enums.c.a(progressColorArr);
        }

        private ProgressColor(String str, int i12, String str2) {
        }

        public static ProgressColor valueOf(String str) {
            return (ProgressColor) Enum.valueOf(ProgressColor.class, str);
        }

        public static ProgressColor[] values() {
            return (ProgressColor[]) f320213b.clone();
        }
    }

    public BblContacts(long j12, @l Icon icon, double d12, @l ProgressColor progressColor) {
        this.count = j12;
        this.icon = icon;
        this.progress = d12;
        this.progressColor = progressColor;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ProgressColor getProgressColor() {
        return this.progressColor;
    }
}
