package ff;

import com.avito.android.deep_linking.links.models.AutoSelectButtonTypeDto;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectConfirmationDialogContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ff.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40410a {

    /* compiled from: AutoSelectConfirmationDialogContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ff.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11165a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f396021a;

        static {
            int[] iArr = new int[AutoSelectButtonTypeDto.values().length];
            try {
                iArr[AutoSelectButtonTypeDto.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoSelectButtonTypeDto.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f396021a = iArr;
        }
    }
}
