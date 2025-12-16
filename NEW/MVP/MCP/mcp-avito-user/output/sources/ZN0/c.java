package zN0;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.virtual_deal_room.base.ClientRoomChildFragmentResult;
import kotlin.Metadata;

/* compiled from: ClientRoomFragmentBehaviour.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LzN0/c;", "Lcom/avito/android/ui/fragments/c;", "b", "c", "LzN0/c$b;", "LzN0/c$c;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c extends com.avito.android.ui.fragments.c {

    /* compiled from: ClientRoomFragmentBehaviour.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@k Fragment fragment) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ClientRoomChildFragmentResultData", new ClientRoomChildFragmentResult(true));
            fragment.getParentFragmentManager().o0(bundle, "ClientRoomChildFragmentResult");
        }
    }

    /* compiled from: ClientRoomFragmentBehaviour.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzN0/c$b;", "LzN0/c;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends c {

        /* compiled from: ClientRoomFragmentBehaviour.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    /* compiled from: ClientRoomFragmentBehaviour.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzN0/c$c;", "LzN0/c;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zN0.c$c, reason: collision with other inner class name */
    public interface InterfaceC12952c extends c {

        /* compiled from: ClientRoomFragmentBehaviour.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: zN0.c$c$a */
        public static final class a {
        }
    }
}
