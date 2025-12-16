package com.avito.android.serp.adapter.witcher;

import com.avito.android.R;
import j.InterfaceC42150f;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WitcherSelectionType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WitcherSelectionType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WitcherSelectionType {

    /* renamed from: d, reason: collision with root package name */
    public static final WitcherSelectionType f273835d;

    /* renamed from: e, reason: collision with root package name */
    public static final WitcherSelectionType f273836e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ WitcherSelectionType[] f273837f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f273838g;

    /* renamed from: b, reason: collision with root package name */
    public final int f273839b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f273840c;

    static {
        WitcherSelectionType witcherSelectionType = new WitcherSelectionType("SCROLLABLE_CLICKABLE_HEADER", 0, 0, null, 3, null);
        f273835d = witcherSelectionType;
        WitcherSelectionType witcherSelectionType2 = new WitcherSelectionType("TRANSPARENT", 1, R.attr.transparentWhite, Integer.valueOf(R.dimen.witcher_title_padding_start_transparent_style));
        f273836e = witcherSelectionType2;
        WitcherSelectionType[] witcherSelectionTypeArr = {witcherSelectionType, witcherSelectionType2};
        f273837f = witcherSelectionTypeArr;
        f273838g = kotlin.enums.c.a(witcherSelectionTypeArr);
    }

    public WitcherSelectionType(@InterfaceC42150f String str, @InterfaceC42161q int i12, int i13, Integer num) {
        this.f273839b = i13;
        this.f273840c = num;
    }

    public static WitcherSelectionType valueOf(String str) {
        return (WitcherSelectionType) Enum.valueOf(WitcherSelectionType.class, str);
    }

    public static WitcherSelectionType[] values() {
        return (WitcherSelectionType[]) f273837f.clone();
    }

    public /* synthetic */ WitcherSelectionType(String str, int i12, int i13, Integer num, int i14, C42822w c42822w) {
        this(str, i12, (i14 & 1) != 0 ? R.attr.orange50 : i13, (i14 & 2) != 0 ? null : num);
    }
}
