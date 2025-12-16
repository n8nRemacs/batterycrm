package com.avito.android.ratings;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewReply.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/ReviewReplyStatus;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReviewReplyStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ReviewReplyStatus f250519b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReviewReplyStatus f250520c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReviewReplyStatus f250521d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ReviewReplyStatus[] f250522e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f250523f;

    static {
        ReviewReplyStatus reviewReplyStatus = new ReviewReplyStatus("MODERATION", 0);
        f250519b = reviewReplyStatus;
        ReviewReplyStatus reviewReplyStatus2 = new ReviewReplyStatus("ACTIVE", 1);
        f250520c = reviewReplyStatus2;
        ReviewReplyStatus reviewReplyStatus3 = new ReviewReplyStatus("DECLINED", 2);
        f250521d = reviewReplyStatus3;
        ReviewReplyStatus[] reviewReplyStatusArr = {reviewReplyStatus, reviewReplyStatus2, reviewReplyStatus3};
        f250522e = reviewReplyStatusArr;
        f250523f = c.a(reviewReplyStatusArr);
    }

    public ReviewReplyStatus() {
        throw null;
    }

    public static ReviewReplyStatus valueOf(String str) {
        return (ReviewReplyStatus) Enum.valueOf(ReviewReplyStatus.class, str);
    }

    public static ReviewReplyStatus[] values() {
        return (ReviewReplyStatus[]) f250522e.clone();
    }
}
