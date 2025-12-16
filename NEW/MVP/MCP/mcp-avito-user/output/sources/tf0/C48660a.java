package tf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.slots.contact_info.ContactsData;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.profile_info.ProfileInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.profile_info.ProfileInfoSlotConfig;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileInfoSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltf0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/profile_info/ProfileInfoSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48660a extends k<ProfileInfoSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileInfoSlot f439374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33544d f439375c;

    @i31.c
    public C48660a(@InterfaceC41220a @Y61.k ProfileInfoSlot profileInfoSlot, @Y61.k InterfaceC33544d interfaceC33544d) {
        this.f439374b = profileInfoSlot;
        this.f439375c = interfaceC33544d;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f439374b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        return this.f439375c.d(null);
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        com.avito.android.publish.slots.profile_info.item.a aVar;
        ContactsData contactsDataB = this.f439375c.b();
        if (contactsDataB != null) {
            String str = contactsDataB.f243213i ? "" : contactsDataB.f243207c;
            if (str == null || str.length() == 0) {
                aVar = null;
            } else {
                aVar = new com.avito.android.publish.slots.profile_info.item.a(((ProfileInfoSlotConfig) this.f439374b.getWidget().getConfig()).getField().getId(), str, contactsDataB.f243211g ? UserIconType.SHOP : contactsDataB.f243212h ? UserIconType.COMPANY : UserIconType.PRIVATE, contactsDataB.f243210f, contactsDataB.f243218n);
            }
            if (aVar != null) {
                return Collections.singletonList(aVar);
            }
        }
        return C42784z0.f406748b;
    }
}
