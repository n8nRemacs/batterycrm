package Z51;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.base_components.android.ComposeWebViewKt;

/* loaded from: classes8.dex */
public final class i extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f19913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a f19914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f19915n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19916o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Y41.a aVar, int i12, int i13) {
        super(2);
        this.f19913l = str;
        this.f19914m = aVar;
        this.f19915n = i12;
        this.f19916o = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f19915n | 1);
        int i12 = this.f19916o;
        ComposeWebViewKt.ComposeWebView(this.f19913l, this.f19914m, (A) obj, iA2, i12);
        return G0.f406611a;
    }
}
