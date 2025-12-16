package Td0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlotConfig;
import kotlin.Metadata;

/* compiled from: ContactInfoStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTd0/a;", "LTd0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Td0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15353a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContactInfoSlot f15756a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f15757b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f15758c;

    public C15353a(@k ContactInfoSlot contactInfoSlot) {
        this.f15756a = contactInfoSlot;
    }

    @Override // Td0.c
    public final void a() {
        ContactInfoSlotConfig contactInfoSlotConfig = (ContactInfoSlotConfig) this.f15756a.getWidget().getConfig();
        this.f15757b = contactInfoSlotConfig.getPhoneField().getValue();
        this.f15758c = contactInfoSlotConfig.getManagerField().getValue();
    }

    @Override // Td0.c
    public final void b() {
        ContactInfoSlotConfig contactInfoSlotConfig = (ContactInfoSlotConfig) this.f15756a.getWidget().getConfig();
        contactInfoSlotConfig.getPhoneField().setValue(this.f15757b);
        contactInfoSlotConfig.getManagerField().setValue(this.f15758c);
    }
}
