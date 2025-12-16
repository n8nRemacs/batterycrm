package tJ;

import com.avito.avcalls.call.models.CallDirection;
import kotlin.Metadata;

/* compiled from: AvCallsCallDirection.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: tJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48562a {

    /* compiled from: AvCallsCallDirection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tJ.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12668a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f439223a;

        static {
            int[] iArr = new int[CallDirection.values().length];
            try {
                iArr[CallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f439223a = iArr;
        }
    }
}
