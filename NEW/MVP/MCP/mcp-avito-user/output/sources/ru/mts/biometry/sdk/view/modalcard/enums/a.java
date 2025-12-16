package ru.mts.biometry.sdk.view.modalcard.enums;

import com.avito.android.R;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f436604c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f436605d;

    /* renamed from: b, reason: collision with root package name */
    public final int f436606b;

    static {
        a aVar = new a("SUCCESS", 0, R.attr.sdkBioModalIcSuccess);
        a aVar2 = new a("INFO", 1, R.attr.sdkBioModalIcInfo);
        a aVar3 = new a("ERROR", 2, R.attr.sdkBioModalIcError);
        f436604c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3, new a("WARNING", 3, R.attr.sdkBioModalIcWarning)};
        f436605d = aVarArr;
        c.a(aVarArr);
    }

    public a(String str, int i12, int i13) {
        this.f436606b = i13;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f436605d.clone();
    }
}
