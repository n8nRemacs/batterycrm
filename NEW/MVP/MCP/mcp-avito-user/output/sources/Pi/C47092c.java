package pi;

import com.avito.android.beduin.network.model.BeduinTitleAlignment;
import kotlin.Metadata;

/* compiled from: BeduinTitleAlignment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: pi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47092c {

    /* compiled from: BeduinTitleAlignment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pi.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f428741a;

        static {
            int[] iArr = new int[BeduinTitleAlignment.values().length];
            try {
                iArr[BeduinTitleAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTitleAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinTitleAlignment.PLATFORM_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f428741a = iArr;
        }
    }
}
