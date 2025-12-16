package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/R1;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface R1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f26834a = a.f26835a;

    /* compiled from: PlatformMagnifier.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/R1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f26835a = new a();

        @F3
        @Y61.k
        public static R1 a() {
            if (C21093y1.a()) {
                return Build.VERSION.SDK_INT == 28 ? S1.f26841b : T1.f26867b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    @Y61.k
    Q1 b(@Y61.k View view, boolean z12, long j12, float f12, float f13, boolean z13, @Y61.k androidx.compose.ui.unit.d dVar, float f14);
}
