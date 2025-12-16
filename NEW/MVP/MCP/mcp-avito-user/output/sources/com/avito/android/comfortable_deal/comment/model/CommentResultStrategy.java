package com.avito.android.comfortable_deal.comment.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommentResult.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/model/CommentResultStrategy;", "", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommentResultStrategy implements Parcelable {

    @k
    public static final Parcelable.Creator<CommentResultStrategy> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final CommentResultStrategy f120539b;

    /* renamed from: c, reason: collision with root package name */
    public static final CommentResultStrategy f120540c;

    /* renamed from: d, reason: collision with root package name */
    public static final CommentResultStrategy f120541d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CommentResultStrategy[] f120542e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120543f;

    static {
        CommentResultStrategy commentResultStrategy = new CommentResultStrategy("Success", 0);
        f120539b = commentResultStrategy;
        CommentResultStrategy commentResultStrategy2 = new CommentResultStrategy("Save", 1);
        f120540c = commentResultStrategy2;
        CommentResultStrategy commentResultStrategy3 = new CommentResultStrategy("Exit", 2);
        f120541d = commentResultStrategy3;
        CommentResultStrategy[] commentResultStrategyArr = {commentResultStrategy, commentResultStrategy2, commentResultStrategy3};
        f120542e = commentResultStrategyArr;
        f120543f = c.a(commentResultStrategyArr);
        CREATOR = new Parcelable.Creator<CommentResultStrategy>() { // from class: com.avito.android.comfortable_deal.comment.model.CommentResultStrategy.a
            @Override // android.os.Parcelable.Creator
            public final CommentResultStrategy createFromParcel(Parcel parcel) {
                return CommentResultStrategy.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommentResultStrategy[] newArray(int i12) {
                return new CommentResultStrategy[i12];
            }
        };
    }

    public CommentResultStrategy() {
        throw null;
    }

    public static CommentResultStrategy valueOf(String str) {
        return (CommentResultStrategy) Enum.valueOf(CommentResultStrategy.class, str);
    }

    public static CommentResultStrategy[] values() {
        return (CommentResultStrategy[]) f120542e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
