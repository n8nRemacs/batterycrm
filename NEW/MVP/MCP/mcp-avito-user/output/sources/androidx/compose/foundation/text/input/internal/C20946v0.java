package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.O1;
import androidx.compose.ui.text.input.C22655v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/v0;", "Landroidx/compose/ui/platform/O1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20946v0 implements O1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f31482a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20898j0 f31483b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f31484c = C20942t0.f31450l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f31485d = C20944u0.f31463l;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C20985q1 f31486e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C21011f1 f31487f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public InterfaceC22544x2 f31488g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.W f31489h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public C22655v f31490i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f31491j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f31492k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Rect f31493l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C20908o0 f31494m;

    public C20946v0(@Y61.k View view, @Y61.k Y41.l lVar, @Y61.k C20898j0 c20898j0) {
        this.f31482a = view;
        this.f31483b = c20898j0;
        androidx.compose.ui.text.v0.f42734b.getClass();
        this.f31489h = new androidx.compose.ui.text.input.W("", androidx.compose.ui.text.v0.f42735c, (androidx.compose.ui.text.v0) null, 4, (C42822w) null);
        C22655v.f42477h.getClass();
        this.f31490i = C22655v.f42478i;
        this.f31491j = new ArrayList();
        this.f31492k = C42727D.b(LazyThreadSafetyMode.f406616d, new C20913r0(this));
        this.f31494m = new C20908o0(lVar, c20898j0);
    }

    @Override // androidx.compose.ui.platform.O1
    public final InputConnection a(EditorInfo editorInfo) {
        androidx.compose.ui.text.input.W w12 = this.f31489h;
        O.a(editorInfo, w12.f42383a.f42127c, w12.f42384b, this.f31490i, null);
        Y41.l<? super View, ? extends InterfaceC20896i0> lVar = C20912q0.f31207a;
        if (androidx.emoji2.text.e.g()) {
            androidx.emoji2.text.e.a().l(editorInfo);
        }
        D0 d02 = new D0(this.f31489h, new C20915s0(this), this.f31490i.f42481c, this.f31486e, this.f31487f, this.f31488g);
        this.f31491j.add(new WeakReference(d02));
        return d02;
    }
}
