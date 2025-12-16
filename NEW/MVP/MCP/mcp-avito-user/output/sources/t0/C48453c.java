package t0;

import Y61.k;
import Y61.l;
import android.R;
import android.view.Menu;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.j;

/* compiled from: TextActionModeCallback.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt0/c;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48453c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.a<G0> f439010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public j f439011b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f439012c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f439013d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f439014e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f439015f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f439016g;

    public C48453c() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static void a(@k Menu menu, @k MenuItemOption menuItemOption) {
        int i12;
        int iOrdinal = menuItemOption.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.copy;
        } else if (iOrdinal == 1) {
            i12 = R.string.paste;
        } else if (iOrdinal == 2) {
            i12 = R.string.cut;
        } else if (iOrdinal == 3) {
            i12 = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.autofill;
        }
        menu.add(0, menuItemOption.f41388b, menuItemOption.f41389c, i12).setShowAsAction(1);
    }

    public static void b(Menu menu, MenuItemOption menuItemOption, Y41.a aVar) {
        int i12 = menuItemOption.f41388b;
        if (aVar != null && menu.findItem(i12) == null) {
            a(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(i12) == null) {
                return;
            }
            menu.removeItem(i12);
        }
    }

    public C48453c(Y41.a aVar, j jVar, Y41.a aVar2, Y41.a aVar3, Y41.a aVar4, Y41.a aVar5, Y41.a aVar6, int i12, C42822w c42822w) {
        aVar = (i12 & 1) != 0 ? null : aVar;
        if ((i12 & 2) != 0) {
            j.f413388e.getClass();
            jVar = j.f413389f;
        }
        aVar2 = (i12 & 4) != 0 ? null : aVar2;
        aVar3 = (i12 & 8) != 0 ? null : aVar3;
        aVar4 = (i12 & 16) != 0 ? null : aVar4;
        aVar5 = (i12 & 32) != 0 ? null : aVar5;
        aVar6 = (i12 & 64) != 0 ? null : aVar6;
        this.f439010a = aVar;
        this.f439011b = jVar;
        this.f439012c = aVar2;
        this.f439013d = aVar3;
        this.f439014e = aVar4;
        this.f439015f = aVar5;
        this.f439016g = aVar6;
    }
}
