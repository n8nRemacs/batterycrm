package shark;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidResourceIdNames.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lshark/AndroidResourceIdNames;", "", "", "resourceIds", "", "", "names", "<init>", "([I[Ljava/lang/String;)V", "", "id", "get", "(I)Ljava/lang/String;", "[I", "[Ljava/lang/String;", "Companion", "a", "shark-android"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class AndroidResourceIdNames {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);
    public static final int FIRST_APP_RESOURCE_ID = 2130771968;
    public static final int RESOURCE_ID_TYPE_ITERATOR = 65536;
    private static volatile AndroidResourceIdNames holderField;
    private final String[] names;
    private final int[] resourceIds;

    /* compiled from: AndroidResourceIdNames.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lshark/AndroidResourceIdNames$a;", "", "<init>", "()V", "", "FIRST_APP_RESOURCE_ID", "I", "RESOURCE_ID_TYPE_ITERATOR", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidResourceIdNames$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    private AndroidResourceIdNames(int[] iArr, String[] strArr) {
        this.resourceIds = iArr;
        this.names = strArr;
    }

    @Y61.l
    public final String get(int id2) {
        int[] iArr = this.resourceIds;
        int iBinarySearch = Arrays.binarySearch(iArr, 0, iArr.length, id2);
        if (iBinarySearch >= 0) {
            return this.names[iBinarySearch];
        }
        return null;
    }

    public /* synthetic */ AndroidResourceIdNames(int[] iArr, String[] strArr, C42822w c42822w) {
        this(iArr, strArr);
    }
}
