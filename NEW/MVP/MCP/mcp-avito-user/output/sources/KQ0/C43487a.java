package kq0;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContainerTabAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkq0/a;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/select/sectioned_multiselect/container/tab_layout/ContainerTabItem;", "Lkq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43487a extends g<ContainerTabItem, C43489c> {
    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(i iVar, ContainerTabItem containerTabItem) {
        C43489c c43489c = (C43489c) iVar;
        ContainerTabItem containerTabItem2 = containerTabItem;
        I5.a(c43489c.f413243b, containerTabItem2.f266464e, false);
        I5.a(c43489c.f413244c, containerTabItem2.f266465f, false);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final i b(View view) {
        return new C43489c(view);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    @k
    public final i e(@k i iVar, int i12) {
        C43489c c43489c = iVar instanceof C43489c ? (C43489c) iVar : null;
        if (c43489c == null) {
            return c(i12);
        }
        ContainerTabItem containerTabItem = (ContainerTabItem) this.f178152a.getItem(i12);
        I5.a(c43489c.f413243b, containerTabItem.f266464e, false);
        I5.a(c43489c.f413244c, containerTabItem.f266465f, false);
        return c43489c;
    }
}
