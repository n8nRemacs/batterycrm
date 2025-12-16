package ru.mts.biometry.sdk;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/mts/biometry/sdk/PassportValidationScreenDesign;", "", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PassportValidationScreenDesign {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f436371b;

    /* renamed from: c, reason: collision with root package name */
    public static final PassportValidationScreenDesign f436372c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PassportValidationScreenDesign[] f436373d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f436374e;

    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/PassportValidationScreenDesign$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        PassportValidationScreenDesign passportValidationScreenDesign = new PassportValidationScreenDesign("INPUT", 0);
        f436372c = passportValidationScreenDesign;
        PassportValidationScreenDesign[] passportValidationScreenDesignArr = {passportValidationScreenDesign, new PassportValidationScreenDesign("FLAT", 1)};
        f436373d = passportValidationScreenDesignArr;
        f436374e = c.a(passportValidationScreenDesignArr);
        f436371b = new a(null);
    }

    public PassportValidationScreenDesign() {
        throw null;
    }

    public static PassportValidationScreenDesign valueOf(String str) {
        return (PassportValidationScreenDesign) Enum.valueOf(PassportValidationScreenDesign.class, str);
    }

    public static PassportValidationScreenDesign[] values() {
        return (PassportValidationScreenDesign[]) f436373d.clone();
    }
}
