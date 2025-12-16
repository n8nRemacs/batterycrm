package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.PhotoParameter;
import kotlin.Metadata;

/* compiled from: PhotoUploadObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver;", "", "b", "UploadStatus", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PhotoUploadObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoUploadObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver$UploadStatus;", "", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final UploadStatus f231961b;

        /* renamed from: c, reason: collision with root package name */
        public static final UploadStatus f231962c;

        /* renamed from: d, reason: collision with root package name */
        public static final UploadStatus f231963d;

        /* renamed from: e, reason: collision with root package name */
        public static final UploadStatus f231964e;

        /* renamed from: f, reason: collision with root package name */
        public static final UploadStatus f231965f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ UploadStatus[] f231966g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231967h;

        static {
            UploadStatus uploadStatus = new UploadStatus("UPLOADED", 0);
            f231961b = uploadStatus;
            UploadStatus uploadStatus2 = new UploadStatus("PENDING", 1);
            f231962c = uploadStatus2;
            UploadStatus uploadStatus3 = new UploadStatus("SYNCED", 2);
            f231963d = uploadStatus3;
            UploadStatus uploadStatus4 = new UploadStatus("UNSYNCED", 3);
            f231964e = uploadStatus4;
            UploadStatus uploadStatus5 = new UploadStatus("ERROR", 4);
            f231965f = uploadStatus5;
            UploadStatus[] uploadStatusArr = {uploadStatus, uploadStatus2, uploadStatus3, uploadStatus4, uploadStatus5};
            f231966g = uploadStatusArr;
            f231967h = kotlin.enums.c.a(uploadStatusArr);
        }

        public UploadStatus() {
            throw null;
        }

        public static UploadStatus valueOf(String str) {
            return (UploadStatus) Enum.valueOf(UploadStatus.class, str);
        }

        public static UploadStatus[] values() {
            return (UploadStatus[]) f231966g.clone();
        }
    }

    /* compiled from: PhotoUploadObserver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PhotoUploadObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PhotoUploadObserver$b;", "", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.l
        PhotoParameter a();
    }

    @Y61.k
    com.jakewharton.rxrelay3.c a(@Y61.k b bVar, boolean z12);
}
