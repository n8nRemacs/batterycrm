package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Json.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DecodeSequenceMode {

    /* renamed from: b, reason: collision with root package name */
    public static final DecodeSequenceMode f412943b;

    /* renamed from: c, reason: collision with root package name */
    public static final DecodeSequenceMode f412944c;

    /* renamed from: d, reason: collision with root package name */
    public static final DecodeSequenceMode f412945d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DecodeSequenceMode[] f412946e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412947f;

    static {
        DecodeSequenceMode decodeSequenceMode = new DecodeSequenceMode("WHITESPACE_SEPARATED", 0);
        f412943b = decodeSequenceMode;
        DecodeSequenceMode decodeSequenceMode2 = new DecodeSequenceMode("ARRAY_WRAPPED", 1);
        f412944c = decodeSequenceMode2;
        DecodeSequenceMode decodeSequenceMode3 = new DecodeSequenceMode("AUTO_DETECT", 2);
        f412945d = decodeSequenceMode3;
        DecodeSequenceMode[] decodeSequenceModeArr = {decodeSequenceMode, decodeSequenceMode2, decodeSequenceMode3};
        f412946e = decodeSequenceModeArr;
        f412947f = kotlin.enums.c.a(decodeSequenceModeArr);
    }

    public DecodeSequenceMode() {
        throw null;
    }

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) f412946e.clone();
    }
}
