package com.avito.beduin.v2.component.common;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/Alignments;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Alignments {

    /* renamed from: b, reason: collision with root package name */
    public static final Alignments f335642b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Alignments[] f335643c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f335644d;

    static {
        Alignments alignments = new Alignments("TopStart", 0);
        Alignments alignments2 = new Alignments("TopCenter", 1);
        f335642b = alignments2;
        Alignments[] alignmentsArr = {alignments, alignments2, new Alignments("TopEnd", 2), new Alignments("CenterStart", 3), new Alignments("Center", 4), new Alignments("CenterEnd", 5), new Alignments("BottomStart", 6), new Alignments("BottomCenter", 7), new Alignments("BottomEnd", 8)};
        f335643c = alignmentsArr;
        f335644d = c.a(alignmentsArr);
    }

    public Alignments() {
        throw null;
    }

    public static Alignments valueOf(String str) {
        return (Alignments) Enum.valueOf(Alignments.class, str);
    }

    public static Alignments[] values() {
        return (Alignments[]) f335643c.clone();
    }
}
