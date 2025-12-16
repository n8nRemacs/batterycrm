package com.avito.beduin.v2.component.common;

import Y61.k;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/ScrollType;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollType {

    /* renamed from: c, reason: collision with root package name */
    public static final ScrollType f335663c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScrollType f335664d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ScrollType[] f335665e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f335666f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f335667b;

    static {
        ScrollType scrollType = new ScrollType("Manual", 0, "manual");
        f335663c = scrollType;
        ScrollType scrollType2 = new ScrollType("System", 1, ChannelContext.System.TYPE);
        f335664d = scrollType2;
        ScrollType[] scrollTypeArr = {scrollType, scrollType2};
        f335665e = scrollTypeArr;
        f335666f = c.a(scrollTypeArr);
    }

    public ScrollType(String str, int i12, String str2) {
        this.f335667b = str2;
    }

    public static ScrollType valueOf(String str) {
        return (ScrollType) Enum.valueOf(ScrollType.class, str);
    }

    public static ScrollType[] values() {
        return (ScrollType[]) f335665e.clone();
    }
}
