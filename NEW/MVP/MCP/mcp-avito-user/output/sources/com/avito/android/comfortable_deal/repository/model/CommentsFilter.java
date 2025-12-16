package com.avito.android.comfortable_deal.repository.model;

import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommentsFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/repository/model/CommentsFilter;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommentsFilter {

    /* renamed from: c, reason: collision with root package name */
    public static final CommentsFilter f122615c;

    /* renamed from: d, reason: collision with root package name */
    public static final CommentsFilter f122616d;

    /* renamed from: e, reason: collision with root package name */
    public static final CommentsFilter f122617e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CommentsFilter[] f122618f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f122619g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f122620b;

    static {
        CommentsFilter commentsFilter = new CommentsFilter("All", 0, null);
        f122615c = commentsFilter;
        CommentsFilter commentsFilter2 = new CommentsFilter("Notes", 1, "notes");
        f122616d = commentsFilter2;
        CommentsFilter commentsFilter3 = new CommentsFilter("History", 2, "history");
        f122617e = commentsFilter3;
        CommentsFilter[] commentsFilterArr = {commentsFilter, commentsFilter2, commentsFilter3};
        f122618f = commentsFilterArr;
        f122619g = c.a(commentsFilterArr);
    }

    public CommentsFilter(String str, int i12, String str2) {
        this.f122620b = str2;
    }

    public static CommentsFilter valueOf(String str) {
        return (CommentsFilter) Enum.valueOf(CommentsFilter.class, str);
    }

    public static CommentsFilter[] values() {
        return (CommentsFilter[]) f122618f.clone();
    }
}
