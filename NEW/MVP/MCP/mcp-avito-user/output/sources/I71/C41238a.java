package i71;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;

/* compiled from: AndroidLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li71/a;", "Ls71/b;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: i71.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41238a extends AbstractC48011b {

    /* compiled from: AndroidLogger.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: i71.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11367a {
        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C41238a() {
        this(null, 1, null);
    }

    @Override // s71.AbstractC48011b
    public final void a(@k Level level, @k String str) {
        level.ordinal();
    }

    public C41238a(Level level, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? Level.f421466c : level);
    }
}
