package sberid.sdk.global.network.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/global/network/models/MimeType;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MimeType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MimeType[] f437768b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f437769c;

    static {
        MimeType[] mimeTypeArr = {new MimeType()};
        f437768b = mimeTypeArr;
        f437769c = c.a(mimeTypeArr);
    }

    public static MimeType valueOf(String str) {
        return (MimeType) Enum.valueOf(MimeType.class, str);
    }

    public static MimeType[] values() {
        return (MimeType[]) f437768b.clone();
    }
}
