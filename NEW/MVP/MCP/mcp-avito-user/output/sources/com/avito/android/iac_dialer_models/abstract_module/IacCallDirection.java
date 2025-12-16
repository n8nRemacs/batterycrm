package com.avito.android.iac_dialer_models.abstract_module;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacCallDirection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "", "(Ljava/lang/String;I)V", "OUTGOING", "INCOMING", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacCallDirection {

    @c("outgoing")
    public static final IacCallDirection INCOMING;

    @c("incoming")
    public static final IacCallDirection OUTGOING;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ IacCallDirection[] f166829b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f166830c;

    static {
        IacCallDirection iacCallDirection = new IacCallDirection("OUTGOING", 0);
        OUTGOING = iacCallDirection;
        IacCallDirection iacCallDirection2 = new IacCallDirection("INCOMING", 1);
        INCOMING = iacCallDirection2;
        IacCallDirection[] iacCallDirectionArr = {iacCallDirection, iacCallDirection2};
        f166829b = iacCallDirectionArr;
        f166830c = kotlin.enums.c.a(iacCallDirectionArr);
    }

    private IacCallDirection(String str, int i12) {
    }

    public static IacCallDirection valueOf(String str) {
        return (IacCallDirection) Enum.valueOf(IacCallDirection.class, str);
    }

    public static IacCallDirection[] values() {
        return (IacCallDirection[]) f166829b.clone();
    }
}
