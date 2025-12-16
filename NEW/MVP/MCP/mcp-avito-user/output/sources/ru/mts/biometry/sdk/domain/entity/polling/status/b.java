package ru.mts.biometry.sdk.domain.entity.polling.status;

import kotlin.enums.c;
import ru.mts.biometry.api.entity.FlowStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f436394b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f436395c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f436396d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f436397e;

    static {
        b bVar = new b("Unknown", 0);
        b bVar2 = new b(FlowStatus.IN_PROGRESS, 1);
        b bVar3 = new b(FlowStatus.COLLECTING_APPLICANT_DATA, 2);
        b bVar4 = new b("IdentificationInProgress", 3);
        b bVar5 = new b("Success", 4);
        b bVar6 = new b("IdentificationSucceeded", 5);
        b bVar7 = new b("IdentificationFailed", 6);
        f436394b = bVar7;
        b bVar8 = new b("SystemError", 7);
        f436395c = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        f436396d = bVarArr;
        f436397e = c.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f436396d.clone();
    }
}
