package com.avito.android.virtual_deal_room_invite.invite.model;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CounterColor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/model/CounterColor;", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CounterColor {

    /* renamed from: c, reason: collision with root package name */
    public static final CounterColor f327036c;

    /* renamed from: d, reason: collision with root package name */
    public static final CounterColor f327037d;

    /* renamed from: e, reason: collision with root package name */
    public static final CounterColor f327038e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CounterColor[] f327039f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f327040g;

    /* renamed from: b, reason: collision with root package name */
    public final int f327041b;

    static {
        CounterColor counterColor = new CounterColor("Black", 0, R.attr.gray54);
        f327036c = counterColor;
        CounterColor counterColor2 = new CounterColor("Orange", 1, R.attr.orange700);
        f327037d = counterColor2;
        CounterColor counterColor3 = new CounterColor("Red", 2, R.attr.red600);
        f327038e = counterColor3;
        CounterColor[] counterColorArr = {counterColor, counterColor2, counterColor3};
        f327039f = counterColorArr;
        f327040g = c.a(counterColorArr);
    }

    public CounterColor(@InterfaceC42150f String str, int i12, int i13) {
        this.f327041b = i13;
    }

    public static CounterColor valueOf(String str) {
        return (CounterColor) Enum.valueOf(CounterColor.class, str);
    }

    public static CounterColor[] values() {
        return (CounterColor[]) f327039f.clone();
    }
}
