package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.ui.text.input.C22648n;
import androidx.compose.ui.text.input.C22651q;
import androidx.compose.ui.text.input.InterfaceC22645k;
import androidx.compose.ui.text.input.L;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextFieldKeyInput.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/j2;", "", "Landroidx/compose/foundation/text/q1;", VoiceInfo.STATE, "Landroidx/compose/foundation/text/selection/f1;", "selectionManager", "Landroidx/compose/ui/text/input/W;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/C1;", "preparedSelectionState", "Landroidx/compose/ui/text/input/L;", "offsetMapping", "Landroidx/compose/foundation/text/i3;", "undoManager", "Landroidx/compose/foundation/text/X0;", "keyCombiner", "Landroidx/compose/foundation/text/h1;", "keyMapping", "Lkotlin/Function1;", "Lkotlin/G0;", "onValueChange", "Landroidx/compose/ui/text/input/u;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/q1;Landroidx/compose/foundation/text/selection/f1;Landroidx/compose/ui/text/input/W;ZZLandroidx/compose/foundation/text/selection/C1;Landroidx/compose/ui/text/input/L;Landroidx/compose/foundation/text/i3;Landroidx/compose/foundation/text/X0;Landroidx/compose/foundation/text/h1;LY41/l;ILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20958j2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20985q1 f31543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C21011f1 f31544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.W f31545c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31546d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31547e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.text.selection.C1 f31548f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.L f31549g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final i3 f31550h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final X0 f31551i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20873h1 f31552j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f31553k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31554l;

    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.j2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f31555l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            return kotlin.G0.f406611a;
        }
    }

    public C20958j2() {
        throw null;
    }

    public C20958j2(C20985q1 c20985q1, C21011f1 c21011f1, androidx.compose.ui.text.input.W w12, boolean z12, boolean z13, androidx.compose.foundation.text.selection.C1 c12, androidx.compose.ui.text.input.L l12, i3 i3Var, X0 x02, InterfaceC20873h1 interfaceC20873h1, Y41.l lVar, int i12, C42822w c42822w) {
        this.f31543a = c20985q1;
        this.f31544b = c21011f1;
        this.f31545c = w12;
        this.f31546d = z12;
        this.f31547e = z13;
        this.f31548f = c12;
        this.f31549g = l12;
        this.f31550h = i3Var;
        this.f31551i = x02;
        this.f31552j = interfaceC20873h1;
        this.f31553k = lVar;
        this.f31554l = i12;
    }

    public final void a(List<? extends InterfaceC22645k> list) {
        C22648n c22648n = this.f31543a.f31781d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new C22651q());
        this.f31553k.invoke(c22648n.a(arrayList));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20958j2(C20985q1 c20985q1, C21011f1 c21011f1, androidx.compose.ui.text.input.W w12, boolean z12, boolean z13, androidx.compose.foundation.text.selection.C1 c12, androidx.compose.ui.text.input.L l12, i3 i3Var, X0 x02, InterfaceC20873h1 interfaceC20873h1, Y41.l lVar, int i12, int i13, C42822w c42822w) {
        androidx.compose.ui.text.input.L l13;
        androidx.compose.ui.text.input.W w13 = (i13 & 4) != 0 ? new androidx.compose.ui.text.input.W((String) null, 0L, (androidx.compose.ui.text.v0) null, 7, (C42822w) null) : w12;
        boolean z14 = (i13 & 8) != 0 ? true : z12;
        boolean z15 = (i13 & 16) != 0 ? false : z13;
        if ((i13 & 64) != 0) {
            androidx.compose.ui.text.input.L.f42358a.getClass();
            l13 = L.a.f42360b;
        } else {
            l13 = l12;
        }
        this(c20985q1, c21011f1, w13, z14, z15, c12, l13, (i13 & 128) != 0 ? null : i3Var, x02, (i13 & 512) != 0 ? C20961k1.f31559a : interfaceC20873h1, (i13 & 1024) != 0 ? a.f31555l : lVar, i12, null);
    }
}
