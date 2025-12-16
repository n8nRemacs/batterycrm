package com.avito.android.virtual_deal_room_client_creation;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.virtual_deal_room.deeplink.CreateClientDeeplink;
import com.avito.android.virtual_deal_room_client_creation.clients.ClientsFragment;
import com.avito.android.virtual_deal_room_client_creation.clients.model.ClientsArguments;
import com.avito.android.virtual_deal_room_client_creation.create.CreateFragment;
import com.avito.android.virtual_deal_room_client_creation.create.model.CreateArguments;
import com.avito.android.virtual_deal_room_client_creation.model.ClientCreationArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ClientCreationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/ClientCreationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientCreationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f326478m = new a(null);

    /* compiled from: ClientCreationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/ClientCreationActivity$a;", "", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@k ActivityC22955m activityC22955m, @k CreateClientDeeplink.Result result) {
            Intent intent = new Intent();
            intent.putExtras(C22777e.b(new Q("arguments", result)));
            G0 g02 = G0.f406611a;
            activityC22955m.setResult(-1, intent);
            activityC22955m.finish();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int L1() {
        return R.id.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"HardcodeStringDetector"})
    public final void onCreate(@l Bundle bundle) {
        Fragment fragmentA;
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("arguments", Parcelable.class) : intent.getParcelableExtra("arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ClientCreationArguments clientCreationArguments = (ClientCreationArguments) parcelableExtra;
            if (clientCreationArguments instanceof ClientsArguments) {
                ClientsFragment.f326484s0.getClass();
                fragmentA = ClientsFragment.a.a((ClientsArguments) clientCreationArguments);
            } else {
                if (!(clientCreationArguments instanceof CreateArguments)) {
                    throw new IllegalArgumentException("Нет реализации фрагмента для переданного аргумента " + clientCreationArguments);
                }
                CreateFragment.f326712s0.getClass();
                fragmentA = CreateFragment.a.a((CreateArguments) clientCreationArguments);
            }
            hE2.j(R.id.fragment_container, fragmentA, null, 1);
            hE2.e();
        }
    }
}
