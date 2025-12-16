package com.avito.android.favorite;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite/FavoriteModel;", "", "Status", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FavoriteModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/FavoriteModel$Status;", "", "_avito-discouraged_persistence_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f155162b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f155163c;

        static {
            Status[] statusArr = {new Status("ACTIVE", 0), new Status("BLOCKED", 1), new Status("REJECTED", 2), new Status("REMOVED", 3), new Status("INACTIVE", 4), new Status("CLOSED", 5), new Status("EXPIRED", 6), new Status("DELETED", 7)};
            f155162b = statusArr;
            f155163c = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f155162b.clone();
        }
    }

    public FavoriteModel(String str, String str2, String str3, String str4, String str5, String str6, long j12, boolean z12, Image image, String str7, Integer num, String str8, String str9, DeepLink deepLink, boolean z13, Status status, String str10, String str11, String str12, boolean z14, String str13, boolean z15, boolean z16, String str14, DeepLink deepLink2, int i12, C42822w c42822w) {
    }
}
