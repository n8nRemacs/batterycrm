package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: MessengerFileErrorEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerFileErrorEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FileType", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerFileErrorEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186217b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerFileErrorEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerFileErrorEvent$FileType;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileType {

        /* renamed from: c, reason: collision with root package name */
        public static final FileType f186218c;

        /* renamed from: d, reason: collision with root package name */
        public static final FileType f186219d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FileType[] f186220e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f186221f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f186222b;

        static {
            FileType fileType = new FileType("IMAGE", 0, "image");
            FileType fileType2 = new FileType("VIDEO", 1, "video");
            f186218c = fileType2;
            FileType fileType3 = new FileType("FILE", 2, "file");
            f186219d = fileType3;
            FileType[] fileTypeArr = {fileType, fileType2, fileType3};
            f186220e = fileTypeArr;
            f186221f = kotlin.enums.c.a(fileTypeArr);
        }

        public FileType(String str, int i12, String str2) {
            this.f186222b = str2;
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) f186220e.clone();
        }
    }

    public MessengerFileErrorEvent(@Y61.k String str, @Y61.l Long l12, @Y61.l String str2, @Y61.l FileType fileType) {
        this.f186217b = new ParametrizedClickStreamEvent(14545, 0, C35755b0.c(P0.g(new kotlin.Q("chatid", str), new kotlin.Q("size", l12), new kotlin.Q("file_extension", str2), new kotlin.Q("file_type", fileType.f186222b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f186217b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186217b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f186217b.f90248c;
    }
}
