package sberid.sdk.ui.models.root;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/ui/models/root/ELKRootTypes;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ELKRootTypes {

    /* renamed from: b, reason: collision with root package name */
    public static final ELKRootTypes f437784b;

    /* renamed from: c, reason: collision with root package name */
    public static final ELKRootTypes f437785c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ELKRootTypes[] f437786d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f437787e;

    static {
        ELKRootTypes eLKRootTypes = new ELKRootTypes("MAIN_SCREEN", 0);
        f437784b = eLKRootTypes;
        ELKRootTypes eLKRootTypes2 = new ELKRootTypes("NATIVE", 1);
        f437785c = eLKRootTypes2;
        ELKRootTypes[] eLKRootTypesArr = {eLKRootTypes, eLKRootTypes2};
        f437786d = eLKRootTypesArr;
        f437787e = c.a(eLKRootTypesArr);
    }

    public ELKRootTypes() {
        throw null;
    }

    public static ELKRootTypes valueOf(String str) {
        return (ELKRootTypes) Enum.valueOf(ELKRootTypes.class, str);
    }

    public static ELKRootTypes[] values() {
        return (ELKRootTypes[]) f437786d.clone();
    }
}
