package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/g;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RegexOption implements InterfaceC43050g {

    /* renamed from: c, reason: collision with root package name */
    public static final RegexOption f410582c;

    /* renamed from: d, reason: collision with root package name */
    public static final RegexOption f410583d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RegexOption[] f410584e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410585f;

    /* renamed from: b, reason: collision with root package name */
    public final int f410586b;

    static {
        RegexOption regexOption = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
        f410582c = regexOption;
        RegexOption regexOption2 = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
        f410583d = regexOption2;
        RegexOption[] regexOptionArr = {regexOption, regexOption2, new RegexOption("LITERAL", 2, 16, 0, 2, null), new RegexOption("UNIX_LINES", 3, 1, 0, 2, null), new RegexOption("COMMENTS", 4, 4, 0, 2, null), new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null), new RegexOption("CANON_EQ", 6, 128, 0, 2, null)};
        f410584e = regexOptionArr;
        f410585f = kotlin.enums.c.a(regexOptionArr);
    }

    public RegexOption() {
        throw null;
    }

    public RegexOption(String str, int i12, int i13, int i14, int i15, C42822w c42822w) {
        this.f410586b = i13;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f410584e.clone();
    }

    @Override // kotlin.text.InterfaceC43050g
    /* renamed from: getValue, reason: from getter */
    public final int getF410586b() {
        return this.f410586b;
    }
}
