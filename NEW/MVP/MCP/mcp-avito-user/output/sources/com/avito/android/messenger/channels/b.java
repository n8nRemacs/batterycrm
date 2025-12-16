package com.avito.android.messenger.channels;

import Y41.l;
import Y61.k;
import Zd.InterfaceC19542a;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.component.snackbar.d;
import com.avito.android.messenger.F;
import com.avito.android.messenger.channels.mvi.view.ChannelsFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/b;", "Lcom/avito/android/messenger/channels/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.messenger.channels.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ChannelsFragment f187142a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC19542a f187143b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final F f187144c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f187145d;

    /* compiled from: ChannelsRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Exception, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            Window window;
            View decorView;
            V2 v22 = V2.f318762a;
            b bVar = b.this;
            bVar.getClass();
            v22.j("ChannelsFragment", "Couldn't start app settings activity", exc);
            ActivityC22955m activityC22955mL1 = bVar.f187142a.l1();
            if (activityC22955mL1 != null && (window = activityC22955mL1.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                d.a.a(d.f125235c, decorView, R.string.error_unknown, -1, null, 0, 1016).b();
            }
            return G0.f406611a;
        }
    }

    public b(@k ChannelsFragment channelsFragment, @k InterfaceC19542a interfaceC19542a, @k F f12, @k InterfaceC35845m2 interfaceC35845m2) {
        this.f187142a = channelsFragment;
        this.f187143b = interfaceC19542a;
        this.f187144c = f12;
        this.f187145d = interfaceC35845m2;
    }

    @Override // com.avito.android.messenger.channels.a
    public final void a(int i12, @k String str, @Y61.l String str2) {
        this.f187142a.startActivity(this.f187144c.c((30 & 2) != 0 ? null : Integer.valueOf(i12 + 1), str, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 32) != 0 ? null : str2, (30 & 16) == 0));
    }

    @Override // com.avito.android.messenger.channels.a
    public final void b() {
        C35966w1.g(this.f187142a, this.f187145d.a(), new a());
    }
}
