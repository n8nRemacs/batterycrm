package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DragAndDrop.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draganddrop/q;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClipData f39021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f39022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39023c;

    public q(ClipData clipData, Object obj, int i12, int i13, C42822w c42822w) {
        obj = (i13 & 2) != 0 ? null : obj;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        this.f39021a = clipData;
        this.f39022b = obj;
        this.f39023c = i12;
    }
}
