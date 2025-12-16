package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.content.g;
import androidx.compose.foundation.content.internal.b;
import androidx.compose.foundation.text.input.internal.C20893h;
import androidx.core.view.inputmethod.c;
import kotlin.Metadata;

/* compiled from: StatelessInputConnection.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/H0;", "Landroidx/core/view/inputmethod/c$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H0 implements c.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f30837a;

    public H0(J0 j02) {
        this.f30837a = j02;
    }

    @Override // androidx.core.view.inputmethod.c.d
    public final boolean a(androidx.core.view.inputmethod.d dVar, int i12, Bundle bundle) {
        int i13 = i12 & 1;
        J0 j02 = this.f30837a;
        if (i13 != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e12) {
                e12.toString();
                j02.getClass();
                return false;
            }
        }
        C20893h.d dVar2 = j02.f30850a;
        androidx.compose.ui.platform.K0 k02 = new androidx.compose.ui.platform.K0(new ClipData(dVar.b(), new ClipData.Item(dVar.a())));
        g.a.f26980b.getClass();
        dVar.b();
        androidx.compose.ui.platform.L0 l02 = new androidx.compose.ui.platform.L0();
        Uri uriC = dVar.c();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        androidx.compose.foundation.content.g gVar = new androidx.compose.foundation.content.g(k02, l02, 0, new androidx.compose.foundation.content.b(uriC, bundle), null);
        androidx.compose.foundation.content.internal.c cVar = dVar2.f31115e;
        if (cVar == null) {
            return false;
        }
        ((b.a) cVar.a()).c(gVar);
        throw null;
    }
}
