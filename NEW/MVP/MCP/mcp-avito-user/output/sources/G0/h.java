package g0;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sberid.sdk.ui.screens.view.defaults.SIDBottomSheetDialogFragment;
import x31.e;
import x31.f;
import x31.g;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg0/h;", "Lsberid/sdk/ui/screens/view/defaults/SIDBottomSheetDialogFragment;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class h extends SIDBottomSheetDialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public final Object f396208f0 = C42727D.b(LazyThreadSafetyMode.f406614b, new e(this));

    /* renamed from: g0, reason: collision with root package name */
    public final Object f396209g0 = C42727D.b(LazyThreadSafetyMode.f406616d, new g(this, new f(this)));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) throws java.net.SocketException {
        /*
            r22 = this;
            r7 = r22
            androidx.compose.ui.platform.ComposeView r8 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r1 = r22.requireContext()
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.ui.platform.u2$e r0 = androidx.compose.ui.platform.InterfaceC22532u2.e.f41618b
            r8.setViewCompositionStrategy(r0)
            r0 = 2131955745(0x7f131021, float:1.9548026E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.Object r0 = r7.f396209g0
            java.lang.Object r0 = r0.getValue()
            C31.a r0 = (C31.a) r0
            android.content.Context r2 = r8.getContext()
            r0.getClass()
            G41.a r0 = r0.f1901E
            G41.i r0 = (G41.i) r0
            kotlinx.coroutines.flow.Z1 r0 = r0.f6332c
            java.lang.Object r0 = r0.getValue()
            N41.g r0 = (N41.g) r0
            java.lang.String r0 = r0.f11194a
            if (r0 != 0) goto L42
            r0 = 2131955744(0x7f131020, float:1.9548024E38)
            java.lang.String r0 = r2.getString(r0)
        L42:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 2131955743(0x7f13101f, float:1.9548022E38)
            java.lang.String r2 = r7.getString(r2, r0)
            r0 = 2131953521(0x7f130771, float:1.9543515E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 2131952220(0x7f13025c, float:1.9540877E38)
            java.lang.String r4 = r7.getString(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r0 < r5) goto L6f
            android.os.Bundle r0 = r22.getArguments()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = s90.c.d(r0)
            android.net.Uri r0 = (android.net.Uri) r0
        L6d:
            r6 = r0
            goto L80
        L6f:
            android.os.Bundle r0 = r22.getArguments()
            if (r0 == 0) goto L7e
            java.lang.String r5 = "uri"
            android.os.Parcelable r0 = r0.getParcelable(r5)
            android.net.Uri r0 = (android.net.Uri) r0
            goto L6d
        L7e:
            r0 = 0
            goto L6d
        L80:
            java.lang.Object r0 = r7.f396208f0
            java.lang.Object r0 = r0.getValue()
            d31.d r0 = (d31.C39498d) r0
            r0.getClass()
            e.a r5 = r0.f393650b
            e.h r5 = (e.h) r5
            java.lang.String r17 = r5.a()
            kotlin.C r9 = y31.c.f442880b
            java.lang.Object r9 = r9.getValue()
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            f61.a r9 = r0.f393651c
            java.lang.String r13 = r5.f394234g
            Yb1.a$b r5 = new Yb1.a$b
            java.lang.String r16 = "android_4.0.0"
            r19 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = "Show"
            java.lang.String r14 = r9.f395679a
            r20 = 515(0x203, float:7.22E-43)
            r21 = 0
            r9 = r5
            r18 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            e31.a r0 = r0.f393649a
            r0.a(r5)
            x31.d r9 = new x31.d
            r0 = r9
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.internal.n r0 = new androidx.compose.runtime.internal.n
            r1 = 1740826718(0x67c2e85e, float:1.840851E24)
            r2 = 1
            r0.<init>(r1, r9, r2)
            r8.setContent(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
