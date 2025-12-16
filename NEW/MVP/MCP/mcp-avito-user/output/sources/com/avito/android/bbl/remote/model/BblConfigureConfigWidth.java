package com.avito.android.bbl.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BblConfigureResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/remote/model/BblConfigureConfigWidth;", "", "(Ljava/lang/String;I)V", "HALF", "FULL", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BblConfigureConfigWidth {

    @c("full")
    public static final BblConfigureConfigWidth FULL;

    @c("half")
    public static final BblConfigureConfigWidth HALF;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BblConfigureConfigWidth[] f99089b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f99090c;

    static {
        BblConfigureConfigWidth bblConfigureConfigWidth = new BblConfigureConfigWidth("HALF", 0);
        HALF = bblConfigureConfigWidth;
        BblConfigureConfigWidth bblConfigureConfigWidth2 = new BblConfigureConfigWidth("FULL", 1);
        FULL = bblConfigureConfigWidth2;
        BblConfigureConfigWidth[] bblConfigureConfigWidthArr = {bblConfigureConfigWidth, bblConfigureConfigWidth2};
        f99089b = bblConfigureConfigWidthArr;
        f99090c = kotlin.enums.c.a(bblConfigureConfigWidthArr);
    }

    private BblConfigureConfigWidth(String str, int i12) {
    }

    public static BblConfigureConfigWidth valueOf(String str) {
        return (BblConfigureConfigWidth) Enum.valueOf(BblConfigureConfigWidth.class, str);
    }

    public static BblConfigureConfigWidth[] values() {
        return (BblConfigureConfigWidth[]) f99089b.clone();
    }
}
