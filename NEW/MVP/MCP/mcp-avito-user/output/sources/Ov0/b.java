package OV0;

import android.view.View;
import android.view.Window;
import androidx.core.view.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Window f12297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12298d;

    public b(View view, Window window, boolean z12) {
        this.f12296b = view;
        this.f12297c = window;
        this.f12298d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new L0(this.f12297c, this.f12296b).e(!this.f12298d);
    }
}
