package com.avito.android.comfortable_deal.repository.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Stage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/repository/model/Stage;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Stage {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Stage[] f122625b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f122626c;

    static {
        Stage[] stageArr = {new Stage()};
        f122625b = stageArr;
        f122626c = c.a(stageArr);
    }

    public static Stage valueOf(String str) {
        return (Stage) Enum.valueOf(Stage.class, str);
    }

    public static Stage[] values() {
        return (Stage[]) f122625b.clone();
    }
}
