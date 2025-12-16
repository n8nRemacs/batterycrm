package com.avito.android.code_check.phone_list.adapter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneListItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/LeftIconType;", "", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LeftIconType {

    /* renamed from: b, reason: collision with root package name */
    public static final LeftIconType f118919b;

    /* renamed from: c, reason: collision with root package name */
    public static final LeftIconType f118920c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LeftIconType[] f118921d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f118922e;

    static {
        LeftIconType leftIconType = new LeftIconType("WARNING", 0);
        f118919b = leftIconType;
        LeftIconType leftIconType2 = new LeftIconType("PLUS", 1);
        f118920c = leftIconType2;
        LeftIconType[] leftIconTypeArr = {leftIconType, leftIconType2};
        f118921d = leftIconTypeArr;
        f118922e = c.a(leftIconTypeArr);
    }

    public LeftIconType() {
        throw null;
    }

    public static LeftIconType valueOf(String str) {
        return (LeftIconType) Enum.valueOf(LeftIconType.class, str);
    }

    public static LeftIconType[] values() {
        return (LeftIconType[]) f118921d.clone();
    }
}
