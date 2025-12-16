package com.avito.beduin.v2.component.common;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/HorizontalAlignment;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HorizontalAlignment {

    /* renamed from: b, reason: collision with root package name */
    public static final HorizontalAlignment f335656b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ HorizontalAlignment[] f335657c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f335658d;

    static {
        HorizontalAlignment horizontalAlignment = new HorizontalAlignment("Start", 0);
        f335656b = horizontalAlignment;
        HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, new HorizontalAlignment("CenterHorizontally", 1), new HorizontalAlignment("End", 2)};
        f335657c = horizontalAlignmentArr;
        f335658d = c.a(horizontalAlignmentArr);
    }

    public HorizontalAlignment() {
        throw null;
    }

    public static HorizontalAlignment valueOf(String str) {
        return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
    }

    public static HorizontalAlignment[] values() {
        return (HorizontalAlignment[]) f335657c.clone();
    }
}
