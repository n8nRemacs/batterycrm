package Rb0;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ActiveView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRb0/c;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15027c implements InterfaceC15026b {

    /* renamed from: b, reason: collision with root package name */
    public final View f14522b;

    public C15027c(@k View view) {
        this.f14522b = view.findViewById(R.id.inactive_fill);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        D6.G(this.f14522b, !z12);
    }
}
