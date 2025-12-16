package com.avito.android.analytics.clickstream.event;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseUploadErrorClickStreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/event/FirebaseUploadErrorClickStreamEventType;", "", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FirebaseUploadErrorClickStreamEventType {

    /* renamed from: c, reason: collision with root package name */
    public static final FirebaseUploadErrorClickStreamEventType f89784c;

    /* renamed from: d, reason: collision with root package name */
    public static final FirebaseUploadErrorClickStreamEventType f89785d;

    /* renamed from: e, reason: collision with root package name */
    public static final FirebaseUploadErrorClickStreamEventType f89786e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FirebaseUploadErrorClickStreamEventType[] f89787f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f89788g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f89789b;

    static {
        FirebaseUploadErrorClickStreamEventType firebaseUploadErrorClickStreamEventType = new FirebaseUploadErrorClickStreamEventType("UPLOAD_ERROR", 0, "upload_error");
        f89784c = firebaseUploadErrorClickStreamEventType;
        FirebaseUploadErrorClickStreamEventType firebaseUploadErrorClickStreamEventType2 = new FirebaseUploadErrorClickStreamEventType("UPLOAD_UNHANDLED_ERROR", 1, "upload_unhandled_error");
        f89785d = firebaseUploadErrorClickStreamEventType2;
        FirebaseUploadErrorClickStreamEventType firebaseUploadErrorClickStreamEventType3 = new FirebaseUploadErrorClickStreamEventType("IO_ERROR", 2, "io_error");
        f89786e = firebaseUploadErrorClickStreamEventType3;
        FirebaseUploadErrorClickStreamEventType[] firebaseUploadErrorClickStreamEventTypeArr = {firebaseUploadErrorClickStreamEventType, firebaseUploadErrorClickStreamEventType2, firebaseUploadErrorClickStreamEventType3};
        f89787f = firebaseUploadErrorClickStreamEventTypeArr;
        f89788g = c.a(firebaseUploadErrorClickStreamEventTypeArr);
    }

    public FirebaseUploadErrorClickStreamEventType(String str, int i12, String str2) {
        this.f89789b = str2;
    }

    public static FirebaseUploadErrorClickStreamEventType valueOf(String str) {
        return (FirebaseUploadErrorClickStreamEventType) Enum.valueOf(FirebaseUploadErrorClickStreamEventType.class, str);
    }

    public static FirebaseUploadErrorClickStreamEventType[] values() {
        return (FirebaseUploadErrorClickStreamEventType[]) f89787f.clone();
    }
}
