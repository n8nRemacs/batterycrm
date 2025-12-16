package kotlin.io.encoding;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Base64.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "a", "PaddingOption", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@e
/* loaded from: classes8.dex */
public class Base64 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42733c0
    public static final class PaddingOption {

        /* renamed from: b, reason: collision with root package name */
        public static final PaddingOption f406770b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ PaddingOption[] f406771c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f406772d;

        static {
            PaddingOption paddingOption = new PaddingOption("PRESENT", 0);
            f406770b = paddingOption;
            PaddingOption[] paddingOptionArr = {paddingOption, new PaddingOption("ABSENT", 1), new PaddingOption("PRESENT_OPTIONAL", 2), new PaddingOption("ABSENT_OPTIONAL", 3)};
            f406771c = paddingOptionArr;
            f406772d = kotlin.enums.c.a(paddingOptionArr);
        }

        public PaddingOption() {
            throw null;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) f406771c.clone();
        }
    }

    /* compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lkotlin/io/encoding/Base64$a;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "", "padSymbol", "B", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Base64 {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            boolean z12 = false;
            super(z12, z12, PaddingOption.f406770b, null);
        }
    }

    static {
        new a(null);
        PaddingOption paddingOption = PaddingOption.f406770b;
        new Base64(true, false, paddingOption);
        new Base64(false, true, paddingOption);
    }

    public /* synthetic */ Base64(boolean z12, boolean z13, PaddingOption paddingOption, C42822w c42822w) {
        this(z12, z13, paddingOption);
    }

    public Base64(boolean z12, boolean z13, PaddingOption paddingOption) {
        if (z12 && z13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
