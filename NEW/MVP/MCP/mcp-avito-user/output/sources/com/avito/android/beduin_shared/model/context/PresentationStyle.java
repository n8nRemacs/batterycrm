package com.avito.android.beduin_shared.model.context;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinViewConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/context/PresentationStyle;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PresentationStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final PresentationStyle f105307b;

    /* renamed from: c, reason: collision with root package name */
    public static final PresentationStyle f105308c;

    /* renamed from: d, reason: collision with root package name */
    public static final PresentationStyle f105309d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PresentationStyle[] f105310e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f105311f;

    static {
        PresentationStyle presentationStyle = new PresentationStyle("DEFAULT", 0);
        f105307b = presentationStyle;
        PresentationStyle presentationStyle2 = new PresentationStyle("PUSH_INIT", 1);
        f105308c = presentationStyle2;
        PresentationStyle presentationStyle3 = new PresentationStyle("PUSH_RECREATED", 2);
        f105309d = presentationStyle3;
        PresentationStyle[] presentationStyleArr = {presentationStyle, presentationStyle2, presentationStyle3};
        f105310e = presentationStyleArr;
        f105311f = c.a(presentationStyleArr);
    }

    public PresentationStyle() {
        throw null;
    }

    public static PresentationStyle valueOf(String str) {
        return (PresentationStyle) Enum.valueOf(PresentationStyle.class, str);
    }

    public static PresentationStyle[] values() {
        return (PresentationStyle[]) f105310e.clone();
    }
}
