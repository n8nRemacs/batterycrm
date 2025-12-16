package zI0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import kotlin.Metadata;

/* compiled from: ProfileHeaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LzI0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/i0;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/mvi/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zI0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC50474d extends i0, com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.a {

    /* compiled from: ProfileHeaderViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zI0.d$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC50474d interfaceC50474d, boolean z12, boolean z13, String str, String str2, boolean z14, DeepLink deepLink, int i12) {
            boolean z15 = (i12 & 1) != 0 ? false : z12;
            boolean z16 = (i12 & 2) != 0 ? false : z13;
            interfaceC50474d.c5((i12 & 16) != 0 ? null : str, z15, (i12 & 1024) != 0 ? null : deepLink, (i12 & 32) != 0 ? null : str2, z16);
        }
    }

    void U2();

    void c5(@l String str, boolean z12, @l DeepLink deepLink, @l String str2, boolean z13);

    void h6(@l String str);

    void onResume();

    void p0();

    void y5(@k String str);
}
