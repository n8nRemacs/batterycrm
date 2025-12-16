package We;

import com.avito.android.auto_reseller_contacts.generated.api.get_messenger_by_item_id_for_apiv_3.EaModal;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LWe/q;", "", "LWe/p;", "action", "LWe/c;", "contactPackageModal", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal;", "earlyAccessModal", "LWe/u;", "notificationToast", "LWe/y;", "spendContactPopUp", "<init>", "(LWe/p;LWe/c;Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal;LWe/u;LWe/y;)V", "LWe/p;", "a", "()LWe/p;", "LWe/c;", "b", "()LWe/c;", "Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal;", "c", "()Lcom/avito/android/auto_reseller_contacts/generated/api/get_messenger_by_item_id_for_apiv_3/EaModal;", "LWe/u;", "d", "()LWe/u;", "LWe/y;", "e", "()LWe/y;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final p action;

    @com.google.gson.annotations.c("contactPackageModal")
    @Y61.l
    private final C15751c contactPackageModal;

    @com.google.gson.annotations.c("earlyAccessModal")
    @Y61.l
    private final EaModal earlyAccessModal;

    @com.google.gson.annotations.c("notificationToast")
    @Y61.l
    private final u notificationToast;

    @com.google.gson.annotations.c("spendContactPopUp")
    @Y61.l
    private final y spendContactPopUp;

    public q(@Y61.l p pVar, @Y61.l C15751c c15751c, @Y61.l EaModal eaModal, @Y61.l u uVar, @Y61.l y yVar) {
        this.action = pVar;
        this.contactPackageModal = c15751c;
        this.earlyAccessModal = eaModal;
        this.notificationToast = uVar;
        this.spendContactPopUp = yVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final p getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C15751c getContactPackageModal() {
        return this.contactPackageModal;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final EaModal getEarlyAccessModal() {
        return this.earlyAccessModal;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final u getNotificationToast() {
        return this.notificationToast;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final y getSpendContactPopUp() {
        return this.spendContactPopUp;
    }
}
