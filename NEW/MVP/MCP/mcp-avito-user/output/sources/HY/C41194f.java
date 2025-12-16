package hy;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DaysPickerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhy/f;", "Lhy/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hy.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41194f implements InterfaceC41193e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f398318a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41191c f398319b;

    public C41194f(@k ArrayList arrayList, @k C41191c c41191c) {
        this.f398318a = arrayList;
        this.f398319b = c41191c;
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ((ListItemCheckmark) obj).setOnClickListener(new com.avito.android.fakedoor_dialog.a(i12, 9, this));
            i12 = i13;
        }
    }

    public final void a(int i12, boolean z12) {
        ((ListItemCheckmark) this.f398318a.get(i12)).setChecked(z12);
    }

    public final void b(int i12) {
        ((ListItemCheckmark) this.f398318a.get(i12)).setEnabled(false);
    }
}
