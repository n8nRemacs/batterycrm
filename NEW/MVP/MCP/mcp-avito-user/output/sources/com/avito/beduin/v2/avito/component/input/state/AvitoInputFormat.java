package com.avito.beduin.v2.avito.component.input.state;

import com.avito.android.remote.model.category_parameters.NumericParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoInputState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputFormat;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AvitoInputFormat {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f334457c;

    /* renamed from: d, reason: collision with root package name */
    public static final AvitoInputFormat f334458d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AvitoInputFormat[] f334459e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334460f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334461b;

    /* compiled from: AvitoInputState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputFormat$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        AvitoInputFormat avitoInputFormat = new AvitoInputFormat("Text", 0, "text");
        f334458d = avitoInputFormat;
        AvitoInputFormat[] avitoInputFormatArr = {avitoInputFormat, new AvitoInputFormat("Numeric", 1, NumericParameter.TYPE), new AvitoInputFormat("PhoneNumber", 2, "phoneNumber"), new AvitoInputFormat("EmailAddress", 3, "emailAddress"), new AvitoInputFormat("DecimalNumeric", 4, "decimalNumeric"), new AvitoInputFormat("Password", 5, "password"), new AvitoInputFormat("Passport", 6, "passport"), new AvitoInputFormat("Date", 7, "date"), new AvitoInputFormat("Roubles", 8, "roubles")};
        f334459e = avitoInputFormatArr;
        f334460f = kotlin.enums.c.a(avitoInputFormatArr);
        f334457c = new a(null);
    }

    public AvitoInputFormat(String str, int i12, String str2) {
        this.f334461b = str2;
    }

    public static AvitoInputFormat valueOf(String str) {
        return (AvitoInputFormat) Enum.valueOf(AvitoInputFormat.class, str);
    }

    public static AvitoInputFormat[] values() {
        return (AvitoInputFormat[]) f334459e.clone();
    }
}
