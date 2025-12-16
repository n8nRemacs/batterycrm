package com.avito.beduin.v2.component.common;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/VerticalAlignment;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerticalAlignment {

    /* renamed from: b, reason: collision with root package name */
    public static final VerticalAlignment f335668b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ VerticalAlignment[] f335669c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f335670d;

    static {
        VerticalAlignment verticalAlignment = new VerticalAlignment("Top", 0);
        f335668b = verticalAlignment;
        VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, new VerticalAlignment("CenterVertically", 1), new VerticalAlignment("Bottom", 2)};
        f335669c = verticalAlignmentArr;
        f335670d = c.a(verticalAlignmentArr);
    }

    public VerticalAlignment() {
        throw null;
    }

    public static VerticalAlignment valueOf(String str) {
        return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
    }

    public static VerticalAlignment[] values() {
        return (VerticalAlignment[]) f335669c.clone();
    }
}
