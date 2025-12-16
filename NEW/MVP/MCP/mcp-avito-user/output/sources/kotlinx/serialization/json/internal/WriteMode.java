package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WriteMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WriteMode {

    /* renamed from: d, reason: collision with root package name */
    public static final WriteMode f413034d;

    /* renamed from: e, reason: collision with root package name */
    public static final WriteMode f413035e;

    /* renamed from: f, reason: collision with root package name */
    public static final WriteMode f413036f;

    /* renamed from: g, reason: collision with root package name */
    public static final WriteMode f413037g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ WriteMode[] f413038h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f413039i;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public final char f413040b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public final char f413041c;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        f413034d = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        f413035e = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        f413036f = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        f413037g = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        f413038h = writeModeArr;
        f413039i = kotlin.enums.c.a(writeModeArr);
    }

    public WriteMode(String str, int i12, char c12, char c13) {
        this.f413040b = c12;
        this.f413041c = c13;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f413038h.clone();
    }
}
