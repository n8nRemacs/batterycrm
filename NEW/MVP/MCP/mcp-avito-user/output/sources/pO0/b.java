package PO0;

import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoButton;
import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoSection;
import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoToastData;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPO0/b;", "", "a", "b", "LPO0/b$a;", "LPO0/b$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: GetWalletServiceInfoResponse.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LPO0/b$a;", "LPO0/b;", "LPO0/d;", "balance", "LPO0/c;", "primaryAction", "LPO0/i;", "promoBanner", "secondaryAction", "", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection;", "sections", "", "title", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData;", "toastData", "<init>", "(LPO0/d;LPO0/c;LPO0/i;LPO0/c;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData;)V", "LPO0/d;", "a", "()LPO0/d;", "LPO0/c;", "b", "()LPO0/c;", "LPO0/i;", "c", "()LPO0/i;", "getSecondaryAction", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData;", "e", "()Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        @com.google.gson.annotations.c("balance")
        @Y61.k
        private final d balance;

        @com.google.gson.annotations.c("primaryAction")
        @Y61.l
        private final c primaryAction;

        @com.google.gson.annotations.c("promoBanner")
        @Y61.l
        private final i promoBanner;

        @com.google.gson.annotations.c("secondaryAction")
        @Y61.l
        private final c secondaryAction;

        @com.google.gson.annotations.c("sections")
        @Y61.l
        private final List<ServiceInfoSection> sections;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("toastData")
        @Y61.l
        private final ServiceInfoToastData toastData;

        public a(@Y61.k d dVar, @Y61.l c cVar, @Y61.l i iVar, @Y61.l c cVar2, @Y61.l List<ServiceInfoSection> list, @Y61.k String str, @Y61.l ServiceInfoToastData serviceInfoToastData) {
            this.balance = dVar;
            this.primaryAction = cVar;
            this.promoBanner = iVar;
            this.secondaryAction = cVar2;
            this.sections = list;
            this.title = str;
            this.toastData = serviceInfoToastData;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final d getBalance() {
            return this.balance;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final c getPrimaryAction() {
            return this.primaryAction;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final i getPromoBanner() {
            return this.promoBanner;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final ServiceInfoToastData getToastData() {
            return this.toastData;
        }
    }

    /* compiled from: GetWalletServiceInfoResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LPO0/b$b;", "LPO0/b;", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;", "firstButton", "", "message", "secondButton", "title", "<init>", "(Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;Ljava/lang/String;Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;Ljava/lang/String;)V", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;", "a", "()Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoButton;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PO0.b$b, reason: collision with other inner class name */
    public static final class C0846b implements b {

        @com.google.gson.annotations.c("first_button")
        @Y61.l
        private final ServiceInfoButton firstButton;

        @com.google.gson.annotations.c("message")
        @Y61.l
        private final String message;

        @com.google.gson.annotations.c("second_button")
        @Y61.l
        private final ServiceInfoButton secondButton;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public C0846b(@Y61.l ServiceInfoButton serviceInfoButton, @Y61.l String str, @Y61.l ServiceInfoButton serviceInfoButton2, @Y61.k String str2) {
            this.firstButton = serviceInfoButton;
            this.message = str;
            this.secondButton = serviceInfoButton2;
            this.title = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final ServiceInfoButton getFirstButton() {
            return this.firstButton;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final ServiceInfoButton getSecondButton() {
            return this.secondButton;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }
}
