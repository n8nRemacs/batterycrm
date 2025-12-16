package com.avito.android.recall_me.presentation.items.single_input;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SingleInputItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/SingleInputType;", "", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SingleInputType {

    /* renamed from: b, reason: collision with root package name */
    public static final SingleInputType f251951b;

    /* renamed from: c, reason: collision with root package name */
    public static final SingleInputType f251952c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SingleInputType[] f251953d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f251954e;

    static {
        SingleInputType singleInputType = new SingleInputType("NAME", 0);
        f251951b = singleInputType;
        SingleInputType singleInputType2 = new SingleInputType("PHONE", 1);
        f251952c = singleInputType2;
        SingleInputType[] singleInputTypeArr = {singleInputType, singleInputType2};
        f251953d = singleInputTypeArr;
        f251954e = kotlin.enums.c.a(singleInputTypeArr);
    }

    public SingleInputType() {
        throw null;
    }

    public static SingleInputType valueOf(String str) {
        return (SingleInputType) Enum.valueOf(SingleInputType.class, str);
    }

    public static SingleInputType[] values() {
        return (SingleInputType[]) f251953d.clone();
    }
}
