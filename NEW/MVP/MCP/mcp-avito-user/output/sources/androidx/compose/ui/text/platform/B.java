package androidx.compose.ui.text.platform;

import androidx.compose.runtime.I3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/B;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I3<Object> f42542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final B f42543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f42544c;

    public B(@Y61.k I3<? extends Object> i32, @Y61.l B b12) {
        this.f42542a = i32;
        this.f42543b = b12;
        this.f42544c = i32.getValue();
    }

    public final boolean a() {
        B b12;
        return this.f42542a.getValue() != this.f42544c || ((b12 = this.f42543b) != null && b12.a());
    }

    public /* synthetic */ B(I3 i32, B b12, int i12, C42822w c42822w) {
        this(i32, (i12 & 2) != 0 ? null : b12);
    }
}
