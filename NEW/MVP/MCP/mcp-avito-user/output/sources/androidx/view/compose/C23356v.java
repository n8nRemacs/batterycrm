package androidx.view.compose;

import Y41.l;
import android.content.Context;
import android.os.Bundle;
import androidx.view.C23404y0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavHostController.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "it", "Landroidx/navigation/y0;", "invoke", "(Landroid/os/Bundle;)Landroidx/navigation/y0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23356v extends N implements l<Bundle, C23404y0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f52986l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23356v(Context context) {
        super(1);
        this.f52986l = context;
    }

    @Override // Y41.l
    public final C23404y0 invoke(Bundle bundle) {
        C23404y0 c23404y0A = C23358x.a(this.f52986l);
        c23404y0A.v(bundle);
        return c23404y0A;
    }
}
